package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractiveLayerOptions
  extends StObject
     with LayerOptions {
  
  var bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined
  
  var interactive: js.UndefOr[Boolean] = js.undefined
}
object InteractiveLayerOptions {
  
  inline def apply(): InteractiveLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractiveLayerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteractiveLayerOptions] (val x: Self) extends AnyVal {
    
    inline def setBubblingMouseEvents(value: Boolean): Self = StObject.set(x, "bubblingMouseEvents", value.asInstanceOf[js.Any])
    
    inline def setBubblingMouseEventsUndefined: Self = StObject.set(x, "bubblingMouseEvents", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
  }
}
