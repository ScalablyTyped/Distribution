package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AclsCaseSensitiveEmail extends js.Object {
  var acls: js.Array[loopbackLib.loopbackMod.lNs.ACL]
  var caseSensitiveEmail: scala.Boolean
  var emailVerificationRequired: scala.Boolean
  var http: Anon_Path
  var maxTTL: scala.Double
  var realmDelimiter: java.lang.String
  var realmRequired: scala.Boolean
  var resetPasswordTokenTTL: scala.Double
  var saltWorkFactor: scala.Double
  var ttl: scala.Double
}

object Anon_AclsCaseSensitiveEmail {
  @scala.inline
  def apply(
    acls: js.Array[loopbackLib.loopbackMod.lNs.ACL],
    caseSensitiveEmail: scala.Boolean,
    emailVerificationRequired: scala.Boolean,
    http: Anon_Path,
    maxTTL: scala.Double,
    realmDelimiter: java.lang.String,
    realmRequired: scala.Boolean,
    resetPasswordTokenTTL: scala.Double,
    saltWorkFactor: scala.Double,
    ttl: scala.Double
  ): Anon_AclsCaseSensitiveEmail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acls")(acls)
    __obj.updateDynamic("caseSensitiveEmail")(caseSensitiveEmail)
    __obj.updateDynamic("emailVerificationRequired")(emailVerificationRequired)
    __obj.updateDynamic("http")(http)
    __obj.updateDynamic("maxTTL")(maxTTL)
    __obj.updateDynamic("realmDelimiter")(realmDelimiter)
    __obj.updateDynamic("realmRequired")(realmRequired)
    __obj.updateDynamic("resetPasswordTokenTTL")(resetPasswordTokenTTL)
    __obj.updateDynamic("saltWorkFactor")(saltWorkFactor)
    __obj.updateDynamic("ttl")(ttl)
    __obj.asInstanceOf[Anon_AclsCaseSensitiveEmail]
  }
}

