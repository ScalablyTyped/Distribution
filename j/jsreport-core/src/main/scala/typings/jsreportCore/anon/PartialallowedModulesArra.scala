package typings.jsreportCore.anon

import typings.jsreportCore.jsreportCoreStrings.`dedicated-process`
import typings.jsreportCore.jsreportCoreStrings.`http-server`
import typings.jsreportCore.jsreportCoreStrings.`in-process`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  allowedModules :std.Array<string> | string,   strategy :'dedicated-process' | 'http-server' | 'in-process' | string}> */
@js.native
trait PartialallowedModulesArra extends js.Object {
  var allowedModules: js.UndefOr[js.Array[String] | String] = js.native
  var strategy: js.UndefOr[`dedicated-process` | `http-server` | `in-process` | String] = js.native
}

object PartialallowedModulesArra {
  @scala.inline
  def apply(): PartialallowedModulesArra = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialallowedModulesArra]
  }
  @scala.inline
  implicit class PartialallowedModulesArraOps[Self <: PartialallowedModulesArra] (val x: Self) extends AnyVal {
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
    def setAllowedModulesVarargs(value: String*): Self = this.set("allowedModules", js.Array(value :_*))
    @scala.inline
    def setAllowedModules(value: js.Array[String] | String): Self = this.set("allowedModules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedModules: Self = this.set("allowedModules", js.undefined)
    @scala.inline
    def setStrategy(value: `dedicated-process` | `http-server` | `in-process` | String): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
  }
  
}

