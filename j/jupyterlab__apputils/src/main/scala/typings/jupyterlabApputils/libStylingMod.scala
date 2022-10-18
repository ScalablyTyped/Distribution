package typings.jupyterlabApputils

import typings.std.HTMLElement
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStylingMod {
  
  object Styling {
    
    @JSImport("@jupyterlab/apputils/lib/styling", "Styling")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Style a node and its child elements with the default tag names.
      *
      * @param node - The base node.
      *
      * @param className - The optional CSS class to add to styled nodes.
      */
    inline def styleNode(node: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("styleNode")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def styleNode(node: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("styleNode")(node.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Style a node and its elements that have a given tag name.
      *
      * @param node - The base node.
      *
      * @param tagName - The html tag name to style.
      *
      * @param className - The optional CSS class to add to styled nodes.
      */
    inline def styleNodeByTag(node: HTMLElement, tagName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("styleNodeByTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def styleNodeByTag(node: HTMLElement, tagName: String, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("styleNodeByTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Wrap a select node.
      */
    inline def wrapSelect(node: HTMLSelectElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapSelect")(node.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  }
}
