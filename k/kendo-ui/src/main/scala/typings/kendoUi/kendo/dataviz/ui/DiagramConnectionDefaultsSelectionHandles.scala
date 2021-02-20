package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramConnectionDefaultsSelectionHandles extends StObject {
  
  var fill: js.UndefOr[String | DiagramConnectionDefaultsSelectionHandlesFill] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var stroke: js.UndefOr[DiagramConnectionDefaultsSelectionHandlesStroke] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object DiagramConnectionDefaultsSelectionHandles {
  
  @scala.inline
  def apply(): DiagramConnectionDefaultsSelectionHandles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsSelectionHandles]
  }
  
  @scala.inline
  implicit class DiagramConnectionDefaultsSelectionHandlesMutableBuilder[Self <: DiagramConnectionDefaultsSelectionHandles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | DiagramConnectionDefaultsSelectionHandlesFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setStroke(value: DiagramConnectionDefaultsSelectionHandlesStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
