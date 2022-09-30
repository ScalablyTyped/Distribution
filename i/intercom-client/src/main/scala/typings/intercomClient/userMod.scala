package typings.intercomClient

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.anon.Companies
import typings.intercomClient.anon.Next
import typings.intercomClient.anon.PartialCompanyremoveboole
import typings.intercomClient.anon.Segments
import typings.intercomClient.anon.Socialprofiles
import typings.intercomClient.anon.Tags
import typings.intercomClient.intercomClientStrings.Twitter
import typings.intercomClient.intercomClientStrings.avatar
import typings.intercomClient.intercomClientStrings.contact
import typings.intercomClient.intercomClientStrings.location_data
import typings.intercomClient.intercomClientStrings.user
import typings.intercomClient.intercomClientStrings.userDotlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userMod {
  
  trait Avatar extends StObject {
    
    var image_url: String | Null
    
    var `type`: avatar
  }
  object Avatar {
    
    inline def apply(): Avatar = {
      val __obj = js.Dynamic.literal(image_url = null)
      __obj.updateDynamic("type")("avatar")
      __obj.asInstanceOf[Avatar]
    }
    
    extension [Self <: Avatar](x: Self) {
      
      inline def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
      
      inline def setImage_urlNull: Self = StObject.set(x, "image_url", null)
      
      inline def setType(value: avatar): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseUser extends StObject {
    
    var anonymous: Boolean
    
    var app_id: js.UndefOr[String] = js.undefined
    
    var avatar: Avatar
    
    val created_at: Double
    
    var custom_attributes: StringDictionary[Any]
    
    var email: String | Null
    
    val id: String
    
    var last_request_at: Double | Null
    
    var last_seen_ip: String | Null
    
    var name: String | Null
    
    var phone: String | Null
    
    var pseudonym: String | Null
    
    var session_count: Double
    
    var signed_up_at: Double | Null
    
    var `type`: user | contact
    
    var unsubscribed_from_emails: Boolean
    
    val updated_at: Double
    
    var user_agent_data: String | Null
    
    var user_id: String | Null
  }
  object BaseUser {
    
    inline def apply(
      anonymous: Boolean,
      avatar: Avatar,
      created_at: Double,
      custom_attributes: StringDictionary[Any],
      id: String,
      session_count: Double,
      `type`: user | contact,
      unsubscribed_from_emails: Boolean,
      updated_at: Double
    ): BaseUser = {
      val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_attributes = custom_attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], session_count = session_count.asInstanceOf[js.Any], unsubscribed_from_emails = unsubscribed_from_emails.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], email = null, last_request_at = null, last_seen_ip = null, name = null, phone = null, pseudonym = null, signed_up_at = null, user_agent_data = null, user_id = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseUser]
    }
    
    extension [Self <: BaseUser](x: Self) {
      
      inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
      
      inline def setApp_id(value: String): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
      
      inline def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
      
      inline def setAvatar(value: Avatar): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCustom_attributes(value: StringDictionary[Any]): Self = StObject.set(x, "custom_attributes", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailNull: Self = StObject.set(x, "email", null)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLast_request_at(value: Double): Self = StObject.set(x, "last_request_at", value.asInstanceOf[js.Any])
      
      inline def setLast_request_atNull: Self = StObject.set(x, "last_request_at", null)
      
      inline def setLast_seen_ip(value: String): Self = StObject.set(x, "last_seen_ip", value.asInstanceOf[js.Any])
      
      inline def setLast_seen_ipNull: Self = StObject.set(x, "last_seen_ip", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneNull: Self = StObject.set(x, "phone", null)
      
      inline def setPseudonym(value: String): Self = StObject.set(x, "pseudonym", value.asInstanceOf[js.Any])
      
      inline def setPseudonymNull: Self = StObject.set(x, "pseudonym", null)
      
      inline def setSession_count(value: Double): Self = StObject.set(x, "session_count", value.asInstanceOf[js.Any])
      
      inline def setSigned_up_at(value: Double): Self = StObject.set(x, "signed_up_at", value.asInstanceOf[js.Any])
      
      inline def setSigned_up_atNull: Self = StObject.set(x, "signed_up_at", null)
      
      inline def setType(value: user | contact): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribed_from_emails(value: Boolean): Self = StObject.set(x, "unsubscribed_from_emails", value.asInstanceOf[js.Any])
      
      inline def setUpdated_at(value: Double): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setUser_agent_data(value: String): Self = StObject.set(x, "user_agent_data", value.asInstanceOf[js.Any])
      
      inline def setUser_agent_dataNull: Self = StObject.set(x, "user_agent_data", null)
      
      inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
      
      inline def setUser_idNull: Self = StObject.set(x, "user_id", null)
    }
  }
  
  trait CreateUpdateUser
    extends StObject
       with BaseUser {
    
    var companies: js.Array[PartialCompanyremoveboole]
  }
  object CreateUpdateUser {
    
    inline def apply(
      anonymous: Boolean,
      avatar: Avatar,
      companies: js.Array[PartialCompanyremoveboole],
      created_at: Double,
      custom_attributes: StringDictionary[Any],
      id: String,
      session_count: Double,
      `type`: user | contact,
      unsubscribed_from_emails: Boolean,
      updated_at: Double
    ): CreateUpdateUser = {
      val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], companies = companies.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_attributes = custom_attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], session_count = session_count.asInstanceOf[js.Any], unsubscribed_from_emails = unsubscribed_from_emails.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], email = null, last_request_at = null, last_seen_ip = null, name = null, phone = null, pseudonym = null, signed_up_at = null, user_agent_data = null, user_id = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateUpdateUser]
    }
    
    extension [Self <: CreateUpdateUser](x: Self) {
      
      inline def setCompanies(value: js.Array[PartialCompanyremoveboole]): Self = StObject.set(x, "companies", value.asInstanceOf[js.Any])
      
      inline def setCompaniesVarargs(value: PartialCompanyremoveboole*): Self = StObject.set(x, "companies", js.Array(value*))
    }
  }
  
  trait List extends StObject {
    
    var pages: Next
    
    var total_count: Double
    
    var `type`: userDotlist
    
    var users: js.Array[User]
  }
  object List {
    
    inline def apply(pages: Next, total_count: Double, users: js.Array[User]): typings.intercomClient.userMod.List = {
      val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("user.list")
      __obj.asInstanceOf[typings.intercomClient.userMod.List]
    }
    
    extension [Self <: typings.intercomClient.userMod.List](x: Self) {
      
      inline def setPages(value: Next): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
      
      inline def setType(value: userDotlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: js.Array[User]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: User*): Self = StObject.set(x, "users", js.Array(value*))
    }
  }
  
  trait LocationData extends StObject {
    
    var city_name: String | Null
    
    var continent_code: String | Null
    
    var country_code: String | Null
    
    var country_name: String | Null
    
    var latitude: Double | Null
    
    var longitude: Double | Null
    
    var postal_code: String | Null
    
    var region_name: String | Null
    
    var timezone: String | Null
    
    var `type`: location_data
  }
  object LocationData {
    
    inline def apply(): LocationData = {
      val __obj = js.Dynamic.literal(city_name = null, continent_code = null, country_code = null, country_name = null, latitude = null, longitude = null, postal_code = null, region_name = null, timezone = null)
      __obj.updateDynamic("type")("location_data")
      __obj.asInstanceOf[LocationData]
    }
    
    extension [Self <: LocationData](x: Self) {
      
      inline def setCity_name(value: String): Self = StObject.set(x, "city_name", value.asInstanceOf[js.Any])
      
      inline def setCity_nameNull: Self = StObject.set(x, "city_name", null)
      
      inline def setContinent_code(value: String): Self = StObject.set(x, "continent_code", value.asInstanceOf[js.Any])
      
      inline def setContinent_codeNull: Self = StObject.set(x, "continent_code", null)
      
      inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      inline def setCountry_codeNull: Self = StObject.set(x, "country_code", null)
      
      inline def setCountry_name(value: String): Self = StObject.set(x, "country_name", value.asInstanceOf[js.Any])
      
      inline def setCountry_nameNull: Self = StObject.set(x, "country_name", null)
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLatitudeNull: Self = StObject.set(x, "latitude", null)
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setLongitudeNull: Self = StObject.set(x, "longitude", null)
      
      inline def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      inline def setPostal_codeNull: Self = StObject.set(x, "postal_code", null)
      
      inline def setRegion_name(value: String): Self = StObject.set(x, "region_name", value.asInstanceOf[js.Any])
      
      inline def setRegion_nameNull: Self = StObject.set(x, "region_name", null)
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneNull: Self = StObject.set(x, "timezone", null)
      
      inline def setType(value: location_data): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Segment extends StObject {
    
    val id: String
  }
  object Segment {
    
    inline def apply(id: String): Segment = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Segment]
    }
    
    extension [Self <: Segment](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait SocialProfile extends StObject {
    
    val id: String | Null
    
    var name: Twitter
    
    var url: String | Null
    
    var username: String | Null
  }
  object SocialProfile {
    
    inline def apply(): SocialProfile = {
      val __obj = js.Dynamic.literal(name = "Twitter", id = null, url = null, username = null)
      __obj.asInstanceOf[SocialProfile]
    }
    
    extension [Self <: SocialProfile](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setName(value: Twitter): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlNull: Self = StObject.set(x, "url", null)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameNull: Self = StObject.set(x, "username", null)
    }
  }
  
  trait Tag extends StObject {
    
    val id: String
  }
  object Tag {
    
    inline def apply(id: String): Tag = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    extension [Self <: Tag](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait User
    extends StObject
       with BaseUser {
    
    var companies: Companies
    
    var location_data: LocationData | js.Object
    
    var segments: Segments
    
    var social_profiles: Socialprofiles
    
    var tags: Tags
  }
  object User {
    
    inline def apply(
      anonymous: Boolean,
      avatar: Avatar,
      companies: Companies,
      created_at: Double,
      custom_attributes: StringDictionary[Any],
      id: String,
      location_data: LocationData | js.Object,
      segments: Segments,
      session_count: Double,
      social_profiles: Socialprofiles,
      tags: Tags,
      `type`: user | contact,
      unsubscribed_from_emails: Boolean,
      updated_at: Double
    ): User = {
      val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], companies = companies.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_attributes = custom_attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location_data = location_data.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], session_count = session_count.asInstanceOf[js.Any], social_profiles = social_profiles.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], unsubscribed_from_emails = unsubscribed_from_emails.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], email = null, last_request_at = null, last_seen_ip = null, name = null, phone = null, pseudonym = null, signed_up_at = null, user_agent_data = null, user_id = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[User]
    }
    
    extension [Self <: User](x: Self) {
      
      inline def setCompanies(value: Companies): Self = StObject.set(x, "companies", value.asInstanceOf[js.Any])
      
      inline def setLocation_data(value: LocationData | js.Object): Self = StObject.set(x, "location_data", value.asInstanceOf[js.Any])
      
      inline def setSegments(value: Segments): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      inline def setSocial_profiles(value: Socialprofiles): Self = StObject.set(x, "social_profiles", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserEmailIdentifier
    extends StObject
       with UserIdentifier {
    
    var email: String
  }
  object UserEmailIdentifier {
    
    inline def apply(email: String): UserEmailIdentifier = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserEmailIdentifier]
    }
    
    extension [Self <: UserEmailIdentifier](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.intercomClient.anon.Id
    - typings.intercomClient.anon.Userid
  */
  trait UserIdIdentifier
    extends StObject
       with UserIdentifier
  object UserIdIdentifier {
    
    inline def Id(id: String): typings.intercomClient.anon.Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intercomClient.anon.Id]
    }
    
    inline def Userid(user_id: String): typings.intercomClient.anon.Userid = {
      val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intercomClient.anon.Userid]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.intercomClient.userMod.UserIdIdentifier
    - typings.intercomClient.userMod.UserEmailIdentifier
  */
  trait UserIdentifier extends StObject
  object UserIdentifier {
    
    inline def Id(id: String): typings.intercomClient.anon.Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intercomClient.anon.Id]
    }
    
    inline def UserEmailIdentifier(email: String): typings.intercomClient.userMod.UserEmailIdentifier = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intercomClient.userMod.UserEmailIdentifier]
    }
    
    inline def Userid(user_id: String): typings.intercomClient.anon.Userid = {
      val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intercomClient.anon.Userid]
    }
  }
}
