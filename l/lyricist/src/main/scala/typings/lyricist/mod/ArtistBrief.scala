package typings.lyricist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtistBrief extends StObject {
  
  var api_path: String
  
  var header_image_url: String
  
  var id: Double
  
  var image_url: String
  
  var is_meme_verified: Boolean
  
  var is_verified: Boolean
  
  var name: String
  
  var url: String
}
object ArtistBrief {
  
  @scala.inline
  def apply(
    api_path: String,
    header_image_url: String,
    id: Double,
    image_url: String,
    is_meme_verified: Boolean,
    is_verified: Boolean,
    name: String,
    url: String
  ): ArtistBrief = {
    val __obj = js.Dynamic.literal(api_path = api_path.asInstanceOf[js.Any], header_image_url = header_image_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any], is_meme_verified = is_meme_verified.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistBrief]
  }
  
  @scala.inline
  implicit class ArtistBriefMutableBuilder[Self <: ArtistBrief] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi_path(value: String): Self = StObject.set(x, "api_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader_image_url(value: String): Self = StObject.set(x, "header_image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_meme_verified(value: Boolean): Self = StObject.set(x, "is_meme_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
