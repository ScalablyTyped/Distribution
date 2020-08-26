package typings.hexo.anon

import typings.minimist.mod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends js.Object {
  val args: ParsedArgs = js.native
  val debug: Boolean = js.native
  val env: String = js.native
  val init: Boolean = js.native
  val safe: Boolean = js.native
  val silent: Boolean = js.native
  val version: String = js.native
}

object Args {
  @scala.inline
  def apply(
    args: ParsedArgs,
    debug: Boolean,
    env: String,
    init: Boolean,
    safe: Boolean,
    silent: Boolean,
    version: String
  ): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], safe = safe.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
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
    def setArgs(value: ParsedArgs): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit(value: Boolean): Self = this.set("init", value.asInstanceOf[js.Any])
    @scala.inline
    def setSafe(value: Boolean): Self = this.set("safe", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

