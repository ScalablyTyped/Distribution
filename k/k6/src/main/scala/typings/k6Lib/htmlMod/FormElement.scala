package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "FormElement")
@js.native
abstract class FormElement () extends Element {
  def elements(): js.Array[Element] = js.native
  def length(): scala.Double = js.native
  def method(): java.lang.String = js.native
}

