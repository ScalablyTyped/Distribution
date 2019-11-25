package typings.heredatalens.H.datalens.SpatialTileProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines layer name and data accessibility parameters for SpatialTileProvider
  * This defines the layer name and dynamic parameters required for fetching tiled geometry data with the Data Lens REST API. Other options from Provider.Options are available.
  */
trait Options extends js.Object {
  /** The name of the layer to fetch with the Data Lens REST API query */
  var layerName: String
  /** The query's dynamic parameters. The dynamic parameters can be used to filter data provided by the query. */
  var queryParams: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(layerName: String, queryParams: js.Any = null): Options = {
    val __obj = js.Dynamic.literal(layerName = layerName.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

