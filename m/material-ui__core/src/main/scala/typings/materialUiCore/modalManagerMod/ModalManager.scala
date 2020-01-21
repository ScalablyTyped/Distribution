package typings.materialUiCore.modalManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalManager extends js.Object {
  def add(modal: js.Any, container: js.Any): Double = js.native
  def isTopModal(modal: js.Any): Boolean = js.native
  def remove(modal: js.Any): Unit = js.native
}

object ModalManager {
  @scala.inline
  def apply(add: (js.Any, js.Any) => Double, isTopModal: js.Any => Boolean, remove: js.Any => Unit): ModalManager = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), isTopModal = js.Any.fromFunction1(isTopModal), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[ModalManager]
  }
}

