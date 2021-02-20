package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The currently supported Android devices.
  */
@js.native
trait SchemaAndroidDeviceCatalog extends StObject {
  
  /**
    * The set of supported Android device models.
    */
  var models: js.UndefOr[js.Array[SchemaAndroidModel]] = js.native
  
  /**
    * The set of supported runtime configurations.
    */
  var runtimeConfiguration: js.UndefOr[SchemaAndroidRuntimeConfiguration] = js.native
  
  /**
    * The set of supported Android OS versions.
    */
  var versions: js.UndefOr[js.Array[SchemaAndroidVersion]] = js.native
}
object SchemaAndroidDeviceCatalog {
  
  @scala.inline
  def apply(): SchemaAndroidDeviceCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidDeviceCatalog]
  }
  
  @scala.inline
  implicit class SchemaAndroidDeviceCatalogMutableBuilder[Self <: SchemaAndroidDeviceCatalog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModels(value: js.Array[SchemaAndroidModel]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
    
    @scala.inline
    def setModelsVarargs(value: SchemaAndroidModel*): Self = StObject.set(x, "models", js.Array(value :_*))
    
    @scala.inline
    def setRuntimeConfiguration(value: SchemaAndroidRuntimeConfiguration): Self = StObject.set(x, "runtimeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeConfigurationUndefined: Self = StObject.set(x, "runtimeConfiguration", js.undefined)
    
    @scala.inline
    def setVersions(value: js.Array[SchemaAndroidVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: SchemaAndroidVersion*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
