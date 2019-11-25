package typings.heredatalens.H.datalens.SpatialLayer

import typings.heredatalens.H.datalens.QueryTileProvider.X
import typings.heredatalens.H.datalens.QueryTileProvider.Y
import typings.heredatalens.H.datalens.QueryTileProvider.Zoom
import typings.heredatalens.H.datalens.Service.Data
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
  var dataToRows: js.UndefOr[js.Function4[/* data */ Data, /* x */ X, /* y */ Y, /* z */ Zoom, js.Array[Row]]] = js.undefined
  /** Defines how to transform the features. */
  var transformFeature: typings.heredatalens.H.datalens.SpatialLayer.transformFeature
  /** Defines the default map object style. */
  def defaultStyle(z: Zoom, styleState: StyleState): js.Any
  /** Defines how to get the spatial ID from a geometry feature. This callback is called for each geometry feature in the vector tile. */
  def featureToSpatialId(feature: Feature): String
  /** Defines how to get the spatial ID from a data row. This callback is called for each row that is returned from dataToRows. */
  def rowToSpatialId(row: Row): String
  /** Defines how the row is translated to map object style. This callback is called for each row that is returned from dataToRows. */
  def rowToStyle(row: Row, z: Zoom, styleState: StyleState): js.Any
}

object Options {
  @scala.inline
  def apply(
    defaultStyle: (Zoom, StyleState) => js.Any,
    featureToSpatialId: Feature => String,
    rowToSpatialId: Row => String,
    rowToStyle: (Row, Zoom, StyleState) => js.Any,
    transformFeature: transformFeature,
    dataToRows: (/* data */ Data, /* x */ X, /* y */ Y, /* z */ Zoom) => js.Array[Row] = null
  ): Options = {
    val __obj = js.Dynamic.literal(defaultStyle = js.Any.fromFunction2(defaultStyle), featureToSpatialId = js.Any.fromFunction1(featureToSpatialId), rowToSpatialId = js.Any.fromFunction1(rowToSpatialId), rowToStyle = js.Any.fromFunction3(rowToStyle), transformFeature = transformFeature.asInstanceOf[js.Any])
    if (dataToRows != null) __obj.updateDynamic("dataToRows")(js.Any.fromFunction4(dataToRows))
    __obj.asInstanceOf[Options]
  }
}

