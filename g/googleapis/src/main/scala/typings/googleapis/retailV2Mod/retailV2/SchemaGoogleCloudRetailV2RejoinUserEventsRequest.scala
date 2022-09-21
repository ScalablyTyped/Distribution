package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2RejoinUserEventsRequest extends StObject {
  
  /**
    * The type of the user event rejoin to define the scope and range of the user events to be rejoined with the latest product catalog. Defaults to USER_EVENT_REJOIN_SCOPE_UNSPECIFIED if this field is not set, or set to an invalid integer value.
    */
  var userEventRejoinScope: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2RejoinUserEventsRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2RejoinUserEventsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2RejoinUserEventsRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2RejoinUserEventsRequest](x: Self) {
    
    inline def setUserEventRejoinScope(value: String): Self = StObject.set(x, "userEventRejoinScope", value.asInstanceOf[js.Any])
    
    inline def setUserEventRejoinScopeNull: Self = StObject.set(x, "userEventRejoinScope", null)
    
    inline def setUserEventRejoinScopeUndefined: Self = StObject.set(x, "userEventRejoinScope", js.undefined)
  }
}
