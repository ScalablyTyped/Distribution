package typings
package heredatalensLib.HNs.datalensNs.ObjectLayerNs

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
  var dataToRows: js.UndefOr[
    js.Function1[/* data */ heredatalensLib.HNs.datalensNs.ServiceNs.Data, js.Array[Row]]
  ] = js.undefined
  /**
    * Defines map object style and icon according to data row and zoom level.
    * Also it can define different styles depending on the StyleState (eg hovered, selected).
    */
  var rowToStyle: js.UndefOr[
    js.Function3[
      /* row */ Row, 
      /* z */ heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Zoom, 
      /* styleState */ StyleState, 
      ObjectStyleOptions
    ]
  ] = js.undefined
  /** Defines how each row is presented on the map (eg marker, polygon) */
  def rowToMapObject(row: Row, z: heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Zoom): heremapsLib.HNs.mapNs.Object
}

object Options {
  @scala.inline
  def apply(
    rowToMapObject: js.Function2[
      Row, 
      heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Zoom, 
      heremapsLib.HNs.mapNs.Object
    ],
    clustering: Clustering = null,
    dataDomains: DataDomains = null,
    dataToRows: js.Function1[/* data */ heredatalensLib.HNs.datalensNs.ServiceNs.Data, js.Array[Row]] = null,
    rowToStyle: js.Function3[
      /* row */ Row, 
      /* z */ heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Zoom, 
      /* styleState */ StyleState, 
      ObjectStyleOptions
    ] = null
  ): Options = {
    val __obj = js.Dynamic.literal(rowToMapObject = rowToMapObject)
    if (clustering != null) __obj.updateDynamic("clustering")(clustering)
    if (dataDomains != null) __obj.updateDynamic("dataDomains")(dataDomains)
    if (dataToRows != null) __obj.updateDynamic("dataToRows")(dataToRows)
    if (rowToStyle != null) __obj.updateDynamic("rowToStyle")(rowToStyle)
    __obj.asInstanceOf[Options]
  }
}

