package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartZoomable extends StObject {
  
  var mousewheel: js.UndefOr[Boolean | ChartZoomableMousewheel] = js.undefined
  
  var selection: js.UndefOr[Boolean | ChartZoomableSelection] = js.undefined
}
object ChartZoomable {
  
  @scala.inline
  def apply(): ChartZoomable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartZoomable]
  }
  
  @scala.inline
  implicit class ChartZoomableMutableBuilder[Self <: ChartZoomable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMousewheel(value: Boolean | ChartZoomableMousewheel): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousewheelUndefined: Self = StObject.set(x, "mousewheel", js.undefined)
    
    @scala.inline
    def setSelection(value: Boolean | ChartZoomableSelection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
  }
}
