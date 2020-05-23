package typings.lyricist.mod

import typings.lyricist.anon.Permissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Artist =========================================================================================
trait Artist extends js.Object {
  var alternate_names: js.Array[_]
  var api_path: String
  var current_user_metadata: Permissions
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
    current_user_metadata: Permissions,
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
    val __obj = js.Dynamic.literal(alternate_names = alternate_names.asInstanceOf[js.Any], api_path = api_path.asInstanceOf[js.Any], current_user_metadata = current_user_metadata.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], description_annotation = description_annotation.asInstanceOf[js.Any], facebook_name = facebook_name.asInstanceOf[js.Any], followers_count = followers_count.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any], instagram_name = instagram_name.asInstanceOf[js.Any], is_meme_verified = is_meme_verified.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], translation_artist = translation_artist.asInstanceOf[js.Any], twitter_name = twitter_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artist]
  }
}

