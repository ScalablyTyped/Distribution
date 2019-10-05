package typings.heredatalens.H.datalens.ObjectLayer

import typings.heredatalens.H.datalens.QueryTileProvider.Zoom
import typings.heredatalens.H.datalens.Service.Data
import typings.heremaps.H.map.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines data processing and data-driven styling for ObjectLayer
  * The initial step of rendering is to split the tile data by rows, where each row represents a bucket.
  * By default this step is processed with ObjectLayer.defaultDataToRows. This behavior can be changed by defining the dataToRows callback.
  * In the next step each row must be presented as a map object with the rowToMapObject callback. Data-driven styling can be provided with the rowToStyle callback.
  */
trait Options extends js.Object {
  /** When present, client-side clustering is applied */
  var clustering: js.UndefOr[Clustering] = js.undefined
  /** Defines quantization of data for improving data-driven styling performance */
  var dataDomains: js.UndefOr[DataDomains] = js.undefined
  /** Defines how the input data is split by rows. You can specify this callback to define client-side aggregation and filtering. */
  var dataToRows: js.UndefOr[js.Function1[/* data */ Data, js.Array[Row]]] = js.undefined
  /**
    * Defines map object style and icon according to data row and zoom level.
    * Also it can define different styles depending on the StyleState (eg hovered, selected).
    */
  var rowToStyle: js.UndefOr[
    js.Function3[/* row */ Row, /* z */ Zoom, /* styleState */ StyleState, ObjectStyleOptions]
  ] = js.undefined
  /** Defines how each row is presented on the map (eg marker, polygon) */
  def rowToMapObject(row: Row, z: Zoom): Object
}

object Options {
  @scala.inline
  def apply(
    rowToMapObject: (Row, Zoom) => Object,
    clustering: Clustering = null,
    dataDomains: DataDomains = null,
    dataToRows: /* data */ Data => js.Array[Row] = null,
    rowToStyle: (/* row */ Row, /* z */ Zoom, /* styleState */ StyleState) => ObjectStyleOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal(rowToMapObject = js.Any.fromFunction2(rowToMapObject))
    if (clustering != null) __obj.updateDynamic("clustering")(clustering)
    if (dataDomains != null) __obj.updateDynamic("dataDomains")(dataDomains)
    if (dataToRows != null) __obj.updateDynamic("dataToRows")(js.Any.fromFunction1(dataToRows))
    if (rowToStyle != null) __obj.updateDynamic("rowToStyle")(js.Any.fromFunction3(rowToStyle))
    __obj.asInstanceOf[Options]
  }
}

