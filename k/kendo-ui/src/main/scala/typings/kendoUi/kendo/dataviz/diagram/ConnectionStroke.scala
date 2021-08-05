package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionStroke extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object ConnectionStroke {
  
  inline def apply(): ConnectionStroke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionStroke]
  }
  
  extension [Self <: ConnectionStroke](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
