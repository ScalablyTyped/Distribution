package typings.iitc.hooksMod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventPortalSelected extends StObject {
  
  var selectedPortalGuid: String = js.native
  
  var unselectedPortalGuid: String = js.native
}
object EventPortalSelected {
  
  @scala.inline
  def apply(selectedPortalGuid: String, unselectedPortalGuid: String): EventPortalSelected = {
    val __obj = js.Dynamic.literal(selectedPortalGuid = selectedPortalGuid.asInstanceOf[js.Any], unselectedPortalGuid = unselectedPortalGuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventPortalSelected]
  }
  
  @scala.inline
  implicit class EventPortalSelectedMutableBuilder[Self <: EventPortalSelected] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectedPortalGuid(value: String): Self = StObject.set(x, "selectedPortalGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectedPortalGuid(value: String): Self = StObject.set(x, "unselectedPortalGuid", value.asInstanceOf[js.Any])
  }
}
