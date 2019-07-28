package typings.k6.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "ButtonElement")
@js.native
abstract class ButtonElement () extends FormFieldElement {
  /** Value of `value` attribute if exists. Otherwise markup of content. */
  def value(): String = js.native
}

