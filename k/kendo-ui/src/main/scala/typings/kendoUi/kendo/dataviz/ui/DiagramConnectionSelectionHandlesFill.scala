package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionSelectionHandlesFill extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object DiagramConnectionSelectionHandlesFill {
  
  inline def apply(): DiagramConnectionSelectionHandlesFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionSelectionHandlesFill]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagramConnectionSelectionHandlesFill] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
