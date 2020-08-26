package typings.jsreportCore.mod

import typings.jsreportCore.anon.AllowedModules
import typings.jsreportCore.anon.PartialallowedModulesArra
import typings.jsreportCore.anon.Silent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  var autoTempCleanup: Boolean = js.native
  var dataDirectory: String = js.native
  var extensionsLocationCache: Boolean = js.native
  var loadConfig: Boolean = js.native
  var logger: Silent = js.native
  var rootDirectory: String = js.native
  var scripts: AllowedModules = js.native
  var tasks: PartialallowedModulesArra = js.native
  var tempDirectory: String = js.native
}

object Configuration {
  @scala.inline
  def apply(
    autoTempCleanup: Boolean,
    dataDirectory: String,
    extensionsLocationCache: Boolean,
    loadConfig: Boolean,
    logger: Silent,
    rootDirectory: String,
    scripts: AllowedModules,
    tasks: PartialallowedModulesArra,
    tempDirectory: String
  ): Configuration = {
    val __obj = js.Dynamic.literal(autoTempCleanup = autoTempCleanup.asInstanceOf[js.Any], dataDirectory = dataDirectory.asInstanceOf[js.Any], extensionsLocationCache = extensionsLocationCache.asInstanceOf[js.Any], loadConfig = loadConfig.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], rootDirectory = rootDirectory.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], tempDirectory = tempDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
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
    def setAutoTempCleanup(value: Boolean): Self = this.set("autoTempCleanup", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataDirectory(value: String): Self = this.set("dataDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensionsLocationCache(value: Boolean): Self = this.set("extensionsLocationCache", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadConfig(value: Boolean): Self = this.set("loadConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogger(value: Silent): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootDirectory(value: String): Self = this.set("rootDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def setScripts(value: AllowedModules): Self = this.set("scripts", value.asInstanceOf[js.Any])
    @scala.inline
    def setTasks(value: PartialallowedModulesArra): Self = this.set("tasks", value.asInstanceOf[js.Any])
    @scala.inline
    def setTempDirectory(value: String): Self = this.set("tempDirectory", value.asInstanceOf[js.Any])
  }
  
}

