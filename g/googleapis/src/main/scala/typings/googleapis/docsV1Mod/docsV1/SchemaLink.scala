package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to another portion of a document or an external URL resource.
  */
trait SchemaLink extends StObject {
  
  /**
    * The ID of a bookmark in this document.
    */
  var bookmarkId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of a heading in this document.
    */
  var headingId: js.UndefOr[String] = js.undefined
  
  /**
    * An external URL.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaLink {
  
  @scala.inline
  def apply(): SchemaLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLink]
  }
  
  @scala.inline
  implicit class SchemaLinkMutableBuilder[Self <: SchemaLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBookmarkId(value: String): Self = StObject.set(x, "bookmarkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookmarkIdUndefined: Self = StObject.set(x, "bookmarkId", js.undefined)
    
    @scala.inline
    def setHeadingId(value: String): Self = StObject.set(x, "headingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingIdUndefined: Self = StObject.set(x, "headingId", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
