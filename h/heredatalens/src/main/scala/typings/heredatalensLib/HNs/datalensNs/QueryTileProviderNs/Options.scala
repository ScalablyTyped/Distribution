package typings
package heredatalensLib.HNs.datalensNs.QueryTileProviderNs

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
  var queryId: java.lang.String
  /** The query's dynamic parameters. The dynamic parameters can be used to filter data provided by the query. */
  var queryParams: js.UndefOr[java.lang.String] = js.undefined
  /** Names of the URI parameters that control the x/y/z of a tiled query */
  var tileParamNames: TileParamNames
}

