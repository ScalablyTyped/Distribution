package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrilldownActiveDataLabelStyleOptions extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var fontWeight: js.UndefOr[String] = js.undefined
  
  var textDecoration: js.UndefOr[String] = js.undefined
}
object DrilldownActiveDataLabelStyleOptions {
  
  inline def apply(): DrilldownActiveDataLabelStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrilldownActiveDataLabelStyleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrilldownActiveDataLabelStyleOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
  }
}
