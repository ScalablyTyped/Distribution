package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.mapboxDashGlStrings.video
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
    __obj.updateDynamic("type")(`type`)
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    __obj.asInstanceOf[VideoSourceRaw]
  }
}

