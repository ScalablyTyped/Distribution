package typings.intercomClient

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.anon.Companies
import typings.intercomClient.anon.Next
import typings.intercomClient.anon.Segments
import typings.intercomClient.anon.Socialprofiles
import typings.intercomClient.anon.Tags
import typings.intercomClient.intercomClientStrings.contact
import typings.intercomClient.intercomClientStrings.userDotlist
import typings.intercomClient.userMod.Avatar
import typings.intercomClient.userMod.LocationData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object leadMod {
  
  @js.native
  trait Lead extends StObject {
    
    var avatar: Avatar = js.native
    
    var companies: Companies = js.native
    
    val created_at: Double = js.native
    
    var custom_attributes: StringDictionary[js.Any] = js.native
    
    var email: String | Null = js.native
    
    val id: String = js.native
    
    var last_request_at: Double | Null = js.native
    
    var last_seen_ip: String | Null = js.native
    
    var location_data: LocationData | js.Object = js.native
    
    var name: String | Null = js.native
    
    var phone: String | Null = js.native
    
    var referrer: String | Null = js.native
    
    var segments: Segments = js.native
    
    var social_profiles: Socialprofiles = js.native
    
    var tags: Tags = js.native
    
    var `type`: contact = js.native
    
    var unsubscribed_from_emails: Boolean = js.native
    
    val updated_at: Double = js.native
    
    var user_agent_data: String | Null = js.native
    
    var user_id: String | Null = js.native
  }
  object Lead {
    
    @scala.inline
    def apply(
      avatar: Avatar,
      companies: Companies,
      created_at: Double,
      custom_attributes: StringDictionary[js.Any],
      id: String,
      location_data: LocationData | js.Object,
      segments: Segments,
      social_profiles: Socialprofiles,
      tags: Tags,
      `type`: contact,
      unsubscribed_from_emails: Boolean,
      updated_at: Double
    ): Lead = {
      val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], companies = companies.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_attributes = custom_attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location_data = location_data.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], social_profiles = social_profiles.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], unsubscribed_from_emails = unsubscribed_from_emails.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lead]
    }
    
    @scala.inline
    implicit class LeadMutableBuilder[Self <: Lead] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvatar(value: Avatar): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompanies(value: Companies): Self = StObject.set(x, "companies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom_attributes(value: StringDictionary[js.Any]): Self = StObject.set(x, "custom_attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailNull: Self = StObject.set(x, "email", null)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_request_at(value: Double): Self = StObject.set(x, "last_request_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_request_atNull: Self = StObject.set(x, "last_request_at", null)
      
      @scala.inline
      def setLast_seen_ip(value: String): Self = StObject.set(x, "last_seen_ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_seen_ipNull: Self = StObject.set(x, "last_seen_ip", null)
      
      @scala.inline
      def setLocation_data(value: LocationData | js.Object): Self = StObject.set(x, "location_data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneNull: Self = StObject.set(x, "phone", null)
      
      @scala.inline
      def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferrerNull: Self = StObject.set(x, "referrer", null)
      
      @scala.inline
      def setSegments(value: Segments): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocial_profiles(value: Socialprofiles): Self = StObject.set(x, "social_profiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: contact): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsubscribed_from_emails(value: Boolean): Self = StObject.set(x, "unsubscribed_from_emails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated_at(value: Double): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_agent_data(value: String): Self = StObject.set(x, "user_agent_data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_agent_dataNull: Self = StObject.set(x, "user_agent_data", null)
      
      @scala.inline
      def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_idNull: Self = StObject.set(x, "user_id", null)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.intercomClient.anon.Id
    - typings.intercomClient.anon.Userid
  */
  trait LeadIdentifier extends StObject
  object LeadIdentifier {
    
    @scala.inline
    def Id(id: String): typings.intercomClient.anon.Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intercomClient.anon.Id]
    }
    
    @scala.inline
    def Userid(user_id: String): typings.intercomClient.anon.Userid = {
      val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intercomClient.anon.Userid]
    }
  }
  
  @js.native
  trait List extends StObject {
    
    var contacts: js.Array[Lead] = js.native
    
    var pages: Next = js.native
    
    var total_count: Double = js.native
    
    var `type`: userDotlist = js.native
  }
  object List {
    
    @scala.inline
    def apply(contacts: js.Array[Lead], pages: Next, total_count: Double, `type`: userDotlist): List = {
      val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[List]
    }
    
    @scala.inline
    implicit class ListMutableBuilder[Self <: List] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContacts(value: js.Array[Lead]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContactsVarargs(value: Lead*): Self = StObject.set(x, "contacts", js.Array(value :_*))
      
      @scala.inline
      def setPages(value: Next): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: userDotlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
