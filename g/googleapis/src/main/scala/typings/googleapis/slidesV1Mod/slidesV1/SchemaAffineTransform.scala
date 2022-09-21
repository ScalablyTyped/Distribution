package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAffineTransform extends StObject {
  
  /**
    * The X coordinate scaling element.
    */
  var scaleX: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The Y coordinate scaling element.
    */
  var scaleY: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The X coordinate shearing element.
    */
  var shearX: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The Y coordinate shearing element.
    */
  var shearY: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The X coordinate translation element.
    */
  var translateX: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The Y coordinate translation element.
    */
  var translateY: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The units for translate elements.
    */
  var unit: js.UndefOr[String | Null] = js.undefined
}
object SchemaAffineTransform {
  
  inline def apply(): SchemaAffineTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAffineTransform]
  }
  
  extension [Self <: SchemaAffineTransform](x: Self) {
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXNull: Self = StObject.set(x, "scaleX", null)
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setScaleYNull: Self = StObject.set(x, "scaleY", null)
    
    inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    inline def setShearX(value: Double): Self = StObject.set(x, "shearX", value.asInstanceOf[js.Any])
    
    inline def setShearXNull: Self = StObject.set(x, "shearX", null)
    
    inline def setShearXUndefined: Self = StObject.set(x, "shearX", js.undefined)
    
    inline def setShearY(value: Double): Self = StObject.set(x, "shearY", value.asInstanceOf[js.Any])
    
    inline def setShearYNull: Self = StObject.set(x, "shearY", null)
    
    inline def setShearYUndefined: Self = StObject.set(x, "shearY", js.undefined)
    
    inline def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateXNull: Self = StObject.set(x, "translateX", null)
    
    inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
    
    inline def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    
    inline def setTranslateYNull: Self = StObject.set(x, "translateY", null)
    
    inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitNull: Self = StObject.set(x, "unit", null)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
