package typings.luminoVirtualdom.mod

import typings.luminoVirtualdom.anon.Attrs
import typings.luminoVirtualdom.luminoVirtualdomStrings.element
import typings.luminoVirtualdom.mod.VirtualElement.IRenderer
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/virtualdom", "VirtualElement")
@js.native
class VirtualElement protected () extends VirtualNode {
  /**
    * Construct a new virtual element node.
    *
    * @param tag - The element tag name.
    *
    * @param attrs - The element attributes.
    *
    * @param children - The element children.
    *
    * @param renderer - An optional custom renderer for the element.
    */
  def this(tag: String, attrs: ElementAttrs, children: js.Array[VirtualNode]) = this()
  def this(tag: String, attrs: ElementAttrs, children: js.Array[VirtualNode], renderer: IRenderer) = this()
  
  /**
    * The attributes for the element.
    */
  val attrs: ElementAttrs = js.native
  
  /**
    * The children for the element.
    */
  val children: js.Array[VirtualNode] = js.native
  
  /**
    * An optional custom renderer for the element's children. If set, on render
    * this element's DOM node and it's attrs will be created/updated as normal.
    * At that point the DOM node is handed off to the renderer.
    */
  val renderer: js.UndefOr[IRenderer] = js.native
  
  /**
    * The tag name for the element.
    */
  val tag: String = js.native
  
  /**
    * The type of the node.
    *
    * This value can be used as a type guard for discriminating the
    * `VirtualNode` union type.
    */
  val `type`: element = js.native
}
@JSImport("@lumino/virtualdom", "VirtualElement")
@js.native
object VirtualElement extends js.Object {
  
  /**
    * A type describing a custom element renderer
    */
  @js.native
  trait IRenderer extends js.Object {
    
    /**
      * Customize how a DOM node is rendered. If .renderer is set on a given
      * instance of VirtualElement, this function will be called every time
      * that VirtualElement is rendered.
      *
      * @param host - The actual DOM node created for a VirtualElement during
      * rendering.
      *
      * On render, host is created and its attrs are set/updated via
      * the standard routines in updateContent. host is then handed off to this
      * function.
      *
      * The render function is free to modify host. The only restriction is
      * is that render should not modify any attributes set by external
      * routines (ie updateContent), as this may cause thrashing when the
      * virtual element is next rendered.
      *
      * @param options - Will be populated with the .attrs and .children fields
      * set on the VirtualElement being rendered.
      */
    def render(host: HTMLElement): Unit = js.native
    def render(host: HTMLElement, options: Attrs): Unit = js.native
    
    /**
      * Optional cleanup function for custom renderers. If the .renderer field
      * of a VirtualELement is set, and if .renderer.unrender is defined, when
      * the element is changed or removed its corresponding DOM element will be
      * passed to this function immediately before it is removed from the DOM.
      *
      * unrender is not required for for simple renderers, such as those
      * implemented using `document.createElement()`. However, for certain
      * rendering techniques explicit cleanup is required in order to avoid
      * resource leaks.
      *
      * For example, if render calls `ReactDOM.render(..., host)`, then
      * there has to also be a corresponding implementation of unrender that
      * calls `ReactDOM.unmountComponentAtNode(host)` in order to prevent
      * a memory leak.
      *
      * @param host - the DOM element to be removed.
      *
      * @param options - Will be populated with the .attrs and .children fields
      * set on the VirtualElement being unrendered.
      */
    var unrender: js.UndefOr[js.Function2[/* host */ HTMLElement, /* options */ js.UndefOr[Attrs], Unit]] = js.native
  }
}
