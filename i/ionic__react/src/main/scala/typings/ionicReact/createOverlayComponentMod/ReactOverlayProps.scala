package typings.ionicReact.createOverlayComponentMod

import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.react.mod.ReactNode
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactOverlayProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var isOpen: Boolean
  var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.undefined
  var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.undefined
  var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.undefined
  var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.undefined
}

object ReactOverlayProps {
  @scala.inline
  def apply(
    isOpen: Boolean,
    children: ReactNode = null,
    onDidDismiss: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit = null,
    onDidPresent: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit = null,
    onWillDismiss: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit = null,
    onWillPresent: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit = null
  ): ReactOverlayProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onDidDismiss != null) __obj.updateDynamic("onDidDismiss")(js.Any.fromFunction1(onDidDismiss))
    if (onDidPresent != null) __obj.updateDynamic("onDidPresent")(js.Any.fromFunction1(onDidPresent))
    if (onWillDismiss != null) __obj.updateDynamic("onWillDismiss")(js.Any.fromFunction1(onWillDismiss))
    if (onWillPresent != null) __obj.updateDynamic("onWillPresent")(js.Any.fromFunction1(onWillPresent))
    __obj.asInstanceOf[ReactOverlayProps]
  }
}

