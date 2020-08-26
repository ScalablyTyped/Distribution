package typings.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A comment on a file in Google Drive.
  */
@js.native
trait SchemaCommentReply extends js.Object {
  /**
    * The user who wrote this reply.
    */
  var author: js.UndefOr[SchemaUser] = js.native
  /**
    * The plain text content used to create this reply. This is not HTML safe
    * and should only be used as a starting point to make edits to a
    * reply&#39;s content. This field is required on inserts if no verb is
    * specified (resolve/reopen).
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The date when this reply was first created.
    */
  var createdDate: js.UndefOr[String] = js.native
  /**
    * Whether this reply has been deleted. If a reply has been deleted the
    * content will be cleared and this will only represent a reply that once
    * existed.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * HTML formatted content for this reply.
    */
  var htmlContent: js.UndefOr[String] = js.native
  /**
    * This is always drive#commentReply.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The date when this reply was last modified.
    */
  var modifiedDate: js.UndefOr[String] = js.native
  /**
    * The ID of the reply.
    */
  var replyId: js.UndefOr[String] = js.native
  /**
    * The action this reply performed to the parent comment. When creating a
    * new reply this is the action to be perform to the parent comment.
    * Possible values are:   - &quot;resolve&quot; - To resolve a comment.  -
    * &quot;reopen&quot; - To reopen (un-resolve) a comment.
    */
  var verb: js.UndefOr[String] = js.native
}

object SchemaCommentReply {
  @scala.inline
  def apply(): SchemaCommentReply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommentReply]
  }
  @scala.inline
  implicit class SchemaCommentReplyOps[Self <: SchemaCommentReply] (val x: Self) extends AnyVal {
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
    def setAuthor(value: SchemaUser): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setCreatedDate(value: String): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setHtmlContent(value: String): Self = this.set("htmlContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlContent: Self = this.set("htmlContent", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setModifiedDate(value: String): Self = this.set("modifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiedDate: Self = this.set("modifiedDate", js.undefined)
    @scala.inline
    def setReplyId(value: String): Self = this.set("replyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyId: Self = this.set("replyId", js.undefined)
    @scala.inline
    def setVerb(value: String): Self = this.set("verb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerb: Self = this.set("verb", js.undefined)
  }
  
}

