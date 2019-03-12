package typings
package atMaterialDashUiCoreLib.buttonBaseButtonBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonBaseActions extends js.Object {
  def focusVisible(): scala.Unit
}

object ButtonBaseActions {
  @scala.inline
  def apply(focusVisible: () => scala.Unit): ButtonBaseActions = {
    val __obj = js.Dynamic.literal(focusVisible = js.Any.fromFunction0(focusVisible))
  
    __obj.asInstanceOf[ButtonBaseActions]
  }
}

