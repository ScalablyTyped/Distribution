package typings.lyricist.lyricistMod

import typings.lyricist.Anon_ExcludedpermissionsInteractionsPermissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Artist =========================================================================================
trait Artist extends js.Object {
  var alternate_names: js.Array[_]
  var api_path: String
  var current_user_metadata: Anon_ExcludedpermissionsInteractionsPermissions
  var description: Description
  var description_annotation: DescriptionAnnotation
  var facebook_name: String
  var followers_count: Double
  var header_image_url: String
  var id: Double
  var image_url: String
  var instagram_name: String
  var is_meme_verified: Boolean
  var is_verified: Boolean
  var name: String
  var translation_artist: Boolean
  var twitter_name: String
  var url: String
  var user: js.UndefOr[js.Any] = js.undefined
}

object Artist {
  @scala.inline
  def apply(
    alternate_names: js.Array[_],
    api_path: String,
    current_user_metadata: Anon_ExcludedpermissionsInteractionsPermissions,
    description: Description,
    description_annotation: DescriptionAnnotation,
    facebook_name: String,
    followers_count: Double,
    header_image_url: String,
    id: Double,
    image_url: String,
    instagram_name: String,
    is_meme_verified: Boolean,
    is_verified: Boolean,
    name: String,
    translation_artist: Boolean,
    twitter_name: String,
    url: String,
    user: js.Any = null
  ): Artist = {
    val __obj = js.Dynamic.literal(alternate_names = alternate_names, api_path = api_path, current_user_metadata = current_user_metadata, description = description, description_annotation = description_annotation, facebook_name = facebook_name, followers_count = followers_count, header_image_url = header_image_url, id = id, image_url = image_url, instagram_name = instagram_name, is_meme_verified = is_meme_verified, is_verified = is_verified, name = name, translation_artist = translation_artist, twitter_name = twitter_name, url = url)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Artist]
  }
}

