package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderreportsListTransactionsResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#orderreportsListTransactionsResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The token for the retrieval of the next page of transactions.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of transactions.
    */
  var transactions: js.UndefOr[js.Array[SchemaOrderReportTransaction]] = js.native
}

object SchemaOrderreportsListTransactionsResponse {
  @scala.inline
  def apply(
    kind: String = null,
    nextPageToken: String = null,
    transactions: js.Array[SchemaOrderReportTransaction] = null
  ): SchemaOrderreportsListTransactionsResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (transactions != null) __obj.updateDynamic("transactions")(transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderreportsListTransactionsResponse]
  }
}

