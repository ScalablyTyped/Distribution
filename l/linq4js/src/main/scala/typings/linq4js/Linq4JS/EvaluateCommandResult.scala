package typings.linq4js.Linq4JS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluateCommandResult extends js.Object {
  var Command: String = js.native
  var DynamicFunction: String = js.native
}

object EvaluateCommandResult {
  @scala.inline
  def apply(Command: String, DynamicFunction: String): EvaluateCommandResult = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], DynamicFunction = DynamicFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateCommandResult]
  }
  @scala.inline
  implicit class EvaluateCommandResultOps[Self <: EvaluateCommandResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommand(value: String): Self = this.set("Command", value.asInstanceOf[js.Any])
    @scala.inline
    def setDynamicFunction(value: String): Self = this.set("DynamicFunction", value.asInstanceOf[js.Any])
  }
  
}

