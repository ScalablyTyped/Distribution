package typings.inlineCritical

import typings.inlineCritical.inlineCriticalBooleans.`false`
import typings.inlineCritical.inlineCriticalStrings.body
import typings.inlineCritical.inlineCriticalStrings.head
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("inline-critical", JSImport.Namespace)
  @js.native
  def apply(html: String, styles: String): String = js.native
  @JSImport("inline-critical", JSImport.Namespace)
  @js.native
  def apply(html: String, styles: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The path to be used when extracting styles to find the files references by `href` attributes.
      * @default process.cwd
      */
    var basePath: js.UndefOr[String] = js.native
    
    /**
      * Whether to remove the inlined styles from any stylesheets referenced in the HTML.
      * @default false
      */
    var extract: js.UndefOr[Boolean] = js.native
    
    /**
      * Stylesheets to ignore when inlining.
      * @default []
      * @example [/bootstrap/]
      */
    var ignore: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
    
    /**
      * Whether to minify the styles before inlining.
      * @default true
      */
    var minify: js.UndefOr[Boolean] = js.native
    
    /**
      * The position of the `noscript` fallback.
      * * `body`: end of body
      * * `head`: end of head
      * * `false`: no `noscript`
      * @default 'body'
      */
    var noscript: js.UndefOr[body | head | `false`] = js.native
    
    /**
      * Whether to add loadCSS if it's not already loaded.
      * @default true
      */
    var polyfill: js.UndefOr[Boolean] = js.native
    
    /**
      * Paths to use in the `href` tag of the `link` elements.
      * @default false
      */
    var replaceStylesheets: js.UndefOr[js.Array[String] | `false`] = js.native
    
    /** The selector for the element used by loadCSS as a reference for inlining. */
    var selector: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setExtract(value: Boolean): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
      
      @scala.inline
      def setIgnore(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: (String | RegExp)*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      @scala.inline
      def setNoscript(value: body | head | `false`): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoscriptUndefined: Self = StObject.set(x, "noscript", js.undefined)
      
      @scala.inline
      def setPolyfill(value: Boolean): Self = StObject.set(x, "polyfill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolyfillUndefined: Self = StObject.set(x, "polyfill", js.undefined)
      
      @scala.inline
      def setReplaceStylesheets(value: js.Array[String] | `false`): Self = StObject.set(x, "replaceStylesheets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceStylesheetsUndefined: Self = StObject.set(x, "replaceStylesheets", js.undefined)
      
      @scala.inline
      def setReplaceStylesheetsVarargs(value: String*): Self = StObject.set(x, "replaceStylesheets", js.Array(value :_*))
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    }
  }
}
