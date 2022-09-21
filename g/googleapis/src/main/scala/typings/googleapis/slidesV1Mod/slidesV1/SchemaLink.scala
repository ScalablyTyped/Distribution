package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLink extends StObject {
  
  /**
    * If set, indicates this is a link to the specific page in this presentation with this ID. A page with this ID may not exist.
    */
  var pageObjectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set, indicates this is a link to a slide in this presentation, addressed by its position.
    */
  var relativeLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set, indicates this is a link to the slide at this zero-based index in the presentation. There may not be a slide at this index.
    */
  var slideIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * If set, indicates this is a link to the external web page at this URL.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaLink {
  
  inline def apply(): SchemaLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLink]
  }
  
  extension [Self <: SchemaLink](x: Self) {
    
    inline def setPageObjectId(value: String): Self = StObject.set(x, "pageObjectId", value.asInstanceOf[js.Any])
    
    inline def setPageObjectIdNull: Self = StObject.set(x, "pageObjectId", null)
    
    inline def setPageObjectIdUndefined: Self = StObject.set(x, "pageObjectId", js.undefined)
    
    inline def setRelativeLink(value: String): Self = StObject.set(x, "relativeLink", value.asInstanceOf[js.Any])
    
    inline def setRelativeLinkNull: Self = StObject.set(x, "relativeLink", null)
    
    inline def setRelativeLinkUndefined: Self = StObject.set(x, "relativeLink", js.undefined)
    
    inline def setSlideIndex(value: Double): Self = StObject.set(x, "slideIndex", value.asInstanceOf[js.Any])
    
    inline def setSlideIndexNull: Self = StObject.set(x, "slideIndex", null)
    
    inline def setSlideIndexUndefined: Self = StObject.set(x, "slideIndex", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
