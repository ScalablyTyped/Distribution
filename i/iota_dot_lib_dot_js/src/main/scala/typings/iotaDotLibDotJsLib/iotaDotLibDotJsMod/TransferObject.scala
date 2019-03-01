package typings
package iotaDotLibDotJsLib.iotaDotLibDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferObject extends js.Object {
  var address: java.lang.String
  var message: java.lang.String
  var tag: java.lang.String
  var value: scala.Double
}

object TransferObject {
  @scala.inline
  def apply(address: java.lang.String, message: java.lang.String, tag: java.lang.String, value: scala.Double): TransferObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("tag")(tag)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TransferObject]
  }
}

