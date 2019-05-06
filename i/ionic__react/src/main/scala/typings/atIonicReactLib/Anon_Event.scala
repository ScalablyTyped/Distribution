package typings
package atIonicReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var isOpen: scala.Boolean
  def onDidDismiss(
    event: stdLib.CustomEvent[atIonicCoreLib.distTypesUtilsOverlaysDashInterfaceMod.OverlayEventDetail[_]]
  ): scala.Unit
}

object Anon_Event {
  @scala.inline
  def apply(
    isOpen: scala.Boolean,
    onDidDismiss: stdLib.CustomEvent[atIonicCoreLib.distTypesUtilsOverlaysDashInterfaceMod.OverlayEventDetail[_]] => scala.Unit
  ): Anon_Event = {
    val __obj = js.Dynamic.literal(isOpen = isOpen, onDidDismiss = js.Any.fromFunction1(onDidDismiss))
  
    __obj.asInstanceOf[Anon_Event]
  }
}

