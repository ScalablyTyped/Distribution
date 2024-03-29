package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountRepositoryCurrentUserResponseMod {
  
  trait AccountRepositoryCurrentUserResponseBiographyWithEntities extends StObject {
    
    var entities: js.Array[js.Any]
    
    var raw_text: String
  }
  object AccountRepositoryCurrentUserResponseBiographyWithEntities {
    
    inline def apply(entities: js.Array[js.Any], raw_text: String): AccountRepositoryCurrentUserResponseBiographyWithEntities = {
      val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw_text = raw_text.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountRepositoryCurrentUserResponseBiographyWithEntities]
    }
    
    extension [Self <: AccountRepositoryCurrentUserResponseBiographyWithEntities](x: Self) {
      
      inline def setEntities(value: js.Array[js.Any]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      inline def setEntitiesVarargs(value: js.Any*): Self = StObject.set(x, "entities", js.Array(value :_*))
      
      inline def setRaw_text(value: String): Self = StObject.set(x, "raw_text", value.asInstanceOf[js.Any])
    }
  }
  
  trait AccountRepositoryCurrentUserResponseHdProfilePicUrlInfo extends StObject {
    
    var height: Double
    
    var url: String
    
    var width: Double
  }
  object AccountRepositoryCurrentUserResponseHdProfilePicUrlInfo {
    
    inline def apply(height: Double, url: String, width: Double): AccountRepositoryCurrentUserResponseHdProfilePicUrlInfo = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountRepositoryCurrentUserResponseHdProfilePicUrlInfo]
    }
    
    extension [Self <: AccountRepositoryCurrentUserResponseHdProfilePicUrlInfo](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem extends StObject {
    
    var height: Double
    
    var url: String
    
    var width: Double
  }
  object AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem {
    
    inline def apply(height: Double, url: String, width: Double): AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem]
    }
    
    extension [Self <: AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait AccountRepositoryCurrentUserResponseRootObject extends StObject {
    
    var status: String
    
    var user: AccountRepositoryCurrentUserResponseUser
  }
  object AccountRepositoryCurrentUserResponseRootObject {
    
    inline def apply(status: String, user: AccountRepositoryCurrentUserResponseUser): AccountRepositoryCurrentUserResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountRepositoryCurrentUserResponseRootObject]
    }
    
    extension [Self <: AccountRepositoryCurrentUserResponseRootObject](x: Self) {
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUser(value: AccountRepositoryCurrentUserResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait AccountRepositoryCurrentUserResponseUser extends StObject {
    
    var allowed_commenter_type: String
    
    var biography: String
    
    var biography_with_entities: AccountRepositoryCurrentUserResponseBiographyWithEntities
    
    var birthday: Null
    
    var can_link_entities_in_bio: Boolean
    
    var country_code: Double
    
    var email: String
    
    var external_url: String
    
    var full_name: String
    
    var gender: Double
    
    var has_anonymous_profile_picture: Boolean
    
    var has_biography_translation: Boolean
    
    var hd_profile_pic_url_info: AccountRepositoryCurrentUserResponseHdProfilePicUrlInfo
    
    var hd_profile_pic_versions: js.Array[AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem]
    
    var is_private: Boolean
    
    var is_verified: Boolean
    
    var national_number: Double
    
    var phone_number: String
    
    var pk: Double
    
    var profile_pic_id: String
    
    var profile_pic_url: String
    
    var reel_auto_archive: String
    
    var show_conversion_edit_entry: Boolean
    
    var username: String
  }
  object AccountRepositoryCurrentUserResponseUser {
    
    inline def apply(
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
    
    extension [Self <: AccountRepositoryCurrentUserResponseUser](x: Self) {
      
      inline def setAllowed_commenter_type(value: String): Self = StObject.set(x, "allowed_commenter_type", value.asInstanceOf[js.Any])
      
      inline def setBiography(value: String): Self = StObject.set(x, "biography", value.asInstanceOf[js.Any])
      
      inline def setBiography_with_entities(value: AccountRepositoryCurrentUserResponseBiographyWithEntities): Self = StObject.set(x, "biography_with_entities", value.asInstanceOf[js.Any])
      
      inline def setBirthday(value: Null): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
      
      inline def setCan_link_entities_in_bio(value: Boolean): Self = StObject.set(x, "can_link_entities_in_bio", value.asInstanceOf[js.Any])
      
      inline def setCountry_code(value: Double): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setExternal_url(value: String): Self = StObject.set(x, "external_url", value.asInstanceOf[js.Any])
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setGender(value: Double): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      inline def setHas_biography_translation(value: Boolean): Self = StObject.set(x, "has_biography_translation", value.asInstanceOf[js.Any])
      
      inline def setHd_profile_pic_url_info(value: AccountRepositoryCurrentUserResponseHdProfilePicUrlInfo): Self = StObject.set(x, "hd_profile_pic_url_info", value.asInstanceOf[js.Any])
      
      inline def setHd_profile_pic_versions(value: js.Array[AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem]): Self = StObject.set(x, "hd_profile_pic_versions", value.asInstanceOf[js.Any])
      
      inline def setHd_profile_pic_versionsVarargs(value: AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem*): Self = StObject.set(x, "hd_profile_pic_versions", js.Array(value :_*))
      
      inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      inline def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      inline def setNational_number(value: Double): Self = StObject.set(x, "national_number", value.asInstanceOf[js.Any])
      
      inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      inline def setReel_auto_archive(value: String): Self = StObject.set(x, "reel_auto_archive", value.asInstanceOf[js.Any])
      
      inline def setShow_conversion_edit_entry(value: Boolean): Self = StObject.set(x, "show_conversion_edit_entry", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
