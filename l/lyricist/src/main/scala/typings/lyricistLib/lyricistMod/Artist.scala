package typings
package lyricistLib.lyricistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Artist =========================================================================================
trait Artist extends js.Object {
  var alternate_names: js.Array[_]
  var api_path: java.lang.String
  var current_user_metadata: lyricistLib.Anon_ExcludedpermissionsInteractionsPermissions
  var description: Description
  var description_annotation: DescriptionAnnotation
  var facebook_name: java.lang.String
  var followers_count: scala.Double
  var header_image_url: java.lang.String
  var id: scala.Double
  var image_url: java.lang.String
  var instagram_name: java.lang.String
  var is_meme_verified: scala.Boolean
  var is_verified: scala.Boolean
  var name: java.lang.String
  var translation_artist: scala.Boolean
  var twitter_name: java.lang.String
  var url: java.lang.String
  var user: js.UndefOr[js.Any] = js.undefined
}

object Artist {
  @scala.inline
  def apply(
    alternate_names: js.Array[_],
    api_path: java.lang.String,
    current_user_metadata: lyricistLib.Anon_ExcludedpermissionsInteractionsPermissions,
    description: Description,
    description_annotation: DescriptionAnnotation,
    facebook_name: java.lang.String,
    followers_count: scala.Double,
    header_image_url: java.lang.String,
    id: scala.Double,
    image_url: java.lang.String,
    instagram_name: java.lang.String,
    is_meme_verified: scala.Boolean,
    is_verified: scala.Boolean,
    name: java.lang.String,
    translation_artist: scala.Boolean,
    twitter_name: java.lang.String,
    url: java.lang.String,
    user: js.Any = null
  ): Artist = {
    val __obj = js.Dynamic.literal(alternate_names = alternate_names, api_path = api_path, current_user_metadata = current_user_metadata, description = description, description_annotation = description_annotation, facebook_name = facebook_name, followers_count = followers_count, header_image_url = header_image_url, id = id, image_url = image_url, instagram_name = instagram_name, is_meme_verified = is_meme_verified, is_verified = is_verified, name = name, translation_artist = translation_artist, twitter_name = twitter_name, url = url)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Artist]
  }
}

