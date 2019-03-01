package typings
package ironLib.ironMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iv")(iv)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("salt")(salt)
    __obj.asInstanceOf[Key]
  }
}

