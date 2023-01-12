package typings.inlineCss

import typings.std.Exclude
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Inline your CSS properties into the `style` attribute in an html file. Useful for emails.
    *
    * @example
    * import inlineCss = require('inline-css');
    *
    * const html = "<style>div{color:red;}</style><div/>";
    *
    * inlineCss(html, options)
    *     .then((html) => { console.log(html); });
    */
  inline def apply(html: String, options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("inline-css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CheerioParserOptions = Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<inline-css.anon.FnCall>[1] */ js.Any, 
    Unit
  ]
  
  trait CodeBlockSpec extends StObject {
    
    var end: String
    
    var start: String
  }
  object CodeBlockSpec {
    
    inline def apply(end: String, start: String): CodeBlockSpec = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeBlockSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeBlockSpec] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped std.Parameters<inline-css.anon.FnCall>[1] extends undefined ? never : std.Parameters<inline-css.anon.FnCall>[1] */ trait Options extends StObject {
    
    /**
      * Whether to resolve `<link rel="stylesheet">` tags and inline the resulting styles.
      *
      * @default true
      */
    var applyLinkTags: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to inline styles in `<style></style>`.
      *
      * @default true
      */
    var applyStyleTags: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to apply the `border`, `cellpadding` and `cellspacing` attributes to table elements.
      *
      * @default false
      */
    var applyTableAttributes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to use any CSS pixel widths to create `width` attributes on elements.
      *
      * @default false
      */
    var applyWidthAttributes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An object that specifies fenced code blocks that should be ignored during parsing and inlining.
      * For example, Handlebars (hbs) templates are `HBS: {start: '{{', end: '}}'}`. `codeBlocks` can fix
      * problems where otherwise inline-css might interpret code like `<=` as HTML, when it is meant to
      * be template language code.
      *
      * @default { EJS: { start: '<%', end: '%>' }, HBS: { start: '{{', end: '}}' } }
      */
    var codeBlocks: js.UndefOr[Record[String, CodeBlockSpec]] = js.undefined
    
    /**
      * Extra css to apply to the file.
      *
      * @default ""
      */
    var extraCss: js.UndefOr[String] = js.undefined
    
    /**
      * Preserves all media queries (and contained styles) within `<style></style>` tags as a refinement when
      * `removeStyleTags` is `true`. Other styles are removed.
      *
      * @default false
      */
    var preserveMediaQueries: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to remove the `class` and `id` attributes from the markup.
      *
      * @default false
      */
    var removeHtmlSelectors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to remove the original `<link rel="stylesheet">` tags after (possibly) inlining the css from them.
      *
      * @default true
      */
    var removeLinkTags: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to remove the original `<style></style>` tags after (possibly) inlining the css from them.
      *
      * @default true
      */
    var removeStyleTags: js.UndefOr[Boolean] = js.undefined
    
    /**
      * How to resolve hrefs.
      */
    var url: String
  }
  object Options {
    
    inline def apply(url: String): Options = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setApplyLinkTags(value: Boolean): Self = StObject.set(x, "applyLinkTags", value.asInstanceOf[js.Any])
      
      inline def setApplyLinkTagsUndefined: Self = StObject.set(x, "applyLinkTags", js.undefined)
      
      inline def setApplyStyleTags(value: Boolean): Self = StObject.set(x, "applyStyleTags", value.asInstanceOf[js.Any])
      
      inline def setApplyStyleTagsUndefined: Self = StObject.set(x, "applyStyleTags", js.undefined)
      
      inline def setApplyTableAttributes(value: Boolean): Self = StObject.set(x, "applyTableAttributes", value.asInstanceOf[js.Any])
      
      inline def setApplyTableAttributesUndefined: Self = StObject.set(x, "applyTableAttributes", js.undefined)
      
      inline def setApplyWidthAttributes(value: Boolean): Self = StObject.set(x, "applyWidthAttributes", value.asInstanceOf[js.Any])
      
      inline def setApplyWidthAttributesUndefined: Self = StObject.set(x, "applyWidthAttributes", js.undefined)
      
      inline def setCodeBlocks(value: Record[String, CodeBlockSpec]): Self = StObject.set(x, "codeBlocks", value.asInstanceOf[js.Any])
      
      inline def setCodeBlocksUndefined: Self = StObject.set(x, "codeBlocks", js.undefined)
      
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
