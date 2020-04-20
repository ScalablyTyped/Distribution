package typings.loopback

import typings.loopback.mod.ACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCaseSensitiveEmail extends js.Object {
  var acls: js.Array[ACL]
  var caseSensitiveEmail: Boolean
  var emailVerificationRequired: Boolean
  var http: AnonPath
  var maxTTL: Double
  var realmDelimiter: String
  var realmRequired: Boolean
  var resetPasswordTokenTTL: Double
  var saltWorkFactor: Double
  var ttl: Double
}

object AnonCaseSensitiveEmail {
  @scala.inline
  def apply(
    acls: js.Array[ACL],
    caseSensitiveEmail: Boolean,
    emailVerificationRequired: Boolean,
    http: AnonPath,
    maxTTL: Double,
    realmDelimiter: String,
    realmRequired: Boolean,
    resetPasswordTokenTTL: Double,
    saltWorkFactor: Double,
    ttl: Double
  ): AnonCaseSensitiveEmail = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], caseSensitiveEmail = caseSensitiveEmail.asInstanceOf[js.Any], emailVerificationRequired = emailVerificationRequired.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], maxTTL = maxTTL.asInstanceOf[js.Any], realmDelimiter = realmDelimiter.asInstanceOf[js.Any], realmRequired = realmRequired.asInstanceOf[js.Any], resetPasswordTokenTTL = resetPasswordTokenTTL.asInstanceOf[js.Any], saltWorkFactor = saltWorkFactor.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCaseSensitiveEmail]
  }
}

