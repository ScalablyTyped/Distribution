package typings
package loginDashWithDashAmazonDashSdkDashBrowserLib

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
  var error: java.lang.String
  /**
    * Indicates whether profile was successfully retrieved.
    * For this type, it is always false.
    */
  var success: loginDashWithDashAmazonDashSdkDashBrowserLib.loginDashWithDashAmazonDashSdkDashBrowserLibNumbers.`false`
}

object RetrieveProfileResponseError {
  @scala.inline
  def apply(
    error: java.lang.String,
    success: loginDashWithDashAmazonDashSdkDashBrowserLib.loginDashWithDashAmazonDashSdkDashBrowserLibNumbers.`false`
  ): RetrieveProfileResponseError = {
    val __obj = js.Dynamic.literal(error = error, success = success)
  
    __obj.asInstanceOf[RetrieveProfileResponseError]
  }
}

