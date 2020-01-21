package typings.mapboxMapboxSdk.staticMod

import typings.mapboxGl.mod.LngLatLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMarker extends js.Object {
  var coordinates: LngLatLike
  var url: String
}

object CustomMarker {
  @scala.inline
  def apply(coordinates: LngLatLike, url: String): CustomMarker = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomMarker]
  }
}

