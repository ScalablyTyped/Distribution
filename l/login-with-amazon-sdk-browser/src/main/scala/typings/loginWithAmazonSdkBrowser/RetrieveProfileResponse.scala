package typings.loginWithAmazonSdkBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.loginWithAmazonSdkBrowser.RetrieveProfileResponseError
  - typings.loginWithAmazonSdkBrowser.RetrieveProfileResponseSuccess
*/
trait RetrieveProfileResponse extends StObject
object RetrieveProfileResponse {
  
  @scala.inline
  def RetrieveProfileResponseError(error: String): typings.loginWithAmazonSdkBrowser.RetrieveProfileResponseError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = false)
    __obj.asInstanceOf[typings.loginWithAmazonSdkBrowser.RetrieveProfileResponseError]
  }
  
  @scala.inline
  def RetrieveProfileResponseSuccess(profile: UserProfile): typings.loginWithAmazonSdkBrowser.RetrieveProfileResponseSuccess = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], success = true)
    __obj.asInstanceOf[typings.loginWithAmazonSdkBrowser.RetrieveProfileResponseSuccess]
  }
}
