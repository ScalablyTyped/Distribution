package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionHover extends StObject {
  
  var stroke: js.UndefOr[DiagramConnectionHoverStroke] = js.undefined
}
object DiagramConnectionHover {
  
  inline def apply(): DiagramConnectionHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionHover]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagramConnectionHover] (val x: Self) extends AnyVal {
    
    inline def setStroke(value: DiagramConnectionHoverStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
