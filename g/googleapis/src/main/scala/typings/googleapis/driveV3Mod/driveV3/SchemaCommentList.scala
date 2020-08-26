package typings.googleapis.driveV3Mod.driveV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of comments on a file.
  */
@js.native
trait SchemaCommentList extends js.Object {
  /**
    * The list of comments. If nextPageToken is populated, then this list may
    * be incomplete and an additional page of results should be fetched.
    */
  var comments: js.UndefOr[js.Array[SchemaComment]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#commentList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of comments. This will be absent if the
    * end of the comments list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted
    * from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaCommentList {
  @scala.inline
  def apply(): SchemaCommentList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommentList]
  }
  @scala.inline
  implicit class SchemaCommentListOps[Self <: SchemaCommentList] (val x: Self) extends AnyVal {
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
    def setCommentsVarargs(value: SchemaComment*): Self = this.set("comments", js.Array(value :_*))
    @scala.inline
    def setComments(value: js.Array[SchemaComment]): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

