package typings.linq4js.Linq4JS

import typings.linq4js.Array
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluateCommand extends js.Object {
  var Command: String
  var Finder: Array[RegExp]
  var SplitRegex: Array[RegExp]
}

object EvaluateCommand {
  @scala.inline
  def apply(Command: String, Finder: Array[RegExp], SplitRegex: Array[RegExp]): EvaluateCommand = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Finder = Finder.asInstanceOf[js.Any], SplitRegex = SplitRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateCommand]
  }
}

