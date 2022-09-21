package typings.hummusRecipe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineOptions extends StObject {
  
  var color: js.UndefOr[String | js.Array[Double]] = js.undefined
  
  var dash: js.UndefOr[js.Array[Double]] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  var stroke: js.UndefOr[String | js.Array[Double]] = js.undefined
}
object LineOptions {
  
  inline def apply(): LineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOptions]
  }
  
  extension [Self <: LineOptions](x: Self) {
    
    inline def setColor(value: String | js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setDash(value: js.Array[Double]): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    inline def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
    
    inline def setDashVarargs(value: Double*): Self = StObject.set(x, "dash", js.Array(value*))
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setStroke(value: String | js.Array[Double]): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeVarargs(value: Double*): Self = StObject.set(x, "stroke", js.Array(value*))
  }
}
