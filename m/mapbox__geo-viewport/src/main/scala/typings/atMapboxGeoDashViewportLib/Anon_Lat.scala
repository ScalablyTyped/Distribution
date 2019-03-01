package typings
package atMapboxGeoDashViewportLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lat extends js.Object {
  var lat: scala.Double
  var lon: scala.Double
}

object Anon_Lat {
  @scala.inline
  def apply(lat: scala.Double, lon: scala.Double): Anon_Lat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lat")(lat)
    __obj.updateDynamic("lon")(lon)
    __obj.asInstanceOf[Anon_Lat]
  }
}

