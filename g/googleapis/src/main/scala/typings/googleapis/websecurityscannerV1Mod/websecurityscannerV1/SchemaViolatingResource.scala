package typings.googleapis.websecurityscannerV1Mod.websecurityscannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaViolatingResource extends StObject {
  
  /**
    * The MIME type of this resource.
    */
  var contentType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL of this violating resource.
    */
  var resourceUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaViolatingResource {
  
  inline def apply(): SchemaViolatingResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaViolatingResource]
  }
  
  extension [Self <: SchemaViolatingResource](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setResourceUrl(value: String): Self = StObject.set(x, "resourceUrl", value.asInstanceOf[js.Any])
    
    inline def setResourceUrlNull: Self = StObject.set(x, "resourceUrl", null)
    
    inline def setResourceUrlUndefined: Self = StObject.set(x, "resourceUrl", js.undefined)
  }
}
