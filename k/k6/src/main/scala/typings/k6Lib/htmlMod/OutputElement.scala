package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "OutputElement")
@js.native
abstract class OutputElement () extends Element {
  def defaultValue(): java.lang.String = js.native
  def form(): js.UndefOr[FormElement] = js.native
  def labels(): js.Array[LabelElement] = js.native
  def value(): java.lang.String = js.native
}

