package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageSource
  extends ImageSourceOptions
     with Source {
  @JSName("type")
  var type_ImageSource: mapboxDashGlLib.mapboxDashGlLibStrings.image
  def setCoordinates(coordinates: js.Array[js.Array[scala.Double]]): this.type
}

