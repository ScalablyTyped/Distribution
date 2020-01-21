package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response for listing creatives.
  */
@js.native
trait SchemaListCreativesResponse extends js.Object {
  /**
    * The list of creatives.
    */
  var creatives: js.UndefOr[js.Array[SchemaCreative]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListCreativesRequest.page_token field in the subsequent call to
    * `ListCreatives` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListCreativesResponse {
  @scala.inline
  def apply(creatives: js.Array[SchemaCreative] = null, nextPageToken: String = null): SchemaListCreativesResponse = {
    val __obj = js.Dynamic.literal()
    if (creatives != null) __obj.updateDynamic("creatives")(creatives.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListCreativesResponse]
  }
}

