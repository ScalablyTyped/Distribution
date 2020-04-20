package typings.hapiHawk.clientMod

import typings.hapiHawk.hapiHawkStrings.sha1
import typings.hapiHawk.hapiHawkStrings.sha256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var algorithm: sha1 | sha256
  var id: String
  var key: String
}

object Credentials {
  @scala.inline
  def apply(algorithm: sha1 | sha256, id: String, key: String): Credentials = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

