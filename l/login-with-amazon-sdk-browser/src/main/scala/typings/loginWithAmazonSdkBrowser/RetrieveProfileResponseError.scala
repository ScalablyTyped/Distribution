package typings.loginWithAmazonSdkBrowser

import typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response type if `retrieveProfile` call failed.
  */
@js.native
trait RetrieveProfileResponseError extends RetrieveProfileResponse {
  
  /**
    * The error message given with the response.
    */
  var error: String = js.native
  
  /**
    * Indicates whether profile was successfully retrieved.
    * For this type, it is always false.
    */
  var success: `false` = js.native
}
object RetrieveProfileResponseError {
  
  @scala.inline
  def apply(error: String, success: `false`): RetrieveProfileResponseError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveProfileResponseError]
  }
  
  @scala.inline
  implicit class RetrieveProfileResponseErrorMutableBuilder[Self <: RetrieveProfileResponseError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: `false`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
