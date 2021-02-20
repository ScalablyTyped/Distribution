package typings.jupyterlabApputils

import typings.std.HTMLElement
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylingMod {
  
  object Styling {
    
    /**
      * Style a node and its child elements with the default tag names.
      *
      * @param node - The base node.
      *
      * @param className - The optional CSS class to add to styled nodes.
      */
    @JSImport("@jupyterlab/apputils/lib/styling", "Styling.styleNode")
    @js.native
    def styleNode(node: HTMLElement): Unit = js.native
    @JSImport("@jupyterlab/apputils/lib/styling", "Styling.styleNode")
    @js.native
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
    @JSImport("@jupyterlab/apputils/lib/styling", "Styling.styleNodeByTag")
    @js.native
    def styleNodeByTag(node: HTMLElement, tagName: String): Unit = js.native
    @JSImport("@jupyterlab/apputils/lib/styling", "Styling.styleNodeByTag")
    @js.native
    def styleNodeByTag(node: HTMLElement, tagName: String, className: String): Unit = js.native
    
    /**
      * Wrap a select node.
      */
    @JSImport("@jupyterlab/apputils/lib/styling", "Styling.wrapSelect")
    @js.native
    def wrapSelect(node: HTMLSelectElement): HTMLElement = js.native
  }
}
