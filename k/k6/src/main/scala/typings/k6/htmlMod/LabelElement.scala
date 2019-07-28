package typings.k6.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "LabelElement")
@js.native
abstract class LabelElement () extends Element {
  /** Associated form control element. */
  def control(): js.UndefOr[Element] = js.native
  /** Owning <form> element. */
  def form(): js.UndefOr[FormElement] = js.native
}

