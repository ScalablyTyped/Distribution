package typings
package jsreportDashCoreLib.jsreportDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var autoTempCleanup: scala.Boolean
  var dataDirectory: java.lang.String
  var extensionsLocationCache: scala.Boolean
  var loadConfig: scala.Boolean
  var logger: jsreportDashCoreLib.Anon_Silent
  var rootDirectory: java.lang.String
  var scripts: jsreportDashCoreLib.Anon_AllowedModules
  var tasks: stdLib.Partial[jsreportDashCoreLib.Anon_AllowedModulesDedicatedprocess]
  var tempDirectory: java.lang.String
}

object Configuration {
  @scala.inline
  def apply(
    autoTempCleanup: scala.Boolean,
    dataDirectory: java.lang.String,
    extensionsLocationCache: scala.Boolean,
    loadConfig: scala.Boolean,
    logger: jsreportDashCoreLib.Anon_Silent,
    rootDirectory: java.lang.String,
    scripts: jsreportDashCoreLib.Anon_AllowedModules,
    tasks: stdLib.Partial[jsreportDashCoreLib.Anon_AllowedModulesDedicatedprocess],
    tempDirectory: java.lang.String
  ): Configuration = {
    val __obj = js.Dynamic.literal(autoTempCleanup = autoTempCleanup, dataDirectory = dataDirectory, extensionsLocationCache = extensionsLocationCache, loadConfig = loadConfig, logger = logger, rootDirectory = rootDirectory, scripts = scripts, tasks = tasks, tempDirectory = tempDirectory)
  
    __obj.asInstanceOf[Configuration]
  }
}

