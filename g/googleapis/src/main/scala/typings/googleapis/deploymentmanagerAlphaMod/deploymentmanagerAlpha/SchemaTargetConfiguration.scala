package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetConfiguration extends StObject {
  
  /**
    * The configuration to use for this deployment.
    */
  var config: js.UndefOr[SchemaConfigFile] = js.undefined
  
  /**
    * Specifies any files to import for this configuration. This can be used to import templates or other files. For example, you might import a text file in order to use the file in a template.
    */
  var imports: js.UndefOr[js.Array[SchemaImportFile]] = js.undefined
}
object SchemaTargetConfiguration {
  
  inline def apply(): SchemaTargetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetConfiguration]
  }
  
  extension [Self <: SchemaTargetConfiguration](x: Self) {
    
    inline def setConfig(value: SchemaConfigFile): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setImports(value: js.Array[SchemaImportFile]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: SchemaImportFile*): Self = StObject.set(x, "imports", js.Array(value*))
  }
}
