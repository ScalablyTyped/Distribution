package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScreenviewData extends StObject {
  
  /**
    * The application name.
    */
  var appName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Mobile manufacturer or branded name. Eg: "Google", "Apple" etc.
    */
  var mobileDeviceBranding: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Mobile device model. Eg: "Pixel", "iPhone" etc.
    */
  var mobileDeviceModel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the screen.
    */
  var screenName: js.UndefOr[String | Null] = js.undefined
}
object SchemaScreenviewData {
  
  inline def apply(): SchemaScreenviewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScreenviewData]
  }
  
  extension [Self <: SchemaScreenviewData](x: Self) {
    
    inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameNull: Self = StObject.set(x, "appName", null)
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    inline def setMobileDeviceBranding(value: String): Self = StObject.set(x, "mobileDeviceBranding", value.asInstanceOf[js.Any])
    
    inline def setMobileDeviceBrandingNull: Self = StObject.set(x, "mobileDeviceBranding", null)
    
    inline def setMobileDeviceBrandingUndefined: Self = StObject.set(x, "mobileDeviceBranding", js.undefined)
    
    inline def setMobileDeviceModel(value: String): Self = StObject.set(x, "mobileDeviceModel", value.asInstanceOf[js.Any])
    
    inline def setMobileDeviceModelNull: Self = StObject.set(x, "mobileDeviceModel", null)
    
    inline def setMobileDeviceModelUndefined: Self = StObject.set(x, "mobileDeviceModel", js.undefined)
    
    inline def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
    
    inline def setScreenNameNull: Self = StObject.set(x, "screenName", null)
    
    inline def setScreenNameUndefined: Self = StObject.set(x, "screenName", js.undefined)
  }
}
