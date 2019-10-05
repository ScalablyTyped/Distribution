package typings.heredatalens.H.datalens.QueryTileProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures source query and data accessibility parameters for QueryTileProvider
  * Specifies the query credentials and dynamic parameters required for fetching tiled query data with the Data Lens REST API.
  * Other options from Provider.Options are available.
  */
trait Options extends js.Object {
  /** The ID for the Data Lens REST API query */
  var queryId: String
  /** The query's dynamic parameters. The dynamic parameters can be used to filter data provided by the query. */
  var queryParams: js.UndefOr[String] = js.undefined
  /** Names of the URI parameters that control the x/y/z of a tiled query */
  var tileParamNames: TileParamNames
}

object Options {
  @scala.inline
  def apply(queryId: String, tileParamNames: TileParamNames, queryParams: String = null): Options = {
    val __obj = js.Dynamic.literal(queryId = queryId, tileParamNames = tileParamNames)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    __obj.asInstanceOf[Options]
  }
}

