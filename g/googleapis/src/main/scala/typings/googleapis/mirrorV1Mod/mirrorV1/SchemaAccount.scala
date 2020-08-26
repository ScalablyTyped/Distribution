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
  def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  @scala.inline
  implicit class SchemaAccountOps[Self <: SchemaAccount] (val x: Self) extends AnyVal {
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
    def setAuthTokensVarargs(value: SchemaAuthToken*): Self = this.set("authTokens", js.Array(value :_*))
    @scala.inline
    def setAuthTokens(value: js.Array[SchemaAuthToken]): Self = this.set("authTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthTokens: Self = this.set("authTokens", js.undefined)
    @scala.inline
    def setFeaturesVarargs(value: String*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setUserDataVarargs(value: SchemaUserData*): Self = this.set("userData", js.Array(value :_*))
    @scala.inline
    def setUserData(value: js.Array[SchemaUserData]): Self = this.set("userData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserData: Self = this.set("userData", js.undefined)
  }
  
}

