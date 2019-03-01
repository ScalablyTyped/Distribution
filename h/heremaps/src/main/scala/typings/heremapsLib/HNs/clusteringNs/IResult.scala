package typings
package heremapsLib.HNs.clusteringNs

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

object IResult {
  @scala.inline
  def apply(
    getMinZoom: js.Function0[scala.Double],
    getPosition: js.Function0[heremapsLib.HNs.geoNs.Point],
    getWeight: js.Function0[scala.Double],
    isCluster: js.Function0[scala.Boolean]
  ): IResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getMinZoom")(getMinZoom)
    __obj.updateDynamic("getPosition")(getPosition)
    __obj.updateDynamic("getWeight")(getWeight)
    __obj.updateDynamic("isCluster")(isCluster)
    __obj.asInstanceOf[IResult]
  }
}

