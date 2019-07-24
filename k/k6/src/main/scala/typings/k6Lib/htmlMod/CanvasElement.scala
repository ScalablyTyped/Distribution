package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "CanvasElement")
@js.native
abstract class CanvasElement () extends Element {
  /** Coordinate space height in CSS pixels. */
  def height(): scala.Double = js.native
  /** Coordinate space width in CSS pixels. */
  def width(): scala.Double = js.native
}

