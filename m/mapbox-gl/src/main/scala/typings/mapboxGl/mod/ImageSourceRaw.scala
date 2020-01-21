package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.image_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageSourceRaw
  extends Source
     with ImageSourceOptions
     with AnySourceData {
  @JSName("type")
  var type_ImageSourceRaw: image_
}

object ImageSourceRaw {
  @scala.inline
  def apply(`type`: image_, coordinates: js.Array[js.Array[Double]] = null, url: String = null): ImageSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSourceRaw]
  }
}

