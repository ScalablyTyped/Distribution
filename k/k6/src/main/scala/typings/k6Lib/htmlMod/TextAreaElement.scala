package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "TextAreaElement")
@js.native
abstract class TextAreaElement () extends Element {
  /** Owning <form> element. */
  def form(): js.UndefOr[FormElement] = js.native
  /** Associated <label> elements. */
  def labels(): js.Array[LabelElement] = js.native
  /** Byte length of current text value. */
  def length(): scala.Double = js.native
}

