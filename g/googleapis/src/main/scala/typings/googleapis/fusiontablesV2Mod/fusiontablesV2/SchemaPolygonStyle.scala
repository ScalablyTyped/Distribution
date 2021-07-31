package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a PolygonStyle within a StyleSetting
  */
trait SchemaPolygonStyle extends StObject {
  
  /**
    * Color of the interior of the polygon in #RRGGBB format.
    */
  var fillColor: js.UndefOr[String] = js.undefined
  
  /**
    * Column-value, gradient, or bucket styler that is used to determine the
    * interior color and opacity of the polygon.
    */
  var fillColorStyler: js.UndefOr[SchemaStyleFunction] = js.undefined
  
  /**
    * Opacity of the interior of the polygon: 0.0 (transparent) to 1.0
    * (opaque).
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Color of the polygon border in #RRGGBB format.
    */
  var strokeColor: js.UndefOr[String] = js.undefined
  
  /**
    * Column-value, gradient or buckets styler that is used to determine the
    * border color and opacity.
    */
  var strokeColorStyler: js.UndefOr[SchemaStyleFunction] = js.undefined
  
  /**
    * Opacity of the polygon border: 0.0 (transparent) to 1.0 (opaque).
    */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Width of the polyon border in pixels.
    */
  var strokeWeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Column-value or bucket styler that is used to determine the width of the
    * polygon border.
    */
  var strokeWeightStyler: js.UndefOr[SchemaStyleFunction] = js.undefined
}
object SchemaPolygonStyle {
  
  @scala.inline
  def apply(): SchemaPolygonStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolygonStyle]
  }
  
  @scala.inline
  implicit class SchemaPolygonStyleMutableBuilder[Self <: SchemaPolygonStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorStyler(value: SchemaStyleFunction): Self = StObject.set(x, "fillColorStyler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorStylerUndefined: Self = StObject.set(x, "fillColorStyler", js.undefined)
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorStyler(value: SchemaStyleFunction): Self = StObject.set(x, "strokeColorStyler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorStylerUndefined: Self = StObject.set(x, "strokeColorStyler", js.undefined)
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWeightStyler(value: SchemaStyleFunction): Self = StObject.set(x, "strokeWeightStyler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWeightStylerUndefined: Self = StObject.set(x, "strokeWeightStyler", js.undefined)
    
    @scala.inline
    def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
  }
}
