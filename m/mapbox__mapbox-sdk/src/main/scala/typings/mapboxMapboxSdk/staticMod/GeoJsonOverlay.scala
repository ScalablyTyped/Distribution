package typings.mapboxMapboxSdk.staticMod

import typings.geojson.mod.GeoJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJsonOverlay extends js.Object {
  var geoJson: GeoJSON
}

object GeoJsonOverlay {
  @scala.inline
  def apply(geoJson: GeoJSON): GeoJsonOverlay = {
    val __obj = js.Dynamic.literal(geoJson = geoJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJsonOverlay]
  }
}

