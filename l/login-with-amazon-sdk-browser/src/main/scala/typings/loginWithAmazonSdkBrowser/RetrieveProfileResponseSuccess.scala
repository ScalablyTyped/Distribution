package typings.loginWithAmazonSdkBrowser

import typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response type if `retrieveProfile` call succeeded.
  */
@js.native
trait RetrieveProfileResponseSuccess extends RetrieveProfileResponse {
  
  /**
    * Contains the user's profile information.
    */
  var profile: UserProfile = js.native
  
  /**
    * Indicates whether profile was successfully retrieved.
    * For this type, it is always true.
    */
  var success: `true` = js.native
}
object RetrieveProfileResponseSuccess {
  
  @scala.inline
  def apply(profile: UserProfile, success: `true`): RetrieveProfileResponseSuccess = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveProfileResponseSuccess]
  }
  
  @scala.inline
  implicit class RetrieveProfileResponseSuccessMutableBuilder[Self <: RetrieveProfileResponseSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfile(value: UserProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: `true`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
