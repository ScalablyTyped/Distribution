package typings.kiwicomOrbitDesignTokens

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.CloudColor> */
trait PartialCloudColor extends js.Object {
  var dark: js.UndefOr[String] = js.undefined
  var light: js.UndefOr[String] = js.undefined
  var lightActive: js.UndefOr[String] = js.undefined
  var lightHover: js.UndefOr[String] = js.undefined
  var normal: js.UndefOr[String] = js.undefined
  var normalActive: js.UndefOr[String] = js.undefined
  var normalHover: js.UndefOr[String] = js.undefined
}

object PartialCloudColor {
  @scala.inline
  def apply(
    dark: String = null,
    light: String = null,
    lightActive: String = null,
    lightHover: String = null,
    normal: String = null,
    normalActive: String = null,
    normalHover: String = null
  ): PartialCloudColor = {
    val __obj = js.Dynamic.literal()
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    if (lightActive != null) __obj.updateDynamic("lightActive")(lightActive.asInstanceOf[js.Any])
    if (lightHover != null) __obj.updateDynamic("lightHover")(lightHover.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (normalActive != null) __obj.updateDynamic("normalActive")(normalActive.asInstanceOf[js.Any])
    if (normalHover != null) __obj.updateDynamic("normalHover")(normalHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCloudColor]
  }
}

