package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionStartCap extends StObject {
  
  var fill: js.UndefOr[String | DiagramConnectionStartCapFill] = js.undefined
  
  var stroke: js.UndefOr[String | DiagramConnectionStartCapStroke] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DiagramConnectionStartCap {
  
  @scala.inline
  def apply(): DiagramConnectionStartCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionStartCap]
  }
  
  @scala.inline
  implicit class DiagramConnectionStartCapMutableBuilder[Self <: DiagramConnectionStartCap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | DiagramConnectionStartCapFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: String | DiagramConnectionStartCapStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
