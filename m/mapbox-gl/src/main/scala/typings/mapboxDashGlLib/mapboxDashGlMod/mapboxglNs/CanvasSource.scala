package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasSource extends CanvasSourceRaw {
  def getCanvas(): stdLib.HTMLCanvasElement
  def pause(): scala.Unit
  def play(): scala.Unit
  def setCoordinates(coordinates: js.Array[js.Array[scala.Double]]): this.type
}

