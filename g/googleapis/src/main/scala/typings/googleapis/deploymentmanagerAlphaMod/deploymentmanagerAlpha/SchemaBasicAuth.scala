package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic Auth used as a credential.
  */
@js.native
trait SchemaBasicAuth extends js.Object {
  var password: js.UndefOr[String] = js.native
  var user: js.UndefOr[String] = js.native
}

object SchemaBasicAuth {
  @scala.inline
  def apply(password: String = null, user: String = null): SchemaBasicAuth = {
    val __obj = js.Dynamic.literal()
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBasicAuth]
  }
}

