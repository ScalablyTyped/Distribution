package typings.markdownItAnchor

import typings.markdownIt.libMod.MarkdownIt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(md: MarkdownIt, opts: AnchorOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(md.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("markdown-it-anchor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AnchorInfo extends StObject {
    
    var slug: String
    
    var title: String
  }
  object AnchorInfo {
    
    inline def apply(slug: String, title: String): AnchorInfo = {
      val __obj = js.Dynamic.literal(slug = slug.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnchorInfo]
    }
    
    extension [Self <: AnchorInfo](x: Self) {
      
      inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnchorOptions extends StObject {
    
    var callback: js.UndefOr[
        js.Function2[/* token */ typings.markdownIt.tokenMod.^, /* anchor_info */ AnchorInfo, Unit]
      ] = js.undefined
    
    var level: js.UndefOr[Double] = js.undefined
    
    var permalink: js.UndefOr[Boolean] = js.undefined
    
    var permalinkBefore: js.UndefOr[Boolean] = js.undefined
    
    var permalinkClass: js.UndefOr[String] = js.undefined
    
    var permalinkHref: js.UndefOr[js.Function1[/* slug */ String, String]] = js.undefined
    
    var permalinkSymbol: js.UndefOr[String] = js.undefined
    
    var renderPermalink: js.UndefOr[
        js.Function4[
          /* slug */ String, 
          /* opts */ this.type, 
          /* state */ typings.markdownIt.parserCoreMod.^, 
          /* idx */ Double, 
          Unit
        ]
      ] = js.undefined
    
    var slugify: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  }
  object AnchorOptions {
    
    inline def apply(): AnchorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorOptions]
    }
    
    extension [Self <: AnchorOptions](x: Self) {
      
      inline def setCallback(value: (/* token */ typings.markdownIt.tokenMod.^, /* anchor_info */ AnchorInfo) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setPermalink(value: Boolean): Self = StObject.set(x, "permalink", value.asInstanceOf[js.Any])
      
      inline def setPermalinkBefore(value: Boolean): Self = StObject.set(x, "permalinkBefore", value.asInstanceOf[js.Any])
      
      inline def setPermalinkBeforeUndefined: Self = StObject.set(x, "permalinkBefore", js.undefined)
      
      inline def setPermalinkClass(value: String): Self = StObject.set(x, "permalinkClass", value.asInstanceOf[js.Any])
      
      inline def setPermalinkClassUndefined: Self = StObject.set(x, "permalinkClass", js.undefined)
      
      inline def setPermalinkHref(value: /* slug */ String => String): Self = StObject.set(x, "permalinkHref", js.Any.fromFunction1(value))
      
      inline def setPermalinkHrefUndefined: Self = StObject.set(x, "permalinkHref", js.undefined)
      
      inline def setPermalinkSymbol(value: String): Self = StObject.set(x, "permalinkSymbol", value.asInstanceOf[js.Any])
      
      inline def setPermalinkSymbolUndefined: Self = StObject.set(x, "permalinkSymbol", js.undefined)
      
      inline def setPermalinkUndefined: Self = StObject.set(x, "permalink", js.undefined)
      
      inline def setRenderPermalink(
        value: (/* slug */ String, AnchorOptions, /* state */ typings.markdownIt.parserCoreMod.^, /* idx */ Double) => Unit
      ): Self = StObject.set(x, "renderPermalink", js.Any.fromFunction4(value))
      
      inline def setRenderPermalinkUndefined: Self = StObject.set(x, "renderPermalink", js.undefined)
      
      inline def setSlugify(value: /* str */ String => String): Self = StObject.set(x, "slugify", js.Any.fromFunction1(value))
      
      inline def setSlugifyUndefined: Self = StObject.set(x, "slugify", js.undefined)
    }
  }
}
