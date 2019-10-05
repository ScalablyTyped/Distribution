package typings.materialDashUi.__MaterialUI.Card

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardMediaProps extends js.Object {
  var actAsExpander: js.UndefOr[Boolean] = js.undefined
  var expandable: js.UndefOr[Boolean] = js.undefined
  var mediaStyle: js.UndefOr[CSSProperties] = js.undefined
  var overlay: js.UndefOr[ReactNode] = js.undefined
  var overlayContainerStyle: js.UndefOr[CSSProperties] = js.undefined
  var overlayContentStyle: js.UndefOr[CSSProperties] = js.undefined
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CardMediaProps {
  @scala.inline
  def apply(
    actAsExpander: js.UndefOr[Boolean] = js.undefined,
    expandable: js.UndefOr[Boolean] = js.undefined,
    mediaStyle: CSSProperties = null,
    overlay: ReactNode = null,
    overlayContainerStyle: CSSProperties = null,
    overlayContentStyle: CSSProperties = null,
    overlayStyle: CSSProperties = null,
    style: CSSProperties = null
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

