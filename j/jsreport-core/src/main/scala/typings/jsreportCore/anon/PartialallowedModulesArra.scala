package typings.jsreportCore.anon

import typings.jsreportCore.jsreportCoreStrings.`dedicated-process`
import typings.jsreportCore.jsreportCoreStrings.`http-server`
import typings.jsreportCore.jsreportCoreStrings.`in-process`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  allowedModules  :std.Array<string> | string,   strategy  :'dedicated-process' | 'http-server' | 'in-process' | string}> */
trait PartialallowedModulesArra extends js.Object {
  var allowedModules: js.UndefOr[js.Array[String] | String] = js.undefined
  var strategy: js.UndefOr[`dedicated-process` | `http-server` | `in-process` | String] = js.undefined
}

object PartialallowedModulesArra {
  @scala.inline
  def apply(
    allowedModules: js.Array[String] | String = null,
    strategy: `dedicated-process` | `http-server` | `in-process` | String = null
  ): PartialallowedModulesArra = {
    val __obj = js.Dynamic.literal()
    if (allowedModules != null) __obj.updateDynamic("allowedModules")(allowedModules.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialallowedModulesArra]
  }
}

