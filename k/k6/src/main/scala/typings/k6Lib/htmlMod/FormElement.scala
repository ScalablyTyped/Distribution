package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "FormElement")
@js.native
abstract class FormElement () extends Element {
  /** Contained form control elements. */
  def elements(): js.Array[Element] = js.native
  /** Number of contained form control elements. */
  def length(): scala.Double = js.native
  /** Form submission HTTP method. */
  def method(): java.lang.String = js.native
}

