package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AclsHashAlgorithm extends js.Object {
  var acls: js.Array[loopbackLib.loopbackMod.ACL]
  var hashAlgorithm: java.lang.String
  var http: Anon_Path
  var ignoreErrors: scala.Boolean
}

object Anon_AclsHashAlgorithm {
  @scala.inline
  def apply(
    acls: js.Array[loopbackLib.loopbackMod.ACL],
    hashAlgorithm: java.lang.String,
    http: Anon_Path,
    ignoreErrors: scala.Boolean
  ): Anon_AclsHashAlgorithm = {
    val __obj = js.Dynamic.literal(acls = acls, hashAlgorithm = hashAlgorithm, http = http, ignoreErrors = ignoreErrors)
  
    __obj.asInstanceOf[Anon_AclsHashAlgorithm]
  }
}

