package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionStroke extends StObject {
  
  var color: js.UndefOr[String] = js.native
}
object ConnectionStroke {
  
  @scala.inline
  def apply(): ConnectionStroke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionStroke]
  }
  
  @scala.inline
  implicit class ConnectionStrokeMutableBuilder[Self <: ConnectionStroke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
