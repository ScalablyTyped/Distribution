package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Scan authentication configuration.
  */
@js.native
trait SchemaAuthentication extends js.Object {
  /**
    * Authentication using a custom account.
    */
  var customAccount: js.UndefOr[SchemaCustomAccount] = js.native
  /**
    * Authentication using a Google account.
    */
  var googleAccount: js.UndefOr[SchemaGoogleAccount] = js.native
}

object SchemaAuthentication {
  @scala.inline
  def apply(customAccount: SchemaCustomAccount = null, googleAccount: SchemaGoogleAccount = null): SchemaAuthentication = {
    val __obj = js.Dynamic.literal()
    if (customAccount != null) __obj.updateDynamic("customAccount")(customAccount.asInstanceOf[js.Any])
    if (googleAccount != null) __obj.updateDynamic("googleAccount")(googleAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAuthentication]
  }
}

