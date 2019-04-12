package typings
package atHapiHapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplyExtendTrue extends js.Object {
  @JSName("apply")
  var apply: atHapiHapiLib.atHapiHapiLibNumbers.`true`
  var extend: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ApplyExtendTrue {
  @scala.inline
  def apply(apply: atHapiHapiLib.atHapiHapiLibNumbers.`true`, extend: js.UndefOr[scala.Boolean] = js.undefined): Anon_ApplyExtendTrue = {
    val __obj = js.Dynamic.literal(apply = apply)
    if (!js.isUndefined(extend)) __obj.updateDynamic("extend")(extend)
    __obj.asInstanceOf[Anon_ApplyExtendTrue]
  }
}

