package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionEndCapFill extends StObject {
  
  var color: js.UndefOr[String] = js.native
}
object ConnectionEndCapFill {
  
  @scala.inline
  def apply(): ConnectionEndCapFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionEndCapFill]
  }
  
  @scala.inline
  implicit class ConnectionEndCapFillMutableBuilder[Self <: ConnectionEndCapFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
