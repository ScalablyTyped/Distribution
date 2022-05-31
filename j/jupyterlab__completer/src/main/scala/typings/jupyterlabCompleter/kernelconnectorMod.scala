package typings.jupyterlabCompleter

import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typings.jupyterlabCompleter.kernelconnectorMod.KernelConnector.IOptions
import typings.jupyterlabServices.sessionSessionMod.ISessionConnection
import typings.jupyterlabStatedb.mod.DataConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelconnectorMod {
  
  @JSImport("@jupyterlab/completer/lib/kernelconnector", "KernelConnector")
  @js.native
  class KernelConnector protected () extends DataConnector[IReply, Unit, IRequest, String] {
    /**
      * Create a new kernel connector for completion requests.
      *
      * @param options - The instantiation options for the kernel connector.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _session: js.Any = js.native
  }
  object KernelConnector {
    
    /**
      * The instantiation options for cell completion handlers.
      */
    trait IOptions extends StObject {
      
      /**
        * The session used by the kernel connector.
        */
      var session: ISessionConnection | Null
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal(session = null)
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setSession(value: ISessionConnection): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
        
        inline def setSessionNull: Self = StObject.set(x, "session", null)
      }
    }
  }
}
