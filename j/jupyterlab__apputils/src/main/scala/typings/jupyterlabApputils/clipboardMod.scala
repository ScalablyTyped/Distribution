package typings.jupyterlabApputils

import typings.jupyterlabApputils.jupyterlabApputilsStrings.copy
import typings.jupyterlabApputils.jupyterlabApputilsStrings.cut
import typings.luminoCoreutils.mod.MimeData
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipboardMod {
  
  object Clipboard {
    
    @JSImport("@jupyterlab/apputils/lib/clipboard", "Clipboard")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Copy text to the system clipboard.
      *
      * #### Notes
      * This can only be called in response to a user input event.
      */
    inline def copyToSystem(clipboardData: ClipboardData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("copyToSystem")(clipboardData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def generateEvent(node: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateEvent")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def generateEvent_copy(node: HTMLElement, `type`: copy): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateEvent")(node.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def generateEvent_cut(node: HTMLElement, `type`: cut): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateEvent")(node.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Get the application clipboard instance.
      */
    inline def getInstance(): MimeData = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[MimeData]
    
    /**
      * Set the application clipboard instance.
      */
    inline def setInstance(value: MimeData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setInstance")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  type ClipboardData = String | MimeData
}
