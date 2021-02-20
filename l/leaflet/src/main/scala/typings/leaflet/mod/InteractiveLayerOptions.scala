package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InteractiveLayerOptions extends LayerOptions {
  
  var bubblingMouseEvents: js.UndefOr[Boolean] = js.native
  
  var interactive: js.UndefOr[Boolean] = js.native
}
object InteractiveLayerOptions {
  
  @scala.inline
  def apply(): InteractiveLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractiveLayerOptions]
  }
  
  @scala.inline
  implicit class InteractiveLayerOptionsMutableBuilder[Self <: InteractiveLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubblingMouseEvents(value: Boolean): Self = StObject.set(x, "bubblingMouseEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubblingMouseEventsUndefined: Self = StObject.set(x, "bubblingMouseEvents", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
  }
}
