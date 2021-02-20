package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionStartCap extends StObject {
  
  var fill: js.UndefOr[String | ConnectionStartCapFill] = js.native
  
  var stroke: js.UndefOr[String | ConnectionStartCapStroke] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object ConnectionStartCap {
  
  @scala.inline
  def apply(): ConnectionStartCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionStartCap]
  }
  
  @scala.inline
  implicit class ConnectionStartCapMutableBuilder[Self <: ConnectionStartCap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | ConnectionStartCapFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: String | ConnectionStartCapStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
