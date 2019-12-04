package typings.highcharts.modulesMapMod.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A latitude/longitude object.
  */
trait MapLatLonObject extends js.Object {
  /**
    * The latitude.
    */
  var lat: Double
  /**
    * The longitude.
    */
  var lon: Double
}

object MapLatLonObject {
  @scala.inline
  def apply(lat: Double, lon: Double): MapLatLonObject = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MapLatLonObject]
  }
}

