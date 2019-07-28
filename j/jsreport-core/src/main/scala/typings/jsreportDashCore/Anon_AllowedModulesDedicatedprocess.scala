package typings.jsreportDashCore

import typings.jsreportDashCore.jsreportDashCoreStrings.`dedicated-process`
import typings.jsreportDashCore.jsreportDashCoreStrings.`http-server`
import typings.jsreportDashCore.jsreportDashCoreStrings.`in-process`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedModulesDedicatedprocess extends js.Object {
  var allowedModules: js.Array[String] | String
  var strategy: `dedicated-process` | `http-server` | `in-process` | String
}

object Anon_AllowedModulesDedicatedprocess {
  @scala.inline
  def apply(
    allowedModules: js.Array[String] | String,
    strategy: `dedicated-process` | `http-server` | `in-process` | String
  ): Anon_AllowedModulesDedicatedprocess = {
    val __obj = js.Dynamic.literal(allowedModules = allowedModules.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AllowedModulesDedicatedprocess]
  }
}

