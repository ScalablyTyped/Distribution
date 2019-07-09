package typings
package atIonicReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenEvent extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode]
  var isOpen: scala.Boolean
  var onDidDismiss: js.UndefOr[
    js.Function1[
      /* event */ stdLib.CustomEvent[atIonicCoreLib.distTypesUtilsOverlaysDashInterfaceMod.OverlayEventDetail[_]], 
      scala.Unit
    ]
  ] = js.undefined
}

object Anon_ChildrenEvent {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    isOpen: scala.Boolean,
    onDidDismiss: /* event */ stdLib.CustomEvent[atIonicCoreLib.distTypesUtilsOverlaysDashInterfaceMod.OverlayEventDetail[_]] => scala.Unit = null
  ): Anon_ChildrenEvent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isOpen = isOpen)
    if (onDidDismiss != null) __obj.updateDynamic("onDidDismiss")(js.Any.fromFunction1(onDidDismiss))
    __obj.asInstanceOf[Anon_ChildrenEvent]
  }
}

