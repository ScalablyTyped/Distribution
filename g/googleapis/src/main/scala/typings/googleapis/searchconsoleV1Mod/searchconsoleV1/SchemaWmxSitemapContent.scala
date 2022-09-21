package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWmxSitemapContent extends StObject {
  
  /**
    * *Deprecated; do not use.*
    */
  var indexed: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of URLs in the sitemap (of the content type).
    */
  var submitted: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The specific type of content in this sitemap. For example: `web`.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaWmxSitemapContent {
  
  inline def apply(): SchemaWmxSitemapContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWmxSitemapContent]
  }
  
  extension [Self <: SchemaWmxSitemapContent](x: Self) {
    
    inline def setIndexed(value: String): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
    
    inline def setIndexedNull: Self = StObject.set(x, "indexed", null)
    
    inline def setIndexedUndefined: Self = StObject.set(x, "indexed", js.undefined)
    
    inline def setSubmitted(value: String): Self = StObject.set(x, "submitted", value.asInstanceOf[js.Any])
    
    inline def setSubmittedNull: Self = StObject.set(x, "submitted", null)
    
    inline def setSubmittedUndefined: Self = StObject.set(x, "submitted", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
