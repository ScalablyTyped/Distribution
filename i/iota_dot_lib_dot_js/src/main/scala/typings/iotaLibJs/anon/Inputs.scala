package typings.iotaLibJs.anon

import typings.iotaLibJs.mod.InputObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inputs extends js.Object {
  var inputs: js.Array[InputObject]
}

object Inputs {
  @scala.inline
  def apply(inputs: js.Array[InputObject]): Inputs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inputs]
  }
}

