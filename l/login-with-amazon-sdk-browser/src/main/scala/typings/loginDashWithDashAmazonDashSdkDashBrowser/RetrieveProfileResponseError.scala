package typings.loginDashWithDashAmazonDashSdkDashBrowser

import typings.loginDashWithDashAmazonDashSdkDashBrowser.loginDashWithDashAmazonDashSdkDashBrowserNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response type if `retrieveProfile` call failed.
  */
trait RetrieveProfileResponseError extends RetrieveProfileResponse {
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
  def apply(error: String, success: `false`): RetrieveProfileResponseError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RetrieveProfileResponseError]
  }
}

