package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramConnectionDefaultsEndCapFill extends StObject {
  
  var color: js.UndefOr[String] = js.native
}
object DiagramConnectionDefaultsEndCapFill {
  
  @scala.inline
  def apply(): DiagramConnectionDefaultsEndCapFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsEndCapFill]
  }
  
  @scala.inline
  implicit class DiagramConnectionDefaultsEndCapFillMutableBuilder[Self <: DiagramConnectionDefaultsEndCapFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
