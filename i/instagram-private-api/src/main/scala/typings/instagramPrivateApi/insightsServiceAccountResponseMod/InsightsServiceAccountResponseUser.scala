package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseUser extends StObject {
  
  var business_manager: InsightsServiceAccountResponseBusinessManager = js.native
  
  var business_profile: InsightsServiceAccountResponseBusinessProfile = js.native
  
  var followers_count: Double = js.native
  
  var id: String = js.native
  
  var instagram_user_id: String = js.native
  
  var profile_picture: InsightsServiceAccountResponseProfilePicture = js.native
  
  var username: String = js.native
}
object InsightsServiceAccountResponseUser {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class InsightsServiceAccountResponseUserMutableBuilder[Self <: InsightsServiceAccountResponseUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusiness_manager(value: InsightsServiceAccountResponseBusinessManager): Self = StObject.set(x, "business_manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusiness_profile(value: InsightsServiceAccountResponseBusinessProfile): Self = StObject.set(x, "business_profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowers_count(value: Double): Self = StObject.set(x, "followers_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstagram_user_id(value: String): Self = StObject.set(x, "instagram_user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_picture(value: InsightsServiceAccountResponseProfilePicture): Self = StObject.set(x, "profile_picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
