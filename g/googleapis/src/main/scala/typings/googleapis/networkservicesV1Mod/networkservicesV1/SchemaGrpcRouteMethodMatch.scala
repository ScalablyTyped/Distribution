package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrpcRouteMethodMatch extends StObject {
  
  /**
    * Optional. Specifies that matches are case sensitive. The default value is true. case_sensitive must not be used with a type of REGULAR_EXPRESSION.
    */
  var caseSensitive: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. Name of the method to match against. If unspecified, will match all methods.
    */
  var grpcMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Name of the service to match against. If unspecified, will match all services.
    */
  var grpcService: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Specifies how to match against the name. If not specified, a default value of "EXACT" is used.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGrpcRouteMethodMatch {
  
  inline def apply(): SchemaGrpcRouteMethodMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrpcRouteMethodMatch]
  }
  
  extension [Self <: SchemaGrpcRouteMethodMatch](x: Self) {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveNull: Self = StObject.set(x, "caseSensitive", null)
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setGrpcMethod(value: String): Self = StObject.set(x, "grpcMethod", value.asInstanceOf[js.Any])
    
    inline def setGrpcMethodNull: Self = StObject.set(x, "grpcMethod", null)
    
    inline def setGrpcMethodUndefined: Self = StObject.set(x, "grpcMethod", js.undefined)
    
    inline def setGrpcService(value: String): Self = StObject.set(x, "grpcService", value.asInstanceOf[js.Any])
    
    inline def setGrpcServiceNull: Self = StObject.set(x, "grpcService", null)
    
    inline def setGrpcServiceUndefined: Self = StObject.set(x, "grpcService", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
