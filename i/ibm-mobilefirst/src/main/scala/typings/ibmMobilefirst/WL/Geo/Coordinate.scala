package typings.ibmMobilefirst.WL.Geo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinate extends js.Object {
  var latitute: Double
  var longitude: Double
}

object Coordinate {
  @scala.inline
  def apply(latitute: Double, longitude: Double): Coordinate = {
    val __obj = js.Dynamic.literal(latitute = latitute.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Coordinate]
  }
}

