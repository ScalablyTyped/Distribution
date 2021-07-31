package typings.htmlWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.htmlWebpackPlugin.anon.AssetTags
import typings.htmlWebpackPlugin.anon.Assets
import typings.htmlWebpackPlugin.anon.BodyTags
import typings.htmlWebpackPlugin.anon.Css
import typings.htmlWebpackPlugin.anon.Files
import typings.htmlWebpackPlugin.anon.HeadTags
import typings.htmlWebpackPlugin.anon.Html
import typings.htmlWebpackPlugin.anon.OutputName
import typings.htmlWebpackPlugin.anon.Plugin
import typings.htmlWebpackPlugin.htmlWebpackPluginBooleans.`false`
import typings.htmlWebpackPlugin.htmlWebpackPluginBooleans.`true`
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.all
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.auto
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.blocking
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.body
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.defer
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.head
import typings.htmlWebpackPlugin.htmlWebpackPluginStrings.manual
import typings.tapable.mod.AsyncSeriesWaterfallHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with HtmlWebpackPlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit = js.native
  }
  @JSImport("html-webpack-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Static helper to create a tag object to be get injected into the dom
    */
  /* static member */
  @scala.inline
  def createHtmlTagObject(tagName: String): HtmlTagObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createHtmlTagObject")(tagName.asInstanceOf[js.Any]).asInstanceOf[HtmlTagObject]
  @scala.inline
  def createHtmlTagObject(tagName: String, attributes: StringDictionary[String | Boolean]): HtmlTagObject = (^.asInstanceOf[js.Dynamic].applyDynamic("createHtmlTagObject")(tagName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[HtmlTagObject]
  @scala.inline
  def createHtmlTagObject(tagName: String, attributes: StringDictionary[String | Boolean], innerHTML: String): HtmlTagObject = (^.asInstanceOf[js.Dynamic].applyDynamic("createHtmlTagObject")(tagName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any])).asInstanceOf[HtmlTagObject]
  @scala.inline
  def createHtmlTagObject(tagName: String, attributes: Unit, innerHTML: String): HtmlTagObject = (^.asInstanceOf[js.Dynamic].applyDynamic("createHtmlTagObject")(tagName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any])).asInstanceOf[HtmlTagObject]
  
  /* static member */
  @scala.inline
  def getHooks(
    compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any
  ): Hooks = ^.asInstanceOf[js.Dynamic].applyDynamic("getHooks")(compilation.asInstanceOf[js.Any]).asInstanceOf[Hooks]
  
  /* static member */
  @JSImport("html-webpack-plugin", "version")
  @js.native
  val version: Double = js.native
  
  trait Hooks extends StObject {
    
    var afterEmit: AsyncSeriesWaterfallHook[Plugin, js.Any, js.Any]
    
    var afterTemplateExecution: AsyncSeriesWaterfallHook[Html, js.Any, js.Any]
    
    var alterAssetTagGroups: AsyncSeriesWaterfallHook[HeadTags, js.Any, js.Any]
    
    var alterAssetTags: AsyncSeriesWaterfallHook[AssetTags, js.Any, js.Any]
    
    var beforeAssetTagGeneration: AsyncSeriesWaterfallHook[Assets, js.Any, js.Any]
    
    var beforeEmit: AsyncSeriesWaterfallHook[OutputName, js.Any, js.Any]
  }
  object Hooks {
    
    @scala.inline
    def apply(
      afterEmit: AsyncSeriesWaterfallHook[Plugin, js.Any, js.Any],
      afterTemplateExecution: AsyncSeriesWaterfallHook[Html, js.Any, js.Any],
      alterAssetTagGroups: AsyncSeriesWaterfallHook[HeadTags, js.Any, js.Any],
      alterAssetTags: AsyncSeriesWaterfallHook[AssetTags, js.Any, js.Any],
      beforeAssetTagGeneration: AsyncSeriesWaterfallHook[Assets, js.Any, js.Any],
      beforeEmit: AsyncSeriesWaterfallHook[OutputName, js.Any, js.Any]
    ): Hooks = {
      val __obj = js.Dynamic.literal(afterEmit = afterEmit.asInstanceOf[js.Any], afterTemplateExecution = afterTemplateExecution.asInstanceOf[js.Any], alterAssetTagGroups = alterAssetTagGroups.asInstanceOf[js.Any], alterAssetTags = alterAssetTags.asInstanceOf[js.Any], beforeAssetTagGeneration = beforeAssetTagGeneration.asInstanceOf[js.Any], beforeEmit = beforeEmit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hooks]
    }
    
    @scala.inline
    implicit class HooksMutableBuilder[Self <: Hooks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterEmit(value: AsyncSeriesWaterfallHook[Plugin, js.Any, js.Any]): Self = StObject.set(x, "afterEmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterTemplateExecution(value: AsyncSeriesWaterfallHook[Html, js.Any, js.Any]): Self = StObject.set(x, "afterTemplateExecution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlterAssetTagGroups(value: AsyncSeriesWaterfallHook[HeadTags, js.Any, js.Any]): Self = StObject.set(x, "alterAssetTagGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlterAssetTags(value: AsyncSeriesWaterfallHook[AssetTags, js.Any, js.Any]): Self = StObject.set(x, "alterAssetTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeAssetTagGeneration(value: AsyncSeriesWaterfallHook[Assets, js.Any, js.Any]): Self = StObject.set(x, "beforeAssetTagGeneration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeEmit(value: AsyncSeriesWaterfallHook[OutputName, js.Any, js.Any]): Self = StObject.set(x, "beforeEmit", value.asInstanceOf[js.Any])
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
    var attributes: StringDictionary[String | Boolean]
    
    /**
      * The inner HTML
      */
    var innerHTML: js.UndefOr[String] = js.undefined
    
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
    
    @scala.inline
    def apply(attributes: StringDictionary[String | Boolean], tagName: String, voidTag: Boolean): HtmlTagObject = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], voidTag = voidTag.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlTagObject]
    }
    
    @scala.inline
    implicit class HtmlTagObjectMutableBuilder[Self <: HtmlTagObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[String | Boolean]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerHTML(value: String): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerHTMLUndefined: Self = StObject.set(x, "innerHTML", js.undefined)
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVoidTag(value: Boolean): Self = StObject.set(x, "voidTag", value.asInstanceOf[js.Any])
    }
  }
  
  trait HtmlWebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit
  }
  object HtmlWebpackPlugin {
    
    @scala.inline
    def apply(
      apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
    ): HtmlWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[HtmlWebpackPlugin]
    }
    
    @scala.inline
    implicit class HtmlWebpackPluginMutableBuilder[Self <: HtmlWebpackPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
      ): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  type MinifyOptions = typings.htmlMinifierTerser.mod.Options
  
  /* Inlined parent std.Partial<html-webpack-plugin.html-webpack-plugin.ProcessedOptions> */
  trait Options extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var chunks: js.UndefOr[all | js.Array[String]] = js.undefined
    
    var chunksSortMode: js.UndefOr[
        auto | manual | (js.Function2[/* entryNameA */ String, /* entryNameB */ String, Double])
      ] = js.undefined
    
    var excludeChunks: js.UndefOr[js.Array[String]] = js.undefined
    
    var favicon: js.UndefOr[`false` | String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var hash: js.UndefOr[Boolean] = js.undefined
    
    var inject: js.UndefOr[`false` | `true` | body | head] = js.undefined
    
    var meta: js.UndefOr[
        `false` | (StringDictionary[String | `false` | (StringDictionary[String | Boolean])])
      ] = js.undefined
    
    var minify: js.UndefOr[auto | Boolean | MinifyOptions] = js.undefined
    
    var publicPath: js.UndefOr[String | auto] = js.undefined
    
    var scriptLoading: js.UndefOr[blocking | defer] = js.undefined
    
    var showErrors: js.UndefOr[Boolean] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var templateContent: js.UndefOr[
        `false` | String | (js.Function1[/* templateParameters */ StringDictionary[js.Any], String | js.Promise[String]]) | js.Promise[String]
      ] = js.undefined
    
    var templateParameters: js.UndefOr[
        `false` | (js.Function4[
          /* compilation */ js.Any, 
          /* assets */ Css, 
          /* assetTags */ BodyTags, 
          /* options */ ProcessedOptions, 
          StringDictionary[js.Any] | js.Promise[StringDictionary[js.Any]]
        ]) | StringDictionary[js.Any]
      ] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var xhtml: js.UndefOr[Boolean] = js.undefined
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
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setChunks(value: all | js.Array[String]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunksSortMode(value: auto | manual | (js.Function2[/* entryNameA */ String, /* entryNameB */ String, Double])): Self = StObject.set(x, "chunksSortMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunksSortModeFunction2(value: (/* entryNameA */ String, /* entryNameB */ String) => Double): Self = StObject.set(x, "chunksSortMode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChunksSortModeUndefined: Self = StObject.set(x, "chunksSortMode", js.undefined)
      
      @scala.inline
      def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
      
      @scala.inline
      def setChunksVarargs(value: String*): Self = StObject.set(x, "chunks", js.Array(value :_*))
      
      @scala.inline
      def setExcludeChunks(value: js.Array[String]): Self = StObject.set(x, "excludeChunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeChunksUndefined: Self = StObject.set(x, "excludeChunks", js.undefined)
      
      @scala.inline
      def setExcludeChunksVarargs(value: String*): Self = StObject.set(x, "excludeChunks", js.Array(value :_*))
      
      @scala.inline
      def setFavicon(value: `false` | String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setInject(value: `false` | `true` | body | head): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      @scala.inline
      def setMeta(value: `false` | (StringDictionary[String | `false` | (StringDictionary[String | Boolean])])): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setMinify(value: auto | Boolean | MinifyOptions): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      @scala.inline
      def setPublicPath(value: String | auto): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      @scala.inline
      def setScriptLoading(value: blocking | defer): Self = StObject.set(x, "scriptLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptLoadingUndefined: Self = StObject.set(x, "scriptLoading", js.undefined)
      
      @scala.inline
      def setShowErrors(value: Boolean): Self = StObject.set(x, "showErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowErrorsUndefined: Self = StObject.set(x, "showErrors", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateContent(
        value: `false` | String | (js.Function1[/* templateParameters */ StringDictionary[js.Any], String | js.Promise[String]]) | js.Promise[String]
      ): Self = StObject.set(x, "templateContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateContentFunction1(value: /* templateParameters */ StringDictionary[js.Any] => String | js.Promise[String]): Self = StObject.set(x, "templateContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTemplateContentUndefined: Self = StObject.set(x, "templateContent", js.undefined)
      
      @scala.inline
      def setTemplateParameters(
        value: `false` | (js.Function4[
              /* compilation */ js.Any, 
              /* assets */ Css, 
              /* assetTags */ BodyTags, 
              /* options */ ProcessedOptions, 
              StringDictionary[js.Any] | js.Promise[StringDictionary[js.Any]]
            ]) | StringDictionary[js.Any]
      ): Self = StObject.set(x, "templateParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateParametersFunction4(
        value: (/* compilation */ js.Any, /* assets */ Css, /* assetTags */ BodyTags, /* options */ ProcessedOptions) => StringDictionary[js.Any] | js.Promise[StringDictionary[js.Any]]
      ): Self = StObject.set(x, "templateParameters", js.Any.fromFunction4(value))
      
      @scala.inline
      def setTemplateParametersUndefined: Self = StObject.set(x, "templateParameters", js.undefined)
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setXhtml(value: Boolean): Self = StObject.set(x, "xhtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhtmlUndefined: Self = StObject.set(x, "xhtml", js.undefined)
    }
  }
  
  /**
    * The plugin options after adding default values
    */
  trait ProcessedOptions
    extends StObject
       with /**
    * In addition to the options actually used by this plugin, you can use this hash to pass arbitrary data through
    * to your template.
    */
  /* option */ StringDictionary[js.Any] {
    
    /**
      * Emit the file only if it was changed.
      * @default true
      */
    var cache: Boolean
    
    /**
      * List all entries which should be injected
      */
    var chunks: all | js.Array[String]
    
    /**
      * Allows to control how chunks should be sorted before they are included to the html.
      * @default 'auto'
      */
    var chunksSortMode: auto | manual | (js.Function2[/* entryNameA */ String, /* entryNameB */ String, Double])
    
    /**
      * List all entries which should not be injected
      */
    var excludeChunks: js.Array[String]
    
    /**
      * Path to the favicon icon
      */
    var favicon: `false` | String
    
    /**
      * The file to write the HTML to.
      * Supports subdirectories eg: `assets/admin.html`
      * @default 'index.html'
      */
    var filename: String
    
    /**
      * If `true` then append a unique `webpack` compilation hash to all included scripts and CSS files.
      * This is useful for cache busting
      */
    var hash: Boolean
    
    /**
      * Inject all assets into the given `template` or `templateContent`.
      */
    var inject: `false` | `true` | body | head
    
    /**
      * Inject meta tags
      */
    var meta: `false` | (StringDictionary[String | `false` | (StringDictionary[String | Boolean])])
    
    /**
      * HTML Minification options accepts the following values:
      * - Set to `false` to disable minifcation
      * - Set to `'auto'` to enable minifcation only for production mode
      * - Set to custom minification according to
      * {@link https://github.com/kangax/html-minifier#options-quick-reference}
      */
    var minify: auto | Boolean | MinifyOptions
    
    /**
      * By default the public path is set to `auto` - that way the html-webpack-plugin will try
      * to set the publicPath according to the current filename and the webpack publicPath setting
      */
    var publicPath: String | auto
    
    // Inject scripts into head
    /**
      * Set up script loading
      * blocking will result in <script src="..."></script>
      * defer will result in <script defer src="..."></script>
      *
      * @default 'blocking'
      */
    var scriptLoading: blocking | defer
    
    /**
      * Render errors into the HTML page
      */
    var showErrors: Boolean
    
    /**
      * The `webpack` require path to the template.
      * @see https://github.com/jantimon/html-webpack-plugin/blob/master/docs/template-option.md
      */
    var template: String
    
    /**
      * Allow to use a html string instead of reading from a file
      */
    var templateContent: `false` | String | (js.Function1[/* templateParameters */ StringDictionary[js.Any], String | js.Promise[String]]) | js.Promise[String]
    
    /**
      * Allows to overwrite the parameters used in the template
      */
    var templateParameters: `false` | (js.Function4[
        /* compilation */ js.Any, 
        /* assets */ Css, 
        /* assetTags */ BodyTags, 
        /* options */ this.type, 
        StringDictionary[js.Any] | js.Promise[StringDictionary[js.Any]]
      ]) | StringDictionary[js.Any]
    
    /**
      * The title to use for the generated HTML document
      */
    var title: String
    
    /**
      * Enforce self closing tags e.g. <link />
      */
    var xhtml: Boolean
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
          StringDictionary[js.Any] | js.Promise[StringDictionary[js.Any]]
        ]) | StringDictionary[js.Any],
      title: String,
      xhtml: Boolean
    ): ProcessedOptions = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], chunks = chunks.asInstanceOf[js.Any], chunksSortMode = chunksSortMode.asInstanceOf[js.Any], excludeChunks = excludeChunks.asInstanceOf[js.Any], favicon = favicon.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], inject = inject.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], minify = minify.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any], scriptLoading = scriptLoading.asInstanceOf[js.Any], showErrors = showErrors.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], templateContent = templateContent.asInstanceOf[js.Any], templateParameters = templateParameters.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], xhtml = xhtml.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessedOptions]
    }
    
    @scala.inline
    implicit class ProcessedOptionsMutableBuilder[Self <: ProcessedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunks(value: all | js.Array[String]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunksSortMode(value: auto | manual | (js.Function2[/* entryNameA */ String, /* entryNameB */ String, Double])): Self = StObject.set(x, "chunksSortMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunksSortModeFunction2(value: (/* entryNameA */ String, /* entryNameB */ String) => Double): Self = StObject.set(x, "chunksSortMode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChunksVarargs(value: String*): Self = StObject.set(x, "chunks", js.Array(value :_*))
      
      @scala.inline
      def setExcludeChunks(value: js.Array[String]): Self = StObject.set(x, "excludeChunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeChunksVarargs(value: String*): Self = StObject.set(x, "excludeChunks", js.Array(value :_*))
      
      @scala.inline
      def setFavicon(value: `false` | String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInject(value: `false` | `true` | body | head): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: `false` | (StringDictionary[String | `false` | (StringDictionary[String | Boolean])])): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinify(value: auto | Boolean | MinifyOptions): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPath(value: String | auto): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptLoading(value: blocking | defer): Self = StObject.set(x, "scriptLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowErrors(value: Boolean): Self = StObject.set(x, "showErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateContent(
        value: `false` | String | (js.Function1[/* templateParameters */ StringDictionary[js.Any], String | js.Promise[String]]) | js.Promise[String]
      ): Self = StObject.set(x, "templateContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateContentFunction1(value: /* templateParameters */ StringDictionary[js.Any] => String | js.Promise[String]): Self = StObject.set(x, "templateContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTemplateParameters(
        value: `false` | (js.Function4[
              /* compilation */ js.Any, 
              /* assets */ Css, 
              /* assetTags */ BodyTags, 
              ProcessedOptions, 
              StringDictionary[js.Any] | js.Promise[StringDictionary[js.Any]]
            ]) | StringDictionary[js.Any]
      ): Self = StObject.set(x, "templateParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateParametersFunction4(
        value: (/* compilation */ js.Any, /* assets */ Css, /* assetTags */ BodyTags, ProcessedOptions) => StringDictionary[js.Any] | js.Promise[StringDictionary[js.Any]]
      ): Self = StObject.set(x, "templateParameters", js.Any.fromFunction4(value))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhtml(value: Boolean): Self = StObject.set(x, "xhtml", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The values which are available during template execution
    *
    * Please keep in mind that the `templateParameter` options allows to change them
    */
  trait TemplateParameter extends StObject {
    
    var compilation: js.Any
    
    var htmlWebpackPlugin: Files
    
    var webpackConfig: js.Any
  }
  object TemplateParameter {
    
    @scala.inline
    def apply(compilation: js.Any, htmlWebpackPlugin: Files, webpackConfig: js.Any): TemplateParameter = {
      val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], htmlWebpackPlugin = htmlWebpackPlugin.asInstanceOf[js.Any], webpackConfig = webpackConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateParameter]
    }
    
    @scala.inline
    implicit class TemplateParameterMutableBuilder[Self <: TemplateParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompilation(value: js.Any): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlWebpackPlugin(value: Files): Self = StObject.set(x, "htmlWebpackPlugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebpackConfig(value: js.Any): Self = StObject.set(x, "webpackConfig", value.asInstanceOf[js.Any])
    }
  }
}
