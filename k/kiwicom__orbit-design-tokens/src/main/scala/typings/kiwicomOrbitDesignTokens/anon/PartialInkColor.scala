package typings.kiwicomOrbitDesignTokens.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.InkColor> */
trait PartialInkColor extends js.Object {
  var light: js.UndefOr[String] = js.undefined
  var lightActive: js.UndefOr[String] = js.undefined
  var lightHover: js.UndefOr[String] = js.undefined
  var lighter: js.UndefOr[String] = js.undefined
  var lighterActive: js.UndefOr[String] = js.undefined
  var lighterHover: js.UndefOr[String] = js.undefined
  var normal: js.UndefOr[String] = js.undefined
  var normalActive: js.UndefOr[String] = js.undefined
  var normalHover: js.UndefOr[String] = js.undefined
}

object PartialInkColor {
  @scala.inline
  def apply(
    light: String = null,
    lightActive: String = null,
    lightHover: String = null,
    lighter: String = null,
    lighterActive: String = null,
    lighterHover: String = null,
    normal: String = null,
    normalActive: String = null,
    normalHover: String = null
  ): PartialInkColor = {
    val __obj = js.Dynamic.literal()
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    if (lightActive != null) __obj.updateDynamic("lightActive")(lightActive.asInstanceOf[js.Any])
    if (lightHover != null) __obj.updateDynamic("lightHover")(lightHover.asInstanceOf[js.Any])
    if (lighter != null) __obj.updateDynamic("lighter")(lighter.asInstanceOf[js.Any])
    if (lighterActive != null) __obj.updateDynamic("lighterActive")(lighterActive.asInstanceOf[js.Any])
    if (lighterHover != null) __obj.updateDynamic("lighterHover")(lighterHover.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (normalActive != null) __obj.updateDynamic("normalActive")(normalActive.asInstanceOf[js.Any])
    if (normalHover != null) __obj.updateDynamic("normalHover")(normalHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialInkColor]
  }
}

