package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartZoomable extends StObject {
  
  var mousewheel: js.UndefOr[Boolean | ChartZoomableMousewheel] = js.undefined
  
  var selection: js.UndefOr[Boolean | ChartZoomableSelection] = js.undefined
}
object ChartZoomable {
  
  inline def apply(): ChartZoomable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartZoomable]
  }
  
  extension [Self <: ChartZoomable](x: Self) {
    
    inline def setMousewheel(value: Boolean | ChartZoomableMousewheel): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
    
    inline def setMousewheelUndefined: Self = StObject.set(x, "mousewheel", js.undefined)
    
    inline def setSelection(value: Boolean | ChartZoomableSelection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
  }
}
