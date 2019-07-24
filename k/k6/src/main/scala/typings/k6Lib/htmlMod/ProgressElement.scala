package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "ProgressElement")
@js.native
abstract class ProgressElement () extends Element {
  /** Associated <label> elements. */
  def labels(): js.Array[LabelElement] = js.native
  /** Work required. */
  def max(): scala.Double = js.native
  /** Progress bar position. `value/max` */
  def position(): scala.Double = js.native
  /** Work completed. */
  def value(): scala.Double = js.native
}

