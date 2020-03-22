package typings.jsreportCore.mod

import typings.jsreportCore.AnonAllowedModules
import typings.jsreportCore.AnonSilent
import typings.jsreportCore.PartialallowedModulesArra
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var autoTempCleanup: Boolean
  var dataDirectory: String
  var extensionsLocationCache: Boolean
  var loadConfig: Boolean
  var logger: AnonSilent
  var rootDirectory: String
  var scripts: AnonAllowedModules
  var tasks: PartialallowedModulesArra
  var tempDirectory: String
}

object Configuration {
  @scala.inline
  def apply(
    autoTempCleanup: Boolean,
    dataDirectory: String,
    extensionsLocationCache: Boolean,
    loadConfig: Boolean,
    logger: AnonSilent,
    rootDirectory: String,
    scripts: AnonAllowedModules,
    tasks: PartialallowedModulesArra,
    tempDirectory: String
  ): Configuration = {
    val __obj = js.Dynamic.literal(autoTempCleanup = autoTempCleanup.asInstanceOf[js.Any], dataDirectory = dataDirectory.asInstanceOf[js.Any], extensionsLocationCache = extensionsLocationCache.asInstanceOf[js.Any], loadConfig = loadConfig.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], rootDirectory = rootDirectory.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], tempDirectory = tempDirectory.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Configuration]
  }
}

