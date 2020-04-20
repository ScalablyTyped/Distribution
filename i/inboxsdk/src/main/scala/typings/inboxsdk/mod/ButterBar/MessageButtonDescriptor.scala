package typings.inboxsdk.mod.ButterBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageButtonDescriptor extends js.Object {
  var title: String
  def onClick(event: js.Any): Unit
}

object MessageButtonDescriptor {
  @scala.inline
  def apply(onClick: js.Any => Unit, title: String): MessageButtonDescriptor = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageButtonDescriptor]
  }
}

