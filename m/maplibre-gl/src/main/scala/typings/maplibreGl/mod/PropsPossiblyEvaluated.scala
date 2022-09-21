package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPossiblyEvaluated extends StObject {
  
  var anchor: map | viewport
  
  var color: Color
  
  var intensity: Double
  
  var position: LightPosition
}
object PropsPossiblyEvaluated {
  
  inline def apply(anchor: map | viewport, color: Color, intensity: Double, position: LightPosition): PropsPossiblyEvaluated = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], intensity = intensity.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPossiblyEvaluated]
  }
  
  extension [Self <: PropsPossiblyEvaluated](x: Self) {
    
    inline def setAnchor(value: map | viewport): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: LightPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
