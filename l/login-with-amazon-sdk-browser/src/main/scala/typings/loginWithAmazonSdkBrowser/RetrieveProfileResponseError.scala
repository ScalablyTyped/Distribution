package typings.loginWithAmazonSdkBrowser

import typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response type if `retrieveProfile` call failed.
  */
trait RetrieveProfileResponseError
  extends StObject
     with RetrieveProfileResponse {
  
  /**
    * The error message given with the response.
    */
  var error: String
  
  /**
    * Indicates whether profile was successfully retrieved.
    * For this type, it is always false.
    */
  var success: `false`
}
object RetrieveProfileResponseError {
  
  @scala.inline
  def apply(error: String): RetrieveProfileResponseError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = false)
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
