package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageSourceRaw
  extends Source
     with ImageSourceOptions
     with AnySourceData {
  @JSName("type")
  var type_ImageSourceRaw: mapboxDashGlLib.mapboxDashGlLibStrings.image
}

object ImageSourceRaw {
  @scala.inline
  def apply(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.image,
    coordinates: js.Array[js.Array[scala.Double]] = null,
    url: java.lang.String = null
  ): ImageSourceRaw = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ImageSourceRaw]
  }
}

