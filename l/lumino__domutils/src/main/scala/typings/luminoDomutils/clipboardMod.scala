package typings.luminoDomutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/domutils/types/clipboard", JSImport.Namespace)
@js.native
object clipboardMod extends js.Object {
  
  @js.native
  object ClipboardExt extends js.Object {
    
    /**
      * Copy text to the system clipboard.
      *
      * @param text - The text to copy to the clipboard.
      */
    def copyText(text: String): Unit = js.native
  }
}
