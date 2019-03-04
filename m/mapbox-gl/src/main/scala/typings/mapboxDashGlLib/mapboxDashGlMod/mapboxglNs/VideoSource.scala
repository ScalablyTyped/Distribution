package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSource
  extends VideoSourceRaw
     with AnySourceImpl {
  def getVideo(): stdLib.HTMLVideoElement
  def setCoordinates(coordinates: js.Array[js.Array[scala.Double]]): this.type
}

object VideoSource {
  @scala.inline
  def apply(
    getVideo: js.Function0[stdLib.HTMLVideoElement],
    setCoordinates: js.Function1[js.Array[js.Array[scala.Double]], VideoSource],
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.video,
    coordinates: js.Array[js.Array[scala.Double]] = null,
    urls: js.Array[java.lang.String] = null
  ): VideoSource = {
    val __obj = js.Dynamic.literal(getVideo = getVideo, setCoordinates = setCoordinates)
    __obj.updateDynamic("type")(`type`)
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (urls != null) __obj.updateDynamic("urls")(urls)
    __obj.asInstanceOf[VideoSource]
  }
}

