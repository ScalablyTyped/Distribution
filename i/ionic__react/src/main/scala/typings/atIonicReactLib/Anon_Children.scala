package typings
package atIonicReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var isOpen: scala.Boolean
  var onDidDismiss: js.UndefOr[
    js.Function1[
      /* event */ stdLib.CustomEvent[atIonicCoreLib.distTypesUtilsOverlaysDashInterfaceMod.OverlayEventDetail[_]], 
      scala.Unit
    ]
  ] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(
    isOpen: scala.Boolean,
    children: reactLib.reactMod.ReactNode = null,
    onDidDismiss: /* event */ stdLib.CustomEvent[atIonicCoreLib.distTypesUtilsOverlaysDashInterfaceMod.OverlayEventDetail[_]] => scala.Unit = null
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(isOpen = isOpen)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onDidDismiss != null) __obj.updateDynamic("onDidDismiss")(js.Any.fromFunction1(onDidDismiss))
    __obj.asInstanceOf[Anon_Children]
  }
}

