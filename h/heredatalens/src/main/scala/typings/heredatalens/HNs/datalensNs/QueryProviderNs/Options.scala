package typings.heredatalens.HNs.datalensNs.QueryProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures source query and data accessibility parameters for QueryProvider
  * Specifies the query credentials and dynamic parameters required for fetching query data with the Data Lens REST API. Other options from Provider.Options are available.
  */
trait Options extends js.Object {
  /** The ID of the Data Lens REST API query */
  var queryId: String
  /** The query's dynamic parameters. The dynamic parameters can be used to filter data provided by the query. */
  var queryParams: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(queryId: String, queryParams: js.Any = null): Options = {
    val __obj = js.Dynamic.literal(queryId = queryId)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    __obj.asInstanceOf[Options]
  }
}

