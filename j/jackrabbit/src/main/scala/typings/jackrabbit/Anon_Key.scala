package typings.jackrabbit

import typings.jackrabbit.jackrabbitMod.jackrabbitNs.AckCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: String
  var reply: js.UndefOr[AckCallback] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(key: String, reply: AckCallback = null): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key)
    if (reply != null) __obj.updateDynamic("reply")(reply)
    __obj.asInstanceOf[Anon_Key]
  }
}

