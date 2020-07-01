package typings.ionicons.stencilPublicRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowRootOptions extends js.Object {
  /**
    * When set to `true`, specifies behavior that mitigates custom element issues
    * around focusability. When a non-focusable part of the shadow DOM is clicked, the first
    * focusable part is given focus, and the shadow host is given any available `:focus` styling.
    */
  var delegatesFocus: js.UndefOr[Boolean] = js.undefined
}

object ShadowRootOptions {
  @scala.inline
  def apply(delegatesFocus: js.UndefOr[Boolean] = js.undefined): ShadowRootOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delegatesFocus)) __obj.updateDynamic("delegatesFocus")(delegatesFocus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRootOptions]
  }
}

