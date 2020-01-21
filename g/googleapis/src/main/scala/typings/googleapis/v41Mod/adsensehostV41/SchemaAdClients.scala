package typings.googleapis.v41Mod.adsensehostV41

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAdClients extends js.Object {
  /**
    * ETag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ad clients returned in this list response.
    */
  var items: js.UndefOr[js.Array[SchemaAdClient]] = js.native
  /**
    * Kind of list this is, in this case adsensehost#adClients.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Continuation token used to page through ad clients. To retrieve the next
    * page of results, set the next request&#39;s &quot;pageToken&quot; value
    * to this.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaAdClients {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[SchemaAdClient] = null,
    kind: String = null,
    nextPageToken: String = null
  ): SchemaAdClients = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAdClients]
  }
}

