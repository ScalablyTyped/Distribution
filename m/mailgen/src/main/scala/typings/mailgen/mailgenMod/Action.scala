package typings.mailgen.mailgenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var button: Button
  var instructions: String
}

object Action {
  @scala.inline
  def apply(button: Button, instructions: String): Action = {
    val __obj = js.Dynamic.literal(button = button, instructions = instructions)
  
    __obj.asInstanceOf[Action]
  }
}

