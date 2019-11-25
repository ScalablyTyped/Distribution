package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.mapboxDashGlStrings.`raster-dem`
import typings.mapboxDashGl.mapboxDashGlStrings.canvas
import typings.mapboxDashGl.mapboxDashGlStrings.geojson
import typings.mapboxDashGl.mapboxDashGlStrings.image_
import typings.mapboxDashGl.mapboxDashGlStrings.raster
import typings.mapboxDashGl.mapboxDashGlStrings.vector
import typings.mapboxDashGl.mapboxDashGlStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var `type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas
}

object Source {
  @scala.inline
  def apply(`type`: vector | raster | `raster-dem` | geojson | image_ | video | canvas): Source = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

