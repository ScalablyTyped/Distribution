package typings.highcharts.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGAttributes
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var d: js.UndefOr[String | SVGPathArray] = js.undefined
  
  var dx: js.UndefOr[Double] = js.undefined
  
  var dy: js.UndefOr[Double] = js.undefined
  
  var fill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  var inverted: js.UndefOr[Boolean] = js.undefined
  
  var matrix: js.UndefOr[js.Array[Double]] = js.undefined
  
  var rotation: js.UndefOr[Double] = js.undefined
  
  var rotationOriginX: js.UndefOr[Double] = js.undefined
  
  var rotationOriginY: js.UndefOr[Double] = js.undefined
  
  var scaleX: js.UndefOr[Double] = js.undefined
  
  var scaleY: js.UndefOr[Double] = js.undefined
  
  var stroke: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  var style: js.UndefOr[String | CSSObject] = js.undefined
  
  var translateX: js.UndefOr[Double] = js.undefined
  
  var translateY: js.UndefOr[Double] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object SVGAttributes {
  
  inline def apply(): SVGAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGAttributes] (val x: Self) extends AnyVal {
    
    inline def setD(value: String | SVGPathArray): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setDVarargs(
      value: (js.Array[SVGPathCommand] | (js.Tuple2[SVGPathCommand, Double]) | (js.Tuple3[SVGPathCommand, Double, Double]) | (js.Tuple5[SVGPathCommand, Double, Double, Double, Double]) | (js.Tuple7[SVGPathCommand, Double, Double, Double, Double, Double, Double]) | (js.Tuple8[SVGPathCommand, Double, Double, Double, Double, Double, Double, Double]))*
    ): Self = StObject.set(x, "d", js.Array(value*))
    
    inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setFill(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    
    inline def setMatrix(value: js.Array[Double]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    inline def setMatrixVarargs(value: Double*): Self = StObject.set(x, "matrix", js.Array(value*))
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationOriginX(value: Double): Self = StObject.set(x, "rotationOriginX", value.asInstanceOf[js.Any])
    
    inline def setRotationOriginXUndefined: Self = StObject.set(x, "rotationOriginX", js.undefined)
    
    inline def setRotationOriginY(value: Double): Self = StObject.set(x, "rotationOriginY", value.asInstanceOf[js.Any])
    
    inline def setRotationOriginYUndefined: Self = StObject.set(x, "rotationOriginY", js.undefined)
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    inline def setStroke(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStyle(value: String | CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
    
    inline def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    
    inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
