package typings.headroom

import typings.std.Element
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
    def this(element: Element) = this()
    def this(element: Node) = this()
    def this(element: Element, options: HeadroomOptions) = this()
    def this(element: Node, options: HeadroomOptions) = this()
    /* CompleteClass */
    override def init(): Unit = js.native
  }
  
}

