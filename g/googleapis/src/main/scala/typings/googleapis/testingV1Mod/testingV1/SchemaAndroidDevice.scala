package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAndroidDevice extends StObject {
  
  /**
    * Required. The id of the Android device to be used. Use the TestEnvironmentDiscoveryService to get supported options.
    */
  var androidModelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The id of the Android OS version to be used. Use the TestEnvironmentDiscoveryService to get supported options.
    */
  var androidVersionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The locale the test device used for testing. Use the TestEnvironmentDiscoveryService to get supported options.
    */
  var locale: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. How the device is oriented during the test. Use the TestEnvironmentDiscoveryService to get supported options.
    */
  var orientation: js.UndefOr[String | Null] = js.undefined
}
object SchemaAndroidDevice {
  
  inline def apply(): SchemaAndroidDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidDevice]
  }
  
  extension [Self <: SchemaAndroidDevice](x: Self) {
    
    inline def setAndroidModelId(value: String): Self = StObject.set(x, "androidModelId", value.asInstanceOf[js.Any])
    
    inline def setAndroidModelIdNull: Self = StObject.set(x, "androidModelId", null)
    
    inline def setAndroidModelIdUndefined: Self = StObject.set(x, "androidModelId", js.undefined)
    
    inline def setAndroidVersionId(value: String): Self = StObject.set(x, "androidVersionId", value.asInstanceOf[js.Any])
    
    inline def setAndroidVersionIdNull: Self = StObject.set(x, "androidVersionId", null)
    
    inline def setAndroidVersionIdUndefined: Self = StObject.set(x, "androidVersionId", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleNull: Self = StObject.set(x, "locale", null)
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationNull: Self = StObject.set(x, "orientation", null)
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
  }
}
