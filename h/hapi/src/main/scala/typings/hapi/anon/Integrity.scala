package typings.hapi.anon

import typings.iron.mod.SealOptionsSub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Integrity extends js.Object {
  var integrity: js.UndefOr[SealOptionsSub] = js.undefined
  var password: String
}

object Integrity {
  @scala.inline
  def apply(password: String, integrity: SealOptionsSub = null): Integrity = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Integrity]
  }
}

