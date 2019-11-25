package typings.hapi

import typings.iron.ironMod.SealOptionsSub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Integrity extends js.Object {
  var integrity: js.UndefOr[SealOptionsSub] = js.undefined
  var password: String
}

object Anon_Integrity {
  @scala.inline
  def apply(password: String, integrity: SealOptionsSub = null): Anon_Integrity = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Integrity]
  }
}

