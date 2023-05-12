package typings.jupyterYdoc

import typings.jupyterYdoc.libApiMod.ISharedText
import typings.yProtocols.awarenessMod.Awareness
import typings.yjs.mod.Text
import typings.yjs.mod.UndoManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libYtextMod {
  
  @js.native
  trait IYText
    extends StObject
       with ISharedText {
    
    /**
      * Shareable awareness
      */
    val awareness: Awareness | Null = js.native
    
    /**
      * Undo manager
      */
    val undoManager: UndoManager | Null = js.native
    
    /**
      * Shareable text
      */
    val ysource: Text = js.native
  }
}
