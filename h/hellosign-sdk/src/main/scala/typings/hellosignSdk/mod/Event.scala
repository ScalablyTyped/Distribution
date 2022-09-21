package typings.hellosignSdk.mod

import typings.hellosignSdk.anon.Eventhash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event[Metadata] extends StObject {
  
  /**
    * @deprecated Use `reported_for_account_id` instead
    */
  var account_guid: String
  
  /**
    * @deprecated Use `reported_for_app_id` instead
    */
  var client_id: String
  
  var event: Eventhash[Metadata]
}
object Event {
  
  inline def apply[Metadata](account_guid: String, client_id: String, event: Eventhash[Metadata]): Event[Metadata] = {
    val __obj = js.Dynamic.literal(account_guid = account_guid.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[Metadata]]
  }
  
  extension [Self <: Event[?], Metadata](x: Self & Event[Metadata]) {
    
    inline def setAccount_guid(value: String): Self = StObject.set(x, "account_guid", value.asInstanceOf[js.Any])
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: Eventhash[Metadata]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
