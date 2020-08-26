package typings.lyricist.mod

import typings.lyricist.anon.Permissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Artist =========================================================================================
@js.native
trait Artist extends js.Object {
  var alternate_names: js.Array[_] = js.native
  var api_path: String = js.native
  var current_user_metadata: Permissions = js.native
  var description: Description = js.native
  var description_annotation: DescriptionAnnotation = js.native
  var facebook_name: String = js.native
  var followers_count: Double = js.native
  var header_image_url: String = js.native
  var id: Double = js.native
  var image_url: String = js.native
  var instagram_name: String = js.native
  var is_meme_verified: Boolean = js.native
  var is_verified: Boolean = js.native
  var name: String = js.native
  var translation_artist: Boolean = js.native
  var twitter_name: String = js.native
  var url: String = js.native
  var user: js.UndefOr[js.Any] = js.native
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
    url: String
  ): Artist = {
    val __obj = js.Dynamic.literal(alternate_names = alternate_names.asInstanceOf[js.Any], api_path = api_path.asInstanceOf[js.Any], current_user_metadata = current_user_metadata.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], description_annotation = description_annotation.asInstanceOf[js.Any], facebook_name = facebook_name.asInstanceOf[js.Any], followers_count = followers_count.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any], instagram_name = instagram_name.asInstanceOf[js.Any], is_meme_verified = is_meme_verified.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], translation_artist = translation_artist.asInstanceOf[js.Any], twitter_name = twitter_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artist]
  }
  @scala.inline
  implicit class ArtistOps[Self <: Artist] (val x: Self) extends AnyVal {
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
    def setAlternate_namesVarargs(value: js.Any*): Self = this.set("alternate_names", js.Array(value :_*))
    @scala.inline
    def setAlternate_names(value: js.Array[_]): Self = this.set("alternate_names", value.asInstanceOf[js.Any])
    @scala.inline
    def setApi_path(value: String): Self = this.set("api_path", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrent_user_metadata(value: Permissions): Self = this.set("current_user_metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription_annotation(value: DescriptionAnnotation): Self = this.set("description_annotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setFacebook_name(value: String): Self = this.set("facebook_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollowers_count(value: Double): Self = this.set("followers_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader_image_url(value: String): Self = this.set("header_image_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage_url(value: String): Self = this.set("image_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstagram_name(value: String): Self = this.set("instagram_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_meme_verified(value: Boolean): Self = this.set("is_meme_verified", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_verified(value: Boolean): Self = this.set("is_verified", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslation_artist(value: Boolean): Self = this.set("translation_artist", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwitter_name(value: String): Self = this.set("twitter_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: js.Any): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

