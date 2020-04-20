package typings.hyperAws4.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var accessKey: String
  var secretKey: String
}

object Credentials {
  @scala.inline
  def apply(accessKey: String, secretKey: String): Credentials = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

