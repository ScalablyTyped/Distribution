package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramConnectionEndCapFill extends StObject {
  
  var color: js.UndefOr[String] = js.native
}
object DiagramConnectionEndCapFill {
  
  @scala.inline
  def apply(): DiagramConnectionEndCapFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionEndCapFill]
  }
  
  @scala.inline
  implicit class DiagramConnectionEndCapFillMutableBuilder[Self <: DiagramConnectionEndCapFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
