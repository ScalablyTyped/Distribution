package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramConnectionSelection extends StObject {
  
  var handles: js.UndefOr[DiagramConnectionSelectionHandles] = js.native
}
object DiagramConnectionSelection {
  
  @scala.inline
  def apply(): DiagramConnectionSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionSelection]
  }
  
  @scala.inline
  implicit class DiagramConnectionSelectionMutableBuilder[Self <: DiagramConnectionSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandles(value: DiagramConnectionSelectionHandles): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlesUndefined: Self = StObject.set(x, "handles", js.undefined)
  }
}
