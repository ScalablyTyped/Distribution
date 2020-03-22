package typings.luminoVirtualdom.mod

import typings.std.HTMLElement
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/virtualdom", "VirtualDOM")
@js.native
object VirtualDOM extends js.Object {
  def realize(node: VirtualElement): HTMLElement = js.native
  /**
    * Create a real DOM element from a virtual element node.
    *
    * @param node - The virtual element node to realize.
    *
    * @returns A new DOM element for the given virtual element node.
    *
    * #### Notes
    * This creates a brand new *real* DOM element with a structure which
    * matches the given virtual DOM node.
    *
    * If virtual diffing is desired, use the `render` function instead.
    */
  def realize(node: VirtualText): Text = js.native
  def render(content: js.Array[VirtualNode], host: HTMLElement): Unit = js.native
  def render(content: Null, host: HTMLElement): Unit = js.native
  /**
    * Render virtual DOM content into a host element.
    *
    * @param content - The virtual DOM content to render.
    *
    * @param host - The host element for the rendered content.
    *
    * #### Notes
    * This renders the delta from the previous rendering. It assumes that
    * the content of the host element is not manipulated by external code.
    *
    * Providing `null` content will clear the rendering.
    *
    * Externally modifying the provided content or the host element will
    * result in undefined rendering behavior.
    */
  def render(content: VirtualNode, host: HTMLElement): Unit = js.native
}

