package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerTooltipContent extends js.Object {
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object MapLayerTooltipContent {
  @scala.inline
  def apply(url: java.lang.String = null): MapLayerTooltipContent = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[MapLayerTooltipContent]
  }
}

