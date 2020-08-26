package typings.heredatalens.H.datalens.ObjectLayer

import typings.heredatalens.H.datalens.QueryTileProvider.Zoom
import typings.heremaps.H.clustering.DataPoint
import typings.heremaps.H.clustering.Provider.ClusteringOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines client-side clustering in the ObjectLayer.
  * When the clustering option is provided, rows returned from dataToRows go to the clustering.rowToDataPoint callback to be transformed to data points.
  * Then, the data points are clustered according to clustering.options. Clustering produces clusters and noise points (data points that are not clustered).
  * Clusters and noise points must be presented as map objects with the rowToMapObject callback and can be styled with the rowToStyle callback.
  */
@js.native
trait Clustering extends js.Object {
  /** Defines clustering options as a function of the zoom level */
  def options(zoom: Zoom): ClusteringOptions = js.native
  /** Defines data points from rows */
  def rowToDataPoint(row: Row): DataPoint = js.native
}

object Clustering {
  @scala.inline
  def apply(options: Zoom => ClusteringOptions, rowToDataPoint: Row => DataPoint): Clustering = {
    val __obj = js.Dynamic.literal(options = js.Any.fromFunction1(options), rowToDataPoint = js.Any.fromFunction1(rowToDataPoint))
    __obj.asInstanceOf[Clustering]
  }
  @scala.inline
  implicit class ClusteringOps[Self <: Clustering] (val x: Self) extends AnyVal {
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
    def setOptions(value: Zoom => ClusteringOptions): Self = this.set("options", js.Any.fromFunction1(value))
    @scala.inline
    def setRowToDataPoint(value: Row => DataPoint): Self = this.set("rowToDataPoint", js.Any.fromFunction1(value))
  }
  
}

