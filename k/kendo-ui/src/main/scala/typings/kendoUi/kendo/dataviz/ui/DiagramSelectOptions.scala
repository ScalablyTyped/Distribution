package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramSelectOptions extends StObject {
  
  var addToSelection: js.UndefOr[Boolean] = js.undefined
}
object DiagramSelectOptions {
  
  inline def apply(): DiagramSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramSelectOptions]
  }
  
  extension [Self <: DiagramSelectOptions](x: Self) {
    
    inline def setAddToSelection(value: Boolean): Self = StObject.set(x, "addToSelection", value.asInstanceOf[js.Any])
    
    inline def setAddToSelectionUndefined: Self = StObject.set(x, "addToSelection", js.undefined)
  }
}
