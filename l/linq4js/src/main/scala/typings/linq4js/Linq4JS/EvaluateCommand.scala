package typings.linq4js.Linq4JS

import typings.linq4js.Array
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluateCommand extends js.Object {
  var Command: String = js.native
  var Finder: Array[RegExp] = js.native
  var SplitRegex: Array[RegExp] = js.native
}

object EvaluateCommand {
  @scala.inline
  def apply(Command: String, Finder: Array[RegExp], SplitRegex: Array[RegExp]): EvaluateCommand = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Finder = Finder.asInstanceOf[js.Any], SplitRegex = SplitRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateCommand]
  }
  @scala.inline
  implicit class EvaluateCommandOps[Self <: EvaluateCommand] (val x: Self) extends AnyVal {
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
    def setFinder(value: Array[RegExp]): Self = this.set("Finder", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplitRegex(value: Array[RegExp]): Self = this.set("SplitRegex", value.asInstanceOf[js.Any])
  }
  
}

