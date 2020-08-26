package typings.grammarkdown.optionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedArguments
  extends /* key */ StringDictionary[js.Any] {
  var argv: js.Array[String] = js.native
  var rest: js.Array[String] = js.native
}

object ParsedArguments {
  @scala.inline
  def apply(argv: js.Array[String], rest: js.Array[String]): ParsedArguments = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedArguments]
  }
  @scala.inline
  implicit class ParsedArgumentsOps[Self <: ParsedArguments] (val x: Self) extends AnyVal {
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
    def setArgvVarargs(value: String*): Self = this.set("argv", js.Array(value :_*))
    @scala.inline
    def setArgv(value: js.Array[String]): Self = this.set("argv", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestVarargs(value: String*): Self = this.set("rest", js.Array(value :_*))
    @scala.inline
    def setRest(value: js.Array[String]): Self = this.set("rest", value.asInstanceOf[js.Any])
  }
  
}

