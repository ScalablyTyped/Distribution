package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderreportsListDisbursementsResponse extends js.Object {
  /**
    * The list of disbursements.
    */
  var disbursements: js.UndefOr[js.Array[SchemaOrderReportDisbursement]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#orderreportsListDisbursementsResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The token for the retrieval of the next page of disbursements.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaOrderreportsListDisbursementsResponse {
  @scala.inline
  def apply(
    disbursements: js.Array[SchemaOrderReportDisbursement] = null,
    kind: String = null,
    nextPageToken: String = null
  ): SchemaOrderreportsListDisbursementsResponse = {
    val __obj = js.Dynamic.literal()
    if (disbursements != null) __obj.updateDynamic("disbursements")(disbursements.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderreportsListDisbursementsResponse]
  }
}

