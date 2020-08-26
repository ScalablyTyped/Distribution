package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes authentication configuration that uses a custom account.
  */
@js.native
trait SchemaCustomAccount extends js.Object {
  /**
    * Required. The login form URL of the website.
    */
  var loginUrl: js.UndefOr[String] = js.native
  /**
    * Input only. Required. The password of the custom account. The credential
    * is stored encrypted and not returned in any response nor included in
    * audit logs.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Required. The user name of the custom account.
    */
  var username: js.UndefOr[String] = js.native
}

object SchemaCustomAccount {
  @scala.inline
  def apply(): SchemaCustomAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAccount]
  }
  @scala.inline
  implicit class SchemaCustomAccountOps[Self <: SchemaCustomAccount] (val x: Self) extends AnyVal {
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
    def setLoginUrl(value: String): Self = this.set("loginUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoginUrl: Self = this.set("loginUrl", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

