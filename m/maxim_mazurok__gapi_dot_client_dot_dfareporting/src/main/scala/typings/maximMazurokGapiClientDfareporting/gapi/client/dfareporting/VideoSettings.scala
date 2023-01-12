package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoSettings extends StObject {
  
  /** Settings for the companion creatives of video creatives served to this placement. */
  var companionSettings: js.UndefOr[CompanionSetting] = js.undefined
  
  /** Duration of a video placement in seconds. */
  var durationSeconds: js.UndefOr[Double] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#videoSettings". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Whether OBA icons are enabled for this placement. */
  var obaEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Settings for the OBA icon of video creatives served to this placement. If this object is provided, the creative-level OBA settings will be overridden. */
  var obaSettings: js.UndefOr[ObaIcon] = js.undefined
  
  /** Orientation of a video placement. If this value is set, placement will return assets matching the specified orientation. */
  var orientation: js.UndefOr[String] = js.undefined
  
  /** Publisher specification ID of a video placement. */
  var publisherSpecificationId: js.UndefOr[String] = js.undefined
  
  /** Settings for the skippability of video creatives served to this placement. If this object is provided, the creative-level skippable settings will be overridden. */
  var skippableSettings: js.UndefOr[SkippableSetting] = js.undefined
  
  /** Settings for the transcodes of video creatives served to this placement. If this object is provided, the creative-level transcode settings will be overridden. */
  var transcodeSettings: js.UndefOr[TranscodeSetting] = js.undefined
}
object VideoSettings {
  
  inline def apply(): VideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoSettings] (val x: Self) extends AnyVal {
    
    inline def setCompanionSettings(value: CompanionSetting): Self = StObject.set(x, "companionSettings", value.asInstanceOf[js.Any])
    
    inline def setCompanionSettingsUndefined: Self = StObject.set(x, "companionSettings", js.undefined)
    
    inline def setDurationSeconds(value: Double): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "durationSeconds", js.undefined)
    
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
    
    inline def setSkippableSettings(value: SkippableSetting): Self = StObject.set(x, "skippableSettings", value.asInstanceOf[js.Any])
    
    inline def setSkippableSettingsUndefined: Self = StObject.set(x, "skippableSettings", js.undefined)
    
    inline def setTranscodeSettings(value: TranscodeSetting): Self = StObject.set(x, "transcodeSettings", value.asInstanceOf[js.Any])
    
    inline def setTranscodeSettingsUndefined: Self = StObject.set(x, "transcodeSettings", js.undefined)
  }
}
