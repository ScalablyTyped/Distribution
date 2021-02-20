package typings.jupyterlabApputils

import typings.jupyterlabApputils.jupyterlabApputilsStrings.copy
import typings.jupyterlabApputils.jupyterlabApputilsStrings.cut
import typings.luminoCoreutils.mod.MimeData
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipboardMod {
  
  object Clipboard {
    
    /**
      * Copy text to the system clipboard.
      *
      * #### Notes
      * This can only be called in response to a user input event.
      */
    @JSImport("@jupyterlab/apputils/lib/clipboard", "Clipboard.copyToSystem")
    @js.native
    def copyToSystem(clipboardData: ClipboardData): Unit = js.native
    
    /**
      * Generate a clipboard event on a node.
      *
      * @param node - The element on which to generate the event.
      *
      * @param type - The type of event to generate.
      *   `'paste'` events cannot be programmatically generated.
      *
      * #### Notes
      * This can only be called in response to a user input event.
      */
    @JSImport("@jupyterlab/apputils/lib/clipboard", "Clipboard.generateEvent")
    @js.native
    def generateEvent(node: HTMLElement): Unit = js.native
    @JSImport("@jupyterlab/apputils/lib/clipboard", "Clipboard.generateEvent")
    @js.native
    def generateEvent_copy(node: HTMLElement, `type`: copy): Unit = js.native
    @JSImport("@jupyterlab/apputils/lib/clipboard", "Clipboard.generateEvent")
    @js.native
    def generateEvent_cut(node: HTMLElement, `type`: cut): Unit = js.native
    
    /**
      * Get the application clipboard instance.
      */
    @JSImport("@jupyterlab/apputils/lib/clipboard", "Clipboard.getInstance")
    @js.native
    def getInstance(): MimeData = js.native
    
    /**
      * Set the application clipboard instance.
      */
    @JSImport("@jupyterlab/apputils/lib/clipboard", "Clipboard.setInstance")
    @js.native
    def setInstance(value: MimeData): Unit = js.native
  }
  
  type ClipboardData = String | MimeData
}
