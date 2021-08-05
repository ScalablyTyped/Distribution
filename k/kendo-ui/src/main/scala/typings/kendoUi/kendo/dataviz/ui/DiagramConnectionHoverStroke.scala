package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionHoverStroke extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object DiagramConnectionHoverStroke {
  
  inline def apply(): DiagramConnectionHoverStroke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionHoverStroke]
  }
  
  extension [Self <: DiagramConnectionHoverStroke](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
