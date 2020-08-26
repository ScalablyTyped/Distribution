package typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGenerateAccessTokenResponse extends js.Object {
  /**
    * The OAuth 2.0 access token.
    */
  var accessToken: js.UndefOr[String] = js.native
  /**
    * Token expiration time. The expiration time is always set.
    */
  var expireTime: js.UndefOr[String] = js.native
}

object SchemaGenerateAccessTokenResponse {
  @scala.inline
  def apply(): SchemaGenerateAccessTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateAccessTokenResponse]
  }
  @scala.inline
  implicit class SchemaGenerateAccessTokenResponseOps[Self <: SchemaGenerateAccessTokenResponse] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    @scala.inline
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
  }
  
}

