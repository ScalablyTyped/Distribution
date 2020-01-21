package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaHistoryMessageAdded extends js.Object {
  var message: js.UndefOr[SchemaMessage] = js.native
}

object SchemaHistoryMessageAdded {
  @scala.inline
  def apply(message: SchemaMessage = null): SchemaHistoryMessageAdded = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHistoryMessageAdded]
  }
}

