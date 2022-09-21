package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSiteVideoSettings extends StObject {
  
  /**
    * Settings for the companion creatives of video creatives served to this site.
    */
  var companionSettings: js.UndefOr[SchemaSiteCompanionSetting] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#siteVideoSettings".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether OBA icons are enabled for this placement.
    */
  var obaEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Settings for the OBA icon of video creatives served to this site. This will act as default for new placements created under this site.
    */
  var obaSettings: js.UndefOr[SchemaObaIcon] = js.undefined
  
  /**
    * Orientation of a site template used for video. This will act as default for new placements created under this site.
    */
  var orientation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Settings for the skippability of video creatives served to this site. This will act as default for new placements created under this site.
    */
  var skippableSettings: js.UndefOr[SchemaSiteSkippableSetting] = js.undefined
  
  /**
    * Settings for the transcodes of video creatives served to this site. This will act as default for new placements created under this site.
    */
  var transcodeSettings: js.UndefOr[SchemaSiteTranscodeSetting] = js.undefined
}
object SchemaSiteVideoSettings {
  
  inline def apply(): SchemaSiteVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteVideoSettings]
  }
  
  extension [Self <: SchemaSiteVideoSettings](x: Self) {
    
    inline def setCompanionSettings(value: SchemaSiteCompanionSetting): Self = StObject.set(x, "companionSettings", value.asInstanceOf[js.Any])
    
    inline def setCompanionSettingsUndefined: Self = StObject.set(x, "companionSettings", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setObaEnabled(value: Boolean): Self = StObject.set(x, "obaEnabled", value.asInstanceOf[js.Any])
    
    inline def setObaEnabledNull: Self = StObject.set(x, "obaEnabled", null)
    
    inline def setObaEnabledUndefined: Self = StObject.set(x, "obaEnabled", js.undefined)
    
    inline def setObaSettings(value: SchemaObaIcon): Self = StObject.set(x, "obaSettings", value.asInstanceOf[js.Any])
    
    inline def setObaSettingsUndefined: Self = StObject.set(x, "obaSettings", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationNull: Self = StObject.set(x, "orientation", null)
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setSkippableSettings(value: SchemaSiteSkippableSetting): Self = StObject.set(x, "skippableSettings", value.asInstanceOf[js.Any])
    
    inline def setSkippableSettingsUndefined: Self = StObject.set(x, "skippableSettings", js.undefined)
    
    inline def setTranscodeSettings(value: SchemaSiteTranscodeSetting): Self = StObject.set(x, "transcodeSettings", value.asInstanceOf[js.Any])
    
    inline def setTranscodeSettingsUndefined: Self = StObject.set(x, "transcodeSettings", js.undefined)
  }
}
