package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrpcRouteRouteMatch extends StObject {
  
  /**
    * Optional. Specifies a collection of headers to match.
    */
  var headers: js.UndefOr[js.Array[SchemaGrpcRouteHeaderMatch]] = js.undefined
  
  /**
    * Optional. A gRPC method to match against. If this field is empty or omitted, will match all methods.
    */
  var method: js.UndefOr[SchemaGrpcRouteMethodMatch] = js.undefined
}
object SchemaGrpcRouteRouteMatch {
  
  inline def apply(): SchemaGrpcRouteRouteMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrpcRouteRouteMatch]
  }
  
  extension [Self <: SchemaGrpcRouteRouteMatch](x: Self) {
    
    inline def setHeaders(value: js.Array[SchemaGrpcRouteHeaderMatch]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: SchemaGrpcRouteHeaderMatch*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setMethod(value: SchemaGrpcRouteMethodMatch): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
