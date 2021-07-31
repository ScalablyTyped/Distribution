package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionDefaultsEndCap extends StObject {
  
  var fill: js.UndefOr[String | DiagramConnectionDefaultsEndCapFill] = js.undefined
  
  var stroke: js.UndefOr[String | DiagramConnectionDefaultsEndCapStroke] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DiagramConnectionDefaultsEndCap {
  
  @scala.inline
  def apply(): DiagramConnectionDefaultsEndCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsEndCap]
  }
  
  @scala.inline
  implicit class DiagramConnectionDefaultsEndCapMutableBuilder[Self <: DiagramConnectionDefaultsEndCap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | DiagramConnectionDefaultsEndCapFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: String | DiagramConnectionDefaultsEndCapStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
