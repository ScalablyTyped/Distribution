package typings.iotaLibJs

import typings.iotaLibJs.mod.TransactionObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInputsArray extends js.Object {
  var inputs: js.Array[TransactionObject]
}

object AnonInputsArray {
  @scala.inline
  def apply(inputs: js.Array[TransactionObject]): AnonInputsArray = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInputsArray]
  }
}

