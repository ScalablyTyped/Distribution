package typings.lasso

import typings.lasso.anon.Parts
import typings.lasso.dependenciesMod.Bundle
import typings.lasso.dependenciesMod.DependencyConfig
import typings.lasso.dependenciesMod.DependencyRegistry
import typings.lasso.lassoPageResultMod.LassoPageResult
import typings.lasso.writerMod.Writer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lassoMod {
  
  @JSImport("lasso/lib/Lasso", JSImport.Default)
  @js.native
  class default protected () extends Lasso {
    def this(config: LassoConfig) = this()
  }
  
  type Callback = js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[js.Any], js.Any]
  
  @js.native
  trait CustomPlugin extends StObject {
    
    var config: js.Any = js.native
    
    var plugin: String = js.native
  }
  object CustomPlugin {
    
    @scala.inline
    def apply(config: js.Any, plugin: String): CustomPlugin = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomPlugin]
    }
    
    @scala.inline
    implicit class CustomPluginMutableBuilder[Self <: CustomPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Lasso extends EventEmitter {
    
    def addTransform(transform: js.Any): Unit = js.native
    
    def buildLassoCacheKey(lassoContext: typings.lasso.lassoContextMod.default): Parts = js.native
    
    def buildPageBundles(options: js.Any, lassoContext: typings.lasso.lassoContextMod.default, callback: Callback): Unit = js.native
    
    var config: LassoConfig = js.native
    
    def createAppBundleMappings(bundleSetConfig: js.Any, lassoContext: typings.lasso.lassoContextMod.default, callback: Callback): js.Any = js.native
    
    def createLassoContext(): typings.lasso.lassoContextMod.default = js.native
    def createLassoContext(options: js.Any): typings.lasso.lassoContextMod.default = js.native
    
    var dependencies: DependencyRegistry = js.native
    
    def getAppBundleMappingsCached(bundleSetConfig: js.Any, lassoContext: typings.lasso.lassoContextMod.default, callback: Callback): Unit = js.native
    
    def getCSSDependencyHtml(url: String): String = js.native
    def getCSSDependencyHtml(url: String, attributes: js.Any): String = js.native
    
    def getConfig(): LassoConfig = js.native
    
    def getDependencyRegistry(): DependencyRegistry = js.native
    
    def getJavaScriptDependencyHtml(url: String): String = js.native
    def getJavaScriptDependencyHtml(url: String, attributes: js.Any): String = js.native
    
    def getLassoCache(lassoContext: typings.lasso.lassoContextMod.default): js.Any = js.native
    
    def initPlugins(): Unit = js.native
    
    var lassoCacheLookup: js.Any = js.native
    
    def lassoPage(options: PageConfig): js.Promise[_] = js.native
    def lassoPage(
      options: PageConfig,
      callback: js.Function2[/* err */ Error | Null, /* result */ LassoPageResult, Unit]
    ): js.Promise[_] = js.native
    @JSName("lassoPage")
    var lassoPage_Original: LassoPage = js.native
    
    def lassoResource(path: String): Unit = js.native
    def lassoResource(path: String, options: js.UndefOr[scala.Nothing], callback: Callback): Unit = js.native
    def lassoResource(path: String, options: js.Any): Unit = js.native
    def lassoResource(path: String, options: js.Any, callback: Callback): Unit = js.native
    @JSName("lassoResource")
    var lassoResource_Original: LassoResource = js.native
    
    def setCSPNonceProvider(func: js.Any): js.Any = js.native
    
    def writer(impl: js.Any): Writer = js.native
    @JSName("writer")
    var writer_Original: typings.lasso.writersMod.Writer = js.native
  }
  
  @js.native
  trait LassoConfig extends StObject {
    
    var baseDir: js.UndefOr[String] = js.native
    
    var bundles: js.UndefOr[js.Array[Bundle]] = js.native
    
    var bundlingEnabled: js.UndefOr[Boolean] = js.native
    
    var cspNonceProvider: js.UndefOr[js.Function1[/* out */ js.Any, String]] = js.native
    
    var fingerprintInlineCode: js.UndefOr[js.Function1[/* code */ js.Any, String]] = js.native
    
    var fingerprintsEnabled: js.UndefOr[Boolean] = js.native
    
    var includeSlotNames: js.UndefOr[Boolean] = js.native
    
    var minify: js.UndefOr[Boolean] = js.native
    
    var minifyCSS: js.UndefOr[Boolean] = js.native
    
    var minifyInlineCSSOnly: js.UndefOr[Boolean] = js.native
    
    var minifyInlineJSOnly: js.UndefOr[Boolean] = js.native
    
    var minifyInlineOnly: js.UndefOr[Boolean] = js.native
    
    var minifyJS: js.UndefOr[Boolean] = js.native
    
    var noConflict: js.UndefOr[String] = js.native
    
    var outputDir: js.UndefOr[String] = js.native
    
    var plugins: js.UndefOr[js.Array[CustomPlugin | String]] = js.native
    
    var relativeUrlsEnabled: js.UndefOr[Boolean] = js.native
    
    var require: js.UndefOr[js.Any] = js.native
    
    var resolveCssUrls: js.UndefOr[Boolean] = js.native
    
    var urlPrefix: js.UndefOr[String] = js.native
  }
  object LassoConfig {
    
    @scala.inline
    def apply(): LassoConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LassoConfig]
    }
    
    @scala.inline
    implicit class LassoConfigMutableBuilder[Self <: LassoConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseDirUndefined: Self = StObject.set(x, "baseDir", js.undefined)
      
      @scala.inline
      def setBundles(value: js.Array[Bundle]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
      
      @scala.inline
      def setBundlesVarargs(value: Bundle*): Self = StObject.set(x, "bundles", js.Array(value :_*))
      
      @scala.inline
      def setBundlingEnabled(value: Boolean): Self = StObject.set(x, "bundlingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundlingEnabledUndefined: Self = StObject.set(x, "bundlingEnabled", js.undefined)
      
      @scala.inline
      def setCspNonceProvider(value: /* out */ js.Any => String): Self = StObject.set(x, "cspNonceProvider", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCspNonceProviderUndefined: Self = StObject.set(x, "cspNonceProvider", js.undefined)
      
      @scala.inline
      def setFingerprintInlineCode(value: /* code */ js.Any => String): Self = StObject.set(x, "fingerprintInlineCode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFingerprintInlineCodeUndefined: Self = StObject.set(x, "fingerprintInlineCode", js.undefined)
      
      @scala.inline
      def setFingerprintsEnabled(value: Boolean): Self = StObject.set(x, "fingerprintsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFingerprintsEnabledUndefined: Self = StObject.set(x, "fingerprintsEnabled", js.undefined)
      
      @scala.inline
      def setIncludeSlotNames(value: Boolean): Self = StObject.set(x, "includeSlotNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeSlotNamesUndefined: Self = StObject.set(x, "includeSlotNames", js.undefined)
      
      @scala.inline
      def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifyCSS(value: Boolean): Self = StObject.set(x, "minifyCSS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifyCSSUndefined: Self = StObject.set(x, "minifyCSS", js.undefined)
      
      @scala.inline
      def setMinifyInlineCSSOnly(value: Boolean): Self = StObject.set(x, "minifyInlineCSSOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifyInlineCSSOnlyUndefined: Self = StObject.set(x, "minifyInlineCSSOnly", js.undefined)
      
      @scala.inline
      def setMinifyInlineJSOnly(value: Boolean): Self = StObject.set(x, "minifyInlineJSOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifyInlineJSOnlyUndefined: Self = StObject.set(x, "minifyInlineJSOnly", js.undefined)
      
      @scala.inline
      def setMinifyInlineOnly(value: Boolean): Self = StObject.set(x, "minifyInlineOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifyInlineOnlyUndefined: Self = StObject.set(x, "minifyInlineOnly", js.undefined)
      
      @scala.inline
      def setMinifyJS(value: Boolean): Self = StObject.set(x, "minifyJS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifyJSUndefined: Self = StObject.set(x, "minifyJS", js.undefined)
      
      @scala.inline
      def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      @scala.inline
      def setNoConflict(value: String): Self = StObject.set(x, "noConflict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoConflictUndefined: Self = StObject.set(x, "noConflict", js.undefined)
      
      @scala.inline
      def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputDirUndefined: Self = StObject.set(x, "outputDir", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[CustomPlugin | String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: (CustomPlugin | String)*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setRelativeUrlsEnabled(value: Boolean): Self = StObject.set(x, "relativeUrlsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUrlsEnabledUndefined: Self = StObject.set(x, "relativeUrlsEnabled", js.undefined)
      
      @scala.inline
      def setRequire(value: js.Any): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      @scala.inline
      def setResolveCssUrls(value: Boolean): Self = StObject.set(x, "resolveCssUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveCssUrlsUndefined: Self = StObject.set(x, "resolveCssUrls", js.undefined)
      
      @scala.inline
      def setUrlPrefix(value: String): Self = StObject.set(x, "urlPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlPrefixUndefined: Self = StObject.set(x, "urlPrefix", js.undefined)
    }
  }
  
  type LassoPage = js.Function2[
    /* options */ PageConfig, 
    /* callback */ js.UndefOr[js.Function2[/* err */ Error | Null, /* result */ LassoPageResult, Unit]], 
    js.Promise[js.Any]
  ]
  
  type LassoResource = js.Function3[
    /* path */ String, 
    /* options */ js.UndefOr[js.Any], 
    /* callback */ js.UndefOr[Callback], 
    Unit
  ]
  
  @js.native
  trait PageConfig extends StObject {
    
    var cache: js.UndefOr[js.Any] = js.native
    
    var cacheKey: js.UndefOr[String] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var dependencies: (js.Array[DependencyConfig | String]) | String | Null = js.native
    
    var flags: js.UndefOr[js.Array[String]] = js.native
    
    var from: js.UndefOr[String] = js.native
    
    var lassoContext: js.UndefOr[typings.lasso.lassoContextMod.default] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var packagePath: js.UndefOr[String] = js.native
    
    var packagePaths: js.UndefOr[js.Array[String]] = js.native
    
    var pageName: js.UndefOr[String] = js.native
  }
  object PageConfig {
    
    @scala.inline
    def apply(): PageConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageConfig]
    }
    
    @scala.inline
    implicit class PageConfigMutableBuilder[Self <: PageConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: js.Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDependencies(value: (js.Array[DependencyConfig | String]) | String): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesNull: Self = StObject.set(x, "dependencies", null)
      
      @scala.inline
      def setDependenciesVarargs(value: (DependencyConfig | String)*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      @scala.inline
      def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value :_*))
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setLassoContext(value: typings.lasso.lassoContextMod.default): Self = StObject.set(x, "lassoContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLassoContextUndefined: Self = StObject.set(x, "lassoContext", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPackagePath(value: String): Self = StObject.set(x, "packagePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackagePathUndefined: Self = StObject.set(x, "packagePath", js.undefined)
      
      @scala.inline
      def setPackagePaths(value: js.Array[String]): Self = StObject.set(x, "packagePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackagePathsUndefined: Self = StObject.set(x, "packagePaths", js.undefined)
      
      @scala.inline
      def setPackagePathsVarargs(value: String*): Self = StObject.set(x, "packagePaths", js.Array(value :_*))
      
      @scala.inline
      def setPageName(value: String): Self = StObject.set(x, "pageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageNameUndefined: Self = StObject.set(x, "pageName", js.undefined)
    }
  }
}
