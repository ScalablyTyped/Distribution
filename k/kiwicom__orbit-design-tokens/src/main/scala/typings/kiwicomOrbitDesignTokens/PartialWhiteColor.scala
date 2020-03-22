package typings.kiwicomOrbitDesignTokens

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.WhiteColor> */
trait PartialWhiteColor extends js.Object {
  var normal: js.UndefOr[String] = js.undefined
  var normalActive: js.UndefOr[String] = js.undefined
  var normalHover: js.UndefOr[String] = js.undefined
}

object PartialWhiteColor {
  @scala.inline
  def apply(normal: String = null, normalActive: String = null, normalHover: String = null): PartialWhiteColor = {
    val __obj = js.Dynamic.literal()
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (normalActive != null) __obj.updateDynamic("normalActive")(normalActive.asInstanceOf[js.Any])
    if (normalHover != null) __obj.updateDynamic("normalHover")(normalHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialWhiteColor]
  }
}

