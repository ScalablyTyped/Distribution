package typings.inlineCss

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(html: String, options: Options): typings.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[String]]
  
  @JSImport("inline-css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var applyLinkTags: js.UndefOr[Boolean] = js.undefined
    
    var applyStyleTags: js.UndefOr[Boolean] = js.undefined
    
    var applyTableAttributes: js.UndefOr[Boolean] = js.undefined
    
    var applyWidthAttributes: js.UndefOr[Boolean] = js.undefined
    
    var extraCss: js.UndefOr[String] = js.undefined
    
    var preserveMediaQueries: js.UndefOr[Boolean] = js.undefined
    
    var removeHtmlSelectors: js.UndefOr[Boolean] = js.undefined
    
    var removeLinkTags: js.UndefOr[Boolean] = js.undefined
    
    var removeStyleTags: js.UndefOr[Boolean] = js.undefined
    
    var url: String
  }
  object Options {
    
    inline def apply(url: String): Options = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setApplyLinkTags(value: Boolean): Self = StObject.set(x, "applyLinkTags", value.asInstanceOf[js.Any])
      
      inline def setApplyLinkTagsUndefined: Self = StObject.set(x, "applyLinkTags", js.undefined)
      
      inline def setApplyStyleTags(value: Boolean): Self = StObject.set(x, "applyStyleTags", value.asInstanceOf[js.Any])
      
      inline def setApplyStyleTagsUndefined: Self = StObject.set(x, "applyStyleTags", js.undefined)
      
      inline def setApplyTableAttributes(value: Boolean): Self = StObject.set(x, "applyTableAttributes", value.asInstanceOf[js.Any])
      
      inline def setApplyTableAttributesUndefined: Self = StObject.set(x, "applyTableAttributes", js.undefined)
      
      inline def setApplyWidthAttributes(value: Boolean): Self = StObject.set(x, "applyWidthAttributes", value.asInstanceOf[js.Any])
      
      inline def setApplyWidthAttributesUndefined: Self = StObject.set(x, "applyWidthAttributes", js.undefined)
      
      inline def setExtraCss(value: String): Self = StObject.set(x, "extraCss", value.asInstanceOf[js.Any])
      
      inline def setExtraCssUndefined: Self = StObject.set(x, "extraCss", js.undefined)
      
      inline def setPreserveMediaQueries(value: Boolean): Self = StObject.set(x, "preserveMediaQueries", value.asInstanceOf[js.Any])
      
      inline def setPreserveMediaQueriesUndefined: Self = StObject.set(x, "preserveMediaQueries", js.undefined)
      
      inline def setRemoveHtmlSelectors(value: Boolean): Self = StObject.set(x, "removeHtmlSelectors", value.asInstanceOf[js.Any])
      
      inline def setRemoveHtmlSelectorsUndefined: Self = StObject.set(x, "removeHtmlSelectors", js.undefined)
      
      inline def setRemoveLinkTags(value: Boolean): Self = StObject.set(x, "removeLinkTags", value.asInstanceOf[js.Any])
      
      inline def setRemoveLinkTagsUndefined: Self = StObject.set(x, "removeLinkTags", js.undefined)
      
      inline def setRemoveStyleTags(value: Boolean): Self = StObject.set(x, "removeStyleTags", value.asInstanceOf[js.Any])
      
      inline def setRemoveStyleTagsUndefined: Self = StObject.set(x, "removeStyleTags", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
