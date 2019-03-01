package typings
package heredatalensLib.HNs.datalensNs.SpatialLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines data processing and rendering options for SpatialLayer
  * The initial step of rendering is to split the tile data by rows, where each row represents a bucket.
  * By default this step is processed with SpatialLayer.defaultDataToRows. This behavior can be changed by defining the dataToRows callback.
  */
trait Options extends js.Object {
  /** Defines how the input tile data is split by rows. You can specify this callback to define client-side aggregation and filtering. This callback is called for each tile. */
  var dataToRows: js.UndefOr[
    js.Function4[
      /* data */ heredatalensLib.HNs.datalensNs.ServiceNs.Data, 
      /* x */ heredatalensLib.HNs.datalensNs.QueryTileProviderNs.X, 
      /* y */ heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Y, 
      /* z */ heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Zoom, 
      js.Array[Row]
    ]
  ] = js.undefined
  /** Defines how to transform the features. */
  var transformFeature: transformFeature
  /** Defines the default map object style. */
  def defaultStyle(z: heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Zoom, styleState: StyleState): js.Any
  /** Defines how to get the spatial ID from a geometry feature. This callback is called for each geometry feature in the vector tile. */
  def featureToSpatialId(feature: Feature): java.lang.String
  /** Defines how to get the spatial ID from a data row. This callback is called for each row that is returned from dataToRows. */
  def rowToSpatialId(row: Row): java.lang.String
  /** Defines how the row is translated to map object style. This callback is called for each row that is returned from dataToRows. */
  def rowToStyle(row: Row, z: heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Zoom, styleState: StyleState): js.Any
}

object Options {
  @scala.inline
  def apply(
    defaultStyle: js.Function2[heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Zoom, StyleState, js.Any],
    featureToSpatialId: js.Function1[Feature, java.lang.String],
    rowToSpatialId: js.Function1[Row, java.lang.String],
    rowToStyle: js.Function3[Row, heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Zoom, StyleState, js.Any],
    transformFeature: transformFeature,
    dataToRows: js.Function4[
      /* data */ heredatalensLib.HNs.datalensNs.ServiceNs.Data, 
      /* x */ heredatalensLib.HNs.datalensNs.QueryTileProviderNs.X, 
      /* y */ heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Y, 
      /* z */ heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Zoom, 
      js.Array[Row]
    ] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultStyle")(defaultStyle)
    __obj.updateDynamic("featureToSpatialId")(featureToSpatialId)
    __obj.updateDynamic("rowToSpatialId")(rowToSpatialId)
    __obj.updateDynamic("rowToStyle")(rowToStyle)
    __obj.updateDynamic("transformFeature")(transformFeature)
    if (dataToRows != null) __obj.updateDynamic("dataToRows")(dataToRows)
    __obj.asInstanceOf[Options]
  }
}

