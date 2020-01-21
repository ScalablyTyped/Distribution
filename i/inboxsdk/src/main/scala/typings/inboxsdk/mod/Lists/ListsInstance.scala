package typings.inboxsdk.mod.Lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListsInstance extends js.Object {
  def getSelectedThreadRowViews(): js.Array[ThreadRowView]
  def registerThreadRowViewHandler(handler: js.Function1[/* threadRowView */ ThreadRowView, _]): js.Function0[Unit]
  def registerThreadRowViewSelectionHandler(handler: js.Function0[_]): js.Function0[Unit]
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
}

