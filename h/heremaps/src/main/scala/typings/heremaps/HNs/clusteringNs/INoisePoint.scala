package typings.heremaps.HNs.clusteringNs

import typings.heremaps.HNs.geoNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface represents a data point which does not belong to a cluster.
  */
trait INoisePoint extends js.Object {
  /**
    * This method returns data which coresponds to this noise point.
    * @returns {*}
    */
  def getData(): js.Any
  /**
    * Returns the minimum zoom level where this item is not part of another cluster
    * @returns {number}
    */
  def getMinZoom(): Double
  /**
    * Returns the geographical position of this cluster result.
    * @returns {H.geo.Point}
    */
  def getPosition(): Point
  /**
    * Returns the weight of this cluster result.
    * @returns {number}
    */
  def getWeight(): Double
  /**
    * To indicate whether this cluster result is a cluster or noise point
    * @returns {boolean}
    */
  def isCluster(): Boolean
}

object INoisePoint {
  @scala.inline
  def apply(
    getData: () => js.Any,
    getMinZoom: () => Double,
    getPosition: () => Point,
    getWeight: () => Double,
    isCluster: () => Boolean
  ): INoisePoint = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction0(getData), getMinZoom = js.Any.fromFunction0(getMinZoom), getPosition = js.Any.fromFunction0(getPosition), getWeight = js.Any.fromFunction0(getWeight), isCluster = js.Any.fromFunction0(isCluster))
  
    __obj.asInstanceOf[INoisePoint]
  }
}

