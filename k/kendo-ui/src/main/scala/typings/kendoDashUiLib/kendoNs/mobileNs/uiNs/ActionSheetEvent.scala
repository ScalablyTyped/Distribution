package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ActionSheet
  def isDefaultPrevented(): scala.Boolean
}

object ActionSheetEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: ActionSheet): ActionSheetEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ActionSheetEvent]
  }
}

