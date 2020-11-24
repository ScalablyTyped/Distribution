package typings.instagramPrivateApi.accountRepositoryCurrentUserResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountRepositoryCurrentUserResponseUser extends js.Object {
  
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
  implicit class AccountRepositoryCurrentUserResponseUserOps[Self <: AccountRepositoryCurrentUserResponseUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowed_commenter_type(value: String): Self = this.set("allowed_commenter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiography(value: String): Self = this.set("biography", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiography_with_entities(value: AccountRepositoryCurrentUserResponseBiographyWithEntities): Self = this.set("biography_with_entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthday(value: Null): Self = this.set("birthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_link_entities_in_bio(value: Boolean): Self = this.set("can_link_entities_in_bio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry_code(value: Double): Self = this.set("country_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_url(value: String): Self = this.set("external_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_name(value: String): Self = this.set("full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGender(value: Double): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_anonymous_profile_picture(value: Boolean): Self = this.set("has_anonymous_profile_picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_biography_translation(value: Boolean): Self = this.set("has_biography_translation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHd_profile_pic_url_info(value: AccountRepositoryCurrentUserResponseHdProfilePicUrlInfo): Self = this.set("hd_profile_pic_url_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHd_profile_pic_versionsVarargs(value: AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem*): Self = this.set("hd_profile_pic_versions", js.Array(value :_*))
    
    @scala.inline
    def setHd_profile_pic_versions(value: js.Array[AccountRepositoryCurrentUserResponseHdProfilePicVersionsItem]): Self = this.set("hd_profile_pic_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_private(value: Boolean): Self = this.set("is_private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_verified(value: Boolean): Self = this.set("is_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNational_number(value: Double): Self = this.set("national_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone_number(value: String): Self = this.set("phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: Double): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_id(value: String): Self = this.set("profile_pic_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = this.set("profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReel_auto_archive(value: String): Self = this.set("reel_auto_archive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_conversion_edit_entry(value: Boolean): Self = this.set("show_conversion_edit_entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
