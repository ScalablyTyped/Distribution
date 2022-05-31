package typings.jupyterlabInspector

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabInspector.handlerMod.InspectionHandler.IReply
import typings.jupyterlabInspector.handlerMod.InspectionHandler.IRequest
import typings.jupyterlabInspector.kernelconnectorMod.KernelConnector.IOptions
import typings.jupyterlabStatedb.mod.DataConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelconnectorMod {
  
  @JSImport("@jupyterlab/inspector/lib/kernelconnector", "KernelConnector")
  @js.native
  class KernelConnector protected () extends DataConnector[IReply, Unit, IRequest, String] {
    /**
      * Create a new kernel connector for inspection requests.
      *
      * @param options - The instatiation options for the kernel connector.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _sessionContext: js.Any = js.native
  }
  object KernelConnector {
    
    /**
      * The instantiation options for an inspection handler.
      */
    trait IOptions extends StObject {
      
      /**
        * The session context used to make API requests to the kernel.
        */
      var sessionContext: ISessionContext
    }
    object IOptions {
      
      inline def apply(sessionContext: ISessionContext): IOptions = {
        val __obj = js.Dynamic.literal(sessionContext = sessionContext.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setSessionContext(value: ISessionContext): Self = StObject.set(x, "sessionContext", value.asInstanceOf[js.Any])
      }
    }
  }
}
