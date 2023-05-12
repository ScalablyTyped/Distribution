package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAxisPlotLinesLabelsOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) Whether to hide labels that are outside
    * the plot area.
    */
  var clip: js.UndefOr[Boolean] = js.undefined
}
object XAxisPlotLinesLabelsOptions {
  
  inline def apply(): XAxisPlotLinesLabelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XAxisPlotLinesLabelsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XAxisPlotLinesLabelsOptions] (val x: Self) extends AnyVal {
    
    inline def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
  }
}
