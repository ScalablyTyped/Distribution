package typings.atHapiIron.atHapiIronMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var iv: String
  var key: Buffer
  var salt: String
}

object Key {
  @scala.inline
  def apply(iv: String, key: Buffer, salt: String): Key = {
    val __obj = js.Dynamic.literal(iv = iv, key = key, salt = salt)
  
    __obj.asInstanceOf[Key]
  }
}

