package typings.googleapis.urlshortenerV1Mod.urlshortenerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUrlHistory extends js.Object {
  /**
    * A list of URL resources.
    */
  var items: js.UndefOr[js.Array[SchemaUrl]] = js.native
  /**
    * Number of items returned with each full &quot;page&quot; of results. Note
    * that the last page could have fewer items than the
    * &quot;itemsPerPage&quot; value.
    */
  var itemsPerPage: js.UndefOr[Double] = js.native
  /**
    * The fixed string &quot;urlshortener#urlHistory&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A token to provide to get the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Total number of short URLs associated with this user (may be
    * approximate).
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object SchemaUrlHistory {
  @scala.inline
  def apply(
    items: js.Array[SchemaUrl] = null,
    itemsPerPage: Int | Double = null,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: Int | Double = null
  ): SchemaUrlHistory = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUrlHistory]
  }
}

