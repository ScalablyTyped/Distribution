package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "LinkElement")
@js.native
abstract class LinkElement () extends Element {
  /** Link types. */
  def relList(): js.Array[java.lang.String] = js.native
}

