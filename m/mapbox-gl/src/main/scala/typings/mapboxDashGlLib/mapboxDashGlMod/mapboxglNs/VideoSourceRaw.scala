package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSourceRaw
  extends Source
     with VideoSourceOptions
     with AnySourceData {
  @JSName("type")
  var type_VideoSourceRaw: mapboxDashGlLib.mapboxDashGlLibStrings.video
}

object VideoSourceRaw {
  @scala.inline
  def apply(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.video,
    coordinates: js.Array[js.Array[scala.Double]] = null,
    urls: js.Array[java.lang.String] = null
  ): VideoSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    __obj.asInstanceOf[VideoSourceRaw]
  }
}

