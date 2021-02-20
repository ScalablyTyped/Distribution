package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramSelectOptions extends StObject {
  
  var addToSelection: js.UndefOr[Boolean] = js.native
}
object DiagramSelectOptions {
  
  @scala.inline
  def apply(): DiagramSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramSelectOptions]
  }
  
  @scala.inline
  implicit class DiagramSelectOptionsMutableBuilder[Self <: DiagramSelectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddToSelection(value: Boolean): Self = StObject.set(x, "addToSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddToSelectionUndefined: Self = StObject.set(x, "addToSelection", js.undefined)
  }
}
