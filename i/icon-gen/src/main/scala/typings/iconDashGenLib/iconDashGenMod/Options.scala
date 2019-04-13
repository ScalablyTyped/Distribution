package typings
package iconDashGenLib.iconDashGenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var favicon: js.UndefOr[iconDashGenLib.Anon_Ico | js.Object] = js.undefined
  var icns: js.UndefOr[iconDashGenLib.Anon_Name | js.Object] = js.undefined
  var ico: js.UndefOr[iconDashGenLib.Anon_Name | js.Object] = js.undefined
  var report: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    favicon: iconDashGenLib.Anon_Ico | js.Object = null,
    icns: iconDashGenLib.Anon_Name | js.Object = null,
    ico: iconDashGenLib.Anon_Name | js.Object = null,
    report: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (favicon != null) __obj.updateDynamic("favicon")(favicon.asInstanceOf[js.Any])
    if (icns != null) __obj.updateDynamic("icns")(icns.asInstanceOf[js.Any])
    if (ico != null) __obj.updateDynamic("ico")(ico.asInstanceOf[js.Any])
    if (!js.isUndefined(report)) __obj.updateDynamic("report")(report)
    __obj.asInstanceOf[Options]
  }
}

