package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRichLinkProperties extends StObject {
  
  /**
    * Output only. The [MIME type](https://developers.google.com/drive/api/v3/mime-types) of the RichLink, if there is one (i.e., when it is a file in Drive).
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The title of the RichLink as displayed in the link. This title matches the title of the linked resource at the time of the insertion or last update of the link. This field is always present.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The URI to the RichLink. This is always present.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaRichLinkProperties {
  
  inline def apply(): SchemaRichLinkProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRichLinkProperties]
  }
  
  extension [Self <: SchemaRichLinkProperties](x: Self) {
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
