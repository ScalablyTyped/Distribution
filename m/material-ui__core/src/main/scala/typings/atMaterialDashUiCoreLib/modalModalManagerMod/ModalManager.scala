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
    add: js.Function2[js.Any, js.Any, scala.Double],
    isTopModal: js.Function1[js.Any, scala.Boolean],
    remove: js.Function1[js.Any, scala.Unit]
  ): ModalManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("isTopModal")(isTopModal)
    __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[ModalManager]
  }
}

