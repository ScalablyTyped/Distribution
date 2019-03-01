package typings
package kendoDashUiLib.kendoNs.datavizNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerOptions extends js.Object {
  var location: js.UndefOr[js.Any | Location] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var shape: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var tooltip: js.UndefOr[MarkerTooltip] = js.undefined
}

object MarkerOptions {
  @scala.inline
  def apply(
    location: js.Any | Location = null,
    name: java.lang.String = null,
    shape: java.lang.String = null,
    title: java.lang.String = null,
    tooltip: MarkerTooltip = null
  ): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (title != null) __obj.updateDynamic("title")(title)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[MarkerOptions]
  }
}

