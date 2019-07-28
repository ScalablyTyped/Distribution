package typings.k6.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "DataListElement")
@js.native
abstract class DataListElement () extends Element {
  /** Contained <option> elements. */
  def options(): js.Array[OptionElement] = js.native
}

