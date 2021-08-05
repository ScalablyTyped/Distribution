package typings.instagramPrivateApi.tagFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFeedResponseOwner extends StObject {
  
  var name: String
  
  var pk: String
  
  var profile_pic_url: String
  
  var profile_pic_username: String
  
  var `type`: String
}
object TagFeedResponseOwner {
  
  inline def apply(name: String, pk: String, profile_pic_url: String, profile_pic_username: String, `type`: String): TagFeedResponseOwner = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], profile_pic_username = profile_pic_username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseOwner]
  }
  
  extension [Self <: TagFeedResponseOwner](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
    
    inline def setProfile_pic_username(value: String): Self = StObject.set(x, "profile_pic_username", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
