package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCrawledUrl extends StObject {
  
  /**
    * The body of the request that was used to visit the URL.
    */
  var body: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The http method of the request that was used to visit the URL, in uppercase.
    */
  var httpMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL that was crawled.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaCrawledUrl {
  
  inline def apply(): SchemaCrawledUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCrawledUrl]
  }
  
  extension [Self <: SchemaCrawledUrl](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    inline def setHttpMethodNull: Self = StObject.set(x, "httpMethod", null)
    
    inline def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
