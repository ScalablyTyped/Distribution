package typings
package heredatalensLib.HNs.datalensNs.ObjectLayerNs

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
  def options(zoom: heredatalensLib.HNs.datalensNs.QueryTileProviderNs.Zoom): heremapsLib.HNs.clusteringNs.ProviderNs.ClusteringOptions
  /** Defines data points from rows */
  def rowToDataPoint(row: Row): heremapsLib.HNs.clusteringNs.DataPoint
}

