package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionHover extends StObject {
  
  var stroke: js.UndefOr[ConnectionHoverStroke] = js.native
}
object ConnectionHover {
  
  @scala.inline
  def apply(): ConnectionHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionHover]
  }
  
  @scala.inline
  implicit class ConnectionHoverMutableBuilder[Self <: ConnectionHover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStroke(value: ConnectionHoverStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
