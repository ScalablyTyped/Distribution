package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ext extends StObject {
  
  var ext: OnPostHandler
  
  var handler: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof resources.gateway.handler */ Any
  
  var response: Ranges
}
object Ext {
  
  inline def apply(
    ext: OnPostHandler,
    handler: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof resources.gateway.handler */ Any,
    response: Ranges
  ): Ext = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ext]
  }
  
  extension [Self <: Ext](x: Self) {
    
    inline def setExt(value: OnPostHandler): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setHandler(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof resources.gateway.handler */ Any
    ): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: Ranges): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
