package typings
package mapDashObjLib.mapDashObjMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var deep: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[js.Object] = js.undefined
}

object Options {
  @scala.inline
  def apply(deep: js.UndefOr[scala.Boolean] = js.undefined, target: js.Object = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Options]
  }
}

