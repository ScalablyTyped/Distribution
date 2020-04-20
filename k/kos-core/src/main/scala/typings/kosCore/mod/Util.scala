package typings.kosCore.mod

import typings.kosCore.AnonNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Util extends js.Object {
  def getActionType(action: String): AnonNamespace
  def getParam(): js.Any
}

object Util {
  @scala.inline
  def apply(getActionType: String => AnonNamespace, getParam: () => js.Any): Util = {
    val __obj = js.Dynamic.literal(getActionType = js.Any.fromFunction1(getActionType), getParam = js.Any.fromFunction0(getParam))
    __obj.asInstanceOf[Util]
  }
}

