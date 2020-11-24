package typings.jsreportCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<jsreport-core.jsreport-core.Configuration> */
@js.native
trait PartialConfiguration extends js.Object {
  
  var autoTempCleanup: js.UndefOr[Boolean] = js.native
  
  var dataDirectory: js.UndefOr[String] = js.native
  
  var extensionsLocationCache: js.UndefOr[Boolean] = js.native
  
  var loadConfig: js.UndefOr[Boolean] = js.native
  
  var logger: js.UndefOr[Silent] = js.native
  
  var rootDirectory: js.UndefOr[String] = js.native
  
  var scripts: js.UndefOr[AllowedModules] = js.native
  
  var tasks: js.UndefOr[PartialallowedModulesArra] = js.native
  
  var tempDirectory: js.UndefOr[String] = js.native
}
object PartialConfiguration {
  
  @scala.inline
  def apply(): PartialConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfiguration]
  }
  
  @scala.inline
  implicit class PartialConfigurationOps[Self <: PartialConfiguration] (val x: Self) extends AnyVal {
    
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
    def deleteAutoTempCleanup: Self = this.set("autoTempCleanup", js.undefined)
    
    @scala.inline
    def setDataDirectory(value: String): Self = this.set("dataDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataDirectory: Self = this.set("dataDirectory", js.undefined)
    
    @scala.inline
    def setExtensionsLocationCache(value: Boolean): Self = this.set("extensionsLocationCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionsLocationCache: Self = this.set("extensionsLocationCache", js.undefined)
    
    @scala.inline
    def setLoadConfig(value: Boolean): Self = this.set("loadConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadConfig: Self = this.set("loadConfig", js.undefined)
    
    @scala.inline
    def setLogger(value: Silent): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setRootDirectory(value: String): Self = this.set("rootDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootDirectory: Self = this.set("rootDirectory", js.undefined)
    
    @scala.inline
    def setScripts(value: AllowedModules): Self = this.set("scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
    
    @scala.inline
    def setTasks(value: PartialallowedModulesArra): Self = this.set("tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTasks: Self = this.set("tasks", js.undefined)
    
    @scala.inline
    def setTempDirectory(value: String): Self = this.set("tempDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTempDirectory: Self = this.set("tempDirectory", js.undefined)
  }
}
