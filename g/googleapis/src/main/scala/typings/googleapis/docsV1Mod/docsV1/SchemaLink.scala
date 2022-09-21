package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLink extends StObject {
  
  /**
    * The ID of a bookmark in this document.
    */
  var bookmarkId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of a heading in this document.
    */
  var headingId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An external URL.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaLink {
  
  inline def apply(): SchemaLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLink]
  }
  
  extension [Self <: SchemaLink](x: Self) {
    
    inline def setBookmarkId(value: String): Self = StObject.set(x, "bookmarkId", value.asInstanceOf[js.Any])
    
    inline def setBookmarkIdNull: Self = StObject.set(x, "bookmarkId", null)
    
    inline def setBookmarkIdUndefined: Self = StObject.set(x, "bookmarkId", js.undefined)
    
    inline def setHeadingId(value: String): Self = StObject.set(x, "headingId", value.asInstanceOf[js.Any])
    
    inline def setHeadingIdNull: Self = StObject.set(x, "headingId", null)
    
    inline def setHeadingIdUndefined: Self = StObject.set(x, "headingId", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
