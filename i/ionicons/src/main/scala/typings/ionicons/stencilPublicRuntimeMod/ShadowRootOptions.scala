package typings.ionicons.stencilPublicRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShadowRootOptions extends js.Object {
  /**
    * When set to `true`, specifies behavior that mitigates custom element issues
    * around focusability. When a non-focusable part of the shadow DOM is clicked, the first
    * focusable part is given focus, and the shadow host is given any available `:focus` styling.
    */
  var delegatesFocus: js.UndefOr[Boolean] = js.native
}

object ShadowRootOptions {
  @scala.inline
  def apply(): ShadowRootOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowRootOptions]
  }
  @scala.inline
  implicit class ShadowRootOptionsOps[Self <: ShadowRootOptions] (val x: Self) extends AnyVal {
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
    def setDelegatesFocus(value: Boolean): Self = this.set("delegatesFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegatesFocus: Self = this.set("delegatesFocus", js.undefined)
  }
  
}

