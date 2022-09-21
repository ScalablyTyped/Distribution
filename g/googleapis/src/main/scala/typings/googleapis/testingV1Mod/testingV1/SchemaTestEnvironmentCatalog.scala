package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestEnvironmentCatalog extends StObject {
  
  /**
    * Supported Android devices.
    */
  var androidDeviceCatalog: js.UndefOr[SchemaAndroidDeviceCatalog] = js.undefined
  
  /**
    * The IP blocks used by devices in the test environment.
    */
  var deviceIpBlockCatalog: js.UndefOr[SchemaDeviceIpBlockCatalog] = js.undefined
  
  /**
    * Supported iOS devices.
    */
  var iosDeviceCatalog: js.UndefOr[SchemaIosDeviceCatalog] = js.undefined
  
  /**
    * Supported network configurations.
    */
  var networkConfigurationCatalog: js.UndefOr[SchemaNetworkConfigurationCatalog] = js.undefined
  
  /**
    * The software test environment provided by TestExecutionService.
    */
  var softwareCatalog: js.UndefOr[SchemaProvidedSoftwareCatalog] = js.undefined
}
object SchemaTestEnvironmentCatalog {
  
  inline def apply(): SchemaTestEnvironmentCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestEnvironmentCatalog]
  }
  
  extension [Self <: SchemaTestEnvironmentCatalog](x: Self) {
    
    inline def setAndroidDeviceCatalog(value: SchemaAndroidDeviceCatalog): Self = StObject.set(x, "androidDeviceCatalog", value.asInstanceOf[js.Any])
    
    inline def setAndroidDeviceCatalogUndefined: Self = StObject.set(x, "androidDeviceCatalog", js.undefined)
    
    inline def setDeviceIpBlockCatalog(value: SchemaDeviceIpBlockCatalog): Self = StObject.set(x, "deviceIpBlockCatalog", value.asInstanceOf[js.Any])
    
    inline def setDeviceIpBlockCatalogUndefined: Self = StObject.set(x, "deviceIpBlockCatalog", js.undefined)
    
    inline def setIosDeviceCatalog(value: SchemaIosDeviceCatalog): Self = StObject.set(x, "iosDeviceCatalog", value.asInstanceOf[js.Any])
    
    inline def setIosDeviceCatalogUndefined: Self = StObject.set(x, "iosDeviceCatalog", js.undefined)
    
    inline def setNetworkConfigurationCatalog(value: SchemaNetworkConfigurationCatalog): Self = StObject.set(x, "networkConfigurationCatalog", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigurationCatalogUndefined: Self = StObject.set(x, "networkConfigurationCatalog", js.undefined)
    
    inline def setSoftwareCatalog(value: SchemaProvidedSoftwareCatalog): Self = StObject.set(x, "softwareCatalog", value.asInstanceOf[js.Any])
    
    inline def setSoftwareCatalogUndefined: Self = StObject.set(x, "softwareCatalog", js.undefined)
  }
}
