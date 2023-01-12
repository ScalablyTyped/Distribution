package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodAny extends StObject {
  
  var method: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof resources.gateway.afterHandler */ Any
}
object MethodAny {
  
  inline def apply(
    method: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof resources.gateway.afterHandler */ Any
  ): MethodAny = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodAny]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MethodAny] (val x: Self) extends AnyVal {
    
    inline def setMethod(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof resources.gateway.afterHandler */ Any
    ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
