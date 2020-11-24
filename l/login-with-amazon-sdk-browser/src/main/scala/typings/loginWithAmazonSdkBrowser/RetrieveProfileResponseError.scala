package typings.loginWithAmazonSdkBrowser

import typings.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserBooleans.`false`
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
  implicit class RetrieveProfileResponseErrorOps[Self <: RetrieveProfileResponseError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: `false`): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
