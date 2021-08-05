package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaPlayerMessages extends StObject {
  
  var fullscreen: js.UndefOr[String] = js.undefined
  
  var mute: js.UndefOr[String] = js.undefined
  
  var pause: js.UndefOr[String] = js.undefined
  
  var play: js.UndefOr[String] = js.undefined
  
  var quality: js.UndefOr[String] = js.undefined
  
  var unmute: js.UndefOr[String] = js.undefined
}
object MediaPlayerMessages {
  
  inline def apply(): MediaPlayerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPlayerMessages]
  }
  
  extension [Self <: MediaPlayerMessages](x: Self) {
    
    inline def setFullscreen(value: String): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    inline def setMute(value: String): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
    
    inline def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
    
    inline def setPause(value: String): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    inline def setPlay(value: String): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
    
    inline def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setUnmute(value: String): Self = StObject.set(x, "unmute", value.asInstanceOf[js.Any])
    
    inline def setUnmuteUndefined: Self = StObject.set(x, "unmute", js.undefined)
  }
}
