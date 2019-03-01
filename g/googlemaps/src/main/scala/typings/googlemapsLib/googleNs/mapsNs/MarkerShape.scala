package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerShape extends js.Object {
  var coords: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object MarkerShape {
  @scala.inline
  def apply(coords: js.Array[scala.Double] = null, `type`: java.lang.String = null): MarkerShape = {
    val __obj = js.Dynamic.literal()
    if (coords != null) __obj.updateDynamic("coords")(coords)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MarkerShape]
  }
}

