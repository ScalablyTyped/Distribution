package typings.loopback

import typings.loopback.loopbackMod.ACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AclsCaseSensitiveEmail extends js.Object {
  var acls: js.Array[ACL]
  var caseSensitiveEmail: Boolean
  var emailVerificationRequired: Boolean
  var http: Anon_Path
  var maxTTL: Double
  var realmDelimiter: String
  var realmRequired: Boolean
  var resetPasswordTokenTTL: Double
  var saltWorkFactor: Double
  var ttl: Double
}

object Anon_AclsCaseSensitiveEmail {
  @scala.inline
  def apply(
    acls: js.Array[ACL],
    caseSensitiveEmail: Boolean,
    emailVerificationRequired: Boolean,
    http: Anon_Path,
    maxTTL: Double,
    realmDelimiter: String,
    realmRequired: Boolean,
    resetPasswordTokenTTL: Double,
    saltWorkFactor: Double,
    ttl: Double
  ): Anon_AclsCaseSensitiveEmail = {
    val __obj = js.Dynamic.literal(acls = acls, caseSensitiveEmail = caseSensitiveEmail, emailVerificationRequired = emailVerificationRequired, http = http, maxTTL = maxTTL, realmDelimiter = realmDelimiter, realmRequired = realmRequired, resetPasswordTokenTTL = resetPasswordTokenTTL, saltWorkFactor = saltWorkFactor, ttl = ttl)
  
    __obj.asInstanceOf[Anon_AclsCaseSensitiveEmail]
  }
}

