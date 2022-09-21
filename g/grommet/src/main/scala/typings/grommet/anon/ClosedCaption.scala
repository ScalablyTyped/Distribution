package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosedCaption extends StObject {
  
  var closedCaption: js.UndefOr[Any] = js.undefined
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var configure: js.UndefOr[Any] = js.undefined
  
  var fullScreen: js.UndefOr[Any] = js.undefined
  
  var pause: js.UndefOr[Any] = js.undefined
  
  var play: js.UndefOr[Any] = js.undefined
  
  var reduceVolume: js.UndefOr[Any] = js.undefined
  
  var volume: js.UndefOr[Any] = js.undefined
}
object ClosedCaption {
  
  inline def apply(): ClosedCaption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosedCaption]
  }
  
  extension [Self <: ClosedCaption](x: Self) {
    
    inline def setClosedCaption(value: Any): Self = StObject.set(x, "closedCaption", value.asInstanceOf[js.Any])
    
    inline def setClosedCaptionUndefined: Self = StObject.set(x, "closedCaption", js.undefined)
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setConfigure(value: Any): Self = StObject.set(x, "configure", value.asInstanceOf[js.Any])
    
    inline def setConfigureUndefined: Self = StObject.set(x, "configure", js.undefined)
    
    inline def setFullScreen(value: Any): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    inline def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
    
    inline def setPause(value: Any): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    inline def setPlay(value: Any): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
    
    inline def setReduceVolume(value: Any): Self = StObject.set(x, "reduceVolume", value.asInstanceOf[js.Any])
    
    inline def setReduceVolumeUndefined: Self = StObject.set(x, "reduceVolume", js.undefined)
    
    inline def setVolume(value: Any): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
