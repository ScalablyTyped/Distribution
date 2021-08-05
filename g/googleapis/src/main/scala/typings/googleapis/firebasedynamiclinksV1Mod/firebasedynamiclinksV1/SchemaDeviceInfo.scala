package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Signals associated with the device making the request.
  */
trait SchemaDeviceInfo extends StObject {
  
  /**
    * Device model name.
    */
  var deviceModelName: js.UndefOr[String] = js.undefined
  
  /**
    * Device language code setting.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Device language code setting obtained by executing JavaScript code in
    * WebView.
    */
  var languageCodeFromWebview: js.UndefOr[String] = js.undefined
  
  /**
    * Device language code raw setting. iOS does returns language code in
    * different format than iOS WebView. For example WebView returns en_US, but
    * iOS returns en-US. Field below will return raw value returned by iOS.
    */
  var languageCodeRaw: js.UndefOr[String] = js.undefined
  
  /**
    * Device display resolution height.
    */
  var screenResolutionHeight: js.UndefOr[String] = js.undefined
  
  /**
    * Device display resolution width.
    */
  var screenResolutionWidth: js.UndefOr[String] = js.undefined
  
  /**
    * Device timezone setting.
    */
  var timezone: js.UndefOr[String] = js.undefined
}
object SchemaDeviceInfo {
  
  inline def apply(): SchemaDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceInfo]
  }
  
  extension [Self <: SchemaDeviceInfo](x: Self) {
    
    inline def setDeviceModelName(value: String): Self = StObject.set(x, "deviceModelName", value.asInstanceOf[js.Any])
    
    inline def setDeviceModelNameUndefined: Self = StObject.set(x, "deviceModelName", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeFromWebview(value: String): Self = StObject.set(x, "languageCodeFromWebview", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeFromWebviewUndefined: Self = StObject.set(x, "languageCodeFromWebview", js.undefined)
    
    inline def setLanguageCodeRaw(value: String): Self = StObject.set(x, "languageCodeRaw", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeRawUndefined: Self = StObject.set(x, "languageCodeRaw", js.undefined)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setScreenResolutionHeight(value: String): Self = StObject.set(x, "screenResolutionHeight", value.asInstanceOf[js.Any])
    
    inline def setScreenResolutionHeightUndefined: Self = StObject.set(x, "screenResolutionHeight", js.undefined)
    
    inline def setScreenResolutionWidth(value: String): Self = StObject.set(x, "screenResolutionWidth", value.asInstanceOf[js.Any])
    
    inline def setScreenResolutionWidthUndefined: Self = StObject.set(x, "screenResolutionWidth", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
