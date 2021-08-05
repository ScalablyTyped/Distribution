package typings.instagramPrivateApi.savedFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavedFeedResponseMerchant extends StObject {
  
  var pk: Double
  
  var profile_pic_url: String
  
  var username: String
}
object SavedFeedResponseMerchant {
  
  inline def apply(pk: Double, profile_pic_url: String, username: String): SavedFeedResponseMerchant = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseMerchant]
  }
  
  extension [Self <: SavedFeedResponseMerchant](x: Self) {
    
    inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
