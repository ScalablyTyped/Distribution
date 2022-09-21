package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIosDevice extends StObject {
  
  /**
    * Required. The id of the iOS device to be used. Use the TestEnvironmentDiscoveryService to get supported options.
    */
  var iosModelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The id of the iOS major software version to be used. Use the TestEnvironmentDiscoveryService to get supported options.
    */
  var iosVersionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The locale the test device used for testing. Use the TestEnvironmentDiscoveryService to get supported options.
    */
  var locale: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. How the device is oriented during the test. Use the TestEnvironmentDiscoveryService to get supported options.
    */
  var orientation: js.UndefOr[String | Null] = js.undefined
}
object SchemaIosDevice {
  
  inline def apply(): SchemaIosDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosDevice]
  }
  
  extension [Self <: SchemaIosDevice](x: Self) {
    
    inline def setIosModelId(value: String): Self = StObject.set(x, "iosModelId", value.asInstanceOf[js.Any])
    
    inline def setIosModelIdNull: Self = StObject.set(x, "iosModelId", null)
    
    inline def setIosModelIdUndefined: Self = StObject.set(x, "iosModelId", js.undefined)
    
    inline def setIosVersionId(value: String): Self = StObject.set(x, "iosVersionId", value.asInstanceOf[js.Any])
    
    inline def setIosVersionIdNull: Self = StObject.set(x, "iosVersionId", null)
    
    inline def setIosVersionIdUndefined: Self = StObject.set(x, "iosVersionId", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleNull: Self = StObject.set(x, "locale", null)
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationNull: Self = StObject.set(x, "orientation", null)
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
  }
}
