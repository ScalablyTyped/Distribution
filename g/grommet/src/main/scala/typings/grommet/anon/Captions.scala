package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Captions extends StObject {
  
  var captions: js.UndefOr[`5`] = js.undefined
  
  var controls: js.UndefOr[`5`] = js.undefined
  
  var icons: js.UndefOr[ClosedCaption] = js.undefined
  
  var scrubber: js.UndefOr[`3`] = js.undefined
}
object Captions {
  
  @scala.inline
  def apply(): Captions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Captions]
  }
  
  @scala.inline
  implicit class CaptionsMutableBuilder[Self <: Captions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptions(value: `5`): Self = StObject.set(x, "captions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionsUndefined: Self = StObject.set(x, "captions", js.undefined)
    
    @scala.inline
    def setControls(value: `5`): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    @scala.inline
    def setIcons(value: ClosedCaption): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setScrubber(value: `3`): Self = StObject.set(x, "scrubber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrubberUndefined: Self = StObject.set(x, "scrubber", js.undefined)
  }
}
