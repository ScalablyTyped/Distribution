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
trait Clustering extends js.Object {
  /** Defines clustering options as a function of the zoom level */
  def options(zoom: Zoom): ClusteringOptions
  /** Defines data points from rows */
  def rowToDataPoint(row: Row): DataPoint
}

object Clustering {
  @scala.inline
  def apply(options: Zoom => ClusteringOptions, rowToDataPoint: Row => DataPoint): Clustering = {
    val __obj = js.Dynamic.literal(options = js.Any.fromFunction1(options), rowToDataPoint = js.Any.fromFunction1(rowToDataPoint))
  
    __obj.asInstanceOf[Clustering]
  }
}

