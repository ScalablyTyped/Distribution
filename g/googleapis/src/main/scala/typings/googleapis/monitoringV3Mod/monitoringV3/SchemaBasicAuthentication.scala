package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type of authentication to perform against the specified resource or URL
  * that uses username and password. Currently, only Basic authentication is
  * supported in Uptime Monitoring.
  */
@js.native
trait SchemaBasicAuthentication extends js.Object {
  /**
    * The password to authenticate.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * The username to authenticate.
    */
  var username: js.UndefOr[String] = js.native
}

object SchemaBasicAuthentication {
  @scala.inline
  def apply(password: String = null, username: String = null): SchemaBasicAuthentication = {
    val __obj = js.Dynamic.literal()
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBasicAuthentication]
  }
}

