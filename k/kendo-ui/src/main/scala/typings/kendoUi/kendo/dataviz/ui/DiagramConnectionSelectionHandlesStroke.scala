package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramConnectionSelectionHandlesStroke extends StObject {
  
  var color: js.UndefOr[String] = js.native
}
object DiagramConnectionSelectionHandlesStroke {
  
  @scala.inline
  def apply(): DiagramConnectionSelectionHandlesStroke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionSelectionHandlesStroke]
  }
  
  @scala.inline
  implicit class DiagramConnectionSelectionHandlesStrokeMutableBuilder[Self <: DiagramConnectionSelectionHandlesStroke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
