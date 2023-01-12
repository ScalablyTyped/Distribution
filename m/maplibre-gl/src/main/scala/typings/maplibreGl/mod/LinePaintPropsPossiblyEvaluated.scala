package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinePaintPropsPossiblyEvaluated extends StObject {
  
  var `line-blur`: PossiblyEvaluatedPropertyValue[Double]
  
  var `line-color`: PossiblyEvaluatedPropertyValue[Color]
  
  var `line-dasharray`: CrossFaded[js.Array[Double]]
  
  var `line-gap-width`: PossiblyEvaluatedPropertyValue[Double]
  
  var `line-gradient`: ColorRampProperty
  
  var `line-offset`: PossiblyEvaluatedPropertyValue[Double]
  
  var `line-opacity`: PossiblyEvaluatedPropertyValue[Double]
  
  var `line-pattern`: PossiblyEvaluatedPropertyValue[CrossFaded[ResolvedImage]]
  
  var `line-translate`: js.Tuple2[Double, Double]
  
  var `line-translate-anchor`: map | viewport
  
  var `line-width`: PossiblyEvaluatedPropertyValue[Double]
}
object LinePaintPropsPossiblyEvaluated {
  
  inline def apply(
    `line-blur`: PossiblyEvaluatedPropertyValue[Double],
    `line-color`: PossiblyEvaluatedPropertyValue[Color],
    `line-dasharray`: CrossFaded[js.Array[Double]],
    `line-gap-width`: PossiblyEvaluatedPropertyValue[Double],
    `line-gradient`: ColorRampProperty,
    `line-offset`: PossiblyEvaluatedPropertyValue[Double],
    `line-opacity`: PossiblyEvaluatedPropertyValue[Double],
    `line-pattern`: PossiblyEvaluatedPropertyValue[CrossFaded[ResolvedImage]],
    `line-translate`: js.Tuple2[Double, Double],
    `line-translate-anchor`: map | viewport,
    `line-width`: PossiblyEvaluatedPropertyValue[Double]
  ): LinePaintPropsPossiblyEvaluated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("line-blur")(`line-blur`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-color")(`line-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-dasharray")(`line-dasharray`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-gap-width")(`line-gap-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-gradient")(`line-gradient`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-offset")(`line-offset`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-opacity")(`line-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-pattern")(`line-pattern`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-translate")(`line-translate`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-translate-anchor")(`line-translate-anchor`.asInstanceOf[js.Any])
    __obj.updateDynamic("line-width")(`line-width`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinePaintPropsPossiblyEvaluated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinePaintPropsPossiblyEvaluated] (val x: Self) extends AnyVal {
    
    inline def `setLine-blur`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "line-blur", value.asInstanceOf[js.Any])
    
    inline def `setLine-color`(value: PossiblyEvaluatedPropertyValue[Color]): Self = StObject.set(x, "line-color", value.asInstanceOf[js.Any])
    
    inline def `setLine-dasharray`(value: CrossFaded[js.Array[Double]]): Self = StObject.set(x, "line-dasharray", value.asInstanceOf[js.Any])
    
    inline def `setLine-gap-width`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "line-gap-width", value.asInstanceOf[js.Any])
    
    inline def `setLine-gradient`(value: ColorRampProperty): Self = StObject.set(x, "line-gradient", value.asInstanceOf[js.Any])
    
    inline def `setLine-offset`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "line-offset", value.asInstanceOf[js.Any])
    
    inline def `setLine-opacity`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "line-opacity", value.asInstanceOf[js.Any])
    
    inline def `setLine-pattern`(value: PossiblyEvaluatedPropertyValue[CrossFaded[ResolvedImage]]): Self = StObject.set(x, "line-pattern", value.asInstanceOf[js.Any])
    
    inline def `setLine-translate`(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "line-translate", value.asInstanceOf[js.Any])
    
    inline def `setLine-translate-anchor`(value: map | viewport): Self = StObject.set(x, "line-translate-anchor", value.asInstanceOf[js.Any])
    
    inline def `setLine-width`(value: PossiblyEvaluatedPropertyValue[Double]): Self = StObject.set(x, "line-width", value.asInstanceOf[js.Any])
  }
}
