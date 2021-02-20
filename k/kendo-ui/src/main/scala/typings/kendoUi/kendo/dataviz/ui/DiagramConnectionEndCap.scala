package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramConnectionEndCap extends StObject {
  
  var fill: js.UndefOr[String | DiagramConnectionEndCapFill] = js.native
  
  var stroke: js.UndefOr[String | DiagramConnectionEndCapStroke] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object DiagramConnectionEndCap {
  
  @scala.inline
  def apply(): DiagramConnectionEndCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionEndCap]
  }
  
  @scala.inline
  implicit class DiagramConnectionEndCapMutableBuilder[Self <: DiagramConnectionEndCap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | DiagramConnectionEndCapFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: String | DiagramConnectionEndCapStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
