package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseMerchant extends StObject {
  
  var pk: Double
  
  var profile_pic_url: String
  
  var username: String
}
object TopicalExploreFeedResponseMerchant {
  
  @scala.inline
  def apply(pk: Double, profile_pic_url: String, username: String): TopicalExploreFeedResponseMerchant = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseMerchant]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseMerchantMutableBuilder[Self <: TopicalExploreFeedResponseMerchant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
