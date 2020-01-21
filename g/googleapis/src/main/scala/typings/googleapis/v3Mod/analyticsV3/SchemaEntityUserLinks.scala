package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An entity user link collection provides a list of Analytics ACL links Each
  * resource in this collection corresponds to a single link.
  */
@js.native
trait SchemaEntityUserLinks extends js.Object {
  /**
    * A list of entity user links.
    */
  var items: js.UndefOr[js.Array[SchemaEntityUserLink]] = js.native
  /**
    * The maximum number of entries the response can contain, regardless of the
    * actual number of entries returned. Its value ranges from 1 to 1000 with a
    * value of 1000 by default, or otherwise specified by the max-results query
    * parameter.
    */
  var itemsPerPage: js.UndefOr[Double] = js.native
  /**
    * Collection type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Next link for this account collection.
    */
  var nextLink: js.UndefOr[String] = js.native
  /**
    * Previous link for this account collection.
    */
  var previousLink: js.UndefOr[String] = js.native
  /**
    * The starting index of the entries, which is 1 by default or otherwise
    * specified by the start-index query parameter.
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * The total number of results for the query, regardless of the number of
    * results in the response.
    */
  var totalResults: js.UndefOr[Double] = js.native
}

object SchemaEntityUserLinks {
  @scala.inline
  def apply(
    items: js.Array[SchemaEntityUserLink] = null,
    itemsPerPage: Int | Double = null,
    kind: String = null,
    nextLink: String = null,
    previousLink: String = null,
    startIndex: Int | Double = null,
    totalResults: Int | Double = null
  ): SchemaEntityUserLinks = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextLink != null) __obj.updateDynamic("nextLink")(nextLink.asInstanceOf[js.Any])
    if (previousLink != null) __obj.updateDynamic("previousLink")(previousLink.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEntityUserLinks]
  }
}

