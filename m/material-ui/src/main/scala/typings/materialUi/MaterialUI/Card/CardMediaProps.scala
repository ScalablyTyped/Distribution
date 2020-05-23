package typings.materialUi.MaterialUI.Card

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
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
    if (!js.isUndefined(actAsExpander)) __obj.updateDynamic("actAsExpander")(actAsExpander.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.get.asInstanceOf[js.Any])
    if (mediaStyle != null) __obj.updateDynamic("mediaStyle")(mediaStyle.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (overlayContainerStyle != null) __obj.updateDynamic("overlayContainerStyle")(overlayContainerStyle.asInstanceOf[js.Any])
    if (overlayContentStyle != null) __obj.updateDynamic("overlayContentStyle")(overlayContentStyle.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardMediaProps]
  }
}

