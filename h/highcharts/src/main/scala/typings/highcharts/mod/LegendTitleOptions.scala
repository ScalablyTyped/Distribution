package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendTitleOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Generic CSS styles for the
    * legend title.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A text or HTML string for the
    * title.
    */
  var text: js.UndefOr[String] = js.undefined
}
object LegendTitleOptions {
  
  inline def apply(): LegendTitleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendTitleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegendTitleOptions] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
