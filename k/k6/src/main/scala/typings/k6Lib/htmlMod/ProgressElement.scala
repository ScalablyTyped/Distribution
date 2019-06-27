package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "ProgressElement")
@js.native
abstract class ProgressElement () extends Element {
  def labels(): js.Array[LabelElement] = js.native
  def max(): scala.Double = js.native
  def position(): scala.Double = js.native
  def value(): scala.Double = js.native
}

