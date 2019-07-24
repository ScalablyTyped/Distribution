package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "MapElement")
@js.native
abstract class MapElement () extends Element {
  /** Associated <area> elements. */
  def areas(): js.Array[Element] = js.native
  /** Associated <img> and <object> elements. */
  def images(): js.Array[Element] = js.native
}

