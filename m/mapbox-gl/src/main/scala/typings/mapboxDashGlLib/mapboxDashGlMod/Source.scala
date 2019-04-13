package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var `type`: mapboxDashGlLib.mapboxDashGlLibStrings.vector | mapboxDashGlLib.mapboxDashGlLibStrings.raster | mapboxDashGlLib.mapboxDashGlLibStrings.`raster-dem` | mapboxDashGlLib.mapboxDashGlLibStrings.geojson | mapboxDashGlLib.mapboxDashGlLibStrings.image | mapboxDashGlLib.mapboxDashGlLibStrings.video | mapboxDashGlLib.mapboxDashGlLibStrings.canvas
}

object Source {
  @scala.inline
  def apply(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.vector | mapboxDashGlLib.mapboxDashGlLibStrings.raster | mapboxDashGlLib.mapboxDashGlLibStrings.`raster-dem` | mapboxDashGlLib.mapboxDashGlLibStrings.geojson | mapboxDashGlLib.mapboxDashGlLibStrings.image | mapboxDashGlLib.mapboxDashGlLibStrings.video | mapboxDashGlLib.mapboxDashGlLibStrings.canvas
  ): Source = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

