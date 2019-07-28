package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.mapboxDashGlStrings.image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageSourceRaw
  extends Source
     with ImageSourceOptions
     with AnySourceData {
  @JSName("type")
  var type_ImageSourceRaw: image
}

object ImageSourceRaw {
  @scala.inline
  def apply(`type`: image, coordinates: js.Array[js.Array[Double]] = null, url: String = null): ImageSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ImageSourceRaw]
  }
}

