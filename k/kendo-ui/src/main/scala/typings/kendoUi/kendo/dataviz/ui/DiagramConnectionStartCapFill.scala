package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramConnectionStartCapFill extends StObject {
  
  var color: js.UndefOr[String] = js.native
}
object DiagramConnectionStartCapFill {
  
  @scala.inline
  def apply(): DiagramConnectionStartCapFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionStartCapFill]
  }
  
  @scala.inline
  implicit class DiagramConnectionStartCapFillMutableBuilder[Self <: DiagramConnectionStartCapFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
