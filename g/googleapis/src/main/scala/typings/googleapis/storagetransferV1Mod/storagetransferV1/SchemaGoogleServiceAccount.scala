package typings.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google service account
  */
@js.native
trait SchemaGoogleServiceAccount extends js.Object {
  /**
    * Required.
    */
  var accountEmail: js.UndefOr[String] = js.native
}

object SchemaGoogleServiceAccount {
  @scala.inline
  def apply(accountEmail: String = null): SchemaGoogleServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (accountEmail != null) __obj.updateDynamic("accountEmail")(accountEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleServiceAccount]
  }
}

