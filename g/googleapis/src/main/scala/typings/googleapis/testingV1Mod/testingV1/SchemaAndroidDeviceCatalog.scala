package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The currently supported Android devices.
  */
trait SchemaAndroidDeviceCatalog extends StObject {
  
  /**
    * The set of supported Android device models.
    */
  var models: js.UndefOr[js.Array[SchemaAndroidModel]] = js.undefined
  
  /**
    * The set of supported runtime configurations.
    */
  var runtimeConfiguration: js.UndefOr[SchemaAndroidRuntimeConfiguration] = js.undefined
  
  /**
    * The set of supported Android OS versions.
    */
  var versions: js.UndefOr[js.Array[SchemaAndroidVersion]] = js.undefined
}
object SchemaAndroidDeviceCatalog {
  
  inline def apply(): SchemaAndroidDeviceCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidDeviceCatalog]
  }
  
  extension [Self <: SchemaAndroidDeviceCatalog](x: Self) {
    
    inline def setModels(value: js.Array[SchemaAndroidModel]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
    
    inline def setModelsVarargs(value: SchemaAndroidModel*): Self = StObject.set(x, "models", js.Array(value :_*))
    
    inline def setRuntimeConfiguration(value: SchemaAndroidRuntimeConfiguration): Self = StObject.set(x, "runtimeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRuntimeConfigurationUndefined: Self = StObject.set(x, "runtimeConfiguration", js.undefined)
    
    inline def setVersions(value: js.Array[SchemaAndroidVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: SchemaAndroidVersion*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
