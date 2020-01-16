package typings.atHapiIron.atHapiIronMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var iv: Buffer
  var key: Buffer
  var salt: String
}

object Key {
  @scala.inline
  def apply(iv: Buffer, key: Buffer, salt: String): Key = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Key]
  }
}

