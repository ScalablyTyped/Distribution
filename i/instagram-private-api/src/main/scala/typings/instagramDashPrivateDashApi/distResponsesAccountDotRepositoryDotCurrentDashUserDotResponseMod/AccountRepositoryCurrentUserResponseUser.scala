package typings.instagramDashPrivateDashApi.distResponsesAccountDotRepositoryDotCurrentDashUserDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountRepositoryCurrentUserResponseUser extends js.Object {
  var allowed_commenter_type: String
  var biography: String
  var biography_with_entities: AccountRepositoryCurrentUserResponseBiography_with_entities
  var birthday: Null
  var can_link_entities_in_bio: Boolean
  var country_code: Double
  var email: String
  var external_url: String
  var full_name: String
  var gender: Double
  var has_anonymous_profile_picture: Boolean
  var has_biography_translation: Boolean
  var hd_profile_pic_url_info: AccountRepositoryCurrentUserResponseHd_profile_pic_url_info
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
  @scala.inline
  def apply(
    allowed_commenter_type: String,
    biography: String,
    biography_with_entities: AccountRepositoryCurrentUserResponseBiography_with_entities,
    birthday: Null,
    can_link_entities_in_bio: Boolean,
    country_code: Double,
    email: String,
    external_url: String,
    full_name: String,
    gender: Double,
    has_anonymous_profile_picture: Boolean,
    has_biography_translation: Boolean,
    hd_profile_pic_url_info: AccountRepositoryCurrentUserResponseHd_profile_pic_url_info,
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
    val __obj = js.Dynamic.literal(allowed_commenter_type = allowed_commenter_type, biography = biography, biography_with_entities = biography_with_entities, birthday = birthday, can_link_entities_in_bio = can_link_entities_in_bio, country_code = country_code, email = email, external_url = external_url, full_name = full_name, gender = gender, has_anonymous_profile_picture = has_anonymous_profile_picture, has_biography_translation = has_biography_translation, hd_profile_pic_url_info = hd_profile_pic_url_info, hd_profile_pic_versions = hd_profile_pic_versions, is_private = is_private, is_verified = is_verified, national_number = national_number, phone_number = phone_number, pk = pk, profile_pic_id = profile_pic_id, profile_pic_url = profile_pic_url, reel_auto_archive = reel_auto_archive, show_conversion_edit_entry = show_conversion_edit_entry, username = username)
  
    __obj.asInstanceOf[AccountRepositoryCurrentUserResponseUser]
  }
}

