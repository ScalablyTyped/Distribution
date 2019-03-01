package typings
package jackrabbitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: java.lang.String
  var reply: js.UndefOr[jackrabbitLib.jackrabbitMod.jackrabbitNs.AckCallback] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(key: java.lang.String, reply: jackrabbitLib.jackrabbitMod.jackrabbitNs.AckCallback = null): Anon_Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    if (reply != null) __obj.updateDynamic("reply")(reply)
    __obj.asInstanceOf[Anon_Key]
  }
}

