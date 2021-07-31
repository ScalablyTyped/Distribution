package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video Settings
  */
trait SchemaVideoSettings extends StObject {
  
  /**
    * Settings for the companion creatives of video creatives served to this
    * placement.
    */
  var companionSettings: js.UndefOr[SchemaCompanionSetting] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#videoSettings&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Orientation of a video placement. If this value is set, placement will
    * return assets matching the specified orientation.
    */
  var orientation: js.UndefOr[String] = js.undefined
  
  /**
    * Settings for the skippability of video creatives served to this
    * placement. If this object is provided, the creative-level skippable
    * settings will be overridden.
    */
  var skippableSettings: js.UndefOr[SchemaSkippableSetting] = js.undefined
  
  /**
    * Settings for the transcodes of video creatives served to this placement.
    * If this object is provided, the creative-level transcode settings will be
    * overridden.
    */
  var transcodeSettings: js.UndefOr[SchemaTranscodeSetting] = js.undefined
}
object SchemaVideoSettings {
  
  @scala.inline
  def apply(): SchemaVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoSettings]
  }
  
  @scala.inline
  implicit class SchemaVideoSettingsMutableBuilder[Self <: SchemaVideoSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompanionSettings(value: SchemaCompanionSetting): Self = StObject.set(x, "companionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanionSettingsUndefined: Self = StObject.set(x, "companionSettings", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setSkippableSettings(value: SchemaSkippableSetting): Self = StObject.set(x, "skippableSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkippableSettingsUndefined: Self = StObject.set(x, "skippableSettings", js.undefined)
    
    @scala.inline
    def setTranscodeSettings(value: SchemaTranscodeSetting): Self = StObject.set(x, "transcodeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscodeSettingsUndefined: Self = StObject.set(x, "transcodeSettings", js.undefined)
  }
}
