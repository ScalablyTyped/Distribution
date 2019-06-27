package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "SelectElement")
@js.native
abstract class SelectElement () extends Element {
  def form(): js.UndefOr[FormElement] = js.native
  def labels(): js.Array[LabelElement] = js.native
  def length(): scala.Double = js.native
  def options(): js.Array[OptionElement] = js.native
  def selectedIndex(): scala.Double = js.native
  def selectedOptions(): js.Array[OptionElement] = js.native
  def size(): scala.Double = js.native
  def `type`(): java.lang.String = js.native
  def value(): java.lang.String = js.native
}

