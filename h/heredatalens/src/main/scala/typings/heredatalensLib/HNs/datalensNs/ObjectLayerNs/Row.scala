package typings
package heredatalensLib.HNs.datalensNs.ObjectLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Slice of data (eg Data Lens query data row) that represents a data point.
  * Each row is translated to map objects with the rowToMapObject callback. By default each row is an Object where property names correspond to data column names.
  * This representation can be changed with the dataToRows callback.
  */
trait Row extends js.Object {
  var lat: scala.Double
  var lng: scala.Double
  def getPosition(): heremapsLib.HNs.geoNs.Point
  def isCluster(): scala.Boolean
}

object Row {
  @scala.inline
  def apply(
    getPosition: js.Function0[heremapsLib.HNs.geoNs.Point],
    isCluster: js.Function0[scala.Boolean],
    lat: scala.Double,
    lng: scala.Double
  ): Row = {
    val __obj = js.Dynamic.literal(getPosition = getPosition, isCluster = isCluster, lat = lat, lng = lng)
  
    __obj.asInstanceOf[Row]
  }
}

