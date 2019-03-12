package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListsInstance extends js.Object {
  def registerThreadRowViewHandler(handler: js.Function1[/* threadRowView */ ThreadRowView, _]): js.Function0[scala.Unit]
}

object ListsInstance {
  @scala.inline
  def apply(
    registerThreadRowViewHandler: js.Function1[/* threadRowView */ ThreadRowView, _] => js.Function0[scala.Unit]
  ): ListsInstance = {
    val __obj = js.Dynamic.literal(registerThreadRowViewHandler = js.Any.fromFunction1(registerThreadRowViewHandler))
  
    __obj.asInstanceOf[ListsInstance]
  }
}

