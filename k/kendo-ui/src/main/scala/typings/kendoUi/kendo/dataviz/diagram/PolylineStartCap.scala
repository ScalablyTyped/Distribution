package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolylineStartCap extends StObject {
  
  var fill: js.UndefOr[String | PolylineStartCapFill] = js.undefined
  
  var stroke: js.UndefOr[String | PolylineStartCapStroke] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PolylineStartCap {
  
  @scala.inline
  def apply(): PolylineStartCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineStartCap]
  }
  
  @scala.inline
  implicit class PolylineStartCapMutableBuilder[Self <: PolylineStartCap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | PolylineStartCapFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: String | PolylineStartCapStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
