package typings.hummusRecipe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineToOptions extends StObject {
  
  var color: js.UndefOr[String | js.Array[Double]] = js.native
  
  var dash: js.UndefOr[js.Array[Double]] = js.native
  
  var fill: js.UndefOr[String | js.Array[Double]] = js.native
  
  var lineWidth: js.UndefOr[Double] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var stroke: js.UndefOr[String | js.Array[Double]] = js.native
}
object LineToOptions {
  
  @scala.inline
  def apply(): LineToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineToOptions]
  }
  
  @scala.inline
  implicit class LineToOptionsMutableBuilder[Self <: LineToOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String | js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setDash(value: js.Array[Double]): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
    
    @scala.inline
    def setDashVarargs(value: Double*): Self = StObject.set(x, "dash", js.Array(value :_*))
    
    @scala.inline
    def setFill(value: String | js.Array[Double]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFillVarargs(value: Double*): Self = StObject.set(x, "fill", js.Array(value :_*))
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setStroke(value: String | js.Array[Double]): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStrokeVarargs(value: Double*): Self = StObject.set(x, "stroke", js.Array(value :_*))
  }
}
