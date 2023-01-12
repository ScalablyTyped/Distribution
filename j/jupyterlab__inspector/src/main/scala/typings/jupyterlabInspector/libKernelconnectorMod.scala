package typings.jupyterlabInspector

import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext
import typings.jupyterlabInspector.libHandlerMod.InspectionHandler.IReply
import typings.jupyterlabInspector.libHandlerMod.InspectionHandler.IRequest
import typings.jupyterlabInspector.libKernelconnectorMod.KernelConnector.IOptions
import typings.jupyterlabStatedb.mod.DataConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKernelconnectorMod {
  
  @JSImport("@jupyterlab/inspector/lib/kernelconnector", "KernelConnector")
  @js.native
  open class KernelConnector protected () extends DataConnector[IReply, Unit, IRequest, String] {
    /**
      * Create a new kernel connector for inspection requests.
      *
      * @param options - The instantiation options for the kernel connector.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _sessionContext: Any = js.native
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
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setSessionContext(value: ISessionContext): Self = StObject.set(x, "sessionContext", value.asInstanceOf[js.Any])
      }
    }
  }
}
