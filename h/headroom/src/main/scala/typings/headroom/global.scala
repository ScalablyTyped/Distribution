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
    /** destroy the headroom instance, removing event listeners and any classes added */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /** freeze the headroom instance's state (pinned or unpinned), and no longer respond to scroll events */
    /* CompleteClass */
    override def freeze(): Unit = js.native
    /** initialise */
    /* CompleteClass */
    override def init(): Unit = js.native
    /** forcibly set the headroom instance's state to pinned */
    /* CompleteClass */
    override def pin(): Unit = js.native
    /** resume responding to scroll events */
    /* CompleteClass */
    override def unfreeze(): Unit = js.native
    /** forcibly set the headroom instance's state to unpinned */
    /* CompleteClass */
    override def unpin(): Unit = js.native
  }
  
}

