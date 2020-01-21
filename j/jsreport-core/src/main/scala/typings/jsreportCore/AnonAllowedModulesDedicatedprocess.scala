package typings.jsreportCore

import typings.jsreportCore.jsreportCoreStrings.`dedicated-process`
import typings.jsreportCore.jsreportCoreStrings.`http-server`
import typings.jsreportCore.jsreportCoreStrings.`in-process`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowedModulesDedicatedprocess extends js.Object {
  var allowedModules: js.Array[String] | String
  var strategy: `dedicated-process` | `http-server` | `in-process` | String
}

object AnonAllowedModulesDedicatedprocess {
  @scala.inline
  def apply(
    allowedModules: js.Array[String] | String,
    strategy: `dedicated-process` | `http-server` | `in-process` | String
  ): AnonAllowedModulesDedicatedprocess = {
    val __obj = js.Dynamic.literal(allowedModules = allowedModules.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllowedModulesDedicatedprocess]
  }
}

