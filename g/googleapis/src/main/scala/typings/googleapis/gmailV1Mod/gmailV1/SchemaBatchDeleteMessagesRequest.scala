package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBatchDeleteMessagesRequest extends js.Object {
  /**
    * The IDs of the messages to delete.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
}

object SchemaBatchDeleteMessagesRequest {
  @scala.inline
  def apply(ids: js.Array[String] = null): SchemaBatchDeleteMessagesRequest = {
    val __obj = js.Dynamic.literal()
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchDeleteMessagesRequest]
  }
}

