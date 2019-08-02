package typings.atMapboxMapboxDashSdk.servicesStaticMod

import typings.geojson.geojsonMod.GeoJsonTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJsonOverlay extends js.Object {
  var geoJson: GeoJsonTypes
}

object GeoJsonOverlay {
  @scala.inline
  def apply(geoJson: GeoJsonTypes): GeoJsonOverlay = {
    val __obj = js.Dynamic.literal(geoJson = geoJson)
  
    __obj.asInstanceOf[GeoJsonOverlay]
  }
}

