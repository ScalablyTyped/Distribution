package typings.lyricist.anon

import typings.lyricist.mod.ClientTimestamps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Apipath extends StObject {
  
  var api_path: String
  
  var client_timestamps: ClientTimestamps
  
  var context: String
  
  var id: Double
  
  var image_url: String
  
  var link_title: String
  
  var title: String
  
  var `type`: String
  
  var url: String
}
object Apipath {
  
  @scala.inline
  def apply(
    api_path: String,
    client_timestamps: ClientTimestamps,
    context: String,
    id: Double,
    image_url: String,
    link_title: String,
    title: String,
    `type`: String,
    url: String
  ): Apipath = {
    val __obj = js.Dynamic.literal(api_path = api_path.asInstanceOf[js.Any], client_timestamps = client_timestamps.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any], link_title = link_title.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apipath]
  }
  
  @scala.inline
  implicit class ApipathMutableBuilder[Self <: Apipath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi_path(value: String): Self = StObject.set(x, "api_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_timestamps(value: ClientTimestamps): Self = StObject.set(x, "client_timestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink_title(value: String): Self = StObject.set(x, "link_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
