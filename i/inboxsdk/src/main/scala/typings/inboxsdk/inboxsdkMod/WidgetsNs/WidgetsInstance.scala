package typings.inboxsdk.inboxsdkMod.WidgetsNs

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
    showDrawerView: DrawerOptions => DrawerView,
    showModalView: ModalOptions => ModalView,
    showMoleView: MoleOptions => MoleView
  ): WidgetsInstance = {
    val __obj = js.Dynamic.literal(showDrawerView = js.Any.fromFunction1(showDrawerView), showModalView = js.Any.fromFunction1(showModalView), showMoleView = js.Any.fromFunction1(showMoleView))
  
    __obj.asInstanceOf[WidgetsInstance]
  }
}

