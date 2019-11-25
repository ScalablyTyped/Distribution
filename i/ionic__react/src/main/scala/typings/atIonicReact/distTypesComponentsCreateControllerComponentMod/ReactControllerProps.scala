package typings.atIonicReact.distTypesComponentsCreateControllerComponentMod

import typings.atIonicCore.distTypesUtilsOverlaysDashInterfaceMod.OverlayEventDetail
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactControllerProps extends js.Object {
  var isOpen: Boolean
  var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.undefined
}

object ReactControllerProps {
  @scala.inline
  def apply(isOpen: Boolean, onDidDismiss: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit = null): ReactControllerProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (onDidDismiss != null) __obj.updateDynamic("onDidDismiss")(js.Any.fromFunction1(onDidDismiss))
    __obj.asInstanceOf[ReactControllerProps]
  }
}

