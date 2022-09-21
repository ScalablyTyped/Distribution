package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HillshadePaintPropsPossiblyEvaluated extends StObject {
  
  var `hillshade-accent-color`: Color
  
  var `hillshade-exaggeration`: Double
  
  var `hillshade-highlight-color`: Color
  
  var `hillshade-illumination-anchor`: map | viewport
  
  var `hillshade-illumination-direction`: Double
  
  var `hillshade-shadow-color`: Color
}
object HillshadePaintPropsPossiblyEvaluated {
  
  inline def apply(
    `hillshade-accent-color`: Color,
    `hillshade-exaggeration`: Double,
    `hillshade-highlight-color`: Color,
    `hillshade-illumination-anchor`: map | viewport,
    `hillshade-illumination-direction`: Double,
    `hillshade-shadow-color`: Color
  ): HillshadePaintPropsPossiblyEvaluated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hillshade-accent-color")(`hillshade-accent-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("hillshade-exaggeration")(`hillshade-exaggeration`.asInstanceOf[js.Any])
    __obj.updateDynamic("hillshade-highlight-color")(`hillshade-highlight-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("hillshade-illumination-anchor")(`hillshade-illumination-anchor`.asInstanceOf[js.Any])
    __obj.updateDynamic("hillshade-illumination-direction")(`hillshade-illumination-direction`.asInstanceOf[js.Any])
    __obj.updateDynamic("hillshade-shadow-color")(`hillshade-shadow-color`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HillshadePaintPropsPossiblyEvaluated]
  }
  
  extension [Self <: HillshadePaintPropsPossiblyEvaluated](x: Self) {
    
    inline def `setHillshade-accent-color`(value: Color): Self = StObject.set(x, "hillshade-accent-color", value.asInstanceOf[js.Any])
    
    inline def `setHillshade-exaggeration`(value: Double): Self = StObject.set(x, "hillshade-exaggeration", value.asInstanceOf[js.Any])
    
    inline def `setHillshade-highlight-color`(value: Color): Self = StObject.set(x, "hillshade-highlight-color", value.asInstanceOf[js.Any])
    
    inline def `setHillshade-illumination-anchor`(value: map | viewport): Self = StObject.set(x, "hillshade-illumination-anchor", value.asInstanceOf[js.Any])
    
    inline def `setHillshade-illumination-direction`(value: Double): Self = StObject.set(x, "hillshade-illumination-direction", value.asInstanceOf[js.Any])
    
    inline def `setHillshade-shadow-color`(value: Color): Self = StObject.set(x, "hillshade-shadow-color", value.asInstanceOf[js.Any])
  }
}
