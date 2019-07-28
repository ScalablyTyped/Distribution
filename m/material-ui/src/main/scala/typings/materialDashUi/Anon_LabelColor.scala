package typings.materialDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LabelColor extends js.Object {
  var labelColor: js.UndefOr[String] = js.undefined
  var labelDisabledColor: js.UndefOr[String] = js.undefined
  var thumbDisabledColor: js.UndefOr[String] = js.undefined
  var thumbOffColor: js.UndefOr[String] = js.undefined
  var thumbOnColor: js.UndefOr[String] = js.undefined
  var thumbRequiredColor: js.UndefOr[String] = js.undefined
  var trackDisabledColor: js.UndefOr[String] = js.undefined
  var trackOffColor: js.UndefOr[String] = js.undefined
  var trackOnColor: js.UndefOr[String] = js.undefined
  var trackRequiredColor: js.UndefOr[String] = js.undefined
}

object Anon_LabelColor {
  @scala.inline
  def apply(
    labelColor: String = null,
    labelDisabledColor: String = null,
    thumbDisabledColor: String = null,
    thumbOffColor: String = null,
    thumbOnColor: String = null,
    thumbRequiredColor: String = null,
    trackDisabledColor: String = null,
    trackOffColor: String = null,
    trackOnColor: String = null,
    trackRequiredColor: String = null
  ): Anon_LabelColor = {
    val __obj = js.Dynamic.literal()
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor)
    if (labelDisabledColor != null) __obj.updateDynamic("labelDisabledColor")(labelDisabledColor)
    if (thumbDisabledColor != null) __obj.updateDynamic("thumbDisabledColor")(thumbDisabledColor)
    if (thumbOffColor != null) __obj.updateDynamic("thumbOffColor")(thumbOffColor)
    if (thumbOnColor != null) __obj.updateDynamic("thumbOnColor")(thumbOnColor)
    if (thumbRequiredColor != null) __obj.updateDynamic("thumbRequiredColor")(thumbRequiredColor)
    if (trackDisabledColor != null) __obj.updateDynamic("trackDisabledColor")(trackDisabledColor)
    if (trackOffColor != null) __obj.updateDynamic("trackOffColor")(trackOffColor)
    if (trackOnColor != null) __obj.updateDynamic("trackOnColor")(trackOnColor)
    if (trackRequiredColor != null) __obj.updateDynamic("trackRequiredColor")(trackRequiredColor)
    __obj.asInstanceOf[Anon_LabelColor]
  }
}

