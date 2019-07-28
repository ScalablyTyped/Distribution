package typings.heremaps.HNs.clusteringNs

import typings.heremaps.HNs.geoNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface represents the result item of a clustering operation.
  */
trait IResult extends js.Object {
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

object IResult {
  @scala.inline
  def apply(
    getMinZoom: () => Double,
    getPosition: () => Point,
    getWeight: () => Double,
    isCluster: () => Boolean
  ): IResult = {
    val __obj = js.Dynamic.literal(getMinZoom = js.Any.fromFunction0(getMinZoom), getPosition = js.Any.fromFunction0(getPosition), getWeight = js.Any.fromFunction0(getWeight), isCluster = js.Any.fromFunction0(isCluster))
  
    __obj.asInstanceOf[IResult]
  }
}

