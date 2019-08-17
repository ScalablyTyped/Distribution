package typings.lozad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lozadMod {
  import typings.std.Element
  import typings.std.HTMLCollectionOf
  import typings.std.NodeListOf

  type Selector = String | Element | HTMLCollectionOf[Element] | NodeListOf[Element]
}
