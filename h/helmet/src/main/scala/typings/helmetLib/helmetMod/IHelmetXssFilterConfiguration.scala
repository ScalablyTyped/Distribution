package typings
package helmetLib.helmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetXssFilterConfiguration extends js.Object {
  var setOnOldIE: js.UndefOr[scala.Boolean] = js.undefined
}

object IHelmetXssFilterConfiguration {
  @scala.inline
  def apply(setOnOldIE: js.UndefOr[scala.Boolean] = js.undefined): IHelmetXssFilterConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(setOnOldIE)) __obj.updateDynamic("setOnOldIE")(setOnOldIE)
    __obj.asInstanceOf[IHelmetXssFilterConfiguration]
  }
}

