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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lassoMod {
  
  @JSImport("lasso/lib/Lasso", JSImport.Default)
  @js.native
  class default protected () extends Lasso {
    def this(config: LassoConfig) = this()
  }
  
  type Callback = js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[js.Any], js.Any]
  
  trait CustomPlugin extends StObject {
    
    var config: js.Any
    
    var plugin: String
  }
  object CustomPlugin {
    
    inline def apply(config: js.Any, plugin: String): CustomPlugin = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomPlugin]
    }
    
    extension [Self <: CustomPlugin](x: Self) {
      
      inline def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
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
    
    def lassoPage(options: PageConfig): js.Promise[js.Any] = js.native
    def lassoPage(
      options: PageConfig,
      callback: js.Function2[/* err */ Error | Null, /* result */ LassoPageResult, Unit]
    ): js.Promise[js.Any] = js.native
    @JSName("lassoPage")
    var lassoPage_Original: LassoPage = js.native
    
    def lassoResource(path: String): Unit = js.native
    def lassoResource(path: String, options: js.Any): Unit = js.native
    def lassoResource(path: String, options: js.Any, callback: Callback): Unit = js.native
    def lassoResource(path: String, options: Unit, callback: Callback): Unit = js.native
    @JSName("lassoResource")
    var lassoResource_Original: LassoResource = js.native
    
    def setCSPNonceProvider(func: js.Any): js.Any = js.native
    
    def writer(impl: js.Any): Writer = js.native
    @JSName("writer")
    var writer_Original: typings.lasso.writersMod.Writer = js.native
  }
  
  trait LassoConfig extends StObject {
    
    var baseDir: js.UndefOr[String] = js.undefined
    
    var bundles: js.UndefOr[js.Array[Bundle]] = js.undefined
    
    var bundlingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var cspNonceProvider: js.UndefOr[js.Function1[/* out */ js.Any, String]] = js.undefined
    
    var fingerprintInlineCode: js.UndefOr[js.Function1[/* code */ js.Any, String]] = js.undefined
    
    var fingerprintsEnabled: js.UndefOr[Boolean] = js.undefined
    
    var includeSlotNames: js.UndefOr[Boolean] = js.undefined
    
    var minify: js.UndefOr[Boolean] = js.undefined
    
    var minifyCSS: js.UndefOr[Boolean] = js.undefined
    
    var minifyInlineCSSOnly: js.UndefOr[Boolean] = js.undefined
    
    var minifyInlineJSOnly: js.UndefOr[Boolean] = js.undefined
    
    var minifyInlineOnly: js.UndefOr[Boolean] = js.undefined
    
    var minifyJS: js.UndefOr[Boolean] = js.undefined
    
    var noConflict: js.UndefOr[String] = js.undefined
    
    var outputDir: js.UndefOr[String] = js.undefined
    
    var plugins: js.UndefOr[js.Array[CustomPlugin | String]] = js.undefined
    
    var relativeUrlsEnabled: js.UndefOr[Boolean] = js.undefined
    
    var require: js.UndefOr[js.Any] = js.undefined
    
    var resolveCssUrls: js.UndefOr[Boolean] = js.undefined
    
    var urlPrefix: js.UndefOr[String] = js.undefined
  }
  object LassoConfig {
    
    inline def apply(): LassoConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LassoConfig]
    }
    
    extension [Self <: LassoConfig](x: Self) {
      
      inline def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      inline def setBaseDirUndefined: Self = StObject.set(x, "baseDir", js.undefined)
      
      inline def setBundles(value: js.Array[Bundle]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
      
      inline def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
      
      inline def setBundlesVarargs(value: Bundle*): Self = StObject.set(x, "bundles", js.Array(value :_*))
      
      inline def setBundlingEnabled(value: Boolean): Self = StObject.set(x, "bundlingEnabled", value.asInstanceOf[js.Any])
      
      inline def setBundlingEnabledUndefined: Self = StObject.set(x, "bundlingEnabled", js.undefined)
      
      inline def setCspNonceProvider(value: /* out */ js.Any => String): Self = StObject.set(x, "cspNonceProvider", js.Any.fromFunction1(value))
      
      inline def setCspNonceProviderUndefined: Self = StObject.set(x, "cspNonceProvider", js.undefined)
      
      inline def setFingerprintInlineCode(value: /* code */ js.Any => String): Self = StObject.set(x, "fingerprintInlineCode", js.Any.fromFunction1(value))
      
      inline def setFingerprintInlineCodeUndefined: Self = StObject.set(x, "fingerprintInlineCode", js.undefined)
      
      inline def setFingerprintsEnabled(value: Boolean): Self = StObject.set(x, "fingerprintsEnabled", value.asInstanceOf[js.Any])
      
      inline def setFingerprintsEnabledUndefined: Self = StObject.set(x, "fingerprintsEnabled", js.undefined)
      
      inline def setIncludeSlotNames(value: Boolean): Self = StObject.set(x, "includeSlotNames", value.asInstanceOf[js.Any])
      
      inline def setIncludeSlotNamesUndefined: Self = StObject.set(x, "includeSlotNames", js.undefined)
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyCSS(value: Boolean): Self = StObject.set(x, "minifyCSS", value.asInstanceOf[js.Any])
      
      inline def setMinifyCSSUndefined: Self = StObject.set(x, "minifyCSS", js.undefined)
      
      inline def setMinifyInlineCSSOnly(value: Boolean): Self = StObject.set(x, "minifyInlineCSSOnly", value.asInstanceOf[js.Any])
      
      inline def setMinifyInlineCSSOnlyUndefined: Self = StObject.set(x, "minifyInlineCSSOnly", js.undefined)
      
      inline def setMinifyInlineJSOnly(value: Boolean): Self = StObject.set(x, "minifyInlineJSOnly", value.asInstanceOf[js.Any])
      
      inline def setMinifyInlineJSOnlyUndefined: Self = StObject.set(x, "minifyInlineJSOnly", js.undefined)
      
      inline def setMinifyInlineOnly(value: Boolean): Self = StObject.set(x, "minifyInlineOnly", value.asInstanceOf[js.Any])
      
      inline def setMinifyInlineOnlyUndefined: Self = StObject.set(x, "minifyInlineOnly", js.undefined)
      
      inline def setMinifyJS(value: Boolean): Self = StObject.set(x, "minifyJS", value.asInstanceOf[js.Any])
      
      inline def setMinifyJSUndefined: Self = StObject.set(x, "minifyJS", js.undefined)
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setNoConflict(value: String): Self = StObject.set(x, "noConflict", value.asInstanceOf[js.Any])
      
      inline def setNoConflictUndefined: Self = StObject.set(x, "noConflict", js.undefined)
      
      inline def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
      
      inline def setOutputDirUndefined: Self = StObject.set(x, "outputDir", js.undefined)
      
      inline def setPlugins(value: js.Array[CustomPlugin | String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: (CustomPlugin | String)*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      inline def setRelativeUrlsEnabled(value: Boolean): Self = StObject.set(x, "relativeUrlsEnabled", value.asInstanceOf[js.Any])
      
      inline def setRelativeUrlsEnabledUndefined: Self = StObject.set(x, "relativeUrlsEnabled", js.undefined)
      
      inline def setRequire(value: js.Any): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      inline def setResolveCssUrls(value: Boolean): Self = StObject.set(x, "resolveCssUrls", value.asInstanceOf[js.Any])
      
      inline def setResolveCssUrlsUndefined: Self = StObject.set(x, "resolveCssUrls", js.undefined)
      
      inline def setUrlPrefix(value: String): Self = StObject.set(x, "urlPrefix", value.asInstanceOf[js.Any])
      
      inline def setUrlPrefixUndefined: Self = StObject.set(x, "urlPrefix", js.undefined)
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
  
  trait PageConfig extends StObject {
    
    var cache: js.UndefOr[js.Any] = js.undefined
    
    var cacheKey: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var dependencies: (js.Array[DependencyConfig | String]) | String | Null
    
    var flags: js.UndefOr[js.Array[String]] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var lassoContext: js.UndefOr[typings.lasso.lassoContextMod.default] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var packagePath: js.UndefOr[String] = js.undefined
    
    var packagePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    var pageName: js.UndefOr[String] = js.undefined
  }
  object PageConfig {
    
    inline def apply(): PageConfig = {
      val __obj = js.Dynamic.literal(dependencies = null)
      __obj.asInstanceOf[PageConfig]
    }
    
    extension [Self <: PageConfig](x: Self) {
      
      inline def setCache(value: js.Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDependencies(value: (js.Array[DependencyConfig | String]) | String): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesNull: Self = StObject.set(x, "dependencies", null)
      
      inline def setDependenciesVarargs(value: (DependencyConfig | String)*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      inline def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value :_*))
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setLassoContext(value: typings.lasso.lassoContextMod.default): Self = StObject.set(x, "lassoContext", value.asInstanceOf[js.Any])
      
      inline def setLassoContextUndefined: Self = StObject.set(x, "lassoContext", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPackagePath(value: String): Self = StObject.set(x, "packagePath", value.asInstanceOf[js.Any])
      
      inline def setPackagePathUndefined: Self = StObject.set(x, "packagePath", js.undefined)
      
      inline def setPackagePaths(value: js.Array[String]): Self = StObject.set(x, "packagePaths", value.asInstanceOf[js.Any])
      
      inline def setPackagePathsUndefined: Self = StObject.set(x, "packagePaths", js.undefined)
      
      inline def setPackagePathsVarargs(value: String*): Self = StObject.set(x, "packagePaths", js.Array(value :_*))
      
      inline def setPageName(value: String): Self = StObject.set(x, "pageName", value.asInstanceOf[js.Any])
      
      inline def setPageNameUndefined: Self = StObject.set(x, "pageName", js.undefined)
    }
  }
}
