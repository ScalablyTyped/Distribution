package typings.kdbxweb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgon2 extends js.Object {
  var Aes: String
  var Argon2: String
}

object AnonArgon2 {
  @scala.inline
  def apply(Aes: String, Argon2: String): AnonArgon2 = {
    val __obj = js.Dynamic.literal(Aes = Aes.asInstanceOf[js.Any], Argon2 = Argon2.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgon2]
  }
}

