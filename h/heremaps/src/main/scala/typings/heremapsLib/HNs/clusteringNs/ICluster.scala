package typings
package heremapsLib.HNs.clusteringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface describes a cluster of data points, which fulfill the clustering specification (i.e. data points are within the epsilon and there are enough points to form a cluster).
  */
trait ICluster extends js.Object {
  /**
    * Invokes the specified callback for each data point which is part of this cluster, even indirectly.
    * @param callback {function(H.clustering.INoisePoint)} - The callback gets the currently traversed noise point as argument.
    */
  def forEachDataPoint(callback: js.Function1[/* noise */ INoisePoint, scala.Unit]): scala.Unit
  /**
    * Invokes the specified callback for each "entry" of the cluster.
    * That "entry" can be either a cluster which implements H.clustering.ICluster interface or a noise point which implements H.clustering.INoisePoint interface.
    * @param callback {function(H.clustering.IResult)} - The callback gets the currently traversed entry as an argument, which is cluster or noise point.
    */
  def forEachEntry(callback: js.Function1[/* result */ IResult, scala.Unit]): scala.Unit
  /**
    * Returns the bounding rectangle of this cluster.
    * @returns {H.geo.Rect}
    */
  def getBounds(): heremapsLib.HNs.geoNs.Rect
  /**
    * Returns the maximum zoom level where this cluster doesn't fall apart into sub clusters and/or noise poinst
    * @returns {number}
    */
  def getMaxZoom(): scala.Double
  /**
    * Returns the minimum zoom level where this item is not part of another cluster
    * @returns {number}
    */
  def getMinZoom(): scala.Double
  /**
    * Returns the geographical position of this cluster result.
    * @returns {H.geo.Point}
    */
  def getPosition(): heremapsLib.HNs.geoNs.Point
  /**
    * Returns the weight of this cluster result.
    * @returns {number}
    */
  def getWeight(): scala.Double
  /**
    * To indicate whether this cluster result is a cluster or noise point
    * @returns {boolean}
    */
  def isCluster(): scala.Boolean
}

object ICluster {
  @scala.inline
  def apply(
    forEachDataPoint: js.Function1[js.Function1[/* noise */ INoisePoint, scala.Unit], scala.Unit],
    forEachEntry: js.Function1[js.Function1[/* result */ IResult, scala.Unit], scala.Unit],
    getBounds: js.Function0[heremapsLib.HNs.geoNs.Rect],
    getMaxZoom: js.Function0[scala.Double],
    getMinZoom: js.Function0[scala.Double],
    getPosition: js.Function0[heremapsLib.HNs.geoNs.Point],
    getWeight: js.Function0[scala.Double],
    isCluster: js.Function0[scala.Boolean]
  ): ICluster = {
    val __obj = js.Dynamic.literal(forEachDataPoint = forEachDataPoint, forEachEntry = forEachEntry, getBounds = getBounds, getMaxZoom = getMaxZoom, getMinZoom = getMinZoom, getPosition = getPosition, getWeight = getWeight, isCluster = isCluster)
  
    __obj.asInstanceOf[ICluster]
  }
}

