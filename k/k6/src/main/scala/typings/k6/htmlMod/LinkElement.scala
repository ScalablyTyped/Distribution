package typings.k6.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "LinkElement")
@js.native
abstract class LinkElement () extends Element {
  /** Link types. */
  def relList(): js.Array[String] = js.native
}

