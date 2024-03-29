package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesLollipopDataDragDropGuideBoxOptions extends StObject {
  
  /**
    * (Highcharts, Highstock) Style options for the guide box default state.
    */
  var default: js.UndefOr[DragDropGuideBoxOptionsObject] = js.undefined
}
object SeriesLollipopDataDragDropGuideBoxOptions {
  
  inline def apply(): SeriesLollipopDataDragDropGuideBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesLollipopDataDragDropGuideBoxOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeriesLollipopDataDragDropGuideBoxOptions] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: DragDropGuideBoxOptionsObject): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
