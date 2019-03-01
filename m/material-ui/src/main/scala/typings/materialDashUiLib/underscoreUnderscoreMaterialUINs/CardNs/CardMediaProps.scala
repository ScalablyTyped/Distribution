package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.CardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardMediaProps extends js.Object {
  var actAsExpander: js.UndefOr[scala.Boolean] = js.undefined
  var expandable: js.UndefOr[scala.Boolean] = js.undefined
  var mediaStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var overlay: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var overlayContainerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var overlayContentStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var overlayStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object CardMediaProps {
  @scala.inline
  def apply(
    actAsExpander: js.UndefOr[scala.Boolean] = js.undefined,
    expandable: js.UndefOr[scala.Boolean] = js.undefined,
    mediaStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    overlay: reactLib.reactMod.ReactNs.ReactNode = null,
    overlayContainerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    overlayContentStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    overlayStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): CardMediaProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actAsExpander)) __obj.updateDynamic("actAsExpander")(actAsExpander)
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable)
    if (mediaStyle != null) __obj.updateDynamic("mediaStyle")(mediaStyle)
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (overlayContainerStyle != null) __obj.updateDynamic("overlayContainerStyle")(overlayContainerStyle)
    if (overlayContentStyle != null) __obj.updateDynamic("overlayContentStyle")(overlayContentStyle)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CardMediaProps]
  }
}

