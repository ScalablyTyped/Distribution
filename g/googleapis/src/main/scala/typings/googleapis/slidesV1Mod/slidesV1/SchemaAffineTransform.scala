package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AffineTransform uses a 3x3 matrix with an implied last row of [ 0 0 1 ] to
  * transform source coordinates (x,y) into destination coordinates (x&#39;,
  * y&#39;) according to:        x&#39;  x  =   shear_y  scale_y  translate_y
  * 1  [ 1 ]  After transformation,       x&#39; = scale_x * x + shear_x * y +
  * translate_x;      y&#39; = scale_y * y + shear_y * x + translate_y;  This
  * message is therefore composed of these six matrix elements.
  */
trait SchemaAffineTransform extends StObject {
  
  /**
    * The X coordinate scaling element.
    */
  var scaleX: js.UndefOr[Double] = js.undefined
  
  /**
    * The Y coordinate scaling element.
    */
  var scaleY: js.UndefOr[Double] = js.undefined
  
  /**
    * The X coordinate shearing element.
    */
  var shearX: js.UndefOr[Double] = js.undefined
  
  /**
    * The Y coordinate shearing element.
    */
  var shearY: js.UndefOr[Double] = js.undefined
  
  /**
    * The X coordinate translation element.
    */
  var translateX: js.UndefOr[Double] = js.undefined
  
  /**
    * The Y coordinate translation element.
    */
  var translateY: js.UndefOr[Double] = js.undefined
  
  /**
    * The units for translate elements.
    */
  var unit: js.UndefOr[String] = js.undefined
}
object SchemaAffineTransform {
  
  @scala.inline
  def apply(): SchemaAffineTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAffineTransform]
  }
  
  @scala.inline
  implicit class SchemaAffineTransformMutableBuilder[Self <: SchemaAffineTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    @scala.inline
    def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    @scala.inline
    def setShearX(value: Double): Self = StObject.set(x, "shearX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShearXUndefined: Self = StObject.set(x, "shearX", js.undefined)
    
    @scala.inline
    def setShearY(value: Double): Self = StObject.set(x, "shearY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShearYUndefined: Self = StObject.set(x, "shearY", js.undefined)
    
    @scala.inline
    def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
    
    @scala.inline
    def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
