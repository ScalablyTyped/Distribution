package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionHoverStroke extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object ConnectionHoverStroke {
  
  inline def apply(): ConnectionHoverStroke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionHoverStroke]
  }
  
  extension [Self <: ConnectionHoverStroke](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
