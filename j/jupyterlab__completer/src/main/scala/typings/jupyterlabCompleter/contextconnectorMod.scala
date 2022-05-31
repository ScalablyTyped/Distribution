package typings.jupyterlabCompleter

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCompleter.contextconnectorMod.ContextConnector.IOptions
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typings.jupyterlabStatedb.mod.DataConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextconnectorMod {
  
  @JSImport("@jupyterlab/completer/lib/contextconnector", "ContextConnector")
  @js.native
  class ContextConnector protected () extends DataConnector[IReply, Unit, IRequest, String] {
    /**
      * Create a new context connector for completion requests.
      *
      * @param options - The instatiation options for the context connector.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _editor: js.Any = js.native
  }
  object ContextConnector {
    
    /**
      * The instantiation options for cell completion handlers.
      */
    trait IOptions extends StObject {
      
      /**
        * The session used by the context connector.
        */
      var editor: IEditor | Null
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal(editor = null)
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setEditor(value: IEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
        
        inline def setEditorNull: Self = StObject.set(x, "editor", null)
      }
    }
  }
}
