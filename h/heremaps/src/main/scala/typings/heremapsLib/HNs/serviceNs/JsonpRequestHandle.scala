package typings
package heremapsLib.HNs.serviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property id {number} - the ID associated internally with this request
  * @property cancel {function()} - this function cancels the request and invokes the errback function
  */
trait JsonpRequestHandle extends js.Object {
  var id: scala.Double
  def cancel(): scala.Unit
}

object JsonpRequestHandle {
  @scala.inline
  def apply(cancel: () => scala.Unit, id: scala.Double): JsonpRequestHandle = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), id = id)
  
    __obj.asInstanceOf[JsonpRequestHandle]
  }
}

