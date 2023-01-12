package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramShapeDefaultsHover extends StObject {
  
  var fill: js.UndefOr[String | DiagramShapeDefaultsHoverFill] = js.undefined
}
object DiagramShapeDefaultsHover {
  
  inline def apply(): DiagramShapeDefaultsHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeDefaultsHover]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagramShapeDefaultsHover] (val x: Self) extends AnyVal {
    
    inline def setFill(value: String | DiagramShapeDefaultsHoverFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
