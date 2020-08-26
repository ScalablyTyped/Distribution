package typings.loopback.anon

import typings.loopback.mod.ACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaseSensitiveEmail extends js.Object {
  var acls: js.Array[ACL] = js.native
  var caseSensitiveEmail: Boolean = js.native
  var emailVerificationRequired: Boolean = js.native
  var http: Path = js.native
  var maxTTL: Double = js.native
  var realmDelimiter: String = js.native
  var realmRequired: Boolean = js.native
  var resetPasswordTokenTTL: Double = js.native
  var saltWorkFactor: Double = js.native
  var ttl: Double = js.native
}

object CaseSensitiveEmail {
  @scala.inline
  def apply(
    acls: js.Array[ACL],
    caseSensitiveEmail: Boolean,
    emailVerificationRequired: Boolean,
    http: Path,
    maxTTL: Double,
    realmDelimiter: String,
    realmRequired: Boolean,
    resetPasswordTokenTTL: Double,
    saltWorkFactor: Double,
    ttl: Double
  ): CaseSensitiveEmail = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], caseSensitiveEmail = caseSensitiveEmail.asInstanceOf[js.Any], emailVerificationRequired = emailVerificationRequired.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], maxTTL = maxTTL.asInstanceOf[js.Any], realmDelimiter = realmDelimiter.asInstanceOf[js.Any], realmRequired = realmRequired.asInstanceOf[js.Any], resetPasswordTokenTTL = resetPasswordTokenTTL.asInstanceOf[js.Any], saltWorkFactor = saltWorkFactor.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseSensitiveEmail]
  }
  @scala.inline
  implicit class CaseSensitiveEmailOps[Self <: CaseSensitiveEmail] (val x: Self) extends AnyVal {
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
    def setAclsVarargs(value: ACL*): Self = this.set("acls", js.Array(value :_*))
    @scala.inline
    def setAcls(value: js.Array[ACL]): Self = this.set("acls", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaseSensitiveEmail(value: Boolean): Self = this.set("caseSensitiveEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailVerificationRequired(value: Boolean): Self = this.set("emailVerificationRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttp(value: Path): Self = this.set("http", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxTTL(value: Double): Self = this.set("maxTTL", value.asInstanceOf[js.Any])
    @scala.inline
    def setRealmDelimiter(value: String): Self = this.set("realmDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def setRealmRequired(value: Boolean): Self = this.set("realmRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetPasswordTokenTTL(value: Double): Self = this.set("resetPasswordTokenTTL", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaltWorkFactor(value: Double): Self = this.set("saltWorkFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
  }
  
}

