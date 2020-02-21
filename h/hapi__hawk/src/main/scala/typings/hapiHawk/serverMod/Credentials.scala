package typings.hapiHawk.serverMod

import typings.hapiHawk.hapiHawkStrings.sha1
import typings.hapiHawk.hapiHawkStrings.sha256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var algorithm: sha1 | sha256
  var key: String
  var user: String
}

object Credentials {
  @scala.inline
  def apply(algorithm: sha1 | sha256, key: String, user: String): Credentials = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Credentials]
  }
}

