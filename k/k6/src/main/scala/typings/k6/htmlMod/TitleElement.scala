package typings.k6.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "TitleElement")
@js.native
abstract class TitleElement () extends Element {
  /** Title text. */
  def text(): String = js.native
}

