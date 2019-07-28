package typings.kendoDashUi.kendoNs.datavizNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerTooltipContent extends js.Object {
  var url: js.UndefOr[String] = js.undefined
}

object MarkerTooltipContent {
  @scala.inline
  def apply(url: String = null): MarkerTooltipContent = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[MarkerTooltipContent]
  }
}

