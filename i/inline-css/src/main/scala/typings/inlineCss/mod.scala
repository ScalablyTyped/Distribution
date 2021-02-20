package typings.inlineCss

import typings.bluebird.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inline-css", JSImport.Namespace)
  @js.native
  def apply(html: String, options: Options): ^[String] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var applyLinkTags: js.UndefOr[Boolean] = js.native
    
    var applyStyleTags: js.UndefOr[Boolean] = js.native
    
    var applyTableAttributes: js.UndefOr[Boolean] = js.native
    
    var applyWidthAttributes: js.UndefOr[Boolean] = js.native
    
    var extraCss: js.UndefOr[String] = js.native
    
    var preserveMediaQueries: js.UndefOr[Boolean] = js.native
    
    var removeHtmlSelectors: js.UndefOr[Boolean] = js.native
    
    var removeLinkTags: js.UndefOr[Boolean] = js.native
    
    var removeStyleTags: js.UndefOr[Boolean] = js.native
    
    var url: String = js.native
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
