package typings.jsonwebtokenPromisified.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: String
  var passphrase: String
}

object Key {
  @scala.inline
  def apply(key: String, passphrase: String): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], passphrase = passphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

