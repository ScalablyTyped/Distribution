package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupLinkSharingModificationEvent extends StObject {
  
  var newStatus: js.UndefOr[String] = js.undefined
}
object GroupLinkSharingModificationEvent {
  
  inline def apply(): GroupLinkSharingModificationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupLinkSharingModificationEvent]
  }
  
  extension [Self <: GroupLinkSharingModificationEvent](x: Self) {
    
    inline def setNewStatus(value: String): Self = StObject.set(x, "newStatus", value.asInstanceOf[js.Any])
    
    inline def setNewStatusUndefined: Self = StObject.set(x, "newStatus", js.undefined)
  }
}
