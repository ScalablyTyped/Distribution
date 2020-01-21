package typings.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an account passed into the Account Manager on Glass.
  */
@js.native
trait SchemaAccount extends js.Object {
  var authTokens: js.UndefOr[js.Array[SchemaAuthToken]] = js.native
  var features: js.UndefOr[js.Array[String]] = js.native
  var password: js.UndefOr[String] = js.native
  var userData: js.UndefOr[js.Array[SchemaUserData]] = js.native
}

object SchemaAccount {
  @scala.inline
  def apply(
    authTokens: js.Array[SchemaAuthToken] = null,
    features: js.Array[String] = null,
    password: String = null,
    userData: js.Array[SchemaUserData] = null
  ): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    if (authTokens != null) __obj.updateDynamic("authTokens")(authTokens.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccount]
  }
}

