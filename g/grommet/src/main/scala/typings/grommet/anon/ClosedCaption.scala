package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClosedCaption extends StObject {
  
  var closedCaption: js.UndefOr[js.Any] = js.native
  
  var color: js.UndefOr[ColorType] = js.native
  
  var configure: js.UndefOr[js.Any] = js.native
  
  var fullScreen: js.UndefOr[js.Any] = js.native
  
  var pause: js.UndefOr[js.Any] = js.native
  
  var play: js.UndefOr[js.Any] = js.native
  
  var reduceVolume: js.UndefOr[js.Any] = js.native
  
  var volume: js.UndefOr[js.Any] = js.native
}
object ClosedCaption {
  
  @scala.inline
  def apply(): ClosedCaption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosedCaption]
  }
  
  @scala.inline
  implicit class ClosedCaptionMutableBuilder[Self <: ClosedCaption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClosedCaption(value: js.Any): Self = StObject.set(x, "closedCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosedCaptionUndefined: Self = StObject.set(x, "closedCaption", js.undefined)
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setConfigure(value: js.Any): Self = StObject.set(x, "configure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigureUndefined: Self = StObject.set(x, "configure", js.undefined)
    
    @scala.inline
    def setFullScreen(value: js.Any): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
    
    @scala.inline
    def setPause(value: js.Any): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    @scala.inline
    def setPlay(value: js.Any): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
    
    @scala.inline
    def setReduceVolume(value: js.Any): Self = StObject.set(x, "reduceVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReduceVolumeUndefined: Self = StObject.set(x, "reduceVolume", js.undefined)
    
    @scala.inline
    def setVolume(value: js.Any): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
