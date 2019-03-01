package typings
package heredatalensLib.HNs.datalensNs.SpatialTileProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines layer name and data accessibility parameters for SpatialTileProvider
  * This defines the layer name and dynamic parameters required for fetching tiled geometry data with the Data Lens REST API. Other options from Provider.Options are available.
  */
trait Options extends js.Object {
  /** The name of the layer to fetch with the Data Lens REST API query */
  var layerName: java.lang.String
  /** The query's dynamic parameters. The dynamic parameters can be used to filter data provided by the query. */
  var queryParams: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(layerName: java.lang.String, queryParams: js.Any = null): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layerName")(layerName)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    __obj.asInstanceOf[Options]
  }
}

