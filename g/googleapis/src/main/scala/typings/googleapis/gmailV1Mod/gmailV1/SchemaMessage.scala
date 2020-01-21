package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An email message.
  */
@js.native
trait SchemaMessage extends js.Object {
  /**
    * The ID of the last history record that modified this message.
    */
  var historyId: js.UndefOr[String] = js.native
  /**
    * The immutable ID of the message.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The internal message creation timestamp (epoch ms), which determines
    * ordering in the inbox. For normal SMTP-received email, this represents
    * the time the message was originally accepted by Google, which is more
    * reliable than the Date header. However, for API-migrated mail, it can be
    * configured by client to be based on the Date header.
    */
  var internalDate: js.UndefOr[String] = js.native
  /**
    * List of IDs of labels applied to this message.
    */
  var labelIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The parsed email structure in the message parts.
    */
  var payload: js.UndefOr[SchemaMessagePart] = js.native
  /**
    * The entire email message in an RFC 2822 formatted and base64url encoded
    * string. Returned in messages.get and drafts.get responses when the
    * format=RAW parameter is supplied.
    */
  var raw: js.UndefOr[String] = js.native
  /**
    * Estimated size in bytes of the message.
    */
  var sizeEstimate: js.UndefOr[Double] = js.native
  /**
    * A short part of the message text.
    */
  var snippet: js.UndefOr[String] = js.native
  /**
    * The ID of the thread the message belongs to. To add a message or draft to
    * a thread, the following criteria must be met:  - The requested threadId
    * must be specified on the Message or Draft.Message you supply with your
    * request.  - The References and In-Reply-To headers must be set in
    * compliance with the RFC 2822 standard.  - The Subject headers must match.
    */
  var threadId: js.UndefOr[String] = js.native
}

object SchemaMessage {
  @scala.inline
  def apply(
    historyId: String = null,
    id: String = null,
    internalDate: String = null,
    labelIds: js.Array[String] = null,
    payload: SchemaMessagePart = null,
    raw: String = null,
    sizeEstimate: Int | Double = null,
    snippet: String = null,
    threadId: String = null
  ): SchemaMessage = {
    val __obj = js.Dynamic.literal()
    if (historyId != null) __obj.updateDynamic("historyId")(historyId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (internalDate != null) __obj.updateDynamic("internalDate")(internalDate.asInstanceOf[js.Any])
    if (labelIds != null) __obj.updateDynamic("labelIds")(labelIds.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (sizeEstimate != null) __obj.updateDynamic("sizeEstimate")(sizeEstimate.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (threadId != null) __obj.updateDynamic("threadId")(threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMessage]
  }
}

