package typings.jsreportDashCore.jsreportDashCoreMod

import typings.jsreportDashCore.Anon_AllowedModules
import typings.jsreportDashCore.Anon_AllowedModulesDedicatedprocess
import typings.jsreportDashCore.Anon_Silent
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var autoTempCleanup: Boolean
  var dataDirectory: String
  var extensionsLocationCache: Boolean
  var loadConfig: Boolean
  var logger: Anon_Silent
  var rootDirectory: String
  var scripts: Anon_AllowedModules
  var tasks: Partial[Anon_AllowedModulesDedicatedprocess]
  var tempDirectory: String
}

object Configuration {
  @scala.inline
  def apply(
    autoTempCleanup: Boolean,
    dataDirectory: String,
    extensionsLocationCache: Boolean,
    loadConfig: Boolean,
    logger: Anon_Silent,
    rootDirectory: String,
    scripts: Anon_AllowedModules,
    tasks: Partial[Anon_AllowedModulesDedicatedprocess],
    tempDirectory: String
  ): Configuration = {
    val __obj = js.Dynamic.literal(autoTempCleanup = autoTempCleanup, dataDirectory = dataDirectory, extensionsLocationCache = extensionsLocationCache, loadConfig = loadConfig, logger = logger, rootDirectory = rootDirectory, scripts = scripts, tasks = tasks, tempDirectory = tempDirectory)
  
    __obj.asInstanceOf[Configuration]
  }
}

