package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionHoverStroke extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object DiagramConnectionHoverStroke {
  
  @scala.inline
  def apply(): DiagramConnectionHoverStroke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionHoverStroke]
  }
  
  @scala.inline
  implicit class DiagramConnectionHoverStrokeMutableBuilder[Self <: DiagramConnectionHoverStroke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
