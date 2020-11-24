package typings.jsonwebtoken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignOptions extends js.Object {
  
  /**
    * Signature algorithm. Could be one of these values :
    * - HS256:    HMAC using SHA-256 hash algorithm (default)
    * - HS384:    HMAC using SHA-384 hash algorithm
    * - HS512:    HMAC using SHA-512 hash algorithm
    * - RS256:    RSASSA using SHA-256 hash algorithm
    * - RS384:    RSASSA using SHA-384 hash algorithm
    * - RS512:    RSASSA using SHA-512 hash algorithm
    * - ES256:    ECDSA using P-256 curve and SHA-256 hash algorithm
    * - ES384:    ECDSA using P-384 curve and SHA-384 hash algorithm
    * - ES512:    ECDSA using P-521 curve and SHA-512 hash algorithm
    * - none:     No digital signature or MAC value included
    */
  var algorithm: js.UndefOr[Algorithm] = js.native
  
  var audience: js.UndefOr[String | js.Array[String]] = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  /** expressed in seconds or a string describing a time span [zeit/ms](https://github.com/zeit/ms.js).  Eg: 60, "2 days", "10h", "7d" */
  var expiresIn: js.UndefOr[String | Double] = js.native
  
  var header: js.UndefOr[js.Object] = js.native
  
  var issuer: js.UndefOr[String] = js.native
  
  var jwtid: js.UndefOr[String] = js.native
  
  var keyid: js.UndefOr[String] = js.native
  
  var mutatePayload: js.UndefOr[Boolean] = js.native
  
  var noTimestamp: js.UndefOr[Boolean] = js.native
  
  /** expressed in seconds or a string describing a time span [zeit/ms](https://github.com/zeit/ms.js).  Eg: 60, "2 days", "10h", "7d" */
  var notBefore: js.UndefOr[String | Double] = js.native
  
  var subject: js.UndefOr[String] = js.native
}
object SignOptions {
  
  @scala.inline
  def apply(): SignOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignOptions]
  }
  
  @scala.inline
  implicit class SignOptionsOps[Self <: SignOptions] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: Algorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setAudienceVarargs(value: String*): Self = this.set("audience", js.Array(value :_*))
    
    @scala.inline
    def setAudience(value: String | js.Array[String]): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setExpiresIn(value: String | Double): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiresIn: Self = this.set("expiresIn", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Object): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    
    @scala.inline
    def setJwtid(value: String): Self = this.set("jwtid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwtid: Self = this.set("jwtid", js.undefined)
    
    @scala.inline
    def setKeyid(value: String): Self = this.set("keyid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyid: Self = this.set("keyid", js.undefined)
    
    @scala.inline
    def setMutatePayload(value: Boolean): Self = this.set("mutatePayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutatePayload: Self = this.set("mutatePayload", js.undefined)
    
    @scala.inline
    def setNoTimestamp(value: Boolean): Self = this.set("noTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoTimestamp: Self = this.set("noTimestamp", js.undefined)
    
    @scala.inline
    def setNotBefore(value: String | Double): Self = this.set("notBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotBefore: Self = this.set("notBefore", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}
