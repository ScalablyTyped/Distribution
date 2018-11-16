package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CanvasSource
  extends Source
     with CanvasSourceOptions {
  @JSName("type")
  var type_CanvasSource: mapboxDashGlLib.mapboxDashGlLibStrings.canvas
  def getCanvas(): stdLib.HTMLCanvasElement
  def pause(): scala.Unit
  def play(): scala.Unit
  def setCoordinates(coordinates: js.Array[js.Array[scala.Double]]): this.type
}

