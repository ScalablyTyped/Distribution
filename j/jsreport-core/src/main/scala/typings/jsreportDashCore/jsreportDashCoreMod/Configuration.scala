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
    val __obj = js.Dynamic.literal(autoTempCleanup = autoTempCleanup.asInstanceOf[js.Any], dataDirectory = dataDirectory.asInstanceOf[js.Any], extensionsLocationCache = extensionsLocationCache.asInstanceOf[js.Any], loadConfig = loadConfig.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], rootDirectory = rootDirectory.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], tempDirectory = tempDirectory.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Configuration]
  }
}

