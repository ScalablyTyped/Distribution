package typings.googleapis.plusV1Mod.plusV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPeopleFeed extends js.Object {
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The people in this page of results. Each item includes the id,
    * displayName, image, and url for the person. To retrieve additional
    * profile data, see the people.get method.
    */
  var items: js.UndefOr[js.Array[SchemaPerson]] = js.native
  /**
    * Identifies this resource as a collection of people. Value:
    * &quot;plus#peopleFeed&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Link to this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The title of this collection of people.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The total number of people available in this list. The number of people
    * in a response might be smaller due to paging. This might not be set for
    * all collections.
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object SchemaPeopleFeed {
  @scala.inline
  def apply(): SchemaPeopleFeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPeopleFeed]
  }
  @scala.inline
  implicit class SchemaPeopleFeedOps[Self <: SchemaPeopleFeed] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaPerson*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaPerson]): Self = this.set("items", value.asInstanceOf[js.Any])
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
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTotalItems(value: Double): Self = this.set("totalItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalItems: Self = this.set("totalItems", js.undefined)
  }
  
}

