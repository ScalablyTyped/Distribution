package typings.maximMazurokGapiClientAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallerType extends StObject {
  
  /** The type of actor. */
  var callerType: js.UndefOr[String] = js.undefined
  
  /** The primary email address of the actor. May be absent if there is no email address associated with the actor. */
  var email: js.UndefOr[String] = js.undefined
  
  /** Only present when `callerType` is `KEY`. Can be the `consumer_key` of the requestor for OAuth 2LO API requests or an identifier for robot accounts. */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * The unique Google Workspace profile ID of the actor. This value might be absent if the actor is not a Google Workspace user, or may be the number 105250506097979753968 which
    * acts as a placeholder ID.
    */
  var profileId: js.UndefOr[String] = js.undefined
}
object CallerType {
  
  inline def apply(): CallerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallerType]
  }
  
  extension [Self <: CallerType](x: Self) {
    
    inline def setCallerType(value: String): Self = StObject.set(x, "callerType", value.asInstanceOf[js.Any])
    
    inline def setCallerTypeUndefined: Self = StObject.set(x, "callerType", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
  }
}
