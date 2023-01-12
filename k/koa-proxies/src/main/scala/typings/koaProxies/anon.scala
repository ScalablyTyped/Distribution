package typings.koaProxies

import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var error: js.UndefOr[
        js.Function3[
          /* error */ Any, 
          /* req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          Unit
        ]
      ] = js.undefined
    
    var proxyReq: js.UndefOr[
        js.Function3[
          /* proxyReq */ ClientRequest, 
          /* req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          Unit
        ]
      ] = js.undefined
    
    var proxyRes: js.UndefOr[
        js.Function3[
          /* proxyRes */ IncomingMessage, 
          /* req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          Unit
        ]
      ] = js.undefined
  }
  object Error {
    
    inline def apply(): Error = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setError(
        value: (/* error */ Any, /* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage]) => Unit
      ): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setProxyReq(
        value: (/* proxyReq */ ClientRequest, /* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage]) => Unit
      ): Self = StObject.set(x, "proxyReq", js.Any.fromFunction3(value))
      
      inline def setProxyReqUndefined: Self = StObject.set(x, "proxyReq", js.undefined)
      
      inline def setProxyRes(
        value: (/* proxyRes */ IncomingMessage, /* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage]) => Unit
      ): Self = StObject.set(x, "proxyRes", js.Any.fromFunction3(value))
      
      inline def setProxyResUndefined: Self = StObject.set(x, "proxyRes", js.undefined)
    }
  }
}
