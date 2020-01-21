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
}

object ReactOverlayProps {
  @scala.inline
  def apply(
    isOpen: Boolean,
    children: ReactNode = null,
    onDidDismiss: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit = null
  ): ReactOverlayProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onDidDismiss != null) __obj.updateDynamic("onDidDismiss")(js.Any.fromFunction1(onDidDismiss))
    __obj.asInstanceOf[ReactOverlayProps]
  }
}

