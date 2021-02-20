package typings.markdownItAnchor

import typings.markdownIt.libMod.MarkdownIt
import typings.markdownIt.tokenMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("markdown-it-anchor", JSImport.Namespace)
  @js.native
  def apply(md: MarkdownIt, opts: AnchorOptions): Unit = js.native
  
  @js.native
  trait AnchorInfo extends StObject {
    
    var slug: String = js.native
    
    var title: String = js.native
  }
  object AnchorInfo {
    
    @scala.inline
    def apply(slug: String, title: String): AnchorInfo = {
      val __obj = js.Dynamic.literal(slug = slug.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnchorInfo]
    }
    
    @scala.inline
    implicit class AnchorInfoMutableBuilder[Self <: AnchorInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AnchorOptions extends StObject {
    
    var callback: js.UndefOr[js.Function2[/* token */ ^, /* anchor_info */ AnchorInfo, Unit]] = js.native
    
    var level: js.UndefOr[Double] = js.native
    
    var permalink: js.UndefOr[Boolean] = js.native
    
    var permalinkBefore: js.UndefOr[Boolean] = js.native
    
    var permalinkClass: js.UndefOr[String] = js.native
    
    var permalinkHref: js.UndefOr[js.Function1[/* slug */ String, String]] = js.native
    
    var permalinkSymbol: js.UndefOr[String] = js.native
    
    var renderPermalink: js.UndefOr[
        js.Function4[
          /* slug */ String, 
          /* opts */ this.type, 
          /* state */ typings.markdownIt.parserCoreMod.^, 
          /* idx */ Double, 
          Unit
        ]
      ] = js.native
    
    var slugify: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
  }
  object AnchorOptions {
    
    @scala.inline
    def apply(): AnchorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorOptions]
    }
    
    @scala.inline
    implicit class AnchorOptionsMutableBuilder[Self <: AnchorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: (/* token */ ^, /* anchor_info */ AnchorInfo) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setPermalink(value: Boolean): Self = StObject.set(x, "permalink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermalinkBefore(value: Boolean): Self = StObject.set(x, "permalinkBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermalinkBeforeUndefined: Self = StObject.set(x, "permalinkBefore", js.undefined)
      
      @scala.inline
      def setPermalinkClass(value: String): Self = StObject.set(x, "permalinkClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermalinkClassUndefined: Self = StObject.set(x, "permalinkClass", js.undefined)
      
      @scala.inline
      def setPermalinkHref(value: /* slug */ String => String): Self = StObject.set(x, "permalinkHref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPermalinkHrefUndefined: Self = StObject.set(x, "permalinkHref", js.undefined)
      
      @scala.inline
      def setPermalinkSymbol(value: String): Self = StObject.set(x, "permalinkSymbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermalinkSymbolUndefined: Self = StObject.set(x, "permalinkSymbol", js.undefined)
      
      @scala.inline
      def setPermalinkUndefined: Self = StObject.set(x, "permalink", js.undefined)
      
      @scala.inline
      def setRenderPermalink(
        value: (/* slug */ String, AnchorOptions, /* state */ typings.markdownIt.parserCoreMod.^, /* idx */ Double) => Unit
      ): Self = StObject.set(x, "renderPermalink", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRenderPermalinkUndefined: Self = StObject.set(x, "renderPermalink", js.undefined)
      
      @scala.inline
      def setSlugify(value: /* str */ String => String): Self = StObject.set(x, "slugify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSlugifyUndefined: Self = StObject.set(x, "slugify", js.undefined)
    }
  }
}
