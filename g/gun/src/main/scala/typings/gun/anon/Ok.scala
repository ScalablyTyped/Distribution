package typings.gun.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ok extends js.Object {
  var err: js.UndefOr[scala.Nothing] = js.undefined
  var ok: String
}

object Ok {
  @scala.inline
  def apply(ok: String): Ok = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ok]
  }
}

