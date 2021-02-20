package typings.maximMazurokGapiClientAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallerType extends StObject {
  
  /** The type of actor. */
  var callerType: js.UndefOr[String] = js.native
  
  /** The primary email address of the actor. May be absent if there is no email address associated with the actor. */
  var email: js.UndefOr[String] = js.native
  
  /** Only present when callerType is KEY. Can be the consumer_key of the requestor for OAuth 2LO API requests or an identifier for robot accounts. */
  var key: js.UndefOr[String] = js.native
  
  /** The unique G Suite profile ID of the actor. May be absent if the actor is not a G Suite user. */
  var profileId: js.UndefOr[String] = js.native
}
object CallerType {
  
  @scala.inline
  def apply(): CallerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallerType]
  }
  
  @scala.inline
  implicit class CallerTypeMutableBuilder[Self <: CallerType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallerType(value: String): Self = StObject.set(x, "callerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallerTypeUndefined: Self = StObject.set(x, "callerType", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
  }
}
