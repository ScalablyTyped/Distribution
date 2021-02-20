package typings.highcharts.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGAttributes
  extends /* key */ StringDictionary[js.Any] {
  
  var d: js.UndefOr[String | SVGPathArray] = js.native
  
  var fill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  var inverted: js.UndefOr[Boolean] = js.native
  
  var matrix: js.UndefOr[js.Array[Double]] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var rotationOriginX: js.UndefOr[Double] = js.native
  
  var rotationOriginY: js.UndefOr[Double] = js.native
  
  var scaleX: js.UndefOr[Double] = js.native
  
  var scaleY: js.UndefOr[Double] = js.native
  
  var stroke: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  var style: js.UndefOr[String | CSSObject] = js.native
  
  var translateX: js.UndefOr[Double] = js.native
  
  var translateY: js.UndefOr[Double] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object SVGAttributes {
  
  @scala.inline
  def apply(): SVGAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGAttributes]
  }
  
  @scala.inline
  implicit class SVGAttributesMutableBuilder[Self <: SVGAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setD(value: String | SVGPathArray): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    @scala.inline
    def setDVarargs(
      value: (js.Array[SVGPathCommand] | (js.Tuple2[SVGPathCommand, Double]) | (js.Tuple3[SVGPathCommand, Double, Double]) | (js.Tuple5[SVGPathCommand, Double, Double, Double, Double]) | (js.Tuple7[SVGPathCommand, Double, Double, Double, Double, Double, Double]) | (js.Tuple8[SVGPathCommand, Double, Double, Double, Double, Double, Double, Double]))*
    ): Self = StObject.set(x, "d", js.Array(value :_*))
    
    @scala.inline
    def setFill(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    
    @scala.inline
    def setMatrix(value: js.Array[Double]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    @scala.inline
    def setMatrixVarargs(value: Double*): Self = StObject.set(x, "matrix", js.Array(value :_*))
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationOriginX(value: Double): Self = StObject.set(x, "rotationOriginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationOriginXUndefined: Self = StObject.set(x, "rotationOriginX", js.undefined)
    
    @scala.inline
    def setRotationOriginY(value: Double): Self = StObject.set(x, "rotationOriginY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationOriginYUndefined: Self = StObject.set(x, "rotationOriginY", js.undefined)
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    @scala.inline
    def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    @scala.inline
    def setStroke(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStyle(value: String | CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
    
    @scala.inline
    def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
