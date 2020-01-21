package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response for listing creative and deal associations
  */
@js.native
trait SchemaListDealAssociationsResponse extends js.Object {
  /**
    * The list of associations.
    */
  var associations: js.UndefOr[js.Array[SchemaCreativeDealAssociation]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListDealAssociationsRequest.page_token field in the subsequent call to
    * &#39;ListDealAssociation&#39; method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDealAssociationsResponse {
  @scala.inline
  def apply(associations: js.Array[SchemaCreativeDealAssociation] = null, nextPageToken: String = null): SchemaListDealAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    if (associations != null) __obj.updateDynamic("associations")(associations.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListDealAssociationsResponse]
  }
}

