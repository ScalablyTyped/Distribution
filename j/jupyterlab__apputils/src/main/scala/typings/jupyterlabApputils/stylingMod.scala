package typings.jupyterlabApputils

import typings.std.HTMLElement
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/apputils/lib/styling", JSImport.Namespace)
@js.native
object stylingMod extends js.Object {
  
  @js.native
  object Styling extends js.Object {
    
    /**
      * Style a node and its child elements with the default tag names.
      *
      * @param node - The base node.
      *
      * @param className - The optional CSS class to add to styled nodes.
      */
    def styleNode(node: HTMLElement): Unit = js.native
    def styleNode(node: HTMLElement, className: String): Unit = js.native
    
    /**
      * Style a node and its elements that have a given tag name.
      *
      * @param node - The base node.
      *
      * @param tagName - The html tag name to style.
      *
      * @param className - The optional CSS class to add to styled nodes.
      */
    def styleNodeByTag(node: HTMLElement, tagName: String): Unit = js.native
    def styleNodeByTag(node: HTMLElement, tagName: String, className: String): Unit = js.native
    
    /**
      * Wrap a select node.
      */
    def wrapSelect(node: HTMLSelectElement): HTMLElement = js.native
  }
}
