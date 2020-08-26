package typings.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of replies to a comment on a file in Google Drive.
  */
@js.native
trait SchemaCommentReplyList extends js.Object {
  /**
    * The list of replies. If nextPageToken is populated, then this list may be
    * incomplete and an additional page of results should be fetched.
    */
  var items: js.UndefOr[js.Array[SchemaCommentReply]] = js.native
  /**
    * This is always drive#commentReplyList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A link to the next page of replies.
    */
  var nextLink: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of replies. This will be absent if the
    * end of the replies list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted
    * from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A link back to this list.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaCommentReplyList {
  @scala.inline
  def apply(): SchemaCommentReplyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommentReplyList]
  }
  @scala.inline
  implicit class SchemaCommentReplyListOps[Self <: SchemaCommentReplyList] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaCommentReply*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaCommentReply]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextLink(value: String): Self = this.set("nextLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextLink: Self = this.set("nextLink", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
  
}

