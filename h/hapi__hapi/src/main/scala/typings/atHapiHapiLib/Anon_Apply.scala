package typings
package atHapiHapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Apply extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[scala.Boolean] = js.undefined
  var extend: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Apply {
  @scala.inline
  def apply(apply: js.UndefOr[scala.Boolean] = js.undefined, extend: js.UndefOr[scala.Boolean] = js.undefined): Anon_Apply = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(apply)) __obj.updateDynamic("apply")(apply)
    if (!js.isUndefined(extend)) __obj.updateDynamic("extend")(extend)
    __obj.asInstanceOf[Anon_Apply]
  }
}

