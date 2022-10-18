package typings.markdownItAnchor

import typings.markdownIt.libMod.MarkdownIt
import typings.markdownIt.libTokenMod.^
import typings.markdownItAnchor.markdownItAnchorBooleans.`false`
import typings.markdownItAnchor.markdownItAnchorStrings.`aria-describedby`
import typings.markdownItAnchor.markdownItAnchorStrings.`aria-label`
import typings.markdownItAnchor.markdownItAnchorStrings.`aria-labelledby`
import typings.markdownItAnchor.markdownItAnchorStrings.`visually-hidden`
import typings.markdownItAnchor.markdownItAnchorStrings.after
import typings.markdownItAnchor.markdownItAnchorStrings.before
import typings.markdownItAnchor.mod.anchor.AnchorOptions
import typings.markdownItAnchor.mod.anchor.AriaHiddenPermalinkOptions
import typings.markdownItAnchor.mod.anchor.HeaderLinkPermalinkOptions
import typings.markdownItAnchor.mod.anchor.LinkAfterHeaderPermalinkOptions
import typings.markdownItAnchor.mod.anchor.LinkInsideHeaderPermalinkOptions
import typings.markdownItAnchor.mod.anchor.PermalinkGenerator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(md: MarkdownIt): Unit = ^.asInstanceOf[js.Dynamic].apply(md.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def apply(md: MarkdownIt, opts: AnchorOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(md.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("markdown-it-anchor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object permalink {
      
      @JSImport("markdown-it-anchor", "default.permalink")
      @js.native
      val ^ : js.Any = js.native
      
      inline def ariaHidden(): PermalinkGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("ariaHidden")().asInstanceOf[PermalinkGenerator]
      inline def ariaHidden(opts: AriaHiddenPermalinkOptions): PermalinkGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("ariaHidden")(opts.asInstanceOf[js.Any]).asInstanceOf[PermalinkGenerator]
      
      inline def headerLink(): PermalinkGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("headerLink")().asInstanceOf[PermalinkGenerator]
      inline def headerLink(opts: HeaderLinkPermalinkOptions): PermalinkGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("headerLink")(opts.asInstanceOf[js.Any]).asInstanceOf[PermalinkGenerator]
      
      inline def linkAfterHeader(): PermalinkGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("linkAfterHeader")().asInstanceOf[PermalinkGenerator]
      inline def linkAfterHeader(opts: LinkAfterHeaderPermalinkOptions): PermalinkGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("linkAfterHeader")(opts.asInstanceOf[js.Any]).asInstanceOf[PermalinkGenerator]
      
      inline def linkInsideHeader(): PermalinkGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("linkInsideHeader")().asInstanceOf[PermalinkGenerator]
      inline def linkInsideHeader(opts: LinkInsideHeaderPermalinkOptions): PermalinkGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("linkInsideHeader")(opts.asInstanceOf[js.Any]).asInstanceOf[PermalinkGenerator]
    }
  }
  
  object anchor {
    
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
      
      var callback: js.UndefOr[js.Function2[/* token */ ^, /* anchor_info */ AnchorInfo, Unit]] = js.undefined
      
      var getTokensText: js.UndefOr[js.Function1[/* tokens */ js.Array[^], String]] = js.undefined
      
      var level: js.UndefOr[Double | js.Array[Double]] = js.undefined
      
      var permalink: js.UndefOr[PermalinkGenerator] = js.undefined
      
      var slugify: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
      
      var tabIndex: js.UndefOr[Double | `false`] = js.undefined
      
      var uniqueSlugStartIndex: js.UndefOr[Double] = js.undefined
    }
    object AnchorOptions {
      
      inline def apply(): AnchorOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AnchorOptions]
      }
      
      extension [Self <: AnchorOptions](x: Self) {
        
        inline def setCallback(value: (/* token */ ^, /* anchor_info */ AnchorInfo) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
        
        inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        inline def setGetTokensText(value: /* tokens */ js.Array[^] => String): Self = StObject.set(x, "getTokensText", js.Any.fromFunction1(value))
        
        inline def setGetTokensTextUndefined: Self = StObject.set(x, "getTokensText", js.undefined)
        
        inline def setLevel(value: Double | js.Array[Double]): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
        
        inline def setLevelVarargs(value: Double*): Self = StObject.set(x, "level", js.Array(value*))
        
        inline def setPermalink(
          value: (/* slug */ String, /* opts */ PermalinkOptions, /* state */ typings.markdownIt.libRulesCoreStateCoreMod.^, /* index */ Double) => Unit
        ): Self = StObject.set(x, "permalink", js.Any.fromFunction4(value))
        
        inline def setPermalinkUndefined: Self = StObject.set(x, "permalink", js.undefined)
        
        inline def setSlugify(value: /* str */ String => String): Self = StObject.set(x, "slugify", js.Any.fromFunction1(value))
        
        inline def setSlugifyUndefined: Self = StObject.set(x, "slugify", js.undefined)
        
        inline def setTabIndex(value: Double | `false`): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
        
        inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
        
        inline def setUniqueSlugStartIndex(value: Double): Self = StObject.set(x, "uniqueSlugStartIndex", value.asInstanceOf[js.Any])
        
        inline def setUniqueSlugStartIndexUndefined: Self = StObject.set(x, "uniqueSlugStartIndex", js.undefined)
      }
    }
    
    trait AriaHiddenPermalinkOptions
      extends StObject
         with PermalinkOptions {
      
      var placement: js.UndefOr[before | after] = js.undefined
      
      var space: js.UndefOr[Boolean | String] = js.undefined
    }
    object AriaHiddenPermalinkOptions {
      
      inline def apply(): AriaHiddenPermalinkOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AriaHiddenPermalinkOptions]
      }
      
      extension [Self <: AriaHiddenPermalinkOptions](x: Self) {
        
        inline def setPlacement(value: before | after): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
        
        inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
        
        inline def setSpace(value: Boolean | String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
        
        inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      }
    }
    
    trait HeaderLinkPermalinkOptions
      extends StObject
         with PermalinkOptions {
      
      var safariReaderFix: js.UndefOr[Boolean] = js.undefined
    }
    object HeaderLinkPermalinkOptions {
      
      inline def apply(): HeaderLinkPermalinkOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HeaderLinkPermalinkOptions]
      }
      
      extension [Self <: HeaderLinkPermalinkOptions](x: Self) {
        
        inline def setSafariReaderFix(value: Boolean): Self = StObject.set(x, "safariReaderFix", value.asInstanceOf[js.Any])
        
        inline def setSafariReaderFixUndefined: Self = StObject.set(x, "safariReaderFix", js.undefined)
      }
    }
    
    trait LinkAfterHeaderPermalinkOptions
      extends StObject
         with PermalinkOptions {
      
      var assistiveText: js.UndefOr[js.Function1[/* title */ String, String]] = js.undefined
      
      var placement: js.UndefOr[before | after] = js.undefined
      
      var space: js.UndefOr[Boolean | String] = js.undefined
      
      var style: js.UndefOr[`visually-hidden` | `aria-label` | `aria-describedby` | `aria-labelledby`] = js.undefined
      
      var visuallyHiddenClass: js.UndefOr[String] = js.undefined
      
      var wrapper: js.UndefOr[(js.Tuple2[String, String]) | Null] = js.undefined
    }
    object LinkAfterHeaderPermalinkOptions {
      
      inline def apply(): LinkAfterHeaderPermalinkOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LinkAfterHeaderPermalinkOptions]
      }
      
      extension [Self <: LinkAfterHeaderPermalinkOptions](x: Self) {
        
        inline def setAssistiveText(value: /* title */ String => String): Self = StObject.set(x, "assistiveText", js.Any.fromFunction1(value))
        
        inline def setAssistiveTextUndefined: Self = StObject.set(x, "assistiveText", js.undefined)
        
        inline def setPlacement(value: before | after): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
        
        inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
        
        inline def setSpace(value: Boolean | String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
        
        inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
        
        inline def setStyle(value: `visually-hidden` | `aria-label` | `aria-describedby` | `aria-labelledby`): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        inline def setVisuallyHiddenClass(value: String): Self = StObject.set(x, "visuallyHiddenClass", value.asInstanceOf[js.Any])
        
        inline def setVisuallyHiddenClassUndefined: Self = StObject.set(x, "visuallyHiddenClass", js.undefined)
        
        inline def setWrapper(value: js.Tuple2[String, String]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
        
        inline def setWrapperNull: Self = StObject.set(x, "wrapper", null)
        
        inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
      }
    }
    
    trait LinkInsideHeaderPermalinkOptions
      extends StObject
         with PermalinkOptions {
      
      var ariaHidden: js.UndefOr[Boolean] = js.undefined
      
      var placement: js.UndefOr[before | after] = js.undefined
      
      var space: js.UndefOr[Boolean | String] = js.undefined
    }
    object LinkInsideHeaderPermalinkOptions {
      
      inline def apply(): LinkInsideHeaderPermalinkOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LinkInsideHeaderPermalinkOptions]
      }
      
      extension [Self <: LinkInsideHeaderPermalinkOptions](x: Self) {
        
        inline def setAriaHidden(value: Boolean): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
        
        inline def setAriaHiddenUndefined: Self = StObject.set(x, "ariaHidden", js.undefined)
        
        inline def setPlacement(value: before | after): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
        
        inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
        
        inline def setSpace(value: Boolean | String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
        
        inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      }
    }
    
    type PermalinkGenerator = js.Function4[
        /* slug */ String, 
        /* opts */ PermalinkOptions, 
        /* state */ typings.markdownIt.libRulesCoreStateCoreMod.^, 
        /* index */ Double, 
        Unit
      ]
    
    trait PermalinkOptions extends StObject {
      
      var `class`: js.UndefOr[String] = js.undefined
      
      var renderAttrs: js.UndefOr[RenderAttrs] = js.undefined
      
      var renderHref: js.UndefOr[RenderHref] = js.undefined
      
      var symbol: js.UndefOr[String] = js.undefined
    }
    object PermalinkOptions {
      
      inline def apply(): PermalinkOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PermalinkOptions]
      }
      
      extension [Self <: PermalinkOptions](x: Self) {
        
        inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
        
        inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
        
        inline def setRenderAttrs(
          value: (/* slug */ String, /* state */ typings.markdownIt.libRulesCoreStateCoreMod.^) => Record[String, String | Double]
        ): Self = StObject.set(x, "renderAttrs", js.Any.fromFunction2(value))
        
        inline def setRenderAttrsUndefined: Self = StObject.set(x, "renderAttrs", js.undefined)
        
        inline def setRenderHref(value: (/* slug */ String, /* state */ typings.markdownIt.libRulesCoreStateCoreMod.^) => String): Self = StObject.set(x, "renderHref", js.Any.fromFunction2(value))
        
        inline def setRenderHrefUndefined: Self = StObject.set(x, "renderHref", js.undefined)
        
        inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
        
        inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      }
    }
    
    type RenderAttrs = js.Function2[
        /* slug */ String, 
        /* state */ typings.markdownIt.libRulesCoreStateCoreMod.^, 
        Record[String, String | Double]
      ]
    
    type RenderHref = js.Function2[/* slug */ String, /* state */ typings.markdownIt.libRulesCoreStateCoreMod.^, String]
  }
}
