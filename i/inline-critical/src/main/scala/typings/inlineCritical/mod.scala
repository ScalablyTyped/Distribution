package typings.inlineCritical

import typings.inlineCritical.inlineCriticalBooleans.`false`
import typings.inlineCritical.inlineCriticalStrings.body
import typings.inlineCritical.inlineCriticalStrings.head
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param html The HTML to use to inline critical styles.
    * @param styles The styles to inline.
    * @param options Optional configuration object.
    * @example
    * const html = fs.readFileSync('test/fixtures/index.html', 'utf8')
    * const critical = fs.readFileSync('tests/fixtures/critical.css', 'utf8')
    * const inlined = inline(html, critical)
    *
    * // ignoring stylesheets matching regex
    * const inlined = inline(html, critical, {ignore: [/bootstrap/]})
    */
  inline def apply(html: String, styles: String): String = (^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(html: String, styles: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("inline-critical", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * The path to be used when extracting styles to find the files references by `href` attributes.
      * @default process.cwd
      */
    var basePath: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to remove the inlined styles from any stylesheets referenced in the HTML.
      * @default false
      */
    var extract: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Stylesheets to ignore when inlining.
      * @default []
      * @example [/bootstrap/]
      */
    var ignore: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
    
    /**
      * Whether to minify the styles before inlining.
      * @default true
      */
    var minify: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The position of the `noscript` fallback.
      * * `body`: end of body
      * * `head`: end of head
      * * `false`: no `noscript`
      * @default 'body'
      */
    var noscript: js.UndefOr[body | head | `false`] = js.undefined
    
    /**
      * Whether to add loadCSS if it's not already loaded.
      * @default true
      */
    var polyfill: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Paths to use in the `href` tag of the `link` elements.
      * @default false
      */
    var replaceStylesheets: js.UndefOr[js.Array[String] | `false`] = js.undefined
    
    /** The selector for the element used by loadCSS as a reference for inlining. */
    var selector: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setExtract(value: Boolean): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
      
      inline def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
      
      inline def setIgnore(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: (String | RegExp)*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setNoscript(value: body | head | `false`): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
      
      inline def setNoscriptUndefined: Self = StObject.set(x, "noscript", js.undefined)
      
      inline def setPolyfill(value: Boolean): Self = StObject.set(x, "polyfill", value.asInstanceOf[js.Any])
      
      inline def setPolyfillUndefined: Self = StObject.set(x, "polyfill", js.undefined)
      
      inline def setReplaceStylesheets(value: js.Array[String] | `false`): Self = StObject.set(x, "replaceStylesheets", value.asInstanceOf[js.Any])
      
      inline def setReplaceStylesheetsUndefined: Self = StObject.set(x, "replaceStylesheets", js.undefined)
      
      inline def setReplaceStylesheetsVarargs(value: String*): Self = StObject.set(x, "replaceStylesheets", js.Array(value :_*))
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    }
  }
}
