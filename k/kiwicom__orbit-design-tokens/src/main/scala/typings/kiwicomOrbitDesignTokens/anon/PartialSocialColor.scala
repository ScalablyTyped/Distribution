package typings.kiwicomOrbitDesignTokens.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.SocialColor> */
@js.native
trait PartialSocialColor extends js.Object {
  var facebook: js.UndefOr[String] = js.native
  var facebookActive: js.UndefOr[String] = js.native
  var facebookHover: js.UndefOr[String] = js.native
}

object PartialSocialColor {
  @scala.inline
  def apply(): PartialSocialColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSocialColor]
  }
  @scala.inline
  implicit class PartialSocialColorOps[Self <: PartialSocialColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFacebook(value: String): Self = this.set("facebook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacebook: Self = this.set("facebook", js.undefined)
    @scala.inline
    def setFacebookActive(value: String): Self = this.set("facebookActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacebookActive: Self = this.set("facebookActive", js.undefined)
    @scala.inline
    def setFacebookHover(value: String): Self = this.set("facebookHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacebookHover: Self = this.set("facebookHover", js.undefined)
  }
  
}

