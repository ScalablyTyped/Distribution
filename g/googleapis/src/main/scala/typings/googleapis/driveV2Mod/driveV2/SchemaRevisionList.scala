package typings.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of revisions of a file.
  */
@js.native
trait SchemaRevisionList extends js.Object {
  /**
    * The ETag of the list.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The list of revisions. If nextPageToken is populated, then this list may
    * be incomplete and an additional page of results should be fetched.
    */
  var items: js.UndefOr[js.Array[SchemaRevision]] = js.native
  /**
    * This is always drive#revisionList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of revisions. This field will be absent
    * if the end of the revisions list has been reached. If the token is
    * rejected for any reason, it should be discarded and pagination should be
    * restarted from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A link back to this list.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaRevisionList {
  @scala.inline
  def apply(): SchemaRevisionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevisionList]
  }
  @scala.inline
  implicit class SchemaRevisionListOps[Self <: SchemaRevisionList] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setItemsVarargs(value: SchemaRevision*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaRevision]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
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

