package typings.intercomClient.anon

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.intercomClientStrings.contact
import typings.intercomClient.intercomClientStrings.user
import typings.intercomClient.userMod.Avatar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<intercom-client.intercom-client/User.CreateUpdateUser> */
trait PartialCreateUpdateUser extends StObject {
  
  var anonymous: js.UndefOr[Boolean] = js.undefined
  
  var app_id: js.UndefOr[String] = js.undefined
  
  var avatar: js.UndefOr[Avatar] = js.undefined
  
  var companies: js.UndefOr[js.Array[PartialCompanyremoveboole]] = js.undefined
  
  var created_at: js.UndefOr[Double] = js.undefined
  
  var custom_attributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var last_request_at: js.UndefOr[Double | Null] = js.undefined
  
  var last_seen_ip: js.UndefOr[String | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var phone: js.UndefOr[String | Null] = js.undefined
  
  var pseudonym: js.UndefOr[String | Null] = js.undefined
  
  var session_count: js.UndefOr[Double] = js.undefined
  
  var signed_up_at: js.UndefOr[Double | Null] = js.undefined
  
  var `type`: js.UndefOr[user | contact] = js.undefined
  
  var unsubscribed_from_emails: js.UndefOr[Boolean] = js.undefined
  
  var updated_at: js.UndefOr[Double] = js.undefined
  
  var user_agent_data: js.UndefOr[String | Null] = js.undefined
  
  var user_id: js.UndefOr[String | Null] = js.undefined
}
object PartialCreateUpdateUser {
  
  @scala.inline
  def apply(): PartialCreateUpdateUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCreateUpdateUser]
  }
  
  @scala.inline
  implicit class PartialCreateUpdateUserMutableBuilder[Self <: PartialCreateUpdateUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    @scala.inline
    def setApp_id(value: String): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
    
    @scala.inline
    def setAvatar(value: Avatar): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    @scala.inline
    def setCompanies(value: js.Array[PartialCompanyremoveboole]): Self = StObject.set(x, "companies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompaniesUndefined: Self = StObject.set(x, "companies", js.undefined)
    
    @scala.inline
    def setCompaniesVarargs(value: PartialCompanyremoveboole*): Self = StObject.set(x, "companies", js.Array(value :_*))
    
    @scala.inline
    def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    @scala.inline
    def setCustom_attributes(value: StringDictionary[js.Any]): Self = StObject.set(x, "custom_attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_attributesUndefined: Self = StObject.set(x, "custom_attributes", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNull: Self = StObject.set(x, "email", null)
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLast_request_at(value: Double): Self = StObject.set(x, "last_request_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_request_atNull: Self = StObject.set(x, "last_request_at", null)
    
    @scala.inline
    def setLast_request_atUndefined: Self = StObject.set(x, "last_request_at", js.undefined)
    
    @scala.inline
    def setLast_seen_ip(value: String): Self = StObject.set(x, "last_seen_ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_seen_ipNull: Self = StObject.set(x, "last_seen_ip", null)
    
    @scala.inline
    def setLast_seen_ipUndefined: Self = StObject.set(x, "last_seen_ip", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setPseudonym(value: String): Self = StObject.set(x, "pseudonym", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPseudonymNull: Self = StObject.set(x, "pseudonym", null)
    
    @scala.inline
    def setPseudonymUndefined: Self = StObject.set(x, "pseudonym", js.undefined)
    
    @scala.inline
    def setSession_count(value: Double): Self = StObject.set(x, "session_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession_countUndefined: Self = StObject.set(x, "session_count", js.undefined)
    
    @scala.inline
    def setSigned_up_at(value: Double): Self = StObject.set(x, "signed_up_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigned_up_atNull: Self = StObject.set(x, "signed_up_at", null)
    
    @scala.inline
    def setSigned_up_atUndefined: Self = StObject.set(x, "signed_up_at", js.undefined)
    
    @scala.inline
    def setType(value: user | contact): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnsubscribed_from_emails(value: Boolean): Self = StObject.set(x, "unsubscribed_from_emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsubscribed_from_emailsUndefined: Self = StObject.set(x, "unsubscribed_from_emails", js.undefined)
    
    @scala.inline
    def setUpdated_at(value: Double): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    @scala.inline
    def setUser_agent_data(value: String): Self = StObject.set(x, "user_agent_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_agent_dataNull: Self = StObject.set(x, "user_agent_data", null)
    
    @scala.inline
    def setUser_agent_dataUndefined: Self = StObject.set(x, "user_agent_data", js.undefined)
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_idNull: Self = StObject.set(x, "user_id", null)
    
    @scala.inline
    def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
