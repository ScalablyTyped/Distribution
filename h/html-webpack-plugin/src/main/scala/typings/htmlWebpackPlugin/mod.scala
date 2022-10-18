package typings.htmlWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.htmlWebpackPlugin.anon.AssetTags
import typings.htmlWebpackPlugin.anon.Assets
import typings.htmlWebpackPlugin.anon.BodyTags
import typings.htmlWebpackPlugin.anon.BodyTagsHeadTags
import typings.htmlWebpackPlugin.anon.DictmetaAttributeName
import typings.htmlWebpackPlugin.anon.Favicon
import typings.htmlWebpackPlugin.anon.Files
import typings.htmlWebpackPlugin.anon.HeadTags
import typings.htmlWebpackPlugin.anon.Html
import typings.htmlWebpackPlugin.anon.OutputName
import typings.htmlWebpackPlugin.htmlWebpackPluginBooleans.`false`
import typings.htmlWebpackPlugin.htmlWebpackPluginBooleans.`true`
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.all
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.auto
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.blocking
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.body
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.defer
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.head
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.manual
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.module
import typings.tapable.mod.AsyncSeriesWaterfallHook
import typings.tapable.mod.UnsetAdditionalOptions
import typings.webpack.mod.Compilation
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with HtmlWebpackPlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
    
    /* CompleteClass */
    var userOptions: Options = js.native
    
    /** Current HtmlWebpackPlugin Major */
    /* CompleteClass */
    var version: Double = js.native
  }
  @JSImport("html-webpack-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Static helper to create a tag object to be get injected into the dom
    */
  /* static member */
  inline def createHtmlTagObject(tagName: String): HtmlTagObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createHtmlTagObject")(tagName.asInstanceOf[js.Any]).asInstanceOf[HtmlTagObject]
  inline def createHtmlTagObject(tagName: String, attributes: StringDictionary[String | Boolean]): HtmlTagObject = (^.asInstanceOf[js.Dynamic].applyDynamic("createHtmlTagObject")(tagName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[HtmlTagObject]
  inline def createHtmlTagObject(tagName: String, attributes: StringDictionary[String | Boolean], innerHTML: String): HtmlTagObject = (^.asInstanceOf[js.Dynamic].applyDynamic("createHtmlTagObject")(tagName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any])).asInstanceOf[HtmlTagObject]
  inline def createHtmlTagObject(tagName: String, attributes: Unit, innerHTML: String): HtmlTagObject = (^.asInstanceOf[js.Dynamic].applyDynamic("createHtmlTagObject")(tagName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any])).asInstanceOf[HtmlTagObject]
  
  /* static member */
  inline def getHooks(compilation: Compilation): Hooks = ^.asInstanceOf[js.Dynamic].applyDynamic("getHooks")(compilation.asInstanceOf[js.Any]).asInstanceOf[Hooks]
  
  /* static member */
  @JSImport("html-webpack-plugin", "version")
  @js.native
  val version: Double = js.native
  
  trait Hooks extends StObject {
    
    var afterEmit: AsyncSeriesWaterfallHook[OutputName, UnsetAdditionalOptions]
    
    var afterTemplateExecution: AsyncSeriesWaterfallHook[HeadTags, UnsetAdditionalOptions]
    
    var alterAssetTagGroups: AsyncSeriesWaterfallHook[BodyTags, UnsetAdditionalOptions]
    
    var alterAssetTags: AsyncSeriesWaterfallHook[AssetTags, UnsetAdditionalOptions]
    
    var beforeAssetTagGeneration: AsyncSeriesWaterfallHook[Assets, UnsetAdditionalOptions]
    
    var beforeEmit: AsyncSeriesWaterfallHook[Html, UnsetAdditionalOptions]
  }
  object Hooks {
    
    inline def apply(
      afterEmit: AsyncSeriesWaterfallHook[OutputName, UnsetAdditionalOptions],
      afterTemplateExecution: AsyncSeriesWaterfallHook[HeadTags, UnsetAdditionalOptions],
      alterAssetTagGroups: AsyncSeriesWaterfallHook[BodyTags, UnsetAdditionalOptions],
      alterAssetTags: AsyncSeriesWaterfallHook[AssetTags, UnsetAdditionalOptions],
      beforeAssetTagGeneration: AsyncSeriesWaterfallHook[Assets, UnsetAdditionalOptions],
      beforeEmit: AsyncSeriesWaterfallHook[Html, UnsetAdditionalOptions]
    ): Hooks = {
      val __obj = js.Dynamic.literal(afterEmit = afterEmit.asInstanceOf[js.Any], afterTemplateExecution = afterTemplateExecution.asInstanceOf[js.Any], alterAssetTagGroups = alterAssetTagGroups.asInstanceOf[js.Any], alterAssetTags = alterAssetTags.asInstanceOf[js.Any], beforeAssetTagGeneration = beforeAssetTagGeneration.asInstanceOf[js.Any], beforeEmit = beforeEmit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hooks]
    }
    
    extension [Self <: Hooks](x: Self) {
      
      inline def setAfterEmit(value: AsyncSeriesWaterfallHook[OutputName, UnsetAdditionalOptions]): Self = StObject.set(x, "afterEmit", value.asInstanceOf[js.Any])
      
      inline def setAfterTemplateExecution(value: AsyncSeriesWaterfallHook[HeadTags, UnsetAdditionalOptions]): Self = StObject.set(x, "afterTemplateExecution", value.asInstanceOf[js.Any])
      
      inline def setAlterAssetTagGroups(value: AsyncSeriesWaterfallHook[BodyTags, UnsetAdditionalOptions]): Self = StObject.set(x, "alterAssetTagGroups", value.asInstanceOf[js.Any])
      
      inline def setAlterAssetTags(value: AsyncSeriesWaterfallHook[AssetTags, UnsetAdditionalOptions]): Self = StObject.set(x, "alterAssetTags", value.asInstanceOf[js.Any])
      
      inline def setBeforeAssetTagGeneration(value: AsyncSeriesWaterfallHook[Assets, UnsetAdditionalOptions]): Self = StObject.set(x, "beforeAssetTagGeneration", value.asInstanceOf[js.Any])
      
      inline def setBeforeEmit(value: AsyncSeriesWaterfallHook[Html, UnsetAdditionalOptions]): Self = StObject.set(x, "beforeEmit", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A tag element according to the htmlWebpackPlugin object notation
    */
  trait HtmlTagObject extends StObject {
    
    /**
      * Attributes of the html tag
      * E.g. `{'disabled': true, 'value': 'demo'}`
      */
    var attributes: StringDictionary[js.UndefOr[String | Boolean | Null]]
    
    /**
      * The inner HTML
      */
    var innerHTML: js.UndefOr[String] = js.undefined
    
    /**
      * Meta information about the tag
      * E.g. `{'plugin': 'html-webpack-plugin'}`
      */
    var meta: DictmetaAttributeName
    
    /**
      * The tag name e.g. `'div'`
      */
    var tagName: String
    
    /**
      * Whether this html must not contain innerHTML
      * @see https://www.w3.org/TR/html5/syntax.html#void-elements
      */
    var voidTag: Boolean
  }
  object HtmlTagObject {
    
    inline def apply(
      attributes: StringDictionary[js.UndefOr[String | Boolean | Null]],
      meta: DictmetaAttributeName,
      tagName: String,
      voidTag: Boolean
    ): HtmlTagObject = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], voidTag = voidTag.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlTagObject]
    }
    
    extension [Self <: HtmlTagObject](x: Self) {
      
      inline def setAttributes(value: StringDictionary[js.UndefOr[String | Boolean | Null]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setInnerHTML(value: String): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
      
      inline def setInnerHTMLUndefined: Self = StObject.set(x, "innerHTML", js.undefined)
      
      inline def setMeta(value: DictmetaAttributeName): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setVoidTag(value: Boolean): Self = StObject.set(x, "voidTag", value.asInstanceOf[js.Any])
    }
  }
  
  trait HtmlWebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
    
    /**
      * Options after html-webpack-plugin has been initialized with defaults
      */
    var options: js.UndefOr[ProcessedOptions] = js.undefined
    
    var userOptions: Options
    
    /** Current HtmlWebpackPlugin Major */
    var version: Double
  }
  object HtmlWebpackPlugin {
    
    inline def apply(apply: Compiler => Unit, userOptions: Options, version: Double): HtmlWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), userOptions = userOptions.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlWebpackPlugin]
    }
    
    extension [Self <: HtmlWebpackPlugin](x: Self) {
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setOptions(value: ProcessedOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setUserOptions(value: Options): Self = StObject.set(x, "userOptions", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type MinifyOptions = typings.htmlMinifierTerser.mod.Options
  
  trait Options
    extends StObject
       with /**
    * In addition to the options actually used by this plugin, you can use this hash to pass arbitrary data through
    * to your template.
    */
  /* option */ StringDictionary[Any] {
    
    /**
      * Emit the file only if it was changed.
      * @default true
      */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * List all entries which should be injected
      */
    var chunks: js.UndefOr[all | js.Array[String]] = js.undefined
    
    /**
      * Allows to control how chunks should be sorted before they are included to the html.
      * @default 'auto'
      */
    var chunksSortMode: js.UndefOr[
        auto | manual | (js.Function2[/* entryNameA */ String, /* entryNameB */ String, Double])
      ] = js.undefined
    
    /**
      * List all entries which should not be injected
      */
    var excludeChunks: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Path to the favicon icon
      */
    var favicon: js.UndefOr[`false` | String] = js.undefined
    
    /**
      * The file to write the HTML to.
      * Supports subdirectories eg: `assets/admin.html`
      * [name] will be replaced by the entry name
      * Supports a function to generate the name
      *
      * @default 'index.html'
      */
    var filename: js.UndefOr[String | (js.Function1[/* entryName */ String, String])] = js.undefined
    
    /**
      * If `true` then append a unique `webpack` compilation hash to all included scripts and CSS files.
      * This is useful for cache busting
      */
    var hash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Inject all assets into the given `template` or `templateContent`.
      */
    var inject: js.UndefOr[`false` | `true` | body | head] = js.undefined
    
    /**
      * Inject meta tags
      */
    var meta: js.UndefOr[
        `false` | (StringDictionary[String | `false` | (StringDictionary[String | Boolean])])
      ] = js.undefined
    
    /**
      * HTML Minification options accepts the following values:
      * - Set to `false` to disable minifcation
      * - Set to `'auto'` to enable minifcation only for production mode
      * - Set to custom minification according to
      * {@link https://github.com/kangax/html-minifier#options-quick-reference}
      */
    var minify: js.UndefOr[auto | Boolean | MinifyOptions] = js.undefined
    
    /**
      * By default the public path is set to `auto` - that way the html-webpack-plugin will try
      * to set the publicPath according to the current filename and the webpack publicPath setting
      */
    var publicPath: js.UndefOr[String | auto] = js.undefined
    
    // Inject scripts into head
    /**
      * Set up script loading
      * blocking will result in <script src="..."></script>
      * defer will result in <script defer src="..."></script>
      *
      * @default 'defer'
      */
    var scriptLoading: js.UndefOr[blocking | defer | module] = js.undefined
    
    /**
      * Render errors into the HTML page
      */
    var showErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The `webpack` require path to the template.
      * @see https://github.com/jantimon/html-webpack-plugin/blob/master/docs/template-option.md
      */
    var template: js.UndefOr[String] = js.undefined
    
    /**
      * Allow to use a html string instead of reading from a file
      */
    var templateContent: js.UndefOr[
        `false` | String | (js.Function1[/* templateParameters */ StringDictionary[Any], String | js.Promise[String]]) | js.Promise[String]
      ] = js.undefined
    
    /**
      * Allows to overwrite the parameters used in the template
      */
    var templateParameters: js.UndefOr[
        `false` | (js.Function4[
          /* compilation */ Any, 
          /* assets */ Favicon, 
          /* assetTags */ BodyTagsHeadTags, 
          /* options */ ProcessedOptions, 
          StringDictionary[Any] | js.Promise[StringDictionary[Any]]
        ]) | StringDictionary[Any]
      ] = js.undefined
    
    /**
      * The title to use for the generated HTML document
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * Enforce self closing tags e.g. <link />
      */
    var xhtml: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setChunks(value: all | js.Array[String]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setChunksSortMode(value: auto | manual | (js.Function2[/* entryNameA */ String, /* entryNameB */ String, Double])): Self = StObject.set(x, "chunksSortMode", value.asInstanceOf[js.Any])
      
      inline def setChunksSortModeFunction2(value: (/* entryNameA */ String, /* entryNameB */ String) => Double): Self = StObject.set(x, "chunksSortMode", js.Any.fromFunction2(value))
      
      inline def setChunksSortModeUndefined: Self = StObject.set(x, "chunksSortMode", js.undefined)
      
      inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
      
      inline def setChunksVarargs(value: String*): Self = StObject.set(x, "chunks", js.Array(value*))
      
      inline def setExcludeChunks(value: js.Array[String]): Self = StObject.set(x, "excludeChunks", value.asInstanceOf[js.Any])
      
      inline def setExcludeChunksUndefined: Self = StObject.set(x, "excludeChunks", js.undefined)
      
      inline def setExcludeChunksVarargs(value: String*): Self = StObject.set(x, "excludeChunks", js.Array(value*))
      
      inline def setFavicon(value: `false` | String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      inline def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
      
      inline def setFilename(value: String | (js.Function1[/* entryName */ String, String])): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameFunction1(value: /* entryName */ String => String): Self = StObject.set(x, "filename", js.Any.fromFunction1(value))
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setInject(value: `false` | `true` | body | head): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      inline def setMeta(value: `false` | (StringDictionary[String | `false` | (StringDictionary[String | Boolean])])): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setMinify(value: auto | Boolean | MinifyOptions): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setPublicPath(value: String | auto): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      inline def setScriptLoading(value: blocking | defer | module): Self = StObject.set(x, "scriptLoading", value.asInstanceOf[js.Any])
      
      inline def setScriptLoadingUndefined: Self = StObject.set(x, "scriptLoading", js.undefined)
      
      inline def setShowErrors(value: Boolean): Self = StObject.set(x, "showErrors", value.asInstanceOf[js.Any])
      
      inline def setShowErrorsUndefined: Self = StObject.set(x, "showErrors", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateContent(
        value: `false` | String | (js.Function1[/* templateParameters */ StringDictionary[Any], String | js.Promise[String]]) | js.Promise[String]
      ): Self = StObject.set(x, "templateContent", value.asInstanceOf[js.Any])
      
      inline def setTemplateContentFunction1(value: /* templateParameters */ StringDictionary[Any] => String | js.Promise[String]): Self = StObject.set(x, "templateContent", js.Any.fromFunction1(value))
      
      inline def setTemplateContentUndefined: Self = StObject.set(x, "templateContent", js.undefined)
      
      inline def setTemplateParameters(
        value: `false` | (js.Function4[
              /* compilation */ Any, 
              /* assets */ Favicon, 
              /* assetTags */ BodyTagsHeadTags, 
              /* options */ ProcessedOptions, 
              StringDictionary[Any] | js.Promise[StringDictionary[Any]]
            ]) | StringDictionary[Any]
      ): Self = StObject.set(x, "templateParameters", value.asInstanceOf[js.Any])
      
      inline def setTemplateParametersFunction4(
        value: (/* compilation */ Any, /* assets */ Favicon, /* assetTags */ BodyTagsHeadTags, /* options */ ProcessedOptions) => StringDictionary[Any] | js.Promise[StringDictionary[Any]]
      ): Self = StObject.set(x, "templateParameters", js.Any.fromFunction4(value))
      
      inline def setTemplateParametersUndefined: Self = StObject.set(x, "templateParameters", js.undefined)
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setXhtml(value: Boolean): Self = StObject.set(x, "xhtml", value.asInstanceOf[js.Any])
      
      inline def setXhtmlUndefined: Self = StObject.set(x, "xhtml", js.undefined)
    }
  }
  
  /**
    * The plugin options after adding default values
    */
  /* Inlined parent std.Required<html-webpack-plugin.html-webpack-plugin.Options> */
  trait ProcessedOptions extends StObject {
    
    var cache: Boolean
    
    var chunks: all | js.Array[String]
    
    var chunksSortMode: auto | manual | (js.Function2[/* entryNameA */ String, /* entryNameB */ String, Double])
    
    var excludeChunks: js.Array[String]
    
    var favicon: `false` | String
    
    var filename: String
    
    var hash: Boolean
    
    var inject: `false` | `true` | body | head
    
    var meta: `false` | (StringDictionary[String | `false` | (StringDictionary[String | Boolean])])
    
    var minify: auto | Boolean | MinifyOptions
    
    var publicPath: String | auto
    
    var scriptLoading: blocking | defer | module
    
    var showErrors: Boolean
    
    var template: String
    
    var templateContent: `false` | String | (js.Function1[/* templateParameters */ StringDictionary[Any], String | js.Promise[String]]) | js.Promise[String]
    
    var templateParameters: `false` | (js.Function4[
        /* compilation */ Any, 
        /* assets */ Favicon, 
        /* assetTags */ BodyTagsHeadTags, 
        /* options */ this.type, 
        StringDictionary[Any] | js.Promise[StringDictionary[Any]]
      ]) | StringDictionary[Any]
    
    var title: String
    
    var xhtml: Boolean
  }
  object ProcessedOptions {
    
    inline def apply(
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
      scriptLoading: blocking | defer | module,
      showErrors: Boolean,
      template: String,
      templateContent: `false` | String | (js.Function1[/* templateParameters */ StringDictionary[Any], String | js.Promise[String]]) | js.Promise[String],
      templateParameters: `false` | (js.Function4[
          /* compilation */ Any, 
          /* assets */ Favicon, 
          /* assetTags */ BodyTagsHeadTags, 
          ProcessedOptions, 
          StringDictionary[Any] | js.Promise[StringDictionary[Any]]
        ]) | StringDictionary[Any],
      title: String,
      xhtml: Boolean
    ): ProcessedOptions = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], chunks = chunks.asInstanceOf[js.Any], chunksSortMode = chunksSortMode.asInstanceOf[js.Any], excludeChunks = excludeChunks.asInstanceOf[js.Any], favicon = favicon.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], inject = inject.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], minify = minify.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any], scriptLoading = scriptLoading.asInstanceOf[js.Any], showErrors = showErrors.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], templateContent = templateContent.asInstanceOf[js.Any], templateParameters = templateParameters.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], xhtml = xhtml.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessedOptions]
    }
    
    extension [Self <: ProcessedOptions](x: Self) {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setChunks(value: all | js.Array[String]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setChunksSortMode(value: auto | manual | (js.Function2[/* entryNameA */ String, /* entryNameB */ String, Double])): Self = StObject.set(x, "chunksSortMode", value.asInstanceOf[js.Any])
      
      inline def setChunksSortModeFunction2(value: (/* entryNameA */ String, /* entryNameB */ String) => Double): Self = StObject.set(x, "chunksSortMode", js.Any.fromFunction2(value))
      
      inline def setChunksVarargs(value: String*): Self = StObject.set(x, "chunks", js.Array(value*))
      
      inline def setExcludeChunks(value: js.Array[String]): Self = StObject.set(x, "excludeChunks", value.asInstanceOf[js.Any])
      
      inline def setExcludeChunksVarargs(value: String*): Self = StObject.set(x, "excludeChunks", js.Array(value*))
      
      inline def setFavicon(value: `false` | String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setInject(value: `false` | `true` | body | head): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: `false` | (StringDictionary[String | `false` | (StringDictionary[String | Boolean])])): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMinify(value: auto | Boolean | MinifyOptions): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setPublicPath(value: String | auto): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setScriptLoading(value: blocking | defer | module): Self = StObject.set(x, "scriptLoading", value.asInstanceOf[js.Any])
      
      inline def setShowErrors(value: Boolean): Self = StObject.set(x, "showErrors", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateContent(
        value: `false` | String | (js.Function1[/* templateParameters */ StringDictionary[Any], String | js.Promise[String]]) | js.Promise[String]
      ): Self = StObject.set(x, "templateContent", value.asInstanceOf[js.Any])
      
      inline def setTemplateContentFunction1(value: /* templateParameters */ StringDictionary[Any] => String | js.Promise[String]): Self = StObject.set(x, "templateContent", js.Any.fromFunction1(value))
      
      inline def setTemplateParameters(
        value: `false` | (js.Function4[
              /* compilation */ Any, 
              /* assets */ Favicon, 
              /* assetTags */ BodyTagsHeadTags, 
              ProcessedOptions, 
              StringDictionary[Any] | js.Promise[StringDictionary[Any]]
            ]) | StringDictionary[Any]
      ): Self = StObject.set(x, "templateParameters", value.asInstanceOf[js.Any])
      
      inline def setTemplateParametersFunction4(
        value: (/* compilation */ Any, /* assets */ Favicon, /* assetTags */ BodyTagsHeadTags, ProcessedOptions) => StringDictionary[Any] | js.Promise[StringDictionary[Any]]
      ): Self = StObject.set(x, "templateParameters", js.Any.fromFunction4(value))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setXhtml(value: Boolean): Self = StObject.set(x, "xhtml", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The values which are available during template execution
    *
    * Please keep in mind that the `templateParameter` options allows to change them
    */
  trait TemplateParameter extends StObject {
    
    var compilation: Any
    
    var htmlWebpackPlugin: Files
    
    var webpackConfig: Any
  }
  object TemplateParameter {
    
    inline def apply(compilation: Any, htmlWebpackPlugin: Files, webpackConfig: Any): TemplateParameter = {
      val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], htmlWebpackPlugin = htmlWebpackPlugin.asInstanceOf[js.Any], webpackConfig = webpackConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateParameter]
    }
    
    extension [Self <: TemplateParameter](x: Self) {
      
      inline def setCompilation(value: Any): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
      
      inline def setHtmlWebpackPlugin(value: Files): Self = StObject.set(x, "htmlWebpackPlugin", value.asInstanceOf[js.Any])
      
      inline def setWebpackConfig(value: Any): Self = StObject.set(x, "webpackConfig", value.asInstanceOf[js.Any])
    }
  }
}
