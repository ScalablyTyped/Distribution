package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionStartCapFill extends StObject {
  
  var color: js.UndefOr[String] = js.native
}
object ConnectionStartCapFill {
  
  @scala.inline
  def apply(): ConnectionStartCapFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionStartCapFill]
  }
  
  @scala.inline
  implicit class ConnectionStartCapFillMutableBuilder[Self <: ConnectionStartCapFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
