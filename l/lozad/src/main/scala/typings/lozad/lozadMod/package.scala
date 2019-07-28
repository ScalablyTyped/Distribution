package typings.lozad

import typings.std.Element
import typings.std.HTMLCollectionOf
import typings.std.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lozadMod {
  type Selector = String | Element | HTMLCollectionOf[Element] | NodeListOf[Element]
}
