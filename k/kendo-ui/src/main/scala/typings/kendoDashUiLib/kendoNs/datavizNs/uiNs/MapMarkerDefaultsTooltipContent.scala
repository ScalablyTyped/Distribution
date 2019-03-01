package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMarkerDefaultsTooltipContent extends js.Object {
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object MapMarkerDefaultsTooltipContent {
  @scala.inline
  def apply(url: java.lang.String = null): MapMarkerDefaultsTooltipContent = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[MapMarkerDefaultsTooltipContent]
  }
}

