package typings.luminoVirtualdom.mod

import typings.luminoVirtualdom.luminoVirtualdomStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/virtualdom", "VirtualText")
@js.native
class VirtualText protected () extends VirtualNode {
  /**
    * Construct a new virtual text node.
    *
    * @param content - The text content for the node.
    */
  def this(content: String) = this()
  /**
    * The text content for the node.
    */
  val content: String = js.native
  /**
    * The type of the node.
    *
    * This value can be used as a type guard for discriminating the
    * `VirtualNode` union type.
    */
  val `type`: text = js.native
}

