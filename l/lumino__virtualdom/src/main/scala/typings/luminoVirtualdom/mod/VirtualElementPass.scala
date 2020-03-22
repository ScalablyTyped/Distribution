package typings.luminoVirtualdom.mod

import typings.luminoVirtualdom.mod.VirtualElementPass.IRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/virtualdom", "VirtualElementPass")
@js.native
class VirtualElementPass protected () extends VirtualElement {
  def this(tag: String, attrs: ElementAttrs) = this()
  /**
    * DEPRECATED - use VirtualElement with a defined renderer param instead
    *
    * Construct a new virtual element pass thru node.
    *
    * @param tag - the tag of the parent element of this node. Once the parent
    * element is rendered, it will be passed as an argument to
    * renderer.render
    *
    * @param attrs - attributes that will assigned to the
    * parent element
    *
    * @param renderer - an object with render and unrender
    * functions, each of which should take a single argument of type
    * HTMLElement and return nothing. If null, the parent element
    * will be rendered barren without any children.
    */
  def this(tag: String, attrs: ElementAttrs, renderer: IRenderer) = this()
}

@JSImport("@lumino/virtualdom", "VirtualElementPass")
@js.native
object VirtualElementPass extends js.Object {
  /**
    * DEPRECATED - use VirtualElement.IRenderer instead
    *
    * A type describing a custom element renderer
    */
  type IRenderer = typings.luminoVirtualdom.mod.VirtualElement.IRenderer
}

