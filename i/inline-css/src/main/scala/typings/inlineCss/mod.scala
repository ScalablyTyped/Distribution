package typings.inlineCss

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(html: String, options: Options): typings.bluebird.mod.^[String] = (^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[String]]
  
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
    
    @scala.inline
    def apply(url: String): Options = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyLinkTags(value: Boolean): Self = StObject.set(x, "applyLinkTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyLinkTagsUndefined: Self = StObject.set(x, "applyLinkTags", js.undefined)
      
      @scala.inline
      def setApplyStyleTags(value: Boolean): Self = StObject.set(x, "applyStyleTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyStyleTagsUndefined: Self = StObject.set(x, "applyStyleTags", js.undefined)
      
      @scala.inline
      def setApplyTableAttributes(value: Boolean): Self = StObject.set(x, "applyTableAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyTableAttributesUndefined: Self = StObject.set(x, "applyTableAttributes", js.undefined)
      
      @scala.inline
      def setApplyWidthAttributes(value: Boolean): Self = StObject.set(x, "applyWidthAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyWidthAttributesUndefined: Self = StObject.set(x, "applyWidthAttributes", js.undefined)
      
      @scala.inline
      def setExtraCss(value: String): Self = StObject.set(x, "extraCss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraCssUndefined: Self = StObject.set(x, "extraCss", js.undefined)
      
      @scala.inline
      def setPreserveMediaQueries(value: Boolean): Self = StObject.set(x, "preserveMediaQueries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveMediaQueriesUndefined: Self = StObject.set(x, "preserveMediaQueries", js.undefined)
      
      @scala.inline
      def setRemoveHtmlSelectors(value: Boolean): Self = StObject.set(x, "removeHtmlSelectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveHtmlSelectorsUndefined: Self = StObject.set(x, "removeHtmlSelectors", js.undefined)
      
      @scala.inline
      def setRemoveLinkTags(value: Boolean): Self = StObject.set(x, "removeLinkTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveLinkTagsUndefined: Self = StObject.set(x, "removeLinkTags", js.undefined)
      
      @scala.inline
      def setRemoveStyleTags(value: Boolean): Self = StObject.set(x, "removeStyleTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveStyleTagsUndefined: Self = StObject.set(x, "removeStyleTags", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
