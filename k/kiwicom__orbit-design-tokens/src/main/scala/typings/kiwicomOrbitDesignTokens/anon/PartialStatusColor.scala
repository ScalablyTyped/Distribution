package typings.kiwicomOrbitDesignTokens.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.StatusColor> */
trait PartialStatusColor extends js.Object {
  var dark: js.UndefOr[String] = js.undefined
  var darkActive: js.UndefOr[String] = js.undefined
  var darkHover: js.UndefOr[String] = js.undefined
  var darker: js.UndefOr[String] = js.undefined
  var light: js.UndefOr[String] = js.undefined
  var lightActive: js.UndefOr[String] = js.undefined
  var lightHover: js.UndefOr[String] = js.undefined
  var normal: js.UndefOr[String] = js.undefined
  var normalActive: js.UndefOr[String] = js.undefined
  var normalHover: js.UndefOr[String] = js.undefined
}

object PartialStatusColor {
  @scala.inline
  def apply(
    dark: String = null,
    darkActive: String = null,
    darkHover: String = null,
    darker: String = null,
    light: String = null,
    lightActive: String = null,
    lightHover: String = null,
    normal: String = null,
    normalActive: String = null,
    normalHover: String = null
  ): PartialStatusColor = {
    val __obj = js.Dynamic.literal()
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (darkActive != null) __obj.updateDynamic("darkActive")(darkActive.asInstanceOf[js.Any])
    if (darkHover != null) __obj.updateDynamic("darkHover")(darkHover.asInstanceOf[js.Any])
    if (darker != null) __obj.updateDynamic("darker")(darker.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    if (lightActive != null) __obj.updateDynamic("lightActive")(lightActive.asInstanceOf[js.Any])
    if (lightHover != null) __obj.updateDynamic("lightHover")(lightHover.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (normalActive != null) __obj.updateDynamic("normalActive")(normalActive.asInstanceOf[js.Any])
    if (normalHover != null) __obj.updateDynamic("normalHover")(normalHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStatusColor]
  }
}

