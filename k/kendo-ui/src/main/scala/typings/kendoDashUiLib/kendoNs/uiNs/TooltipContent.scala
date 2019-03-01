package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipContent extends js.Object {
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object TooltipContent {
  @scala.inline
  def apply(url: java.lang.String = null): TooltipContent = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TooltipContent]
  }
}

