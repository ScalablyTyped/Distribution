package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaHistoryMessageDeleted extends js.Object {
  var message: js.UndefOr[SchemaMessage] = js.native
}

object SchemaHistoryMessageDeleted {
  @scala.inline
  def apply(message: SchemaMessage = null): SchemaHistoryMessageDeleted = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHistoryMessageDeleted]
  }
}

