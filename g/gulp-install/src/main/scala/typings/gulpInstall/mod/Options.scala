package typings.gulpInstall.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allowRoot: js.UndefOr[Boolean] = js.native
  var args: js.UndefOr[String | js.Array[String]] = js.native
  var ignoreScripts: js.UndefOr[Boolean] = js.native
  var noOptional: js.UndefOr[Boolean] = js.native
  var production: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAllowRoot(value: Boolean): Self = this.set("allowRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowRoot: Self = this.set("allowRoot", js.undefined)
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: String | js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setIgnoreScripts(value: Boolean): Self = this.set("ignoreScripts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreScripts: Self = this.set("ignoreScripts", js.undefined)
    @scala.inline
    def setNoOptional(value: Boolean): Self = this.set("noOptional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoOptional: Self = this.set("noOptional", js.undefined)
    @scala.inline
    def setProduction(value: Boolean): Self = this.set("production", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduction: Self = this.set("production", js.undefined)
  }
  
}

