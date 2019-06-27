package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "TextAreaElement")
@js.native
abstract class TextAreaElement () extends Element {
  def form(): js.UndefOr[FormElement] = js.native
  def labels(): js.Array[LabelElement] = js.native
  def length(): scala.Double = js.native
}

