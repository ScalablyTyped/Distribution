package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a LineStyle within a StyleSetting
  */
trait SchemaLineStyle extends StObject {
  
  /**
    * Color of the line in #RRGGBB format.
    */
  var strokeColor: js.UndefOr[String] = js.undefined
  
  /**
    * Column-value, gradient or buckets styler that is used to determine the
    * line color and opacity.
    */
  var strokeColorStyler: js.UndefOr[SchemaStyleFunction] = js.undefined
  
  /**
    * Opacity of the line : 0.0 (transparent) to 1.0 (opaque).
    */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Width of the line in pixels.
    */
  var strokeWeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Column-value or bucket styler that is used to determine the width of the
    * line.
    */
  var strokeWeightStyler: js.UndefOr[SchemaStyleFunction] = js.undefined
}
object SchemaLineStyle {
  
  inline def apply(): SchemaLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLineStyle]
  }
  
  extension [Self <: SchemaLineStyle](x: Self) {
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorStyler(value: SchemaStyleFunction): Self = StObject.set(x, "strokeColorStyler", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorStylerUndefined: Self = StObject.set(x, "strokeColorStyler", js.undefined)
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    inline def setStrokeWeightStyler(value: SchemaStyleFunction): Self = StObject.set(x, "strokeWeightStyler", value.asInstanceOf[js.Any])
    
    inline def setStrokeWeightStylerUndefined: Self = StObject.set(x, "strokeWeightStyler", js.undefined)
    
    inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
  }
}
