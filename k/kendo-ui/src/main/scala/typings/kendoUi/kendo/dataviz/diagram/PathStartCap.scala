package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathStartCap extends StObject {
  
  var fill: js.UndefOr[String | PathStartCapFill] = js.undefined
  
  var stroke: js.UndefOr[String | PathStartCapStroke] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PathStartCap {
  
  @scala.inline
  def apply(): PathStartCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathStartCap]
  }
  
  @scala.inline
  implicit class PathStartCapMutableBuilder[Self <: PathStartCap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | PathStartCapFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: String | PathStartCapStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
