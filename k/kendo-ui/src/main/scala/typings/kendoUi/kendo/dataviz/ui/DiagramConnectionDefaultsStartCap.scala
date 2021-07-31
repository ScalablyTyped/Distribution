package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionDefaultsStartCap extends StObject {
  
  var fill: js.UndefOr[String | DiagramConnectionDefaultsStartCapFill] = js.undefined
  
  var stroke: js.UndefOr[String | DiagramConnectionDefaultsStartCapStroke] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DiagramConnectionDefaultsStartCap {
  
  @scala.inline
  def apply(): DiagramConnectionDefaultsStartCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsStartCap]
  }
  
  @scala.inline
  implicit class DiagramConnectionDefaultsStartCapMutableBuilder[Self <: DiagramConnectionDefaultsStartCap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | DiagramConnectionDefaultsStartCapFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: String | DiagramConnectionDefaultsStartCapStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
