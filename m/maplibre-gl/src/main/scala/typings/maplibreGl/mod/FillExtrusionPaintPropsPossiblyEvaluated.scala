package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillExtrusionPaintPropsPossiblyEvaluated extends StObject {
  
  var `fill-extrusion-base`: PossiblyEvaluatedPropertyValue[Double]
  
  var `fill-extrusion-color`: PossiblyEvaluatedPropertyValue[Color]
  
  var `fill-extrusion-height`: PossiblyEvaluatedPropertyValue[Double]
  
  var `fill-extrusion-opacity`: Double
  
  var `fill-extrusion-pattern`: PossiblyEvaluatedPropertyValue[CrossFaded[ResolvedImage]]
  
  var `fill-extrusion-translate`: js.Tuple2[Double, Double]
  
  var `fill-extrusion-translate-anchor`: map | viewport
  
  var `fill-extrusion-vertical-gradient`: Boolean
}
object FillExtrusionPaintPropsPossiblyEvaluated {
  
  inline def apply(
    `fill-extrusion-base`: PossiblyEvaluatedPropertyValue[Double],
    `fill-extrusion-color`: PossiblyEvaluatedPropertyValue[Color],
    `fill-extrusion-height`: PossiblyEvaluatedPropertyValue[Double],
    `fill-extrusion-opacity`: Double,
    `fill-extrusion-pattern`: PossiblyEvaluatedPropertyValue[CrossFaded[ResolvedImage]],
    `fill-extrusion-translate`: js.Tuple2[Double, Double],
    `fill-extrusion-translate-anchor`: map | viewport,
    `fill-extrusion-vertical-gradient`: Boolean
  ): FillExtrusionPaintPropsPossiblyEvaluated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fill-extrusion-base")(`fill-extrusion-base`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-extrusion-color")(`fill-extrusion-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-extrusion-height")(`fill-extrusion-height`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-extrusion-opacity")(`fill-extrusion-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-extrusion-pattern")(`fill-extrusion-pattern`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-extrusion-translate")(`fill-extrusion-translate`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-extrusion-translate-anchor")(`fill-extrusion-translate-anchor`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-extrusion-vertical-gradient")(`fill-extrusion-vertical-gradient`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillExtrusionPaintPropsPossiblyEvaluated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FillExtrusionPaintPropsPossiblyEvaluated] (val x: Self) extends AnyVal {
    
    inline def `setFill-extrusion-base`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "fill-extrusion-base", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-color`(value: PossiblyEvaluatedPropertyValue[Color]): Self = StObject.set(x, "fill-extrusion-color", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-height`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "fill-extrusion-height", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-opacity`(value: Double): Self = StObject.set(x, "fill-extrusion-opacity", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-pattern`(value: PossiblyEvaluatedPropertyValue[CrossFaded[ResolvedImage]]): Self = StObject.set(x, "fill-extrusion-pattern", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-translate`(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "fill-extrusion-translate", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-translate-anchor`(value: map | viewport): Self = StObject.set(x, "fill-extrusion-translate-anchor", value.asInstanceOf[js.Any])
    
    inline def `setFill-extrusion-vertical-gradient`(value: Boolean): Self = StObject.set(x, "fill-extrusion-vertical-gradient", value.asInstanceOf[js.Any])
  }
}
