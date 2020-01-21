package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the ListSendAs method.
  */
@js.native
trait SchemaListSendAsResponse extends js.Object {
  /**
    * List of send-as aliases.
    */
  var sendAs: js.UndefOr[js.Array[SchemaSendAs]] = js.native
}

object SchemaListSendAsResponse {
  @scala.inline
  def apply(sendAs: js.Array[SchemaSendAs] = null): SchemaListSendAsResponse = {
    val __obj = js.Dynamic.literal()
    if (sendAs != null) __obj.updateDynamic("sendAs")(sendAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListSendAsResponse]
  }
}

