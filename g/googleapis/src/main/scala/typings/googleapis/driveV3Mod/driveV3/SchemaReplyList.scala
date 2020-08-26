package typings.googleapis.driveV3Mod.driveV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of replies to a comment on a file.
  */
@js.native
trait SchemaReplyList extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#replyList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of replies. This will be absent if the
    * end of the replies list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted
    * from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of replies. If nextPageToken is populated, then this list may be
    * incomplete and an additional page of results should be fetched.
    */
  var replies: js.UndefOr[js.Array[SchemaReply]] = js.native
}

object SchemaReplyList {
  @scala.inline
  def apply(): SchemaReplyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplyList]
  }
  @scala.inline
  implicit class SchemaReplyListOps[Self <: SchemaReplyList] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setRepliesVarargs(value: SchemaReply*): Self = this.set("replies", js.Array(value :_*))
    @scala.inline
    def setReplies(value: js.Array[SchemaReply]): Self = this.set("replies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplies: Self = this.set("replies", js.undefined)
  }
  
}

