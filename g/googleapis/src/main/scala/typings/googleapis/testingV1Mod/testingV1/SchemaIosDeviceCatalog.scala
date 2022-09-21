package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIosDeviceCatalog extends StObject {
  
  /**
    * The set of supported iOS device models.
    */
  var models: js.UndefOr[js.Array[SchemaIosModel]] = js.undefined
  
  /**
    * The set of supported runtime configurations.
    */
  var runtimeConfiguration: js.UndefOr[SchemaIosRuntimeConfiguration] = js.undefined
  
  /**
    * The set of supported iOS software versions.
    */
  var versions: js.UndefOr[js.Array[SchemaIosVersion]] = js.undefined
  
  /**
    * The set of supported Xcode versions.
    */
  var xcodeVersions: js.UndefOr[js.Array[SchemaXcodeVersion]] = js.undefined
}
object SchemaIosDeviceCatalog {
  
  inline def apply(): SchemaIosDeviceCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosDeviceCatalog]
  }
  
  extension [Self <: SchemaIosDeviceCatalog](x: Self) {
    
    inline def setModels(value: js.Array[SchemaIosModel]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
    
    inline def setModelsVarargs(value: SchemaIosModel*): Self = StObject.set(x, "models", js.Array(value*))
    
    inline def setRuntimeConfiguration(value: SchemaIosRuntimeConfiguration): Self = StObject.set(x, "runtimeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRuntimeConfigurationUndefined: Self = StObject.set(x, "runtimeConfiguration", js.undefined)
    
    inline def setVersions(value: js.Array[SchemaIosVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: SchemaIosVersion*): Self = StObject.set(x, "versions", js.Array(value*))
    
    inline def setXcodeVersions(value: js.Array[SchemaXcodeVersion]): Self = StObject.set(x, "xcodeVersions", value.asInstanceOf[js.Any])
    
    inline def setXcodeVersionsUndefined: Self = StObject.set(x, "xcodeVersions", js.undefined)
    
    inline def setXcodeVersionsVarargs(value: SchemaXcodeVersion*): Self = StObject.set(x, "xcodeVersions", js.Array(value*))
  }
}
