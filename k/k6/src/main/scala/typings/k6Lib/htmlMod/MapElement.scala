package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "MapElement")
@js.native
abstract class MapElement () extends Element {
  def areas(): js.Array[Element] = js.native
  def images(): js.Array[Element] = js.native
}

