package typings.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetConfiguration extends StObject {
  
  /** The configuration to use for this deployment. */
  var config: js.UndefOr[ConfigFile] = js.undefined
  
  /**
    * Specifies any files to import for this configuration. This can be used to import templates or other files. For example, you might import a text file in order to use the file in a
    * template.
    */
  var imports: js.UndefOr[js.Array[ImportFile]] = js.undefined
}
object TargetConfiguration {
  
  @scala.inline
  def apply(): TargetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetConfiguration]
  }
  
  @scala.inline
  implicit class TargetConfigurationMutableBuilder[Self <: TargetConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: ConfigFile): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setImports(value: js.Array[ImportFile]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    @scala.inline
    def setImportsVarargs(value: ImportFile*): Self = StObject.set(x, "imports", js.Array(value :_*))
  }
}
