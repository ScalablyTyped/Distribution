package typings.hapi.mod

import typings.hapi.hapiStrings.Asterisk
import typings.hapi.hapiStrings.ignore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteOptionsCors extends StObject {
  
  /**
    * a strings array of additional headers to exposedHeaders. Use this to keep the default headers in place.
    */
  var additionalExposedHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * a strings array of additional headers to headers. Use this to keep the default headers in place.
    */
  var additionalHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * if true, allows user credentials to be sent ('Access-Control-Allow-Credentials'). Defaults to false.
    */
  var credentials: js.UndefOr[Boolean] = js.undefined
  
  /**
    * a strings array of exposed headers ('Access-Control-Expose-Headers'). Defaults to ['WWW-Authenticate', 'Server-Authorization'].
    */
  var exposedHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * a strings array of allowed headers ('Access-Control-Allow-Headers'). Defaults to ['Accept', 'Authorization', 'Content-Type', 'If-None-Match'].
    */
  var headers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * number of seconds the browser should cache the CORS response ('Access-Control-Max-Age'). The greater the value, the longer it will take before the browser checks for changes in policy.
    * Defaults to 86400 (one day).
    */
  var maxAge: js.UndefOr[Double] = js.undefined
  
  /**
    * an array of allowed origin servers strings ('Access-Control-Allow-Origin'). The array can contain any combination of fully qualified origins along with origin strings containing a wildcard '*'
    * character, or a single '*' origin string. If set to 'ignore', any incoming Origin header is ignored (present or not) and the 'Access-Control-Allow-Origin' header is set to '*'. Defaults to any
    * origin ['*'].
    */
  var origin: js.UndefOr[js.Array[String] | Asterisk | ignore] = js.undefined
}
object RouteOptionsCors {
  
  inline def apply(): RouteOptionsCors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteOptionsCors]
  }
  
  extension [Self <: RouteOptionsCors](x: Self) {
    
    inline def setAdditionalExposedHeaders(value: js.Array[String]): Self = StObject.set(x, "additionalExposedHeaders", value.asInstanceOf[js.Any])
    
    inline def setAdditionalExposedHeadersUndefined: Self = StObject.set(x, "additionalExposedHeaders", js.undefined)
    
    inline def setAdditionalExposedHeadersVarargs(value: String*): Self = StObject.set(x, "additionalExposedHeaders", js.Array(value*))
    
    inline def setAdditionalHeaders(value: js.Array[String]): Self = StObject.set(x, "additionalHeaders", value.asInstanceOf[js.Any])
    
    inline def setAdditionalHeadersUndefined: Self = StObject.set(x, "additionalHeaders", js.undefined)
    
    inline def setAdditionalHeadersVarargs(value: String*): Self = StObject.set(x, "additionalHeaders", js.Array(value*))
    
    inline def setCredentials(value: Boolean): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setExposedHeaders(value: js.Array[String]): Self = StObject.set(x, "exposedHeaders", value.asInstanceOf[js.Any])
    
    inline def setExposedHeadersUndefined: Self = StObject.set(x, "exposedHeaders", js.undefined)
    
    inline def setExposedHeadersVarargs(value: String*): Self = StObject.set(x, "exposedHeaders", js.Array(value*))
    
    inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setOrigin(value: js.Array[String] | Asterisk | ignore): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setOriginVarargs(value: String*): Self = StObject.set(x, "origin", js.Array(value*))
  }
}
