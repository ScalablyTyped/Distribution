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
@js.native
trait Options extends js.Object {
  /** When present, client-side clustering is applied */
  var clustering: js.UndefOr[Clustering] = js.native
  /** Defines quantization of data for improving data-driven styling performance */
  var dataDomains: js.UndefOr[DataDomains] = js.native
  /** Defines how the input data is split by rows. You can specify this callback to define client-side aggregation and filtering. */
  var dataToRows: js.UndefOr[js.Function1[/* data */ Data, js.Array[Row]]] = js.native
  /**
    * Defines map object style and icon according to data row and zoom level.
    * Also it can define different styles depending on the StyleState (eg hovered, selected).
    */
  var rowToStyle: js.UndefOr[
    js.Function3[/* row */ Row, /* z */ Zoom, /* styleState */ StyleState, ObjectStyleOptions]
  ] = js.native
  /** Defines how each row is presented on the map (eg marker, polygon) */
  def rowToMapObject(row: Row, z: Zoom): Object = js.native
}

object Options {
  @scala.inline
  def apply(rowToMapObject: (Row, Zoom) => Object): Options = {
    val __obj = js.Dynamic.literal(rowToMapObject = js.Any.fromFunction2(rowToMapObject))
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRowToMapObject(value: (Row, Zoom) => Object): Self = this.set("rowToMapObject", js.Any.fromFunction2(value))
    @scala.inline
    def setClustering(value: Clustering): Self = this.set("clustering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClustering: Self = this.set("clustering", js.undefined)
    @scala.inline
    def setDataDomains(value: DataDomains): Self = this.set("dataDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataDomains: Self = this.set("dataDomains", js.undefined)
    @scala.inline
    def setDataToRows(value: /* data */ Data => js.Array[Row]): Self = this.set("dataToRows", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataToRows: Self = this.set("dataToRows", js.undefined)
    @scala.inline
    def setRowToStyle(value: (/* row */ Row, /* z */ Zoom, /* styleState */ StyleState) => ObjectStyleOptions): Self = this.set("rowToStyle", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRowToStyle: Self = this.set("rowToStyle", js.undefined)
  }
  
}

