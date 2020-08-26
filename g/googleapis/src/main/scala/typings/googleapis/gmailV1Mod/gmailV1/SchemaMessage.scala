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
  def apply(): SchemaMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessage]
  }
  @scala.inline
  implicit class SchemaMessageOps[Self <: SchemaMessage] (val x: Self) extends AnyVal {
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
    def setHistoryId(value: String): Self = this.set("historyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistoryId: Self = this.set("historyId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInternalDate(value: String): Self = this.set("internalDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternalDate: Self = this.set("internalDate", js.undefined)
    @scala.inline
    def setLabelIdsVarargs(value: String*): Self = this.set("labelIds", js.Array(value :_*))
    @scala.inline
    def setLabelIds(value: js.Array[String]): Self = this.set("labelIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelIds: Self = this.set("labelIds", js.undefined)
    @scala.inline
    def setPayload(value: SchemaMessagePart): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    @scala.inline
    def setSizeEstimate(value: Double): Self = this.set("sizeEstimate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeEstimate: Self = this.set("sizeEstimate", js.undefined)
    @scala.inline
    def setSnippet(value: String): Self = this.set("snippet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
    @scala.inline
    def setThreadId(value: String): Self = this.set("threadId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreadId: Self = this.set("threadId", js.undefined)
  }
  
}

