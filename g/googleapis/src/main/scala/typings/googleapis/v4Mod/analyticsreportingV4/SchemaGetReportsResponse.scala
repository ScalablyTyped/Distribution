package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The main response class which holds the reports from the Reporting API
  * `batchGet` call.
  */
@js.native
trait SchemaGetReportsResponse extends js.Object {
  /**
    * The amount of resource quota tokens deducted to execute the query.
    * Includes all responses.
    */
  var queryCost: js.UndefOr[Double] = js.native
  /**
    * Responses corresponding to each of the request.
    */
  var reports: js.UndefOr[js.Array[SchemaReport]] = js.native
  /**
    * The amount of resource quota remaining for the property.
    */
  var resourceQuotasRemaining: js.UndefOr[SchemaResourceQuotasRemaining] = js.native
}

object SchemaGetReportsResponse {
  @scala.inline
  def apply(
    queryCost: js.UndefOr[Double] = js.undefined,
    reports: js.Array[SchemaReport] = null,
    resourceQuotasRemaining: SchemaResourceQuotasRemaining = null
  ): SchemaGetReportsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(queryCost)) __obj.updateDynamic("queryCost")(queryCost.get.asInstanceOf[js.Any])
    if (reports != null) __obj.updateDynamic("reports")(reports.asInstanceOf[js.Any])
    if (resourceQuotasRemaining != null) __obj.updateDynamic("resourceQuotasRemaining")(resourceQuotasRemaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetReportsResponse]
  }
}

