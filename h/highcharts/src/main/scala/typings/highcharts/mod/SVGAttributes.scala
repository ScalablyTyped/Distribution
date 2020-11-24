package typings.highcharts.mod

import org.scalablytyped.runtime.StringDictionary
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
  implicit class SVGAttributesOps[Self <: SVGAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDVarargs(
      value: (js.Array[SVGPathCommand] | (js.Tuple2[SVGPathCommand, Double]) | (js.Tuple3[SVGPathCommand, Double, Double]) | (js.Tuple5[SVGPathCommand, Double, Double, Double, Double]) | (js.Tuple7[SVGPathCommand, Double, Double, Double, Double, Double, Double]) | (js.Tuple8[SVGPathCommand, Double, Double, Double, Double, Double, Double, Double]))*
    ): Self = this.set("d", js.Array(value :_*))
    
    @scala.inline
    def setD(value: String | SVGPathArray): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    
    @scala.inline
    def setFill(value: ColorString | GradientColorObject | PatternObject): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    
    @scala.inline
    def setMatrixVarargs(value: Double*): Self = this.set("matrix", js.Array(value :_*))
    
    @scala.inline
    def setMatrix(value: js.Array[Double]): Self = this.set("matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatrix: Self = this.set("matrix", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setRotationOriginX(value: Double): Self = this.set("rotationOriginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationOriginX: Self = this.set("rotationOriginX", js.undefined)
    
    @scala.inline
    def setRotationOriginY(value: Double): Self = this.set("rotationOriginY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationOriginY: Self = this.set("rotationOriginY", js.undefined)
    
    @scala.inline
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    
    @scala.inline
    def setStroke(value: ColorString | GradientColorObject | PatternObject): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setStyle(value: String | CSSObject): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTranslateX(value: Double): Self = this.set("translateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslateX: Self = this.set("translateX", js.undefined)
    
    @scala.inline
    def setTranslateY(value: Double): Self = this.set("translateY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslateY: Self = this.set("translateY", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
