package typings
package atMaterialDashUiCoreLib.modalModalManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalManager extends js.Object {
  def add(modal: js.Any, container: js.Any): scala.Double
  def isTopModal(modal: js.Any): scala.Boolean
  def remove(modal: js.Any): scala.Unit
}

object ModalManager {
  @scala.inline
  def apply(
    add: (js.Any, js.Any) => scala.Double,
    isTopModal: js.Any => scala.Boolean,
    remove: js.Any => scala.Unit
  ): ModalManager = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), isTopModal = js.Any.fromFunction1(isTopModal), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[ModalManager]
  }
}

