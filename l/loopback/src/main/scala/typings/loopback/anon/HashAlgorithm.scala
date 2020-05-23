package typings.loopback.anon

import typings.loopback.mod.ACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashAlgorithm extends js.Object {
  var acls: js.Array[ACL]
  var hashAlgorithm: String
  var http: Path
  var ignoreErrors: Boolean
}

object HashAlgorithm {
  @scala.inline
  def apply(acls: js.Array[ACL], hashAlgorithm: String, http: Path, ignoreErrors: Boolean): HashAlgorithm = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], ignoreErrors = ignoreErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashAlgorithm]
  }
}

