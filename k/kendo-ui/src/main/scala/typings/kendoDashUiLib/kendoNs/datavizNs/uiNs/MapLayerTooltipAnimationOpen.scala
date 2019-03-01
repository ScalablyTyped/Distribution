package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerTooltipAnimationOpen extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var effects: js.UndefOr[java.lang.String] = js.undefined
}

object MapLayerTooltipAnimationOpen {
  @scala.inline
  def apply(duration: scala.Int | scala.Double = null, effects: java.lang.String = null): MapLayerTooltipAnimationOpen = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (effects != null) __obj.updateDynamic("effects")(effects)
    __obj.asInstanceOf[MapLayerTooltipAnimationOpen]
  }
}

