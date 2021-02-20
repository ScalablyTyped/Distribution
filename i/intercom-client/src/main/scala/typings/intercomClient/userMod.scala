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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userMod {
  
  @js.native
  trait Avatar extends StObject {
    
    var image_url: String | Null = js.native
    
    var `type`: avatar = js.native
  }
  object Avatar {
    
    @scala.inline
    def apply(`type`: avatar): Avatar = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Avatar]
    }
    
    @scala.inline
    implicit class AvatarMutableBuilder[Self <: Avatar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_urlNull: Self = StObject.set(x, "image_url", null)
      
      @scala.inline
      def setType(value: avatar): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BaseUser extends StObject {
    
    var anonymous: Boolean = js.native
    
    var app_id: js.UndefOr[String] = js.native
    
    var avatar: Avatar = js.native
    
    val created_at: Double = js.native
    
    var custom_attributes: StringDictionary[js.Any] = js.native
    
    var email: String | Null = js.native
    
    val id: String = js.native
    
    var last_request_at: Double | Null = js.native
    
    var last_seen_ip: String | Null = js.native
    
    var name: String | Null = js.native
    
    var phone: String | Null = js.native
    
    var pseudonym: String | Null = js.native
    
    var session_count: Double = js.native
    
    var signed_up_at: Double | Null = js.native
    
    var `type`: user | contact = js.native
    
    var unsubscribed_from_emails: Boolean = js.native
    
    val updated_at: Double = js.native
    
    var user_agent_data: String | Null = js.native
    
    var user_id: String | Null = js.native
  }
  object BaseUser {
    
    @scala.inline
    def apply(
      anonymous: Boolean,
      avatar: Avatar,
      created_at: Double,
      custom_attributes: StringDictionary[js.Any],
      id: String,
      session_count: Double,
      `type`: user | contact,
      unsubscribed_from_emails: Boolean,
      updated_at: Double
    ): BaseUser = {
      val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_attributes = custom_attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], session_count = session_count.asInstanceOf[js.Any], unsubscribed_from_emails = unsubscribed_from_emails.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseUser]
    }
    
    @scala.inline
    implicit class BaseUserMutableBuilder[Self <: BaseUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApp_id(value: String): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
      
      @scala.inline
      def setAvatar(value: Avatar): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
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
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneNull: Self = StObject.set(x, "phone", null)
      
      @scala.inline
      def setPseudonym(value: String): Self = StObject.set(x, "pseudonym", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPseudonymNull: Self = StObject.set(x, "pseudonym", null)
      
      @scala.inline
      def setSession_count(value: Double): Self = StObject.set(x, "session_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigned_up_at(value: Double): Self = StObject.set(x, "signed_up_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigned_up_atNull: Self = StObject.set(x, "signed_up_at", null)
      
      @scala.inline
      def setType(value: user | contact): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
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
  
  @js.native
  trait CreateUpdateUser extends BaseUser {
    
    var companies: js.Array[PartialCompanyremoveboole] = js.native
  }
  object CreateUpdateUser {
    
    @scala.inline
    def apply(
      anonymous: Boolean,
      avatar: Avatar,
      companies: js.Array[PartialCompanyremoveboole],
      created_at: Double,
      custom_attributes: StringDictionary[js.Any],
      id: String,
      session_count: Double,
      `type`: user | contact,
      unsubscribed_from_emails: Boolean,
      updated_at: Double
    ): CreateUpdateUser = {
      val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], companies = companies.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_attributes = custom_attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], session_count = session_count.asInstanceOf[js.Any], unsubscribed_from_emails = unsubscribed_from_emails.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateUpdateUser]
    }
    
    @scala.inline
    implicit class CreateUpdateUserMutableBuilder[Self <: CreateUpdateUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompanies(value: js.Array[PartialCompanyremoveboole]): Self = StObject.set(x, "companies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompaniesVarargs(value: PartialCompanyremoveboole*): Self = StObject.set(x, "companies", js.Array(value :_*))
    }
  }
  
  @js.native
  trait List extends StObject {
    
    var pages: Next = js.native
    
    var total_count: Double = js.native
    
    var `type`: userDotlist = js.native
    
    var users: js.Array[User] = js.native
  }
  object List {
    
    @scala.inline
    def apply(pages: Next, total_count: Double, `type`: userDotlist, users: js.Array[User]): List = {
      val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[List]
    }
    
    @scala.inline
    implicit class ListMutableBuilder[Self <: List] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPages(value: Next): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: userDotlist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: js.Array[User]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: User*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LocationData extends StObject {
    
    var city_name: String | Null = js.native
    
    var continent_code: String | Null = js.native
    
    var country_code: String | Null = js.native
    
    var country_name: String | Null = js.native
    
    var latitude: Double | Null = js.native
    
    var longitude: Double | Null = js.native
    
    var postal_code: String | Null = js.native
    
    var region_name: String | Null = js.native
    
    var timezone: String | Null = js.native
    
    var `type`: location_data = js.native
  }
  object LocationData {
    
    @scala.inline
    def apply(`type`: location_data): LocationData = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationData]
    }
    
    @scala.inline
    implicit class LocationDataMutableBuilder[Self <: LocationData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCity_name(value: String): Self = StObject.set(x, "city_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCity_nameNull: Self = StObject.set(x, "city_name", null)
      
      @scala.inline
      def setContinent_code(value: String): Self = StObject.set(x, "continent_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinent_codeNull: Self = StObject.set(x, "continent_code", null)
      
      @scala.inline
      def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry_codeNull: Self = StObject.set(x, "country_code", null)
      
      @scala.inline
      def setCountry_name(value: String): Self = StObject.set(x, "country_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry_nameNull: Self = StObject.set(x, "country_name", null)
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitudeNull: Self = StObject.set(x, "latitude", null)
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitudeNull: Self = StObject.set(x, "longitude", null)
      
      @scala.inline
      def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostal_codeNull: Self = StObject.set(x, "postal_code", null)
      
      @scala.inline
      def setRegion_name(value: String): Self = StObject.set(x, "region_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion_nameNull: Self = StObject.set(x, "region_name", null)
      
      @scala.inline
      def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezoneNull: Self = StObject.set(x, "timezone", null)
      
      @scala.inline
      def setType(value: location_data): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Segment extends StObject {
    
    val id: String = js.native
  }
  object Segment {
    
    @scala.inline
    def apply(id: String): Segment = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Segment]
    }
    
    @scala.inline
    implicit class SegmentMutableBuilder[Self <: Segment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SocialProfile extends StObject {
    
    val id: String | Null = js.native
    
    var name: Twitter = js.native
    
    var url: String | Null = js.native
    
    var username: String | Null = js.native
  }
  object SocialProfile {
    
    @scala.inline
    def apply(name: Twitter): SocialProfile = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocialProfile]
    }
    
    @scala.inline
    implicit class SocialProfileMutableBuilder[Self <: SocialProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdNull: Self = StObject.set(x, "id", null)
      
      @scala.inline
      def setName(value: Twitter): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlNull: Self = StObject.set(x, "url", null)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameNull: Self = StObject.set(x, "username", null)
    }
  }
  
  @js.native
  trait Tag extends StObject {
    
    val id: String = js.native
  }
  object Tag {
    
    @scala.inline
    def apply(id: String): Tag = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait User extends BaseUser {
    
    var companies: Companies = js.native
    
    var location_data: LocationData | js.Object = js.native
    
    var segments: Segments = js.native
    
    var social_profiles: Socialprofiles = js.native
    
    var tags: Tags = js.native
  }
  object User {
    
    @scala.inline
    def apply(
      anonymous: Boolean,
      avatar: Avatar,
      companies: Companies,
      created_at: Double,
      custom_attributes: StringDictionary[js.Any],
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
      val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], companies = companies.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_attributes = custom_attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location_data = location_data.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], session_count = session_count.asInstanceOf[js.Any], social_profiles = social_profiles.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], unsubscribed_from_emails = unsubscribed_from_emails.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[User]
    }
    
    @scala.inline
    implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompanies(value: Companies): Self = StObject.set(x, "companies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation_data(value: LocationData | js.Object): Self = StObject.set(x, "location_data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegments(value: Segments): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocial_profiles(value: Socialprofiles): Self = StObject.set(x, "social_profiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserEmailIdentifier extends UserIdentifier {
    
    var email: String = js.native
  }
  object UserEmailIdentifier {
    
    @scala.inline
    def apply(email: String): UserEmailIdentifier = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserEmailIdentifier]
    }
    
    @scala.inline
    implicit class UserEmailIdentifierMutableBuilder[Self <: UserEmailIdentifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.intercomClient.anon.Id
    - typings.intercomClient.anon.Userid
  */
  trait UserIdIdentifier extends UserIdentifier
  object UserIdIdentifier {
    
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.intercomClient.userMod.UserIdIdentifier
    - typings.intercomClient.userMod.UserEmailIdentifier
  */
  trait UserIdentifier extends StObject
  object UserIdentifier {
    
    @scala.inline
    def Id(id: String): typings.intercomClient.anon.Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intercomClient.anon.Id]
    }
    
    @scala.inline
    def UserEmailIdentifier(email: String): typings.intercomClient.userMod.UserEmailIdentifier = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intercomClient.userMod.UserEmailIdentifier]
    }
    
    @scala.inline
    def Userid(user_id: String): typings.intercomClient.anon.Userid = {
      val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.intercomClient.anon.Userid]
    }
  }
}
