package typings.lyricist.mod

import typings.lyricist.anon.Permissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Artist =========================================================================================
trait Artist extends StObject {
  
  var alternate_names: js.Array[Any]
  
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
  
  var user: js.UndefOr[Any] = js.undefined
}
object Artist {
  
  inline def apply(
    alternate_names: js.Array[Any],
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
  
  extension [Self <: Artist](x: Self) {
    
    inline def setAlternate_names(value: js.Array[Any]): Self = StObject.set(x, "alternate_names", value.asInstanceOf[js.Any])
    
    inline def setAlternate_namesVarargs(value: Any*): Self = StObject.set(x, "alternate_names", js.Array(value*))
    
    inline def setApi_path(value: String): Self = StObject.set(x, "api_path", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_metadata(value: Permissions): Self = StObject.set(x, "current_user_metadata", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescription_annotation(value: DescriptionAnnotation): Self = StObject.set(x, "description_annotation", value.asInstanceOf[js.Any])
    
    inline def setFacebook_name(value: String): Self = StObject.set(x, "facebook_name", value.asInstanceOf[js.Any])
    
    inline def setFollowers_count(value: Double): Self = StObject.set(x, "followers_count", value.asInstanceOf[js.Any])
    
    inline def setHeader_image_url(value: String): Self = StObject.set(x, "header_image_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
    
    inline def setInstagram_name(value: String): Self = StObject.set(x, "instagram_name", value.asInstanceOf[js.Any])
    
    inline def setIs_meme_verified(value: Boolean): Self = StObject.set(x, "is_meme_verified", value.asInstanceOf[js.Any])
    
    inline def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTranslation_artist(value: Boolean): Self = StObject.set(x, "translation_artist", value.asInstanceOf[js.Any])
    
    inline def setTwitter_name(value: String): Self = StObject.set(x, "twitter_name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
