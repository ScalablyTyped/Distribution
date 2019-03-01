package typings
package googlemapsLib.googleNs.mapsNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJsonOptions extends js.Object {
  var idPropertyName: js.UndefOr[java.lang.String] = js.undefined
}

object GeoJsonOptions {
  @scala.inline
  def apply(idPropertyName: java.lang.String = null): GeoJsonOptions = {
    val __obj = js.Dynamic.literal()
    if (idPropertyName != null) __obj.updateDynamic("idPropertyName")(idPropertyName)
    __obj.asInstanceOf[GeoJsonOptions]
  }
}

