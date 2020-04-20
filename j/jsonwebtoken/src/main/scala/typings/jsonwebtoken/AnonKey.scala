package typings.jsonwebtoken

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var key: String | Buffer
  var passphrase: String
}

object AnonKey {
  @scala.inline
  def apply(key: String | Buffer, passphrase: String): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], passphrase = passphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

