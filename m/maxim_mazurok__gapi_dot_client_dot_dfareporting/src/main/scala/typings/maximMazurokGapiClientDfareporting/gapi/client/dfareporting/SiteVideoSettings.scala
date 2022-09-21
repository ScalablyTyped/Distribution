package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SiteVideoSettings extends StObject {
  
  /** Settings for the companion creatives of video creatives served to this site. */
  var companionSettings: js.UndefOr[SiteCompanionSetting] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#siteVideoSettings". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Whether OBA icons are enabled for this placement. */
  var obaEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Settings for the OBA icon of video creatives served to this site. This will act as default for new placements created under this site. */
  var obaSettings: js.UndefOr[ObaIcon] = js.undefined
  
  /** Orientation of a site template used for video. This will act as default for new placements created under this site. */
  var orientation: js.UndefOr[String] = js.undefined
  
  /**
    * Publisher specification ID used to identify site-associated publisher requirements and automatically populate transcode settings. If publisher specification ID is specified, it will
    * take precedence over transcode settings.
    */
  var publisherSpecificationId: js.UndefOr[String] = js.undefined
  
  /** Settings for the skippability of video creatives served to this site. This will act as default for new placements created under this site. */
  var skippableSettings: js.UndefOr[SiteSkippableSetting] = js.undefined
  
  /** Settings for the transcodes of video creatives served to this site. This will act as default for new placements created under this site. */
  var transcodeSettings: js.UndefOr[SiteTranscodeSetting] = js.undefined
}
object SiteVideoSettings {
  
  inline def apply(): SiteVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteVideoSettings]
  }
  
  extension [Self <: SiteVideoSettings](x: Self) {
    
    inline def setCompanionSettings(value: SiteCompanionSetting): Self = StObject.set(x, "companionSettings", value.asInstanceOf[js.Any])
    
    inline def setCompanionSettingsUndefined: Self = StObject.set(x, "companionSettings", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setObaEnabled(value: Boolean): Self = StObject.set(x, "obaEnabled", value.asInstanceOf[js.Any])
    
    inline def setObaEnabledUndefined: Self = StObject.set(x, "obaEnabled", js.undefined)
    
    inline def setObaSettings(value: ObaIcon): Self = StObject.set(x, "obaSettings", value.asInstanceOf[js.Any])
    
    inline def setObaSettingsUndefined: Self = StObject.set(x, "obaSettings", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPublisherSpecificationId(value: String): Self = StObject.set(x, "publisherSpecificationId", value.asInstanceOf[js.Any])
    
    inline def setPublisherSpecificationIdUndefined: Self = StObject.set(x, "publisherSpecificationId", js.undefined)
    
    inline def setSkippableSettings(value: SiteSkippableSetting): Self = StObject.set(x, "skippableSettings", value.asInstanceOf[js.Any])
    
    inline def setSkippableSettingsUndefined: Self = StObject.set(x, "skippableSettings", js.undefined)
    
    inline def setTranscodeSettings(value: SiteTranscodeSetting): Self = StObject.set(x, "transcodeSettings", value.asInstanceOf[js.Any])
    
    inline def setTranscodeSettingsUndefined: Self = StObject.set(x, "transcodeSettings", js.undefined)
  }
}
