package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionEndCapFill extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object ConnectionEndCapFill {
  
  inline def apply(): ConnectionEndCapFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionEndCapFill]
  }
  
  extension [Self <: ConnectionEndCapFill](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
