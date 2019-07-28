package typings.iotaDotLibDotJs.iotaDotLibDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferObject extends js.Object {
  var address: String
  var message: String
  var tag: String
  var value: Double
}

object TransferObject {
  @scala.inline
  def apply(address: String, message: String, tag: String, value: Double): TransferObject = {
    val __obj = js.Dynamic.literal(address = address, message = message, tag = tag, value = value)
  
    __obj.asInstanceOf[TransferObject]
  }
}

