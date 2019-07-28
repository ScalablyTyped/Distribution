package typings.atMaterialDashUiCore.buttonBaseButtonBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonBaseActions extends js.Object {
  def focusVisible(): Unit
}

object ButtonBaseActions {
  @scala.inline
  def apply(focusVisible: () => Unit): ButtonBaseActions = {
    val __obj = js.Dynamic.literal(focusVisible = js.Any.fromFunction0(focusVisible))
  
    __obj.asInstanceOf[ButtonBaseActions]
  }
}

