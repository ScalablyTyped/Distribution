package typings.intercomClient

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.anon.Companies
import typings.intercomClient.anon.Next
import typings.intercomClient.anon.Segments
import typings.intercomClient.anon.Socialprofiles
import typings.intercomClient.anon.Tags
import typings.intercomClient.intercomClientStrings.contact
import typings.intercomClient.intercomClientStrings.lead
import typings.intercomClient.intercomClientStrings.user
import typings.intercomClient.intercomClientStrings.userDotlist
import typings.intercomClient.userMod.Avatar
import typings.intercomClient.userMod.LocationData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object leadMod {
  
  trait Lead extends StObject {
    
    var avatar: Avatar
    
    var companies: Companies
    
    val created_at: Double
    
    var custom_attributes: StringDictionary[Any]
    
    var email: String | Null
    
    val id: String
    
    var last_request_at: Double | Null
    
    var last_seen_ip: String | Null
    
    var location_data: LocationData | js.Object
    
    var name: String | Null
    
    var phone: String | Null
    
    var referrer: String | Null
    
    var role: user | lead
    
    var segments: Segments
    
    var social_profiles: Socialprofiles
    
    var tags: Tags
    
    var `type`: contact
    
    var unsubscribed_from_emails: Boolean
    
    val updated_at: Double
    
    var user_agent_data: String | Null
    
    var user_id: String | Null
  }
  object Lead {
    
    inline def apply(
      avatar: Avatar,
      companies: Companies,
      created_at: Double,
      custom_attributes: StringDictionary[Any],
      id: String,
      location_data: LocationData | js.Object,
      role: user | lead,
      segments: Segments,
      social_profiles: Socialprofiles,
      tags: Tags,
      unsubscribed_from_emails: Boolean,
      updated_at: Double
    ): Lead = {
      val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], companies = companies.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_attributes = custom_attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location_data = location_data.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], social_profiles = social_profiles.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], unsubscribed_from_emails = unsubscribed_from_emails.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], email = null, last_request_at = null, last_seen_ip = null, name = null, phone = null, referrer = null, user_agent_data = null, user_id = null)
      __obj.updateDynamic("type")("contact")
      __obj.asInstanceOf[Lead]
    }
    
    extension [Self <: Lead](x: Self) {
      
      inline def setAvatar(value: Avatar): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setCompanies(value: Companies): Self = StObject.set(x, "companies", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCustom_attributes(value: StringDictionary[Any]): Self = StObject.set(x, "custom_attributes", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailNull: Self = StObject.set(x, "email", null)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLast_request_at(value: Double): Self = StObject.set(x, "last_request_at", value.asInstanceOf[js.Any])
      
      inline def setLast_request_atNull: Self = StObject.set(x, "last_request_at", null)
      
      inline def setLast_seen_ip(value: String): Self = StObject.set(x, "last_seen_ip", value.asInstanceOf[js.Any])
      
      inline def setLast_seen_ipNull: Self = StObject.set(x, "last_seen_ip", null)
      
      inline def setLocation_data(value: LocationData | js.Object): Self = StObject.set(x, "location_data", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneNull: Self = StObject.set(x, "phone", null)
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerNull: Self = StObject.set(x, "referrer", null)
      
      inline def setRole(value: user | lead): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setSegments(value: Segments): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      inline def setSocial_profiles(value: Socialprofiles): Self = StObject.set(x, "social_profiles", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setType(value: contact): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribed_from_emails(value: Boolean): Self = StObject.set(x, "unsubscribed_from_emails", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: Double): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setUser_agent_data(value: String): Self = StObject.set(x, "user_agent_data", value.asInstanceOf[js.Any])
      
      inline def setUser_agent_dataNull: Self = StObject.set(x, "user_agent_data", null)
      
      inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
      
      inline def setUser_idNull: Self = StObject.set(x, "user_id", null)
    }
  }
  
  trait LeadIdIdentifier
    extends StObject
       with LeadIdentifier {
    
    var id: String
  }
  object LeadIdIdentifier {
    
    inline def apply(id: String): LeadIdIdentifier = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeadIdIdentifier]
    }
    
    extension [Self <: LeadIdIdentifier](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.intercomClient.leadMod.LeadIdIdentifier
    - typings.intercomClient.anon.Userid
  */
  trait LeadIdentifier extends StObject
  object LeadIdentifier {
    
    inline def LeadIdIdentifier(id: String): typings.intercomClient.leadMod.LeadIdIdentifier = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intercomClient.leadMod.LeadIdIdentifier]
    }
    
    inline def Userid(user_id: String): typings.intercomClient.anon.Userid = {
      val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intercomClient.anon.Userid]
    }
  }
  
  trait List extends StObject {
    
    var contacts: js.Array[Lead]
    
    var pages: Next
    
    var total_count: Double
    
    var `type`: userDotlist
  }
  object List {
    
    inline def apply(contacts: js.Array[Lead], pages: Next, total_count: Double): typings.intercomClient.leadMod.List = {
      val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("user.list")
      __obj.asInstanceOf[typings.intercomClient.leadMod.List]
    }
    
    extension [Self <: typings.intercomClient.leadMod.List](x: Self) {
      
      inline def setContacts(value: js.Array[Lead]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
      
      inline def setContactsVarargs(value: Lead*): Self = StObject.set(x, "contacts", js.Array(value*))
      
      inline def setPages(value: Next): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
      
      inline def setType(value: userDotlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
