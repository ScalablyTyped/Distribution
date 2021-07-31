package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaEntityOembedResponseMod {
  
  trait MediaEntityOembedResponse extends StObject {
    
    var author_id: Double
    
    var author_name: String
    
    var author_url: String
    
    var height: Null
    
    var html: String
    
    var media_id: String
    
    var provider_name: String
    
    var provider_url: String
    
    var thumbnail_height: Double
    
    var thumbnail_url: String
    
    var thumbnail_width: Double
    
    var title: String
    
    var `type`: String
    
    var version: String
    
    var width: Double
  }
  object MediaEntityOembedResponse {
    
    @scala.inline
    def apply(
      author_id: Double,
      author_name: String,
      author_url: String,
      height: Null,
      html: String,
      media_id: String,
      provider_name: String,
      provider_url: String,
      thumbnail_height: Double,
      thumbnail_url: String,
      thumbnail_width: Double,
      title: String,
      `type`: String,
      version: String,
      width: Double
    ): MediaEntityOembedResponse = {
      val __obj = js.Dynamic.literal(author_id = author_id.asInstanceOf[js.Any], author_name = author_name.asInstanceOf[js.Any], author_url = author_url.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], provider_name = provider_name.asInstanceOf[js.Any], provider_url = provider_url.asInstanceOf[js.Any], thumbnail_height = thumbnail_height.asInstanceOf[js.Any], thumbnail_url = thumbnail_url.asInstanceOf[js.Any], thumbnail_width = thumbnail_width.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaEntityOembedResponse]
    }
    
    @scala.inline
    implicit class MediaEntityOembedResponseMutableBuilder[Self <: MediaEntityOembedResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor_id(value: Double): Self = StObject.set(x, "author_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthor_name(value: String): Self = StObject.set(x, "author_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthor_url(value: String): Self = StObject.set(x, "author_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Null): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider_name(value: String): Self = StObject.set(x, "provider_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider_url(value: String): Self = StObject.set(x, "provider_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnail_height(value: Double): Self = StObject.set(x, "thumbnail_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnail_url(value: String): Self = StObject.set(x, "thumbnail_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnail_width(value: Double): Self = StObject.set(x, "thumbnail_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
