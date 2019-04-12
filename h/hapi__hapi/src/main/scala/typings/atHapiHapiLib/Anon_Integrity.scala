package typings
package atHapiHapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Integrity extends js.Object {
  var integrity: js.UndefOr[atHapiIronLib.atHapiIronMod.SealOptionsSub] = js.undefined
  var password: java.lang.String
}

object Anon_Integrity {
  @scala.inline
  def apply(password: java.lang.String, integrity: atHapiIronLib.atHapiIronMod.SealOptionsSub = null): Anon_Integrity = {
    val __obj = js.Dynamic.literal(password = password)
    if (integrity != null) __obj.updateDynamic("integrity")(integrity)
    __obj.asInstanceOf[Anon_Integrity]
  }
}

