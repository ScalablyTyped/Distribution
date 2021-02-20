package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of a test environment.
  */
@js.native
trait SchemaTestEnvironmentCatalog extends StObject {
  
  /**
    * Supported Android devices.
    */
  var androidDeviceCatalog: js.UndefOr[SchemaAndroidDeviceCatalog] = js.native
  
  /**
    * Supported iOS devices.
    */
  var iosDeviceCatalog: js.UndefOr[SchemaIosDeviceCatalog] = js.native
  
  /**
    * Supported network configurations.
    */
  var networkConfigurationCatalog: js.UndefOr[SchemaNetworkConfigurationCatalog] = js.native
  
  /**
    * The software test environment provided by TestExecutionService.
    */
  var softwareCatalog: js.UndefOr[SchemaProvidedSoftwareCatalog] = js.native
}
object SchemaTestEnvironmentCatalog {
  
  @scala.inline
  def apply(): SchemaTestEnvironmentCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestEnvironmentCatalog]
  }
  
  @scala.inline
  implicit class SchemaTestEnvironmentCatalogMutableBuilder[Self <: SchemaTestEnvironmentCatalog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidDeviceCatalog(value: SchemaAndroidDeviceCatalog): Self = StObject.set(x, "androidDeviceCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidDeviceCatalogUndefined: Self = StObject.set(x, "androidDeviceCatalog", js.undefined)
    
    @scala.inline
    def setIosDeviceCatalog(value: SchemaIosDeviceCatalog): Self = StObject.set(x, "iosDeviceCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosDeviceCatalogUndefined: Self = StObject.set(x, "iosDeviceCatalog", js.undefined)
    
    @scala.inline
    def setNetworkConfigurationCatalog(value: SchemaNetworkConfigurationCatalog): Self = StObject.set(x, "networkConfigurationCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkConfigurationCatalogUndefined: Self = StObject.set(x, "networkConfigurationCatalog", js.undefined)
    
    @scala.inline
    def setSoftwareCatalog(value: SchemaProvidedSoftwareCatalog): Self = StObject.set(x, "softwareCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareCatalogUndefined: Self = StObject.set(x, "softwareCatalog", js.undefined)
  }
}
