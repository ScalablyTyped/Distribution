package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEndpoint extends StObject {
  
  /**
    * Allowing [CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing), aka cross-domain traffic, would allow the backends served from this endpoint to receive and respond to HTTP OPTIONS requests. The response will be used by the browser to determine whether the subsequent cross-origin request is allowed to proceed.
    */
  var allowCors: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The canonical name of this endpoint.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The specification of an Internet routable address of API frontend that will handle requests to this [API Endpoint](https://cloud.google.com/apis/design/glossary). It should be either a valid IPv4 address or a fully-qualified domain name. For example, "8.8.8.8" or "myservice.appspot.com".
    */
  var target: js.UndefOr[String | Null] = js.undefined
}
object SchemaEndpoint {
  
  inline def apply(): SchemaEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndpoint]
  }
  
  extension [Self <: SchemaEndpoint](x: Self) {
    
    inline def setAllowCors(value: Boolean): Self = StObject.set(x, "allowCors", value.asInstanceOf[js.Any])
    
    inline def setAllowCorsNull: Self = StObject.set(x, "allowCors", null)
    
    inline def setAllowCorsUndefined: Self = StObject.set(x, "allowCors", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
