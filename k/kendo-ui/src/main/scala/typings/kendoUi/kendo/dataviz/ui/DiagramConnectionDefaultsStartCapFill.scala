package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionDefaultsStartCapFill extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object DiagramConnectionDefaultsStartCapFill {
  
  @scala.inline
  def apply(): DiagramConnectionDefaultsStartCapFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsStartCapFill]
  }
  
  @scala.inline
  implicit class DiagramConnectionDefaultsStartCapFillMutableBuilder[Self <: DiagramConnectionDefaultsStartCapFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
