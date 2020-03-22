package typings.loopback

import typings.loopback.mod.ACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHashAlgorithm extends js.Object {
  var acls: js.Array[ACL]
  var hashAlgorithm: String
  var http: AnonPath
  var ignoreErrors: Boolean
}

object AnonHashAlgorithm {
  @scala.inline
  def apply(acls: js.Array[ACL], hashAlgorithm: String, http: AnonPath, ignoreErrors: Boolean): AnonHashAlgorithm = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], ignoreErrors = ignoreErrors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHashAlgorithm]
  }
}

