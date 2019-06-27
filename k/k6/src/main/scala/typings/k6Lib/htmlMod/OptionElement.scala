package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "OptionElement")
@js.native
abstract class OptionElement () extends Element {
  def disabled(): scala.Boolean = js.native
  def form(): js.UndefOr[FormElement] = js.native
  def index(): scala.Double = js.native
  def label(): java.lang.String = js.native
  def text(): java.lang.String = js.native
  def value(): java.lang.String = js.native
}

