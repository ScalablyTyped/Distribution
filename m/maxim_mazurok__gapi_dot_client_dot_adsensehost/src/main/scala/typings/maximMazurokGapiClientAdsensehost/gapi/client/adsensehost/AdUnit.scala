package typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost

import typings.maximMazurokGapiClientAdsensehost.anon.BackupOption
import typings.maximMazurokGapiClientAdsensehost.anon.MarkupLanguage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdUnit extends StObject {
  
  /** Identity code of this ad unit, not necessarily unique across ad clients. */
  var code: js.UndefOr[String] = js.undefined
  
  /** Settings specific to content ads (AFC) and highend mobile content ads (AFMC - deprecated). */
  var contentAdsSettings: js.UndefOr[BackupOption] = js.undefined
  
  /** Custom style information specific to this ad unit. */
  var customStyle: js.UndefOr[AdStyle] = js.undefined
  
  /** Unique identifier of this ad unit. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Kind of resource this is, in this case adsensehost#adUnit. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Settings specific to WAP mobile content ads (AFMC - deprecated). */
  var mobileContentAdsSettings: js.UndefOr[MarkupLanguage] = js.undefined
  
  /** Name of this ad unit. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Status of this ad unit. Possible values are:
    * NEW: Indicates that the ad unit was created within the last seven days and does not yet have any activity associated with it.
    *
    * ACTIVE: Indicates that there has been activity on this ad unit in the last seven days.
    *
    * INACTIVE: Indicates that there has been no activity on this ad unit in the last seven days.
    */
  var status: js.UndefOr[String] = js.undefined
}
object AdUnit {
  
  inline def apply(): AdUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdUnit]
  }
  
  extension [Self <: AdUnit](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setContentAdsSettings(value: BackupOption): Self = StObject.set(x, "contentAdsSettings", value.asInstanceOf[js.Any])
    
    inline def setContentAdsSettingsUndefined: Self = StObject.set(x, "contentAdsSettings", js.undefined)
    
    inline def setCustomStyle(value: AdStyle): Self = StObject.set(x, "customStyle", value.asInstanceOf[js.Any])
    
    inline def setCustomStyleUndefined: Self = StObject.set(x, "customStyle", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMobileContentAdsSettings(value: MarkupLanguage): Self = StObject.set(x, "mobileContentAdsSettings", value.asInstanceOf[js.Any])
    
    inline def setMobileContentAdsSettingsUndefined: Self = StObject.set(x, "mobileContentAdsSettings", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
