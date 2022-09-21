package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.googleapis.anon.AdPosition
import typings.googleapis.anon.BackupOption
import typings.googleapis.anon.MarkupLanguage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdUnit extends StObject {
  
  /**
    * Identity code of this ad unit, not necessarily unique across ad clients.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Settings specific to content ads (AFC) and highend mobile content ads (AFMC - deprecated).
    */
  var contentAdsSettings: js.UndefOr[BackupOption | Null] = js.undefined
  
  /**
    * Custom style information specific to this ad unit.
    */
  var customStyle: js.UndefOr[SchemaAdStyle] = js.undefined
  
  /**
    * Settings specific to feed ads (AFF) - deprecated.
    */
  var feedAdsSettings: js.UndefOr[AdPosition | Null] = js.undefined
  
  /**
    * Unique identifier of this ad unit. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kind of resource this is, in this case adsense#adUnit.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Settings specific to WAP mobile content ads (AFMC) - deprecated.
    */
  var mobileContentAdsSettings: js.UndefOr[MarkupLanguage | Null] = js.undefined
  
  /**
    * Name of this ad unit.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the saved ad style which holds this ad unit's style information.
    */
  var savedStyleId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of this ad unit. Possible values are:
    * NEW: Indicates that the ad unit was created within the last seven days and does not yet have any activity associated with it.
    *
    * ACTIVE: Indicates that there has been activity on this ad unit in the last seven days.
    *
    * INACTIVE: Indicates that there has been no activity on this ad unit in the last seven days.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdUnit {
  
  inline def apply(): SchemaAdUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdUnit]
  }
  
  extension [Self <: SchemaAdUnit](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setContentAdsSettings(value: BackupOption): Self = StObject.set(x, "contentAdsSettings", value.asInstanceOf[js.Any])
    
    inline def setContentAdsSettingsNull: Self = StObject.set(x, "contentAdsSettings", null)
    
    inline def setContentAdsSettingsUndefined: Self = StObject.set(x, "contentAdsSettings", js.undefined)
    
    inline def setCustomStyle(value: SchemaAdStyle): Self = StObject.set(x, "customStyle", value.asInstanceOf[js.Any])
    
    inline def setCustomStyleUndefined: Self = StObject.set(x, "customStyle", js.undefined)
    
    inline def setFeedAdsSettings(value: AdPosition): Self = StObject.set(x, "feedAdsSettings", value.asInstanceOf[js.Any])
    
    inline def setFeedAdsSettingsNull: Self = StObject.set(x, "feedAdsSettings", null)
    
    inline def setFeedAdsSettingsUndefined: Self = StObject.set(x, "feedAdsSettings", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMobileContentAdsSettings(value: MarkupLanguage): Self = StObject.set(x, "mobileContentAdsSettings", value.asInstanceOf[js.Any])
    
    inline def setMobileContentAdsSettingsNull: Self = StObject.set(x, "mobileContentAdsSettings", null)
    
    inline def setMobileContentAdsSettingsUndefined: Self = StObject.set(x, "mobileContentAdsSettings", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSavedStyleId(value: String): Self = StObject.set(x, "savedStyleId", value.asInstanceOf[js.Any])
    
    inline def setSavedStyleIdNull: Self = StObject.set(x, "savedStyleId", null)
    
    inline def setSavedStyleIdUndefined: Self = StObject.set(x, "savedStyleId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
