package typings.leafletRoutingMachine.leafletMod.Routing_

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaypointOptions extends StObject {
  
  var allowUTurn: js.UndefOr[Boolean] = js.undefined
}
object WaypointOptions {
  
  inline def apply(): WaypointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaypointOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaypointOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowUTurn(value: Boolean): Self = StObject.set(x, "allowUTurn", value.asInstanceOf[js.Any])
    
    inline def setAllowUTurnUndefined: Self = StObject.set(x, "allowUTurn", js.undefined)
  }
}
