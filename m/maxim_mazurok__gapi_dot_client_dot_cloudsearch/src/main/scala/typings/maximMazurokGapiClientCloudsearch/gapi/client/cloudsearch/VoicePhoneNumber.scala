package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoicePhoneNumber extends StObject {
  
  /** E.164 formatted full phone number with leading +. This field also represents encoded form of short telephone numbers in E.164 format. e.g. "911" is encoded as "+1911". */
  var e164: js.UndefOr[String] = js.undefined
  
  /** Additional data that could be added using the libphonenumber API. */
  var i18nData: js.UndefOr[VoicePhoneNumberI18nData] = js.undefined
}
object VoicePhoneNumber {
  
  inline def apply(): VoicePhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoicePhoneNumber]
  }
  
  extension [Self <: VoicePhoneNumber](x: Self) {
    
    inline def setE164(value: String): Self = StObject.set(x, "e164", value.asInstanceOf[js.Any])
    
    inline def setE164Undefined: Self = StObject.set(x, "e164", js.undefined)
    
    inline def setI18nData(value: VoicePhoneNumberI18nData): Self = StObject.set(x, "i18nData", value.asInstanceOf[js.Any])
    
    inline def setI18nDataUndefined: Self = StObject.set(x, "i18nData", js.undefined)
  }
}
