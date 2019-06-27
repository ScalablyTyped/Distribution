package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "LabelElement")
@js.native
abstract class LabelElement () extends Element {
  def control(): js.UndefOr[Element] = js.native
  def form(): js.UndefOr[FormElement] = js.native
}

