package typings.maximMazurokGapiClientAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerId extends StObject {
  
  /** Output only. The unique identifier of the customer's account. */
  var customerId: js.UndefOr[String] = js.native
  
  /** Output only. Object key. Only relevant if entity.type = "OBJECT" Note: external-facing name of report is "Entities" rather than "Objects". */
  var entityId: js.UndefOr[String] = js.native
  
  /** Output only. The user's immutable G Suite profile identifier. */
  var profileId: js.UndefOr[String] = js.native
  
  /** Output only. The type of item. The value is customer. */
  var `type`: js.UndefOr[String] = js.native
  
  /** Output only. The user's email address. Only relevant if entity.type = "USER" */
  var userEmail: js.UndefOr[String] = js.native
}
object CustomerId {
  
  @scala.inline
  def apply(): CustomerId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerId]
  }
  
  @scala.inline
  implicit class CustomerIdMutableBuilder[Self <: CustomerId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEmailUndefined: Self = StObject.set(x, "userEmail", js.undefined)
  }
}
