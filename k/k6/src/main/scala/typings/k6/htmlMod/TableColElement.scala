package typings.k6.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "TableColElement")
@js.native
abstract class TableColElement () extends Element {
  /** Number of consecutive columns spanned. */
  def span(): Double = js.native
}

