package typings.jsonwebtoken

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: String | Buffer
  var passphrase: String
}

object Anon_Key {
  @scala.inline
  def apply(key: String | Buffer, passphrase: String): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], passphrase = passphrase.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Key]
  }
}

