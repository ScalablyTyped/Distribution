package typings.materialUiCore.buttonBaseButtonBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonBaseActions extends js.Object {
  def focusVisible(): Unit = js.native
}

object ButtonBaseActions {
  @scala.inline
  def apply(focusVisible: () => Unit): ButtonBaseActions = {
    val __obj = js.Dynamic.literal(focusVisible = js.Any.fromFunction0(focusVisible))
  
    __obj.asInstanceOf[ButtonBaseActions]
  }
}

