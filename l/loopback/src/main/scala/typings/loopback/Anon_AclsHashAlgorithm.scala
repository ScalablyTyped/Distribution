package typings.loopback

import typings.loopback.loopbackMod.ACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AclsHashAlgorithm extends js.Object {
  var acls: js.Array[ACL]
  var hashAlgorithm: String
  var http: Anon_Path
  var ignoreErrors: Boolean
}

object Anon_AclsHashAlgorithm {
  @scala.inline
  def apply(acls: js.Array[ACL], hashAlgorithm: String, http: Anon_Path, ignoreErrors: Boolean): Anon_AclsHashAlgorithm = {
    val __obj = js.Dynamic.literal(acls = acls, hashAlgorithm = hashAlgorithm, http = http, ignoreErrors = ignoreErrors)
  
    __obj.asInstanceOf[Anon_AclsHashAlgorithm]
  }
}

