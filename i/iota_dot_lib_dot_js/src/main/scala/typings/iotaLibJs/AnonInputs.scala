package typings.iotaLibJs

import typings.iotaLibJs.mod.InputObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInputs extends js.Object {
  var inputs: js.Array[InputObject]
}

object AnonInputs {
  @scala.inline
  def apply(inputs: js.Array[InputObject]): AnonInputs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInputs]
  }
}

