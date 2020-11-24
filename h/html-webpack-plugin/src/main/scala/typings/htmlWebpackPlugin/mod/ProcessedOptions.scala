package typings.htmlWebpackPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import typings.htmlWebpackPlugin.anon.BodyTags
import typings.htmlWebpackPlugin.anon.Css
import typings.htmlWebpackPlugin.htmlWebpackPluginBooleans.`false`
import typings.htmlWebpackPlugin.htmlWebpackPluginBooleans.`true`
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.all
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.auto
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.blocking
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.body
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.defer
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.head
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The plugin options after adding default values
  */
@js.native
trait ProcessedOptions
  extends /**
  * In addition to the options actually used by this plugin, you can use this hash to pass arbitrary data through
  * to your template.
  */
/* option */ StringDictionary[js.Any] {
  
  /**
    * Emit the file only if it was changed.
    * @default true
    */
  var cache: Boolean = js.native
  
  /**
    * List all entries which should be injected
    */
  var chunks: all | js.Array[String] = js.native
  
  /**
    * Allows to control how chunks should be sorted before they are included to the html.
    * @default 'auto'
    */
  var chunksSortMode: auto | manual | (js.Function2[/* entryNameA */ String, /* entryNameB */ String, Double]) = js.native
  
  /**
    * List all entries which should not be injected
    */
  var excludeChunks: js.Array[String] = js.native
  
  /**
    * Path to the favicon icon
    */
  var favicon: `false` | String = js.native
  
  /**
    * The file to write the HTML to.
    * Supports subdirectories eg: `assets/admin.html`
    * @default 'index.html'
    */
  var filename: String = js.native
  
  /**
    * If `true` then append a unique `webpack` compilation hash to all included scripts and CSS files.
    * This is useful for cache busting
    */
  var hash: Boolean = js.native
  
  /**
    * Inject all assets into the given `template` or `templateContent`.
    */
  var inject: `false` | `true` | body | head = js.native
  
  /**
    * Inject meta tags
    */
  var meta: `false` | (StringDictionary[String | `false` | (StringDictionary[String | Boolean])]) = js.native
  
  /**
    * HTML Minification options accepts the following values:
    * - Set to `false` to disable minifcation
    * - Set to `'auto'` to enable minifcation only for production mode
    * - Set to custom minification according to
    * {@link https://github.com/kangax/html-minifier#options-quick-reference}
    */
  var minify: auto | Boolean | MinifyOptions = js.native
  
  /**
    * By default the public path is set to `auto` - that way the html-webpack-plugin will try
    * to set the publicPath according to the current filename and the webpack publicPath setting
    */
  var publicPath: String | auto = js.native
  
  // Inject scripts into head
  /**
    * Set up script loading
    * blocking will result in <script src="..."></script>
    * defer will result in <script defer src="..."></script>
    *
    * @default 'blocking'
    */
  var scriptLoading: blocking | defer = js.native
  
  /**
    * Render errors into the HTML page
    */
  var showErrors: Boolean = js.native
  
  /**
    * The `webpack` require path to the template.
    * @see https://github.com/jantimon/html-webpack-plugin/blob/master/docs/template-option.md
    */
  var template: String = js.native
  
  /**
    * Allow to use a html string instead of reading from a file
    */
  var templateContent: `false` | String | (js.Function1[/* templateParameters */ StringDictionary[js.Any], String | js.Promise[String]]) | js.Promise[String] = js.native
  
  /**
    * Allows to overwrite the parameters used in the template
    */
  var templateParameters: `false` | (js.Function4[
    /* compilation */ js.Any, 
    /* assets */ Css, 
    /* assetTags */ BodyTags, 
    /* options */ this.type, 
    StringDictionary[_] | js.Promise[StringDictionary[_]]
  ]) | StringDictionary[js.Any] = js.native
  
  /**
    * The title to use for the generated HTML document
    */
  var title: String = js.native
  
  /**
    * Enforce self closing tags e.g. <link />
    */
  var xhtml: Boolean = js.native
}
object ProcessedOptions {
  
  @scala.inline
  def apply(
    cache: Boolean,
    chunks: all | js.Array[String],
    chunksSortMode: auto | manual | (js.Function2[/* entryNameA */ String, /* entryNameB */ String, Double]),
    excludeChunks: js.Array[String],
    favicon: `false` | String,
    filename: String,
    hash: Boolean,
    inject: `false` | `true` | body | head,
    meta: `false` | (StringDictionary[String | `false` | (StringDictionary[String | Boolean])]),
    minify: auto | Boolean | MinifyOptions,
    publicPath: String | auto,
    scriptLoading: blocking | defer,
    showErrors: Boolean,
    template: String,
    templateContent: `false` | String | (js.Function1[/* templateParameters */ StringDictionary[js.Any], String | js.Promise[String]]) | js.Promise[String],
    templateParameters: `false` | (js.Function4[
      /* compilation */ js.Any, 
      /* assets */ Css, 
      /* assetTags */ BodyTags, 
      ProcessedOptions, 
      StringDictionary[_] | js.Promise[StringDictionary[_]]
    ]) | StringDictionary[js.Any],
    title: String,
    xhtml: Boolean
  ): ProcessedOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], chunks = chunks.asInstanceOf[js.Any], chunksSortMode = chunksSortMode.asInstanceOf[js.Any], excludeChunks = excludeChunks.asInstanceOf[js.Any], favicon = favicon.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], inject = inject.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], minify = minify.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any], scriptLoading = scriptLoading.asInstanceOf[js.Any], showErrors = showErrors.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], templateContent = templateContent.asInstanceOf[js.Any], templateParameters = templateParameters.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], xhtml = xhtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessedOptions]
  }
  
  @scala.inline
  implicit class ProcessedOptionsOps[Self <: ProcessedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunksVarargs(value: String*): Self = this.set("chunks", js.Array(value :_*))
    
    @scala.inline
    def setChunks(value: all | js.Array[String]): Self = this.set("chunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunksSortModeFunction2(value: (/* entryNameA */ String, /* entryNameB */ String) => Double): Self = this.set("chunksSortMode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChunksSortMode(value: auto | manual | (js.Function2[/* entryNameA */ String, /* entryNameB */ String, Double])): Self = this.set("chunksSortMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeChunksVarargs(value: String*): Self = this.set("excludeChunks", js.Array(value :_*))
    
    @scala.inline
    def setExcludeChunks(value: js.Array[String]): Self = this.set("excludeChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavicon(value: `false` | String): Self = this.set("favicon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: Boolean): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInject(value: `false` | `true` | body | head): Self = this.set("inject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: `false` | (StringDictionary[String | `false` | (StringDictionary[String | Boolean])])): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinify(value: auto | Boolean | MinifyOptions): Self = this.set("minify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicPath(value: String | auto): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptLoading(value: blocking | defer): Self = this.set("scriptLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowErrors(value: Boolean): Self = this.set("showErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateContentFunction1(value: /* templateParameters */ StringDictionary[js.Any] => String | js.Promise[String]): Self = this.set("templateContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTemplateContent(
      value: `false` | String | (js.Function1[/* templateParameters */ StringDictionary[js.Any], String | js.Promise[String]]) | js.Promise[String]
    ): Self = this.set("templateContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateParametersFunction4(
      value: (/* compilation */ js.Any, /* assets */ Css, /* assetTags */ BodyTags, ProcessedOptions) => StringDictionary[_] | js.Promise[StringDictionary[_]]
    ): Self = this.set("templateParameters", js.Any.fromFunction4(value))
    
    @scala.inline
    def setTemplateParameters(
      value: `false` | (js.Function4[
          /* compilation */ js.Any, 
          /* assets */ Css, 
          /* assetTags */ BodyTags, 
          ProcessedOptions, 
          StringDictionary[_] | js.Promise[StringDictionary[_]]
        ]) | StringDictionary[js.Any]
    ): Self = this.set("templateParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhtml(value: Boolean): Self = this.set("xhtml", value.asInstanceOf[js.Any])
  }
}
