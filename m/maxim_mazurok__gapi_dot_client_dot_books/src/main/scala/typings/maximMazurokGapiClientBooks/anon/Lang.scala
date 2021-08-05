package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lang extends StObject {
  
  /** The language of the information url and description. */
  var lang: js.UndefOr[String] = js.undefined
  
  /** The URL for the preview image information. */
  var previewImageUrl: js.UndefOr[String] = js.undefined
  
  /** The description for this location. */
  var snippet: js.UndefOr[String] = js.undefined
  
  /** The URL for information for this location. Ex: wikipedia link. */
  var snippetUrl: js.UndefOr[String] = js.undefined
  
  /** The display title and localized canonical name to use when searching for this entity on Google search. */
  var title: js.UndefOr[String] = js.undefined
}
object Lang {
  
  inline def apply(): Lang = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lang]
  }
  
  extension [Self <: Lang](x: Self) {
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setPreviewImageUrl(value: String): Self = StObject.set(x, "previewImageUrl", value.asInstanceOf[js.Any])
    
    inline def setPreviewImageUrlUndefined: Self = StObject.set(x, "previewImageUrl", js.undefined)
    
    inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setSnippetUrl(value: String): Self = StObject.set(x, "snippetUrl", value.asInstanceOf[js.Any])
    
    inline def setSnippetUrlUndefined: Self = StObject.set(x, "snippetUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
