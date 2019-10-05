package typings.materialDashUi.__MaterialUI

import typings.react.NativeMouseEvent
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayProps extends Props[Overlay] {
  var autoLockScrolling: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var transitionEnabled: js.UndefOr[Boolean] = js.undefined
}

object OverlayProps {
  @scala.inline
  def apply(
    autoLockScrolling: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    key: Key = null,
    onClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    ref: LegacyRef[Overlay] = null,
    show: js.UndefOr[Boolean] = js.undefined,
    transitionEnabled: js.UndefOr[Boolean] = js.undefined
  ): OverlayProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoLockScrolling)) __obj.updateDynamic("autoLockScrolling")(autoLockScrolling)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(transitionEnabled)) __obj.updateDynamic("transitionEnabled")(transitionEnabled)
    __obj.asInstanceOf[OverlayProps]
  }
}

