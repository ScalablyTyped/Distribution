package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightsServiceAccountResponseUser extends StObject {
  
  var business_manager: InsightsServiceAccountResponseBusinessManager
  
  var business_profile: InsightsServiceAccountResponseBusinessProfile
  
  var followers_count: Double
  
  var id: String
  
  var instagram_user_id: String
  
  var profile_picture: InsightsServiceAccountResponseProfilePicture
  
  var username: String
}
object InsightsServiceAccountResponseUser {
  
  inline def apply(
    business_manager: InsightsServiceAccountResponseBusinessManager,
    business_profile: InsightsServiceAccountResponseBusinessProfile,
    followers_count: Double,
    id: String,
    instagram_user_id: String,
    profile_picture: InsightsServiceAccountResponseProfilePicture,
    username: String
  ): InsightsServiceAccountResponseUser = {
    val __obj = js.Dynamic.literal(business_manager = business_manager.asInstanceOf[js.Any], business_profile = business_profile.asInstanceOf[js.Any], followers_count = followers_count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instagram_user_id = instagram_user_id.asInstanceOf[js.Any], profile_picture = profile_picture.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseUser]
  }
  
  extension [Self <: InsightsServiceAccountResponseUser](x: Self) {
    
    inline def setBusiness_manager(value: InsightsServiceAccountResponseBusinessManager): Self = StObject.set(x, "business_manager", value.asInstanceOf[js.Any])
    
    inline def setBusiness_profile(value: InsightsServiceAccountResponseBusinessProfile): Self = StObject.set(x, "business_profile", value.asInstanceOf[js.Any])
    
    inline def setFollowers_count(value: Double): Self = StObject.set(x, "followers_count", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInstagram_user_id(value: String): Self = StObject.set(x, "instagram_user_id", value.asInstanceOf[js.Any])
    
    inline def setProfile_picture(value: InsightsServiceAccountResponseProfilePicture): Self = StObject.set(x, "profile_picture", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
