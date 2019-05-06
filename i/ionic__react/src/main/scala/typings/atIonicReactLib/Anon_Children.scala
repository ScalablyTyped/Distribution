package typings
package atIonicReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var isOpen: scala.Boolean
  def onDidDismiss(
    event: stdLib.CustomEvent[atIonicCoreLib.distTypesUtilsOverlaysDashInterfaceMod.OverlayEventDetail[_]]
  ): scala.Unit
}

object Anon_Children {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    isOpen: scala.Boolean,
    onDidDismiss: stdLib.CustomEvent[atIonicCoreLib.distTypesUtilsOverlaysDashInterfaceMod.OverlayEventDetail[_]] => scala.Unit
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isOpen = isOpen, onDidDismiss = js.Any.fromFunction1(onDidDismiss))
  
    __obj.asInstanceOf[Anon_Children]
  }
}

