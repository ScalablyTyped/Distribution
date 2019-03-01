package typings
package jsgraphLib.jsgraphMod.jsgraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeRequest extends js.Object {
  var e: Edge
  var p: js.Any
}

object EdgeRequest {
  @scala.inline
  def apply(e: Edge, p: js.Any): EdgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("e")(e)
    __obj.updateDynamic("p")(p)
    __obj.asInstanceOf[EdgeRequest]
  }
}

