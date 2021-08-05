package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionSelectionHandlesStroke extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object DiagramConnectionSelectionHandlesStroke {
  
  inline def apply(): DiagramConnectionSelectionHandlesStroke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionSelectionHandlesStroke]
  }
  
  extension [Self <: DiagramConnectionSelectionHandlesStroke](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
