package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountRepositoryCurrentUserResponseMod {
  
  @js.native
  trait AccountRepositoryCurrentUserResponseBiographyWithEntities extends StObject {
    
    var entities: js.Array[_] = js.native
    
    var raw_text: String = js.native
  }
  object AccountRepositoryCurrentUserResponseBiographyWithEntities {
    
    @scala.inline
    def apply(entities: js.Array[_], raw_text: String): AccountRepositoryCurrentUserResponseBiographyWithEntities = {
      val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw_text = raw_text.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountRepositoryCurrentUserResponseBiographyWithEntities]
    }
    
    @scala.inline
    implicit class AccountRepositoryCurrentUserResponseBiographyWithEntitiesMutableBuilder[Self <: AccountRepositoryCurrentUserResponseBiographyWithEntities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntities(value: js.Array[_]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntitiesVarargs(value: js.Any*): Self = StObject.set(x, "entities", js.Array(value :_*))
      
      @scala.inline
      def setRaw_text(value: String): Self = StObject.set(x, "raw_text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AccountRepositoryCurrentUserResponseHdProfilePicUrlInfo extends StObject {
    
    var height: Double = js.native
    
    var url: String = js.native
    
    var width: Double = js.native
  }
  object AccountRepositoryCurrentUserResponseHdProfilePicUrlInfo {
    
    @scala.inline
    def apply(height: Double, url: String, width: Double): AccountRepositoryCurrentUserResponseHdProfilePicUrlInfo = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountRepositoryCurrentUserResponseHdProfilePicUrlInfo]
    }
    
    @scala.inline
    implicit class AccountRepositoryCurrentUserResponseHdProfilePicUrlInfoMutableBuilder[Self <: AccountRepositoryCurrentUserResponseHdProfilePicUrlInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem extends StObject {
    
    var height: Double = js.native
    
    var url: String = js.native
    
    var width: Double = js.native
  }
  object AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem {
    
    @scala.inline
    def apply(height: Double, url: String, width: Double): AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem]
    }
    
    @scala.inline
    implicit class AccountRepositoryCurrentUserResponseHdProfilePicVersionsItemMutableBuilder[Self <: AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AccountRepositoryCurrentUserResponseRootObject extends StObject {
    
    var status: String = js.native
    
    var user: AccountRepositoryCurrentUserResponseUser = js.native
  }
  object AccountRepositoryCurrentUserResponseRootObject {
    
    @scala.inline
    def apply(status: String, user: AccountRepositoryCurrentUserResponseUser): AccountRepositoryCurrentUserResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountRepositoryCurrentUserResponseRootObject]
    }
    
    @scala.inline
    implicit class AccountRepositoryCurrentUserResponseRootObjectMutableBuilder[Self <: AccountRepositoryCurrentUserResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: AccountRepositoryCurrentUserResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AccountRepositoryCurrentUserResponseUser extends StObject {
    
    var allowed_commenter_type: String = js.native
    
    var biography: String = js.native
    
    var biography_with_entities: AccountRepositoryCurrentUserResponseBiographyWithEntities = js.native
    
    var birthday: Null = js.native
    
    var can_link_entities_in_bio: Boolean = js.native
    
    var country_code: Double = js.native
    
    var email: String = js.native
    
    var external_url: String = js.native
    
    var full_name: String = js.native
    
    var gender: Double = js.native
    
    var has_anonymous_profile_picture: Boolean = js.native
    
    var has_biography_translation: Boolean = js.native
    
    var hd_profile_pic_url_info: AccountRepositoryCurrentUserResponseHdProfilePicUrlInfo = js.native
    
    var hd_profile_pic_versions: js.Array[AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem] = js.native
    
    var is_private: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    var national_number: Double = js.native
    
    var phone_number: String = js.native
    
    var pk: Double = js.native
    
    var profile_pic_id: String = js.native
    
    var profile_pic_url: String = js.native
    
    var reel_auto_archive: String = js.native
    
    var show_conversion_edit_entry: Boolean = js.native
    
    var username: String = js.native
  }
  object AccountRepositoryCurrentUserResponseUser {
    
    @scala.inline
    def apply(
      allowed_commenter_type: String,
      biography: String,
      biography_with_entities: AccountRepositoryCurrentUserResponseBiographyWithEntities,
      birthday: Null,
      can_link_entities_in_bio: Boolean,
      country_code: Double,
      email: String,
      external_url: String,
      full_name: String,
      gender: Double,
      has_anonymous_profile_picture: Boolean,
      has_biography_translation: Boolean,
      hd_profile_pic_url_info: AccountRepositoryCurrentUserResponseHdProfilePicUrlInfo,
      hd_profile_pic_versions: js.Array[AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem],
      is_private: Boolean,
      is_verified: Boolean,
      national_number: Double,
      phone_number: String,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      reel_auto_archive: String,
      show_conversion_edit_entry: Boolean,
      username: String
    ): AccountRepositoryCurrentUserResponseUser = {
      val __obj = js.Dynamic.literal(allowed_commenter_type = allowed_commenter_type.asInstanceOf[js.Any], biography = biography.asInstanceOf[js.Any], biography_with_entities = biography_with_entities.asInstanceOf[js.Any], birthday = birthday.asInstanceOf[js.Any], can_link_entities_in_bio = can_link_entities_in_bio.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], has_biography_translation = has_biography_translation.asInstanceOf[js.Any], hd_profile_pic_url_info = hd_profile_pic_url_info.asInstanceOf[js.Any], hd_profile_pic_versions = hd_profile_pic_versions.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], national_number = national_number.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], reel_auto_archive = reel_auto_archive.asInstanceOf[js.Any], show_conversion_edit_entry = show_conversion_edit_entry.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountRepositoryCurrentUserResponseUser]
    }
    
    @scala.inline
    implicit class AccountRepositoryCurrentUserResponseUserMutableBuilder[Self <: AccountRepositoryCurrentUserResponseUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowed_commenter_type(value: String): Self = StObject.set(x, "allowed_commenter_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiography(value: String): Self = StObject.set(x, "biography", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiography_with_entities(value: AccountRepositoryCurrentUserResponseBiographyWithEntities): Self = StObject.set(x, "biography_with_entities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBirthday(value: Null): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_link_entities_in_bio(value: Boolean): Self = StObject.set(x, "can_link_entities_in_bio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry_code(value: Double): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_url(value: String): Self = StObject.set(x, "external_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGender(value: Double): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_biography_translation(value: Boolean): Self = StObject.set(x, "has_biography_translation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHd_profile_pic_url_info(value: AccountRepositoryCurrentUserResponseHdProfilePicUrlInfo): Self = StObject.set(x, "hd_profile_pic_url_info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHd_profile_pic_versions(value: js.Array[AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem]): Self = StObject.set(x, "hd_profile_pic_versions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHd_profile_pic_versionsVarargs(value: AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem*): Self = StObject.set(x, "hd_profile_pic_versions", js.Array(value :_*))
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNational_number(value: Double): Self = StObject.set(x, "national_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReel_auto_archive(value: String): Self = StObject.set(x, "reel_auto_archive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow_conversion_edit_entry(value: Boolean): Self = StObject.set(x, "show_conversion_edit_entry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
