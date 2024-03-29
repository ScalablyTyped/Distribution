package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionDefaultsSelectionHandlesFill extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object DiagramConnectionDefaultsSelectionHandlesFill {
  
  inline def apply(): DiagramConnectionDefaultsSelectionHandlesFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsSelectionHandlesFill]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagramConnectionDefaultsSelectionHandlesFill] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
