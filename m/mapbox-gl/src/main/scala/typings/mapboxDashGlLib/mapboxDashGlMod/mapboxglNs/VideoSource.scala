package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VideoSource
  extends VideoSourceOptions
     with Source {
  @JSName("type")
  var type_VideoSource: mapboxDashGlLib.mapboxDashGlLibStrings.video
  def getVideo(): stdLib.HTMLVideoElement
  def setCoordinates(coordinates: js.Array[js.Array[scala.Double]]): this.type
}

