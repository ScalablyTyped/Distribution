package typings.kendoDashUi.kendo.dataviz.map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerOptions extends js.Object {
  var location: js.UndefOr[js.Any | Location] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[MarkerTooltip] = js.undefined
}

object MarkerOptions {
  @scala.inline
  def apply(
    location: js.Any | Location = null,
    name: String = null,
    shape: String = null,
    title: String = null,
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

