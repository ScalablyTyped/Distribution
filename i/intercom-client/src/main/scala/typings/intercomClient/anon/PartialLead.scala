package typings.intercomClient.anon

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.intercomClientStrings.contact
import typings.intercomClient.intercomClientStrings.lead
import typings.intercomClient.intercomClientStrings.user
import typings.intercomClient.userMod.Avatar
import typings.intercomClient.userMod.LocationData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<intercom-client.intercom-client/Lead.Lead> */
trait PartialLead extends StObject {
  
  var avatar: js.UndefOr[Avatar] = js.undefined
  
  var companies: js.UndefOr[Companies] = js.undefined
  
  var created_at: js.UndefOr[Double] = js.undefined
  
  var custom_attributes: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var last_request_at: js.UndefOr[Double | Null] = js.undefined
  
  var last_seen_ip: js.UndefOr[String | Null] = js.undefined
  
  var location_data: js.UndefOr[LocationData | js.Object] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var phone: js.UndefOr[String | Null] = js.undefined
  
  var referrer: js.UndefOr[String | Null] = js.undefined
  
  var role: js.UndefOr[user | lead] = js.undefined
  
  var segments: js.UndefOr[Segments] = js.undefined
  
  var social_profiles: js.UndefOr[Socialprofiles] = js.undefined
  
  var tags: js.UndefOr[Tags] = js.undefined
  
  var `type`: js.UndefOr[contact] = js.undefined
  
  var unsubscribed_from_emails: js.UndefOr[Boolean] = js.undefined
  
  var updated_at: js.UndefOr[Double] = js.undefined
  
  var user_agent_data: js.UndefOr[String | Null] = js.undefined
  
  var user_id: js.UndefOr[String | Null] = js.undefined
}
object PartialLead {
  
  inline def apply(): PartialLead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLead]
  }
  
  extension [Self <: PartialLead](x: Self) {
    
    inline def setAvatar(value: Avatar): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    inline def setCompanies(value: Companies): Self = StObject.set(x, "companies", value.asInstanceOf[js.Any])
    
    inline def setCompaniesUndefined: Self = StObject.set(x, "companies", js.undefined)
    
    inline def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setCustom_attributes(value: StringDictionary[Any]): Self = StObject.set(x, "custom_attributes", value.asInstanceOf[js.Any])
    
    inline def setCustom_attributesUndefined: Self = StObject.set(x, "custom_attributes", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLast_request_at(value: Double): Self = StObject.set(x, "last_request_at", value.asInstanceOf[js.Any])
    
    inline def setLast_request_atNull: Self = StObject.set(x, "last_request_at", null)
    
    inline def setLast_request_atUndefined: Self = StObject.set(x, "last_request_at", js.undefined)
    
    inline def setLast_seen_ip(value: String): Self = StObject.set(x, "last_seen_ip", value.asInstanceOf[js.Any])
    
    inline def setLast_seen_ipNull: Self = StObject.set(x, "last_seen_ip", null)
    
    inline def setLast_seen_ipUndefined: Self = StObject.set(x, "last_seen_ip", js.undefined)
    
    inline def setLocation_data(value: LocationData | js.Object): Self = StObject.set(x, "location_data", value.asInstanceOf[js.Any])
    
    inline def setLocation_dataUndefined: Self = StObject.set(x, "location_data", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerNull: Self = StObject.set(x, "referrer", null)
    
    inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    inline def setRole(value: user | lead): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSegments(value: Segments): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSocial_profiles(value: Socialprofiles): Self = StObject.set(x, "social_profiles", value.asInstanceOf[js.Any])
    
    inline def setSocial_profilesUndefined: Self = StObject.set(x, "social_profiles", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: contact): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnsubscribed_from_emails(value: Boolean): Self = StObject.set(x, "unsubscribed_from_emails", value.asInstanceOf[js.Any])
    
    inline def setUnsubscribed_from_emailsUndefined: Self = StObject.set(x, "unsubscribed_from_emails", js.undefined)
    
    inline def setUpdated_at(value: Double): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    inline def setUser_agent_data(value: String): Self = StObject.set(x, "user_agent_data", value.asInstanceOf[js.Any])
    
    inline def setUser_agent_dataNull: Self = StObject.set(x, "user_agent_data", null)
    
    inline def setUser_agent_dataUndefined: Self = StObject.set(x, "user_agent_data", js.undefined)
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    inline def setUser_idNull: Self = StObject.set(x, "user_id", null)
    
    inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
