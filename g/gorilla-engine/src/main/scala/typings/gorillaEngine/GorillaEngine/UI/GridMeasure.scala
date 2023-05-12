package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridMeasure extends StObject {
  
  var font: js.UndefOr[Size] = js.undefined
  
  var fractionOfBar: Double
  
  var showLabels: js.UndefOr[Boolean] = js.undefined
  
  var tickHeight: Double
}
object GridMeasure {
  
  inline def apply(fractionOfBar: Double, tickHeight: Double): GridMeasure = {
    val __obj = js.Dynamic.literal(fractionOfBar = fractionOfBar.asInstanceOf[js.Any], tickHeight = tickHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridMeasure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridMeasure] (val x: Self) extends AnyVal {
    
    inline def setFont(value: Size): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFractionOfBar(value: Double): Self = StObject.set(x, "fractionOfBar", value.asInstanceOf[js.Any])
    
    inline def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
    
    inline def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
    
    inline def setTickHeight(value: Double): Self = StObject.set(x, "tickHeight", value.asInstanceOf[js.Any])
  }
}
