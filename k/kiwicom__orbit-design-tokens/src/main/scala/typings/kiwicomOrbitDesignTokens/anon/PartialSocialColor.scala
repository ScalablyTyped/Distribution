package typings.kiwicomOrbitDesignTokens.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.SocialColor> */
trait PartialSocialColor extends js.Object {
  var facebook: js.UndefOr[String] = js.undefined
  var facebookActive: js.UndefOr[String] = js.undefined
  var facebookHover: js.UndefOr[String] = js.undefined
}

object PartialSocialColor {
  @scala.inline
  def apply(facebook: String = null, facebookActive: String = null, facebookHover: String = null): PartialSocialColor = {
    val __obj = js.Dynamic.literal()
    if (facebook != null) __obj.updateDynamic("facebook")(facebook.asInstanceOf[js.Any])
    if (facebookActive != null) __obj.updateDynamic("facebookActive")(facebookActive.asInstanceOf[js.Any])
    if (facebookHover != null) __obj.updateDynamic("facebookHover")(facebookHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSocialColor]
  }
}

