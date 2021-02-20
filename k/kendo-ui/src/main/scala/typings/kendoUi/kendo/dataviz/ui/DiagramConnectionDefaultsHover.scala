package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramConnectionDefaultsHover extends StObject {
  
  var stroke: js.UndefOr[DiagramConnectionDefaultsHoverStroke] = js.native
}
object DiagramConnectionDefaultsHover {
  
  @scala.inline
  def apply(): DiagramConnectionDefaultsHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsHover]
  }
  
  @scala.inline
  implicit class DiagramConnectionDefaultsHoverMutableBuilder[Self <: DiagramConnectionDefaultsHover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStroke(value: DiagramConnectionDefaultsHoverStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
