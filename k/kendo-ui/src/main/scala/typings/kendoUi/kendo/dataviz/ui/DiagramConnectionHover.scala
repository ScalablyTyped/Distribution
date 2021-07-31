package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionHover extends StObject {
  
  var stroke: js.UndefOr[DiagramConnectionHoverStroke] = js.undefined
}
object DiagramConnectionHover {
  
  @scala.inline
  def apply(): DiagramConnectionHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionHover]
  }
  
  @scala.inline
  implicit class DiagramConnectionHoverMutableBuilder[Self <: DiagramConnectionHover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStroke(value: DiagramConnectionHoverStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
