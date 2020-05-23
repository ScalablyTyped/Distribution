package typings.iotaLibJs.anon

import typings.iotaLibJs.mod.TransactionObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputsArray extends js.Object {
  var inputs: js.Array[TransactionObject]
}

object InputsArray {
  @scala.inline
  def apply(inputs: js.Array[TransactionObject]): InputsArray = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsArray]
  }
}

