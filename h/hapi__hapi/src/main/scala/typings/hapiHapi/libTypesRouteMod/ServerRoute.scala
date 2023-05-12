package typings.hapiHapi.libTypesRouteMod

import typings.hapiHapi.libTypesRequestMod.ReqRef
import typings.hapiHapi.libTypesServerMod.Server_
import typings.hapiHapi.libTypesServerServerMod.ServerApplicationState
import typings.hapiHapi.libTypesUtilsMod.HTTP_METHODS_PARTIAL
import typings.hapiHapi.libTypesUtilsMod.Lifecycle.Method
import typings.hapiHapi.libTypesUtilsMod.Lifecycle.ReturnValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerRoute[Refs /* <: ReqRef */] extends StObject {
  
  /**
    * (required when handler is not set) the route handler function called to generate the response after successful authentication and validation.
    */
  var handler: js.UndefOr[(Method[Refs, ReturnValue[Refs]]) | HandlerDecorations] = js.undefined
  
  /**
    * (required) the HTTP method. Typically one of 'GET', 'POST', 'PUT', 'PATCH', 'DELETE', or 'OPTIONS'. Any HTTP method is allowed, except for 'HEAD'. Use '*' to match against any HTTP method
    * (only when an exact match was not found, and any match with a specific method will be given a higher priority over a wildcard match). Can be assigned an array of methods which has the same
    * result as adding the same route with different methods manually.
    */
  var method: HTTP_METHODS_PARTIAL | (js.Array[HTTP_METHODS_PARTIAL | String]) | String
  
  /**
    * additional route options. The options value can be an object or a function that returns an object using the signature function(server) where server is the server the route is being added to
    * and this is bound to the current realm's bind option.
    */
  var options: js.UndefOr[
    RouteOptions[Refs] | (js.Function1[/* server */ Server_[ServerApplicationState], RouteOptions[Refs]])
  ] = js.undefined
  
  /**
    * (required) the absolute path used to match incoming requests (must begin with '/'). Incoming requests are compared to the configured paths based on the server's router configuration. The path
    * can include named parameters enclosed in {} which will be matched against literal values in the request as described in Path parameters. For context [See
    * docs](https://github.com/hapijs/hapi/blob/master/API.md#-serverrouteroute) For context [See docs](https://github.com/hapijs/hapi/blob/master/API.md#path-parameters)
    */
  var path: String
  
  /**
    * route custom rules object. The object is passed to each rules processor registered with server.rules(). Cannot be used if route.options.rules is defined.
    */
  var rules: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: Refs['Rules'] */ js.Any
  ] = js.undefined
  
  /**
    * (optional) a domain string or an array of domain strings for limiting the route to only requests with a matching host header field. Matching is done against the hostname part of the header
    * only (excluding the port). Defaults to all hosts.
    */
  var vhost: js.UndefOr[String | js.Array[String]] = js.undefined
}
object ServerRoute {
  
  inline def apply[Refs /* <: ReqRef */](method: HTTP_METHODS_PARTIAL | (js.Array[HTTP_METHODS_PARTIAL | String]) | String, path: String): ServerRoute[Refs] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerRoute[Refs]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerRoute[?], Refs /* <: ReqRef */] (val x: Self & ServerRoute[Refs]) extends AnyVal {
    
    inline def setHandler(value: (Method[Refs, ReturnValue[Refs]]) | HandlerDecorations): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    inline def setMethod(value: HTTP_METHODS_PARTIAL | (js.Array[HTTP_METHODS_PARTIAL | String]) | String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodVarargs(value: (HTTP_METHODS_PARTIAL | String)*): Self = StObject.set(x, "method", js.Array(value*))
    
    inline def setOptions(
      value: RouteOptions[Refs] | (js.Function1[/* server */ Server_[ServerApplicationState], RouteOptions[Refs]])
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsFunction1(value: /* server */ Server_[ServerApplicationState] => RouteOptions[Refs]): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRules(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Refs['Rules'] */ js.Any
    ): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setVhost(value: String | js.Array[String]): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
    
    inline def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
    
    inline def setVhostVarargs(value: String*): Self = StObject.set(x, "vhost", js.Array(value*))
  }
}
