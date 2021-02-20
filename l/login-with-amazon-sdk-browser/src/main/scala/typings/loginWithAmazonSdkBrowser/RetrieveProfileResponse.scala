package typings.loginWithAmazonSdkBrowser

import typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserBooleans.`false`
import typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.loginWithAmazonSdkBrowser.RetrieveProfileResponseError
  - typings.loginWithAmazonSdkBrowser.RetrieveProfileResponseSuccess
*/
trait RetrieveProfileResponse extends StObject
object RetrieveProfileResponse {
  
  @scala.inline
  def RetrieveProfileResponseError(error: String, success: `false`): typings.loginWithAmazonSdkBrowser.RetrieveProfileResponseError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.loginWithAmazonSdkBrowser.RetrieveProfileResponseError]
  }
  
  @scala.inline
  def RetrieveProfileResponseSuccess(profile: UserProfile, success: `true`): typings.loginWithAmazonSdkBrowser.RetrieveProfileResponseSuccess = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.loginWithAmazonSdkBrowser.RetrieveProfileResponseSuccess]
  }
}
