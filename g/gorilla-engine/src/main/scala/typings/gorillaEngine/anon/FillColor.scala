package typings.gorillaEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillColor extends StObject {
  
  var fillColor: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.undefined
  
  // Fill bright red
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  // Change fills to 50% opacity
  var strokeColor: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.undefined
  
  // Color strokes bright green
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  
  // Change strokes to 50% opacity
  var strokeWidth: js.UndefOr[Double] = js.undefined
  
  // Change stroke width to 3.5px
  var transformAnchor: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  // Rotate by 180°
  var transformOpacity: js.UndefOr[Double] = js.undefined
  
  // Move the anchor to x = 100, y = 100
  var transformPosition: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  // Scale to 50% size in x and y axis
  var transformRotation: js.UndefOr[Double] = js.undefined
  
  // Move to x = 200, y = 200
  var transformScale: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}
object FillColor {
  
  inline def apply(): FillColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FillColor] (val x: Self) extends AnyVal {
    
    inline def setFillColor(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setStrokeColor(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    inline def setTransformAnchor(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "transformAnchor", value.asInstanceOf[js.Any])
    
    inline def setTransformAnchorUndefined: Self = StObject.set(x, "transformAnchor", js.undefined)
    
    inline def setTransformOpacity(value: Double): Self = StObject.set(x, "transformOpacity", value.asInstanceOf[js.Any])
    
    inline def setTransformOpacityUndefined: Self = StObject.set(x, "transformOpacity", js.undefined)
    
    inline def setTransformPosition(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "transformPosition", value.asInstanceOf[js.Any])
    
    inline def setTransformPositionUndefined: Self = StObject.set(x, "transformPosition", js.undefined)
    
    inline def setTransformRotation(value: Double): Self = StObject.set(x, "transformRotation", value.asInstanceOf[js.Any])
    
    inline def setTransformRotationUndefined: Self = StObject.set(x, "transformRotation", js.undefined)
    
    inline def setTransformScale(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "transformScale", value.asInstanceOf[js.Any])
    
    inline def setTransformScaleUndefined: Self = StObject.set(x, "transformScale", js.undefined)
  }
}
