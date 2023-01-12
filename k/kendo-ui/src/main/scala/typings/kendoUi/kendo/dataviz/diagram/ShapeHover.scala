package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeHover extends StObject {
  
  var fill: js.UndefOr[String | ShapeHoverFill] = js.undefined
}
object ShapeHover {
  
  inline def apply(): ShapeHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeHover]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeHover] (val x: Self) extends AnyVal {
    
    inline def setFill(value: String | ShapeHoverFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
