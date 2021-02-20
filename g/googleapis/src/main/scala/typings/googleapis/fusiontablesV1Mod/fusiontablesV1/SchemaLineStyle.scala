package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a LineStyle within a StyleSetting
  */
@js.native
trait SchemaLineStyle extends StObject {
  
  /**
    * Color of the line in #RRGGBB format.
    */
  var strokeColor: js.UndefOr[String] = js.native
  
  /**
    * Column-value, gradient or buckets styler that is used to determine the
    * line color and opacity.
    */
  var strokeColorStyler: js.UndefOr[SchemaStyleFunction] = js.native
  
  /**
    * Opacity of the line : 0.0 (transparent) to 1.0 (opaque).
    */
  var strokeOpacity: js.UndefOr[Double] = js.native
  
  /**
    * Width of the line in pixels.
    */
  var strokeWeight: js.UndefOr[Double] = js.native
  
  /**
    * Column-value or bucket styler that is used to determine the width of the
    * line.
    */
  var strokeWeightStyler: js.UndefOr[SchemaStyleFunction] = js.native
}
object SchemaLineStyle {
  
  @scala.inline
  def apply(): SchemaLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLineStyle]
  }
  
  @scala.inline
  implicit class SchemaLineStyleMutableBuilder[Self <: SchemaLineStyle] (val x: Self) extends AnyVal {
    
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
