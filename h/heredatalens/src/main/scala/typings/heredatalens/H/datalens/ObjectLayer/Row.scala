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
@js.native
trait Row extends js.Object {
  var lat: Double = js.native
  var lng: Double = js.native
  def getPosition(): Point = js.native
  def isCluster(): Boolean = js.native
}

object Row {
  @scala.inline
  def apply(getPosition: () => Point, isCluster: () => Boolean, lat: Double, lng: Double): Row = {
    val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction0(getPosition), isCluster = js.Any.fromFunction0(isCluster), lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
  @scala.inline
  implicit class RowOps[Self <: Row] (val x: Self) extends AnyVal {
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
    def setGetPosition(value: () => Point): Self = this.set("getPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setIsCluster(value: () => Boolean): Self = this.set("isCluster", js.Any.fromFunction0(value))
    @scala.inline
    def setLat(value: Double): Self = this.set("lat", value.asInstanceOf[js.Any])
    @scala.inline
    def setLng(value: Double): Self = this.set("lng", value.asInstanceOf[js.Any])
  }
  
}

