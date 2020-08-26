package typings.kosCore.mod

import typings.kosCore.anon.Namespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Util extends js.Object {
  def getActionType(action: String): Namespace = js.native
  def getParam(): js.Any = js.native
}

object Util {
  @scala.inline
  def apply(getActionType: String => Namespace, getParam: () => js.Any): Util = {
    val __obj = js.Dynamic.literal(getActionType = js.Any.fromFunction1(getActionType), getParam = js.Any.fromFunction0(getParam))
    __obj.asInstanceOf[Util]
  }
  @scala.inline
  implicit class UtilOps[Self <: Util] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetActionType(value: String => Namespace): Self = this.set("getActionType", js.Any.fromFunction1(value))
    @scala.inline
    def setGetParam(value: () => js.Any): Self = this.set("getParam", js.Any.fromFunction0(value))
  }
  
}

