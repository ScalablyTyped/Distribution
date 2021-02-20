package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiteVideoSettings extends StObject {
  
  /** Settings for the companion creatives of video creatives served to this site. */
  var companionSettings: js.UndefOr[SiteCompanionSetting] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#siteVideoSettings". */
  var kind: js.UndefOr[String] = js.native
  
  /** Whether OBA icons are enabled for this placement. */
  var obaEnabled: js.UndefOr[Boolean] = js.native
  
  /** Settings for the OBA icon of video creatives served to this site. This will act as default for new placements created under this site. */
  var obaSettings: js.UndefOr[ObaIcon] = js.native
  
  /** Orientation of a site template used for video. This will act as default for new placements created under this site. */
  var orientation: js.UndefOr[String] = js.native
  
  /** Settings for the skippability of video creatives served to this site. This will act as default for new placements created under this site. */
  var skippableSettings: js.UndefOr[SiteSkippableSetting] = js.native
  
  /** Settings for the transcodes of video creatives served to this site. This will act as default for new placements created under this site. */
  var transcodeSettings: js.UndefOr[SiteTranscodeSetting] = js.native
}
object SiteVideoSettings {
  
  @scala.inline
  def apply(): SiteVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteVideoSettings]
  }
  
  @scala.inline
  implicit class SiteVideoSettingsMutableBuilder[Self <: SiteVideoSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompanionSettings(value: SiteCompanionSetting): Self = StObject.set(x, "companionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanionSettingsUndefined: Self = StObject.set(x, "companionSettings", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setObaEnabled(value: Boolean): Self = StObject.set(x, "obaEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObaEnabledUndefined: Self = StObject.set(x, "obaEnabled", js.undefined)
    
    @scala.inline
    def setObaSettings(value: ObaIcon): Self = StObject.set(x, "obaSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObaSettingsUndefined: Self = StObject.set(x, "obaSettings", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setSkippableSettings(value: SiteSkippableSetting): Self = StObject.set(x, "skippableSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkippableSettingsUndefined: Self = StObject.set(x, "skippableSettings", js.undefined)
    
    @scala.inline
    def setTranscodeSettings(value: SiteTranscodeSetting): Self = StObject.set(x, "transcodeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscodeSettingsUndefined: Self = StObject.set(x, "transcodeSettings", js.undefined)
  }
}
