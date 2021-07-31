package typings.intercomClient.anon

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.intercomClientStrings.contact
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
  
  var custom_attributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var last_request_at: js.UndefOr[Double | Null] = js.undefined
  
  var last_seen_ip: js.UndefOr[String | Null] = js.undefined
  
  var location_data: js.UndefOr[LocationData | js.Object] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var phone: js.UndefOr[String | Null] = js.undefined
  
  var referrer: js.UndefOr[String | Null] = js.undefined
  
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
  
  @scala.inline
  def apply(): PartialLead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLead]
  }
  
  @scala.inline
  implicit class PartialLeadMutableBuilder[Self <: PartialLead] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatar(value: Avatar): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    @scala.inline
    def setCompanies(value: Companies): Self = StObject.set(x, "companies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompaniesUndefined: Self = StObject.set(x, "companies", js.undefined)
    
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
    def setLocation_data(value: LocationData | js.Object): Self = StObject.set(x, "location_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation_dataUndefined: Self = StObject.set(x, "location_data", js.undefined)
    
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
    def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerNull: Self = StObject.set(x, "referrer", null)
    
    @scala.inline
    def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    @scala.inline
    def setSegments(value: Segments): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSocial_profiles(value: Socialprofiles): Self = StObject.set(x, "social_profiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocial_profilesUndefined: Self = StObject.set(x, "social_profiles", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setType(value: contact): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
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
