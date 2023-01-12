package typings.jupyterlabCompleter

import typings.jupyterlabCompleter.libHandlerMod.CompletionHandler.IReply
import typings.jupyterlabCompleter.libHandlerMod.CompletionHandler.IRequest
import typings.jupyterlabCompleter.libKernelconnectorMod.KernelConnector.IOptions
import typings.jupyterlabServices.libSessionSessionMod.ISessionConnection
import typings.jupyterlabStatedb.mod.DataConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKernelconnectorMod {
  
  @JSImport("@jupyterlab/completer/lib/kernelconnector", "KernelConnector")
  @js.native
  open class KernelConnector protected () extends DataConnector[IReply, Unit, IRequest, String] {
    /**
      * Create a new kernel connector for completion requests.
      *
      * @param options - The instantiation options for the kernel connector.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _session: Any = js.native
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setSession(value: ISessionConnection): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
        
        inline def setSessionNull: Self = StObject.set(x, "session", null)
      }
    }
  }
}
