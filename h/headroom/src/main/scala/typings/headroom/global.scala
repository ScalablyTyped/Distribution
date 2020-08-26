package typings.headroom

import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Headroom protected ()
    extends typings.headroom.Headroom {
    def this(element: HTMLElement) = this()
    def this(element: Node) = this()
    def this(element: HTMLElement, options: HeadroomOptions) = this()
    def this(element: Node, options: HeadroomOptions) = this()
  }
  
}

