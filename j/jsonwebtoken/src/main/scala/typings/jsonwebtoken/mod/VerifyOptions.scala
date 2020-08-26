package typings.jsonwebtoken.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyOptions extends js.Object {
  var algorithms: js.UndefOr[js.Array[Algorithm]] = js.native
  var audience: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
  var clockTimestamp: js.UndefOr[Double] = js.native
  var clockTolerance: js.UndefOr[Double] = js.native
  /** return an object with the decoded `{ payload, header, signature }` instead of only the usual content of the payload. */
  var complete: js.UndefOr[Boolean] = js.native
  var ignoreExpiration: js.UndefOr[Boolean] = js.native
  var ignoreNotBefore: js.UndefOr[Boolean] = js.native
  var issuer: js.UndefOr[String | js.Array[String]] = js.native
  var jwtid: js.UndefOr[String] = js.native
  /**
    * @deprecated
    * Max age of token
    */
  var maxAge: js.UndefOr[String] = js.native
  /**
    * If you want to check `nonce` claim, provide a string value here.
    * It is used on Open ID for the ID Tokens. ([Open ID implementation notes](https://openid.net/specs/openid-connect-core-1_0.html#NonceNotes))
    */
  var nonce: js.UndefOr[String] = js.native
  var subject: js.UndefOr[String] = js.native
}

object VerifyOptions {
  @scala.inline
  def apply(): VerifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyOptions]
  }
  @scala.inline
  implicit class VerifyOptionsOps[Self <: VerifyOptions] (val x: Self) extends AnyVal {
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
    def setAlgorithmsVarargs(value: Algorithm*): Self = this.set("algorithms", js.Array(value :_*))
    @scala.inline
    def setAlgorithms(value: js.Array[Algorithm]): Self = this.set("algorithms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithms: Self = this.set("algorithms", js.undefined)
    @scala.inline
    def setAudienceVarargs(value: (String | RegExp)*): Self = this.set("audience", js.Array(value :_*))
    @scala.inline
    def setAudience(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("audience", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    @scala.inline
    def setClockTimestamp(value: Double): Self = this.set("clockTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClockTimestamp: Self = this.set("clockTimestamp", js.undefined)
    @scala.inline
    def setClockTolerance(value: Double): Self = this.set("clockTolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClockTolerance: Self = this.set("clockTolerance", js.undefined)
    @scala.inline
    def setComplete(value: Boolean): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setIgnoreExpiration(value: Boolean): Self = this.set("ignoreExpiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreExpiration: Self = this.set("ignoreExpiration", js.undefined)
    @scala.inline
    def setIgnoreNotBefore(value: Boolean): Self = this.set("ignoreNotBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreNotBefore: Self = this.set("ignoreNotBefore", js.undefined)
    @scala.inline
    def setIssuerVarargs(value: String*): Self = this.set("issuer", js.Array(value :_*))
    @scala.inline
    def setIssuer(value: String | js.Array[String]): Self = this.set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    @scala.inline
    def setJwtid(value: String): Self = this.set("jwtid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJwtid: Self = this.set("jwtid", js.undefined)
    @scala.inline
    def setMaxAge(value: String): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
  
}

