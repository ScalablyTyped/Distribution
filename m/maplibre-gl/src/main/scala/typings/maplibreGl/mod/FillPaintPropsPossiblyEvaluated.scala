package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillPaintPropsPossiblyEvaluated extends StObject {
  
  var `fill-antialias`: Boolean
  
  var `fill-color`: PossiblyEvaluatedPropertyValue[Color]
  
  var `fill-opacity`: PossiblyEvaluatedPropertyValue[Double]
  
  var `fill-outline-color`: PossiblyEvaluatedPropertyValue[Color]
  
  var `fill-pattern`: PossiblyEvaluatedPropertyValue[CrossFaded[ResolvedImage]]
  
  var `fill-translate`: js.Tuple2[Double, Double]
  
  var `fill-translate-anchor`: map | viewport
}
object FillPaintPropsPossiblyEvaluated {
  
  inline def apply(
    `fill-antialias`: Boolean,
    `fill-color`: PossiblyEvaluatedPropertyValue[Color],
    `fill-opacity`: PossiblyEvaluatedPropertyValue[Double],
    `fill-outline-color`: PossiblyEvaluatedPropertyValue[Color],
    `fill-pattern`: PossiblyEvaluatedPropertyValue[CrossFaded[ResolvedImage]],
    `fill-translate`: js.Tuple2[Double, Double],
    `fill-translate-anchor`: map | viewport
  ): FillPaintPropsPossiblyEvaluated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fill-antialias")(`fill-antialias`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-color")(`fill-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-opacity")(`fill-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-outline-color")(`fill-outline-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-pattern")(`fill-pattern`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-translate")(`fill-translate`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-translate-anchor")(`fill-translate-anchor`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillPaintPropsPossiblyEvaluated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FillPaintPropsPossiblyEvaluated] (val x: Self) extends AnyVal {
    
    inline def `setFill-antialias`(value: Boolean): Self = StObject.set(x, "fill-antialias", value.asInstanceOf[js.Any])
    
    inline def `setFill-color`(value: PossiblyEvaluatedPropertyValue[Color]): Self = StObject.set(x, "fill-color", value.asInstanceOf[js.Any])
    
    inline def `setFill-opacity`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
    
    inline def `setFill-outline-color`(value: PossiblyEvaluatedPropertyValue[Color]): Self = StObject.set(x, "fill-outline-color", value.asInstanceOf[js.Any])
    
    inline def `setFill-pattern`(value: PossiblyEvaluatedPropertyValue[CrossFaded[ResolvedImage]]): Self = StObject.set(x, "fill-pattern", value.asInstanceOf[js.Any])
    
    inline def `setFill-translate`(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "fill-translate", value.asInstanceOf[js.Any])
    
    inline def `setFill-translate-anchor`(value: map | viewport): Self = StObject.set(x, "fill-translate-anchor", value.asInstanceOf[js.Any])
  }
}
