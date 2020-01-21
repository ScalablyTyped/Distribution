package typings.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Attachments. This is the response from the server to GET requests
  * on the attachments collection.
  */
@js.native
trait SchemaAttachmentsListResponse extends js.Object {
  /**
    * The list of attachments.
    */
  var items: js.UndefOr[js.Array[SchemaAttachment]] = js.native
  /**
    * The type of resource. This is always mirror#attachmentsList.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaAttachmentsListResponse {
  @scala.inline
  def apply(items: js.Array[SchemaAttachment] = null, kind: String = null): SchemaAttachmentsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAttachmentsListResponse]
  }
}

