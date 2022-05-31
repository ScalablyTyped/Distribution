package typings.jupyterlabShortcutsExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * The default shortcuts extension.
    *
    * #### Notes
    * Shortcut values are stored in the setting system. The default values for each
    * shortcut are preset in the settings schema file of this extension.
    * Additionally, each shortcut can be individually set by the end user by
    * modifying its setting (either in the text editor or by modifying its
    * underlying JSON schema file).
    *
    * When setting shortcut selectors, there are two concepts to consider:
    * specificity and matchability. These two interact in sometimes
    * counterintuitive ways. Keyboard events are triggered from an element and
    * they propagate up the DOM until they reach the `documentElement` (`<body>`).
    *
    * When a registered shortcut sequence is fired, the shortcut manager checks
    * the node that fired the event and each of its ancestors until a node matches
    * one or more registered selectors. The *first* matching selector in the
    * chain of ancestors will invoke the shortcut handler and the traversal will
    * end at that point. If a node matches more than one selector, the handler for
    * whichever selector is more *specific* fires.
    * @see https://www.w3.org/TR/css3-selectors/#specificity
    *
    * The practical consequence of this is that a very broadly matching selector,
    * e.g. `'*'` or `'div'` may match and therefore invoke a handler *before* a
    * more specific selector. The most common pitfall is to use the universal
    * (`'*'`) selector. For almost any use case where a global keyboard shortcut is
    * required, using the `'body'` selector is more appropriate.
    */
  @JSImport("@jupyterlab/shortcuts-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[Unit] = js.native
  
  type _To = JupyterFrontEndPlugin[Unit]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[Unit] = default
}
