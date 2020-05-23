package typings.jsonwebtoken.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: String | Buffer
  var passphrase: String
}

object Key {
  @scala.inline
  def apply(key: String | Buffer, passphrase: String): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], passphrase = passphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

