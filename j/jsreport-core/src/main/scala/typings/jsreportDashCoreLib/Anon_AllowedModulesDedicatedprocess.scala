package typings
package jsreportDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedModulesDedicatedprocess extends js.Object {
  var allowedModules: js.Array[java.lang.String] | java.lang.String
  var strategy: jsreportDashCoreLib.jsreportDashCoreLibStrings.`dedicated-process` | jsreportDashCoreLib.jsreportDashCoreLibStrings.`http-server` | jsreportDashCoreLib.jsreportDashCoreLibStrings.`in-process` | java.lang.String
}

object Anon_AllowedModulesDedicatedprocess {
  @scala.inline
  def apply(
    allowedModules: js.Array[java.lang.String] | java.lang.String,
    strategy: jsreportDashCoreLib.jsreportDashCoreLibStrings.`dedicated-process` | jsreportDashCoreLib.jsreportDashCoreLibStrings.`http-server` | jsreportDashCoreLib.jsreportDashCoreLibStrings.`in-process` | java.lang.String
  ): Anon_AllowedModulesDedicatedprocess = {
    val __obj = js.Dynamic.literal(allowedModules = allowedModules.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AllowedModulesDedicatedprocess]
  }
}

