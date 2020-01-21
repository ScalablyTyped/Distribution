package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSourceRaw
  extends Source
     with VideoSourceOptions
     with AnySourceData {
  @JSName("type")
  var type_VideoSourceRaw: video
}

object VideoSourceRaw {
  @scala.inline
  def apply(`type`: video, coordinates: js.Array[js.Array[Double]] = null, urls: js.Array[String] = null): VideoSourceRaw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoSourceRaw]
  }
}

