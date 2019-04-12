package typings
package atHapiIronLib.atHapiIronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var iv: java.lang.String
  var key: nodeLib.Buffer
  var salt: java.lang.String
}

object Key {
  @scala.inline
  def apply(iv: java.lang.String, key: nodeLib.Buffer, salt: java.lang.String): Key = {
    val __obj = js.Dynamic.literal(iv = iv, key = key, salt = salt)
  
    __obj.asInstanceOf[Key]
  }
}

