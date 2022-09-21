package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaRejoinUserEventsRequest extends StObject {
  
  /**
    * The type of the user event rejoin to define the scope and range of the user events to be rejoined with the latest product catalog. Defaults to USER_EVENT_REJOIN_SCOPE_UNSPECIFIED if this field is not set, or set to an invalid integer value.
    */
  var userEventRejoinScope: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaRejoinUserEventsRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaRejoinUserEventsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaRejoinUserEventsRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaRejoinUserEventsRequest](x: Self) {
    
    inline def setUserEventRejoinScope(value: String): Self = StObject.set(x, "userEventRejoinScope", value.asInstanceOf[js.Any])
    
    inline def setUserEventRejoinScopeNull: Self = StObject.set(x, "userEventRejoinScope", null)
    
    inline def setUserEventRejoinScopeUndefined: Self = StObject.set(x, "userEventRejoinScope", js.undefined)
  }
}
