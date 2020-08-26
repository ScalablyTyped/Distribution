package typings.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of children of a file.
  */
@js.native
trait SchemaChildList extends js.Object {
  /**
    * The ETag of the list.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The list of children. If nextPageToken is populated, then this list may
    * be incomplete and an additional page of results should be fetched.
    */
  var items: js.UndefOr[js.Array[SchemaChildReference]] = js.native
  /**
    * This is always drive#childList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A link to the next page of children.
    */
  var nextLink: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of children. This will be absent if the
    * end of the children list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted
    * from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A link back to this list.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaChildList {
  @scala.inline
  def apply(): SchemaChildList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChildList]
  }
  @scala.inline
  implicit class SchemaChildListOps[Self <: SchemaChildList] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaChildReference*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaChildReference]): Self = this.set("items", value.asInstanceOf[js.Any])
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

