package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageSource
  extends ImageSourceRaw
     with AnySourceImpl {
  def setCoordinates(coordinates: js.Array[js.Array[scala.Double]]): this.type
}

object ImageSource {
  @scala.inline
  def apply(
    setCoordinates: js.Function1[js.Array[js.Array[scala.Double]], ImageSource],
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.image,
    coordinates: js.Array[js.Array[scala.Double]] = null,
    url: java.lang.String = null
  ): ImageSource = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("setCoordinates")(setCoordinates)
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ImageSource]
  }
}

