package typings.heredatalens.H.datalens.ObjectLayer

import typings.heremaps.H.geo.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Slice of data (eg Data Lens query data row) that represents a data point.
  * Each row is translated to map objects with the rowToMapObject callback. By default each row is an Object where property names correspond to data column names.
  * This representation can be changed with the dataToRows callback.
  */
trait Row extends js.Object {
  var lat: Double
  var lng: Double
  def getPosition(): Point
  def isCluster(): Boolean
}

object Row {
  @scala.inline
  def apply(getPosition: () => Point, isCluster: () => Boolean, lat: Double, lng: Double): Row = {
    val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction0(getPosition), isCluster = js.Any.fromFunction0(isCluster), lat = lat, lng = lng)
  
    __obj.asInstanceOf[Row]
  }
}

