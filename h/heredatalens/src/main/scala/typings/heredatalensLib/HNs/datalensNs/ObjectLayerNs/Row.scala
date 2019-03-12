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
    getPosition: () => heremapsLib.HNs.geoNs.Point,
    isCluster: () => scala.Boolean,
    lat: scala.Double,
    lng: scala.Double
  ): Row = {
    val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction0(getPosition), isCluster = js.Any.fromFunction0(isCluster), lat = lat, lng = lng)
  
    __obj.asInstanceOf[Row]
  }
}

