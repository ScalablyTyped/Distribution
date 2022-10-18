package typings.lasso

import org.scalablytyped.runtime.StringDictionary
import typings.lasso.anon.Crossorigin
import typings.lasso.libLassoContextMod.default
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDependenciesMod {
  
  @JSImport("lasso/lib/dependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRegistry(): DependencyRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistry")().asInstanceOf[DependencyRegistry]
  
  inline def isDependency(d: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDependency")(d.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRegistry(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegistry")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Bundle extends StObject {
    
    var dependencies: js.Array[DependencyConfig | String]
    
    var name: String
  }
  object Bundle {
    
    inline def apply(dependencies: js.Array[DependencyConfig | String], name: String): Bundle = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bundle]
    }
    
    extension [Self <: Bundle](x: Self) {
      
      inline def setDependencies(value: js.Array[DependencyConfig | String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: (DependencyConfig | String)*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Callback = js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Any], Any]
  
  @js.native
  trait Dependency
    extends EventEmitter
       with DependencyConfig {
    
    def apply(dependencyConfig: DependencyConfig, dirname: String): Dependency = js.native
    def apply(dependencyConfig: DependencyConfig, dirname: String, filename: String): Dependency = js.native
    
    var _packageDependency: js.UndefOr[Boolean] = js.native
    
    def calculateKey(lassoContext: default, callback: Callback): Any = js.native
    
    def calculateKeyFromProps(): String = js.native
    
    var contentType: js.UndefOr[String] = js.native
    
    def createPackageManifest(): Any = js.native
    def createPackageManifest(manifest: Any): Any = js.native
    def createPackageManifest(manifest: Any, dirname: String): Any = js.native
    def createPackageManifest(manifest: Any, dirname: String, filename: String): Any = js.native
    def createPackageManifest(manifest: Any, dirname: Unit, filename: String): Any = js.native
    def createPackageManifest(manifest: Unit, dirname: String): Any = js.native
    def createPackageManifest(manifest: Unit, dirname: String, filename: String): Any = js.native
    def createPackageManifest(manifest: Unit, dirname: Unit, filename: String): Any = js.native
    
    def createReadStream(lassoContext: default): Any = js.native
    
    def doCalculateKey(lassoContext: default, callback: Callback): Any = js.native
    
    def doGetLastModified(lassoContext: Any, callback: Callback): Any = js.native
    
    def doInit(lassoContext: default, callback: Callback): Unit = js.native
    
    def getContentType(): Any = js.native
    
    def getDefaultBundleName(): String = js.native
    def getDefaultBundleName(pageBundleName: String): String = js.native
    def getDefaultBundleName(pageBundleName: String, lassoContext: default): String = js.native
    def getDefaultBundleName(pageBundleName: Unit, lassoContext: default): String = js.native
    
    def getDir(): String | Null = js.native
    
    def getFileLastModified(path: String, callback: Callback): Any = js.native
    
    def getJavaScriptSlot(): Any = js.native
    
    def getKey(): Any = js.native
    
    def getLastModified(lassoContext: default, callback: Callback): Any = js.native
    
    def getPackageManifest(lassoContext: default, callback: Callback): Any = js.native
    
    def getParentManifestDir(): String = js.native
    
    def getParentManifestPath(): String = js.native
    
    def getPropsKey(): Any = js.native
    
    def getReadCacheKey(): Any = js.native
    
    def getSlot(): Any = js.native
    
    def getSourceFile(): Any = js.native
    
    def getStyleSheetSlot(): Any = js.native
    
    def hasContent(): Boolean = js.native
    
    def hasModifiedFingerprint(): Boolean = js.native
    
    def init(lassoContext: default, callback: Callback): Any = js.native
    
    def inspect(): Any = js.native
    
    def isCompiled(): Boolean = js.native
    
    def isExternalResource(): Boolean = js.native
    
    def isInPlaceDeploymentAllowed(): Boolean = js.native
    
    def isJavaScript(): Boolean = js.native
    
    def isPackageDependency(): Boolean = js.native
    
    def isPageBundleOnlyDependency(): Boolean = js.native
    
    def isStyleSheet(): Boolean = js.native
    
    def onAddToAsyncPageBundle(bundle: Bundle, lassoContext: default): Unit = js.native
    
    def onAddToPageBundle(bundle: Bundle, lassoContext: default): Unit = js.native
    
    var properties: js.UndefOr[StringDictionary[String]] = js.native
    
    def read(context: Any, callback: Callback): Any = js.native
    
    def resolvePath(path: String): String = js.native
    def resolvePath(path: String, from: String): String = js.native
    
    def set(props: Any): Unit = js.native
    
    def shouldCache(lassoContext: default): Boolean = js.native
  }
  
  trait DependencyConfig extends StObject {
    
    var attributes: js.UndefOr[Crossorigin] = js.undefined
    
    var `css-slot`: js.UndefOr[String] = js.undefined
    
    var dependencies: js.UndefOr[js.Array[DependencyConfig | String]] = js.undefined
    
    var external: js.UndefOr[Boolean] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var `if`: js.UndefOr[String] = js.undefined
    
    var `if-flag`: js.UndefOr[String] = js.undefined
    
    var `if-not-flag`: js.UndefOr[String] = js.undefined
    
    var `inline`: js.UndefOr[String] = js.undefined
    
    var `js-slot`: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var require: js.UndefOr[String] = js.undefined
    
    var `require-run`: js.UndefOr[String] = js.undefined
    
    var slot: js.UndefOr[String] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object DependencyConfig {
    
    inline def apply(): DependencyConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DependencyConfig]
    }
    
    extension [Self <: DependencyConfig](x: Self) {
      
      inline def setAttributes(value: Crossorigin): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def `setCss-slot`(value: String): Self = StObject.set(x, "css-slot", value.asInstanceOf[js.Any])
      
      inline def `setCss-slotUndefined`: Self = StObject.set(x, "css-slot", js.undefined)
      
      inline def setDependencies(value: js.Array[DependencyConfig | String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: (DependencyConfig | String)*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setIf(value: String): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
      
      inline def `setIf-flag`(value: String): Self = StObject.set(x, "if-flag", value.asInstanceOf[js.Any])
      
      inline def `setIf-flagUndefined`: Self = StObject.set(x, "if-flag", js.undefined)
      
      inline def `setIf-not-flag`(value: String): Self = StObject.set(x, "if-not-flag", value.asInstanceOf[js.Any])
      
      inline def `setIf-not-flagUndefined`: Self = StObject.set(x, "if-not-flag", js.undefined)
      
      inline def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
      
      inline def setInline(value: String): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def `setJs-slot`(value: String): Self = StObject.set(x, "js-slot", value.asInstanceOf[js.Any])
      
      inline def `setJs-slotUndefined`: Self = StObject.set(x, "js-slot", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRequire(value: String): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def `setRequire-run`(value: String): Self = StObject.set(x, "require-run", value.asInstanceOf[js.Any])
      
      inline def `setRequire-runUndefined`: Self = StObject.set(x, "require-run", js.undefined)
      
      inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait DependencyRegistry extends StObject {
    
    def addNormalizer(normalizerFunc: Any): Any = js.native
    
    def createDependency(config: Any, dirname: String): Any = js.native
    def createDependency(config: Any, dirname: String, filename: String): Any = js.native
    
    def createRequireHandler(path: String, lassoContext: default, userOptions: Any): Any = js.native
    
    def createResourceTransformType(transformFunc: Any): Any = js.native
    
    var extensions: Any = js.native
    
    def getRequireExtensionNames(): Any = js.native
    
    def getRequireHandler(path: String, lassoContext: default): Any = js.native
    
    def getType(`type`: String): Any = js.native
    
    def normalizeDependencies(dependencies: js.Array[Any], dirname: String, filename: String, callback: Callback): Any = js.native
    
    def registerDefaults(): Unit = js.native
    
    def registerExtension(`extension`: String, `type`: String): Unit = js.native
    
    def registerJavaScriptType(`type`: String, mixins: Any): Unit = js.native
    
    def registerPackageType(`type`: String, mixins: Any): Unit = js.native
    
    def registerRequireExtension(ext: String, options: Any): Unit = js.native
    
    def registerRequireType(`type`: String, options: Any): Unit = js.native
    
    def registerStyleSheetType(`type`: String, mixins: Any): Unit = js.native
    
    def registerType(`type`: String, mixins: Any): Unit = js.native
    
    var registeredTypes: Any = js.native
    
    var requireExtensionNames: Any = js.native
    
    var requireExtensions: Any = js.native
    
    def typeForPath(path: String): String = js.native
  }
}
