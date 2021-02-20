package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Signals associated with the device making the request.
  */
@js.native
trait SchemaDeviceInfo extends StObject {
  
  /**
    * Device model name.
    */
  var deviceModelName: js.UndefOr[String] = js.native
  
  /**
    * Device language code setting.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * Device language code setting obtained by executing JavaScript code in
    * WebView.
    */
  var languageCodeFromWebview: js.UndefOr[String] = js.native
  
  /**
    * Device language code raw setting. iOS does returns language code in
    * different format than iOS WebView. For example WebView returns en_US, but
    * iOS returns en-US. Field below will return raw value returned by iOS.
    */
  var languageCodeRaw: js.UndefOr[String] = js.native
  
  /**
    * Device display resolution height.
    */
  var screenResolutionHeight: js.UndefOr[String] = js.native
  
  /**
    * Device display resolution width.
    */
  var screenResolutionWidth: js.UndefOr[String] = js.native
  
  /**
    * Device timezone setting.
    */
  var timezone: js.UndefOr[String] = js.native
}
object SchemaDeviceInfo {
  
  @scala.inline
  def apply(): SchemaDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceInfo]
  }
  
  @scala.inline
  implicit class SchemaDeviceInfoMutableBuilder[Self <: SchemaDeviceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceModelName(value: String): Self = StObject.set(x, "deviceModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceModelNameUndefined: Self = StObject.set(x, "deviceModelName", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeFromWebview(value: String): Self = StObject.set(x, "languageCodeFromWebview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeFromWebviewUndefined: Self = StObject.set(x, "languageCodeFromWebview", js.undefined)
    
    @scala.inline
    def setLanguageCodeRaw(value: String): Self = StObject.set(x, "languageCodeRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeRawUndefined: Self = StObject.set(x, "languageCodeRaw", js.undefined)
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setScreenResolutionHeight(value: String): Self = StObject.set(x, "screenResolutionHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenResolutionHeightUndefined: Self = StObject.set(x, "screenResolutionHeight", js.undefined)
    
    @scala.inline
    def setScreenResolutionWidth(value: String): Self = StObject.set(x, "screenResolutionWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenResolutionWidthUndefined: Self = StObject.set(x, "screenResolutionWidth", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
