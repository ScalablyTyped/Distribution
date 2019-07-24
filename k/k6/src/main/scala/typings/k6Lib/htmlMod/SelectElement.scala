package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "SelectElement")
@js.native
abstract class SelectElement () extends Element {
  /** Owning <form> element. */
  def form(): js.UndefOr[FormElement] = js.native
  /** Associated <label> elements. */
  def labels(): js.Array[LabelElement] = js.native
  /** Number of contained <option> elements. */
  def length(): scala.Double = js.native
  /** Contained <option> elements. */
  def options(): js.Array[OptionElement] = js.native
  /** First selected <option> element index. */
  def selectedIndex(): scala.Double = js.native
  /** Selected <option> elements. */
  def selectedOptions(): js.Array[OptionElement] = js.native
  /** Number of visible rows. */
  def size(): scala.Double = js.native
  /** Select type. `select-one` or `select-multiple`. */
  def `type`(): java.lang.String = js.native
  /** First selected <option> element value. */
  def value(): java.lang.String = js.native
}

