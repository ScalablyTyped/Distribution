package typings.luminoDomutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipboardMod {
  
  object ClipboardExt {
    
    /**
      * Copy text to the system clipboard.
      *
      * @param text - The text to copy to the clipboard.
      */
    @JSImport("@lumino/domutils/types/clipboard", "ClipboardExt.copyText")
    @js.native
    def copyText(text: String): Unit = js.native
  }
}
