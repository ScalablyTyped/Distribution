package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.WidgetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetsInstance extends js.Object {
  def showDrawerView(options: DrawerOptions): DrawerView
  def showModalView(options: ModalOptions): ModalView
  def showMoleView(options: MoleOptions): MoleView
}

object WidgetsInstance {
  @scala.inline
  def apply(
    showDrawerView: js.Function1[DrawerOptions, DrawerView],
    showModalView: js.Function1[ModalOptions, ModalView],
    showMoleView: js.Function1[MoleOptions, MoleView]
  ): WidgetsInstance = {
    val __obj = js.Dynamic.literal(showDrawerView = showDrawerView, showModalView = showModalView, showMoleView = showMoleView)
  
    __obj.asInstanceOf[WidgetsInstance]
  }
}

