package typings.linq4js.Linq4JS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluateCommandResult extends js.Object {
  var Command: String
  var DynamicFunction: String
}

object EvaluateCommandResult {
  @scala.inline
  def apply(Command: String, DynamicFunction: String): EvaluateCommandResult = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], DynamicFunction = DynamicFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateCommandResult]
  }
}

