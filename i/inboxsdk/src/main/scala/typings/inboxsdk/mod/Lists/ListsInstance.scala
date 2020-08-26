package typings.inboxsdk.mod.Lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListsInstance extends js.Object {
  def getSelectedThreadRowViews(): js.Array[ThreadRowView] = js.native
  def registerThreadRowViewHandler(handler: js.Function1[/* threadRowView */ ThreadRowView, _]): js.Function0[Unit] = js.native
  def registerThreadRowViewSelectionHandler(handler: js.Function0[_]): js.Function0[Unit] = js.native
}

object ListsInstance {
  @scala.inline
  def apply(
    getSelectedThreadRowViews: () => js.Array[ThreadRowView],
    registerThreadRowViewHandler: js.Function1[/* threadRowView */ ThreadRowView, _] => js.Function0[Unit],
    registerThreadRowViewSelectionHandler: js.Function0[_] => js.Function0[Unit]
  ): ListsInstance = {
    val __obj = js.Dynamic.literal(getSelectedThreadRowViews = js.Any.fromFunction0(getSelectedThreadRowViews), registerThreadRowViewHandler = js.Any.fromFunction1(registerThreadRowViewHandler), registerThreadRowViewSelectionHandler = js.Any.fromFunction1(registerThreadRowViewSelectionHandler))
    __obj.asInstanceOf[ListsInstance]
  }
  @scala.inline
  implicit class ListsInstanceOps[Self <: ListsInstance] (val x: Self) extends AnyVal {
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
    def setGetSelectedThreadRowViews(value: () => js.Array[ThreadRowView]): Self = this.set("getSelectedThreadRowViews", js.Any.fromFunction0(value))
    @scala.inline
    def setRegisterThreadRowViewHandler(value: js.Function1[/* threadRowView */ ThreadRowView, _] => js.Function0[Unit]): Self = this.set("registerThreadRowViewHandler", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterThreadRowViewSelectionHandler(value: js.Function0[_] => js.Function0[Unit]): Self = this.set("registerThreadRowViewSelectionHandler", js.Any.fromFunction1(value))
  }
  
}

