package typings.grasp.anon

import typings.cliColor.mod.Color
import typings.node.anon.ReadStreamfd0
import typings.node.consoleMod.global.Console_
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends js.Object {
  var args: js.Array[String] | (Record[String, _]) | String = js.native
  var callback: js.UndefOr[js.Function1[/* result */ String, Unit]] = js.native
  var console: js.UndefOr[Console_] = js.native
  var error: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  var exit: js.UndefOr[js.Function1[/* code */ Double, Unit]] = js.native
  // The following are "overrides" for defaults, such as console, cli-color,
  // process.stdin, or fs. In most cases grasp only makes use of a small
  // surface area of the types, but I think if someone really wants to pass a
  // fake fs that only implements the subset of methods they think grasp uses,
  // it should be up to them to use a cast rather than the typedef to be
  // overly lenient. We never know if grasp might change their internal use of
  // fs, after all.
  var fs: js.UndefOr[Typeoffs] = js.native
  var input: js.UndefOr[String] = js.native
  var stdin: js.UndefOr[ReadStreamfd0] = js.native
  var textFormat: js.UndefOr[Color] = js.native
}

object Args {
  @scala.inline
  def apply(args: js.Array[String] | (Record[String, _]) | String): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String] | (Record[String, _]) | String): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallback(value: /* result */ String => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setConsole(value: Console_): Self = this.set("console", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsole: Self = this.set("console", js.undefined)
    @scala.inline
    def setError(value: /* message */ String => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExit(value: /* code */ Double => Unit): Self = this.set("exit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
    @scala.inline
    def setFs(value: Typeoffs): Self = this.set("fs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setStdin(value: ReadStreamfd0): Self = this.set("stdin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdin: Self = this.set("stdin", js.undefined)
    @scala.inline
    def setTextFormat(value: Color): Self = this.set("textFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextFormat: Self = this.set("textFormat", js.undefined)
  }
  
}

