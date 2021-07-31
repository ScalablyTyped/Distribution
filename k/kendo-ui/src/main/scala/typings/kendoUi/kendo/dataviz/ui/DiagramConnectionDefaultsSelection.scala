package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionDefaultsSelection extends StObject {
  
  var handles: js.UndefOr[DiagramConnectionDefaultsSelectionHandles] = js.undefined
}
object DiagramConnectionDefaultsSelection {
  
  @scala.inline
  def apply(): DiagramConnectionDefaultsSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsSelection]
  }
  
  @scala.inline
  implicit class DiagramConnectionDefaultsSelectionMutableBuilder[Self <: DiagramConnectionDefaultsSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandles(value: DiagramConnectionDefaultsSelectionHandles): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlesUndefined: Self = StObject.set(x, "handles", js.undefined)
  }
}
