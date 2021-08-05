package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video Settings
  */
trait SchemaSiteVideoSettings extends StObject {
  
  /**
    * Settings for the companion creatives of video creatives served to this
    * site.
    */
  var companionSettings: js.UndefOr[SchemaSiteCompanionSetting] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#siteVideoSettings&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Orientation of a site template used for video. This will act as default
    * for new placements created under this site.
    */
  var orientation: js.UndefOr[String] = js.undefined
  
  /**
    * Settings for the skippability of video creatives served to this site.
    * This will act as default for new placements created under this site.
    */
  var skippableSettings: js.UndefOr[SchemaSiteSkippableSetting] = js.undefined
  
  /**
    * Settings for the transcodes of video creatives served to this site. This
    * will act as default for new placements created under this site.
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
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setSkippableSettings(value: SchemaSiteSkippableSetting): Self = StObject.set(x, "skippableSettings", value.asInstanceOf[js.Any])
    
    inline def setSkippableSettingsUndefined: Self = StObject.set(x, "skippableSettings", js.undefined)
    
    inline def setTranscodeSettings(value: SchemaSiteTranscodeSetting): Self = StObject.set(x, "transcodeSettings", value.asInstanceOf[js.Any])
    
    inline def setTranscodeSettingsUndefined: Self = StObject.set(x, "transcodeSettings", js.undefined)
  }
}
