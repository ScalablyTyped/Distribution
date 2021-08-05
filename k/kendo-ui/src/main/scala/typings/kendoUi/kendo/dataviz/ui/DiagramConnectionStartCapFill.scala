package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionStartCapFill extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object DiagramConnectionStartCapFill {
  
  inline def apply(): DiagramConnectionStartCapFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionStartCapFill]
  }
  
  extension [Self <: DiagramConnectionStartCapFill](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
