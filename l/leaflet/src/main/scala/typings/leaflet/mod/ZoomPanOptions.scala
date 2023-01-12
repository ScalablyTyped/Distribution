package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.PanOptions because var conflicts: animate. Inlined duration, easeLinearity, noMoveStart */ trait ZoomPanOptions
  extends StObject
     with ZoomOptions {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easeLinearity: js.UndefOr[Double] = js.undefined
  
  var noMoveStart: js.UndefOr[Boolean] = js.undefined
}
object ZoomPanOptions {
  
  inline def apply(): ZoomPanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomPanOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZoomPanOptions] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEaseLinearity(value: Double): Self = StObject.set(x, "easeLinearity", value.asInstanceOf[js.Any])
    
    inline def setEaseLinearityUndefined: Self = StObject.set(x, "easeLinearity", js.undefined)
    
    inline def setNoMoveStart(value: Boolean): Self = StObject.set(x, "noMoveStart", value.asInstanceOf[js.Any])
    
    inline def setNoMoveStartUndefined: Self = StObject.set(x, "noMoveStart", js.undefined)
  }
}
