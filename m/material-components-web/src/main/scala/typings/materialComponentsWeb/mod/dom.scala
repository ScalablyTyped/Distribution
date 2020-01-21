package typings.materialComponentsWeb.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "dom")
@js.native
object dom extends js.Object {
  @js.native
  object ponyfill extends js.Object {
    def closest(element: Element, selector: String): Element = js.native
    def matches(element: Element, selector: String): Boolean = js.native
  }
  
}

