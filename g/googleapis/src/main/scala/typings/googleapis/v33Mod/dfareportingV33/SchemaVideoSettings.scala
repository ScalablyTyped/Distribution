package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoSettings extends StObject {
  
  /**
    * Settings for the companion creatives of video creatives served to this placement.
    */
  var companionSettings: js.UndefOr[SchemaCompanionSetting] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#videoSettings".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Orientation of a video placement. If this value is set, placement will return assets matching the specified orientation.
    */
  var orientation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Settings for the skippability of video creatives served to this placement. If this object is provided, the creative-level skippable settings will be overridden.
    */
  var skippableSettings: js.UndefOr[SchemaSkippableSetting] = js.undefined
  
  /**
    * Settings for the transcodes of video creatives served to this placement. If this object is provided, the creative-level transcode settings will be overridden.
    */
  var transcodeSettings: js.UndefOr[SchemaTranscodeSetting] = js.undefined
}
object SchemaVideoSettings {
  
  inline def apply(): SchemaVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoSettings]
  }
  
  extension [Self <: SchemaVideoSettings](x: Self) {
    
    inline def setCompanionSettings(value: SchemaCompanionSetting): Self = StObject.set(x, "companionSettings", value.asInstanceOf[js.Any])
    
    inline def setCompanionSettingsUndefined: Self = StObject.set(x, "companionSettings", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationNull: Self = StObject.set(x, "orientation", null)
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setSkippableSettings(value: SchemaSkippableSetting): Self = StObject.set(x, "skippableSettings", value.asInstanceOf[js.Any])
    
    inline def setSkippableSettingsUndefined: Self = StObject.set(x, "skippableSettings", js.undefined)
    
    inline def setTranscodeSettings(value: SchemaTranscodeSetting): Self = StObject.set(x, "transcodeSettings", value.asInstanceOf[js.Any])
    
    inline def setTranscodeSettingsUndefined: Self = StObject.set(x, "transcodeSettings", js.undefined)
  }
}
