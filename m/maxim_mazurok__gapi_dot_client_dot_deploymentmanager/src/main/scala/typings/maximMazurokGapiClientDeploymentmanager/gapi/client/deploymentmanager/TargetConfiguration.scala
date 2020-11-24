package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetConfiguration extends js.Object {
  
  /** The configuration to use for this deployment. */
  var config: js.UndefOr[ConfigFile] = js.native
  
  /**
    * Specifies any files to import for this configuration. This can be used to import templates or other files. For example, you might import a text file in order to use the file in a
    * template.
    */
  var imports: js.UndefOr[js.Array[ImportFile]] = js.native
}
object TargetConfiguration {
  
  @scala.inline
  def apply(): TargetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetConfiguration]
  }
  
  @scala.inline
  implicit class TargetConfigurationOps[Self <: TargetConfiguration] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: ConfigFile): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setImportsVarargs(value: ImportFile*): Self = this.set("imports", js.Array(value :_*))
    
    @scala.inline
    def setImports(value: js.Array[ImportFile]): Self = this.set("imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImports: Self = this.set("imports", js.undefined)
  }
}
