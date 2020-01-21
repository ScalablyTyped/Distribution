package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSearchItemsByViewUrlResponse extends js.Object {
  var items: js.UndefOr[js.Array[SchemaItem]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaSearchItemsByViewUrlResponse {
  @scala.inline
  def apply(items: js.Array[SchemaItem] = null, nextPageToken: String = null): SchemaSearchItemsByViewUrlResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearchItemsByViewUrlResponse]
  }
}

