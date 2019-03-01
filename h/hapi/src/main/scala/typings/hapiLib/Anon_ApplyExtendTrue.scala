package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplyExtendTrue extends js.Object {
  @JSName("apply")
  var apply: hapiLib.hapiLibNumbers.`true`
  var extend: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ApplyExtendTrue {
  @scala.inline
  def apply(apply: hapiLib.hapiLibNumbers.`true`, extend: js.UndefOr[scala.Boolean] = js.undefined): Anon_ApplyExtendTrue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(apply)
    if (!js.isUndefined(extend)) __obj.updateDynamic("extend")(extend)
    __obj.asInstanceOf[Anon_ApplyExtendTrue]
  }
}

