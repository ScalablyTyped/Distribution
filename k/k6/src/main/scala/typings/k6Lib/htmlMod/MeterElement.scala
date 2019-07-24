package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "MeterElement")
@js.native
abstract class MeterElement () extends Element {
  /** Associated <label> elements. */
  def labels(): js.Array[LabelElement] = js.native
}

