package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoSettings extends StObject {
  
  /** Settings for the companion creatives of video creatives served to this placement. */
  var companionSettings: js.UndefOr[CompanionSetting] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#videoSettings". */
  var kind: js.UndefOr[String] = js.native
  
  /** Whether OBA icons are enabled for this placement. */
  var obaEnabled: js.UndefOr[Boolean] = js.native
  
  /** Settings for the OBA icon of video creatives served to this placement. If this object is provided, the creative-level OBA settings will be overridden. */
  var obaSettings: js.UndefOr[ObaIcon] = js.native
  
  /** Orientation of a video placement. If this value is set, placement will return assets matching the specified orientation. */
  var orientation: js.UndefOr[String] = js.native
  
  /** Settings for the skippability of video creatives served to this placement. If this object is provided, the creative-level skippable settings will be overridden. */
  var skippableSettings: js.UndefOr[SkippableSetting] = js.native
  
  /** Settings for the transcodes of video creatives served to this placement. If this object is provided, the creative-level transcode settings will be overridden. */
  var transcodeSettings: js.UndefOr[TranscodeSetting] = js.native
}
object VideoSettings {
  
  @scala.inline
  def apply(): VideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSettings]
  }
  
  @scala.inline
  implicit class VideoSettingsMutableBuilder[Self <: VideoSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompanionSettings(value: CompanionSetting): Self = StObject.set(x, "companionSettings", value.asInstanceOf[js.Any])
    
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
    def setSkippableSettings(value: SkippableSetting): Self = StObject.set(x, "skippableSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkippableSettingsUndefined: Self = StObject.set(x, "skippableSettings", js.undefined)
    
    @scala.inline
    def setTranscodeSettings(value: TranscodeSetting): Self = StObject.set(x, "transcodeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscodeSettingsUndefined: Self = StObject.set(x, "transcodeSettings", js.undefined)
  }
}
