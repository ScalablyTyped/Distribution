package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AclsHashAlgorithm extends js.Object {
  var acls: js.Array[loopbackLib.loopbackMod.lNs.ACL]
  var hashAlgorithm: java.lang.String
  var http: Anon_Path
  var ignoreErrors: scala.Boolean
}

object Anon_AclsHashAlgorithm {
  @scala.inline
  def apply(
    acls: js.Array[loopbackLib.loopbackMod.lNs.ACL],
    hashAlgorithm: java.lang.String,
    http: Anon_Path,
    ignoreErrors: scala.Boolean
  ): Anon_AclsHashAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acls")(acls)
    __obj.updateDynamic("hashAlgorithm")(hashAlgorithm)
    __obj.updateDynamic("http")(http)
    __obj.updateDynamic("ignoreErrors")(ignoreErrors)
    __obj.asInstanceOf[Anon_AclsHashAlgorithm]
  }
}

