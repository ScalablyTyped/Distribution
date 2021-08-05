package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.map
import typings.mapboxGl.mapboxGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Light extends StObject {
  
  var anchor: js.UndefOr[map | viewport] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var `color-transition`: js.UndefOr[Transition] = js.undefined
  
  var intensity: js.UndefOr[Double] = js.undefined
  
  var `intensity-transition`: js.UndefOr[Transition] = js.undefined
  
  var position: js.UndefOr[js.Array[Double]] = js.undefined
  
  var `position-transition`: js.UndefOr[Transition] = js.undefined
}
object Light {
  
  inline def apply(): Light = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Light]
  }
  
  extension [Self <: Light](x: Self) {
    
    inline def setAnchor(value: map | viewport): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def `setColor-transition`(value: Transition): Self = StObject.set(x, "color-transition", value.asInstanceOf[js.Any])
    
    inline def `setColor-transitionUndefined`: Self = StObject.set(x, "color-transition", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
    
    inline def `setIntensity-transition`(value: Transition): Self = StObject.set(x, "intensity-transition", value.asInstanceOf[js.Any])
    
    inline def `setIntensity-transitionUndefined`: Self = StObject.set(x, "intensity-transition", js.undefined)
    
    inline def setIntensityUndefined: Self = StObject.set(x, "intensity", js.undefined)
    
    inline def setPosition(value: js.Array[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def `setPosition-transition`(value: Transition): Self = StObject.set(x, "position-transition", value.asInstanceOf[js.Any])
    
    inline def `setPosition-transitionUndefined`: Self = StObject.set(x, "position-transition", js.undefined)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPositionVarargs(value: Double*): Self = StObject.set(x, "position", js.Array(value :_*))
  }
}
