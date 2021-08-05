package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanOptions extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easeLinearity: js.UndefOr[Double] = js.undefined
  
  var noMoveStart: js.UndefOr[Boolean] = js.undefined
}
object PanOptions {
  
  inline def apply(): PanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanOptions]
  }
  
  extension [Self <: PanOptions](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEaseLinearity(value: Double): Self = StObject.set(x, "easeLinearity", value.asInstanceOf[js.Any])
    
    inline def setEaseLinearityUndefined: Self = StObject.set(x, "easeLinearity", js.undefined)
    
    inline def setNoMoveStart(value: Boolean): Self = StObject.set(x, "noMoveStart", value.asInstanceOf[js.Any])
    
    inline def setNoMoveStartUndefined: Self = StObject.set(x, "noMoveStart", js.undefined)
  }
}
