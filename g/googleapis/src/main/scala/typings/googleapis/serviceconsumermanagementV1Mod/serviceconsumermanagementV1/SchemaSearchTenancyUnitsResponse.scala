package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the search query.
  */
@js.native
trait SchemaSearchTenancyUnitsResponse extends js.Object {
  /**
    * Pagination token for large results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Tenancy Units matching the request.
    */
  var tenancyUnits: js.UndefOr[js.Array[SchemaTenancyUnit]] = js.native
}

object SchemaSearchTenancyUnitsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, tenancyUnits: js.Array[SchemaTenancyUnit] = null): SchemaSearchTenancyUnitsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (tenancyUnits != null) __obj.updateDynamic("tenancyUnits")(tenancyUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearchTenancyUnitsResponse]
  }
}

