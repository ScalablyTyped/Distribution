package typings.jupyterlabCompleter

import typings.jupyterlabCompleter.connectorMod.CompletionConnector.IOptions
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typings.jupyterlabStatedb.mod.DataConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectorMod {
  
  @JSImport("@jupyterlab/completer/lib/connector", "CompletionConnector")
  @js.native
  class CompletionConnector protected () extends DataConnector[IReply, Unit, IRequest, String] {
    /**
      * Create a new connector for completion requests.
      *
      * @param options - The instatiation options for the connector.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _context: js.Any = js.native
    
    /* private */ var _kernel: js.Any = js.native
  }
  object CompletionConnector {
    
    /**
      * The instantiation options for cell completion handlers.
      */
    trait IOptions
      extends StObject
         with typings.jupyterlabCompleter.kernelconnectorMod.KernelConnector.IOptions
         with typings.jupyterlabCompleter.contextconnectorMod.ContextConnector.IOptions
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal(editor = null, session = null)
        __obj.asInstanceOf[IOptions]
      }
    }
  }
}
