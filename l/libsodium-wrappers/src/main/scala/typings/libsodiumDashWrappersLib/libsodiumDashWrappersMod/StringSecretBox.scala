package typings
package libsodiumDashWrappersLib.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringSecretBox extends js.Object {
  var cipher: java.lang.String
  var mac: java.lang.String
}

object StringSecretBox {
  @scala.inline
  def apply(cipher: java.lang.String, mac: java.lang.String): StringSecretBox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cipher")(cipher)
    __obj.updateDynamic("mac")(mac)
    __obj.asInstanceOf[StringSecretBox]
  }
}

