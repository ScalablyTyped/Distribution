package typings.googlemaps.google.maps.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJsonOptions extends js.Object {
  var idPropertyName: js.UndefOr[String] = js.undefined
}

object GeoJsonOptions {
  @scala.inline
  def apply(idPropertyName: String = null): GeoJsonOptions = {
    val __obj = js.Dynamic.literal()
    if (idPropertyName != null) __obj.updateDynamic("idPropertyName")(idPropertyName)
    __obj.asInstanceOf[GeoJsonOptions]
  }
}

