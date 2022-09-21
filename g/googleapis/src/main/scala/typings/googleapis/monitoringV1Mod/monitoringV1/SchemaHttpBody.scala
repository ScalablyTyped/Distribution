package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpBody extends StObject {
  
  /**
    * The HTTP Content-Type header value specifying the content type of the body.
    */
  var contentType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The HTTP request/response body as raw binary.
    */
  var data: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Application specific response metadata. Must be set in the first response for streaming APIs.
    */
  var extensions: js.UndefOr[js.Array[StringDictionary[Any]] | Null] = js.undefined
}
object SchemaHttpBody {
  
  inline def apply(): SchemaHttpBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpBody]
  }
  
  extension [Self <: SchemaHttpBody](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setExtensions(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "extensions", js.Array(value*))
  }
}
