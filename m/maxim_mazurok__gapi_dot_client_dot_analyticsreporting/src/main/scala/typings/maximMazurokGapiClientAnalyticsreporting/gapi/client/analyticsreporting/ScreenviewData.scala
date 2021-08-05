package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenviewData extends StObject {
  
  /** The application name. */
  var appName: js.UndefOr[String] = js.undefined
  
  /** Mobile manufacturer or branded name. Eg: "Google", "Apple" etc. */
  var mobileDeviceBranding: js.UndefOr[String] = js.undefined
  
  /** Mobile device model. Eg: "Pixel", "iPhone" etc. */
  var mobileDeviceModel: js.UndefOr[String] = js.undefined
  
  /** The name of the screen. */
  var screenName: js.UndefOr[String] = js.undefined
}
object ScreenviewData {
  
  inline def apply(): ScreenviewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenviewData]
  }
  
  extension [Self <: ScreenviewData](x: Self) {
    
    inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    inline def setMobileDeviceBranding(value: String): Self = StObject.set(x, "mobileDeviceBranding", value.asInstanceOf[js.Any])
    
    inline def setMobileDeviceBrandingUndefined: Self = StObject.set(x, "mobileDeviceBranding", js.undefined)
    
    inline def setMobileDeviceModel(value: String): Self = StObject.set(x, "mobileDeviceModel", value.asInstanceOf[js.Any])
    
    inline def setMobileDeviceModelUndefined: Self = StObject.set(x, "mobileDeviceModel", js.undefined)
    
    inline def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
    
    inline def setScreenNameUndefined: Self = StObject.set(x, "screenName", js.undefined)
  }
}
