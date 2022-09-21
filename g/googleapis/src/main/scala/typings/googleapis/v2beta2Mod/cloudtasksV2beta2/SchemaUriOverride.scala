package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUriOverride extends StObject {
  
  /**
    * Host override. When specified, the host part of url will be overridden. For example, if the original Uri is "https://www.google.com", and host is set to "example.net", the overridden Uri will be "https://example.net".
    */
  var host: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uri path. Will be used as the path for the current Uri (replaces any existing path of the task url).
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Port override. When specified, the port part of Uri will be replaced by the provided value. For instance, for a Uri http://www.google.com/foo and port=123 the overridden Uri becomes http://www.google.com:123/foo.
    */
  var port: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uri Query. Will replace the query part of the task uri.
    */
  var query: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Scheme override. When specified, the Uri scheme is replaced by the provided value.
    */
  var scheme: js.UndefOr[String | Null] = js.undefined
}
object SchemaUriOverride {
  
  inline def apply(): SchemaUriOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUriOverride]
  }
  
  extension [Self <: SchemaUriOverride](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostNull: Self = StObject.set(x, "host", null)
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeNull: Self = StObject.set(x, "scheme", null)
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
