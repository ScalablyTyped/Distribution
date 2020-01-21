package typings.helmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetXssFilterConfiguration extends js.Object {
  var reportUri: js.UndefOr[String] = js.undefined
  var setOnOldIE: js.UndefOr[Boolean] = js.undefined
}

object IHelmetXssFilterConfiguration {
  @scala.inline
  def apply(reportUri: String = null, setOnOldIE: js.UndefOr[Boolean] = js.undefined): IHelmetXssFilterConfiguration = {
    val __obj = js.Dynamic.literal()
    if (reportUri != null) __obj.updateDynamic("reportUri")(reportUri.asInstanceOf[js.Any])
    if (!js.isUndefined(setOnOldIE)) __obj.updateDynamic("setOnOldIE")(setOnOldIE.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHelmetXssFilterConfiguration]
  }
}

