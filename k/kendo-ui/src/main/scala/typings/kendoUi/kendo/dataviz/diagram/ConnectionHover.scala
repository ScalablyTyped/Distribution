package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionHover extends StObject {
  
  var stroke: js.UndefOr[ConnectionHoverStroke] = js.undefined
}
object ConnectionHover {
  
  inline def apply(): ConnectionHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionHover]
  }
  
  extension [Self <: ConnectionHover](x: Self) {
    
    inline def setStroke(value: ConnectionHoverStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
