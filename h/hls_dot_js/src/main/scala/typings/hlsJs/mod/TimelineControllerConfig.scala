package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineControllerConfig extends StObject {
  
  var captionsTextTrack1Label: String
  
  var captionsTextTrack1LanguageCode: String
  
  var captionsTextTrack2Label: String
  
  var captionsTextTrack2LanguageCode: String
  
  var captionsTextTrack3Label: String
  
  var captionsTextTrack3LanguageCode: String
  
  var captionsTextTrack4Label: String
  
  var captionsTextTrack4LanguageCode: String
  
  var cueHandler: CuesInterface
  
  var enableCEA708Captions: Boolean
  
  var enableIMSC1: Boolean
  
  var enableWebVTT: Boolean
  
  var renderTextTracksNatively: Boolean
}
object TimelineControllerConfig {
  
  inline def apply(
    captionsTextTrack1Label: String,
    captionsTextTrack1LanguageCode: String,
    captionsTextTrack2Label: String,
    captionsTextTrack2LanguageCode: String,
    captionsTextTrack3Label: String,
    captionsTextTrack3LanguageCode: String,
    captionsTextTrack4Label: String,
    captionsTextTrack4LanguageCode: String,
    cueHandler: CuesInterface,
    enableCEA708Captions: Boolean,
    enableIMSC1: Boolean,
    enableWebVTT: Boolean,
    renderTextTracksNatively: Boolean
  ): TimelineControllerConfig = {
    val __obj = js.Dynamic.literal(captionsTextTrack1Label = captionsTextTrack1Label.asInstanceOf[js.Any], captionsTextTrack1LanguageCode = captionsTextTrack1LanguageCode.asInstanceOf[js.Any], captionsTextTrack2Label = captionsTextTrack2Label.asInstanceOf[js.Any], captionsTextTrack2LanguageCode = captionsTextTrack2LanguageCode.asInstanceOf[js.Any], captionsTextTrack3Label = captionsTextTrack3Label.asInstanceOf[js.Any], captionsTextTrack3LanguageCode = captionsTextTrack3LanguageCode.asInstanceOf[js.Any], captionsTextTrack4Label = captionsTextTrack4Label.asInstanceOf[js.Any], captionsTextTrack4LanguageCode = captionsTextTrack4LanguageCode.asInstanceOf[js.Any], cueHandler = cueHandler.asInstanceOf[js.Any], enableCEA708Captions = enableCEA708Captions.asInstanceOf[js.Any], enableIMSC1 = enableIMSC1.asInstanceOf[js.Any], enableWebVTT = enableWebVTT.asInstanceOf[js.Any], renderTextTracksNatively = renderTextTracksNatively.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineControllerConfig]
  }
  
  extension [Self <: TimelineControllerConfig](x: Self) {
    
    inline def setCaptionsTextTrack1Label(value: String): Self = StObject.set(x, "captionsTextTrack1Label", value.asInstanceOf[js.Any])
    
    inline def setCaptionsTextTrack1LanguageCode(value: String): Self = StObject.set(x, "captionsTextTrack1LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setCaptionsTextTrack2Label(value: String): Self = StObject.set(x, "captionsTextTrack2Label", value.asInstanceOf[js.Any])
    
    inline def setCaptionsTextTrack2LanguageCode(value: String): Self = StObject.set(x, "captionsTextTrack2LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setCaptionsTextTrack3Label(value: String): Self = StObject.set(x, "captionsTextTrack3Label", value.asInstanceOf[js.Any])
    
    inline def setCaptionsTextTrack3LanguageCode(value: String): Self = StObject.set(x, "captionsTextTrack3LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setCaptionsTextTrack4Label(value: String): Self = StObject.set(x, "captionsTextTrack4Label", value.asInstanceOf[js.Any])
    
    inline def setCaptionsTextTrack4LanguageCode(value: String): Self = StObject.set(x, "captionsTextTrack4LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setCueHandler(value: CuesInterface): Self = StObject.set(x, "cueHandler", value.asInstanceOf[js.Any])
    
    inline def setEnableCEA708Captions(value: Boolean): Self = StObject.set(x, "enableCEA708Captions", value.asInstanceOf[js.Any])
    
    inline def setEnableIMSC1(value: Boolean): Self = StObject.set(x, "enableIMSC1", value.asInstanceOf[js.Any])
    
    inline def setEnableWebVTT(value: Boolean): Self = StObject.set(x, "enableWebVTT", value.asInstanceOf[js.Any])
    
    inline def setRenderTextTracksNatively(value: Boolean): Self = StObject.set(x, "renderTextTracksNatively", value.asInstanceOf[js.Any])
  }
}
