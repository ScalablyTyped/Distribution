package typings
package atMapboxGeoDashViewportLib.atMapboxGeoDashViewportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoViewport extends js.Object {
  var center: js.Tuple2[scala.Double, scala.Double]
  var zoom: scala.Double
}

object GeoViewport {
  @scala.inline
  def apply(center: js.Tuple2[scala.Double, scala.Double], zoom: scala.Double): GeoViewport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("center")(center)
    __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[GeoViewport]
  }
}

