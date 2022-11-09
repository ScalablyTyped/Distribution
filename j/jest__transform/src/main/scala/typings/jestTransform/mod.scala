package typings.jestTransform

import typings.jestTypes.mod.CoverageProvider
import typings.jestTypes.mod.ProjectConfig
import typings.std.Error
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jest/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createScriptTransformer(config: ProjectConfig): js.Promise[ScriptTransformer] = ^.asInstanceOf[js.Dynamic].applyDynamic("createScriptTransformer")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ScriptTransformer]]
  inline def createScriptTransformer(config: ProjectConfig, cacheFS: StringMap): js.Promise[ScriptTransformer] = (^.asInstanceOf[js.Dynamic].applyDynamic("createScriptTransformer")(config.asInstanceOf[js.Any], cacheFS.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ScriptTransformer]]
  
  inline def createTranspilingRequire(config: ProjectConfig): js.Promise[
    js.Function2[
      /* resolverPath */ String, 
      /* applyInteropRequireDefault */ js.UndefOr[Boolean], 
      js.Promise[Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTranspilingRequire")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    js.Function2[
      /* resolverPath */ String, 
      /* applyInteropRequireDefault */ js.UndefOr[Boolean], 
      js.Promise[Any]
    ]
  ]]
  
  inline def handlePotentialSyntaxError(e: ErrorWithCodeFrame): ErrorWithCodeFrame = ^.asInstanceOf[js.Dynamic].applyDynamic("handlePotentialSyntaxError")(e.asInstanceOf[js.Any]).asInstanceOf[ErrorWithCodeFrame]
  
  inline def shouldInstrument(filename: String, options: ShouldInstrumentOptions, config: ProjectConfig): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldInstrument")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait AsyncTransformer[TransformerConfig]
    extends StObject
       with Transformer2[TransformerConfig] {
    
    /**
      * Indicates if the transformer is capable of instrumenting the code for code coverage.
      *
      * If V8 coverage is _not_ active, and this is `true`, Jest will assume the code is instrumented.
      * If V8 coverage is _not_ active, and this is `false`. Jest will instrument the code returned by this transformer using Babel.
      */
    var canInstrument: js.UndefOr[Boolean] = js.undefined
    
    var getCacheKey: js.UndefOr[
        js.Function3[
          /* sourceText */ String, 
          /* sourcePath */ String, 
          /* options */ TransformOptions[TransformerConfig], 
          String
        ]
      ] = js.undefined
    
    var getCacheKeyAsync: js.UndefOr[
        js.Function3[
          /* sourceText */ String, 
          /* sourcePath */ String, 
          /* options */ TransformOptions[TransformerConfig], 
          js.Promise[String]
        ]
      ] = js.undefined
    
    var process: js.UndefOr[
        js.Function3[
          /* sourceText */ String, 
          /* sourcePath */ String, 
          /* options */ TransformOptions[TransformerConfig], 
          TransformedSource
        ]
      ] = js.undefined
    
    def processAsync(sourceText: String, sourcePath: String, options: TransformOptions[TransformerConfig]): js.Promise[TransformedSource]
  }
  object AsyncTransformer {
    
    inline def apply[TransformerConfig](
      processAsync: (String, String, TransformOptions[TransformerConfig]) => js.Promise[TransformedSource]
    ): AsyncTransformer[TransformerConfig] = {
      val __obj = js.Dynamic.literal(processAsync = js.Any.fromFunction3(processAsync))
      __obj.asInstanceOf[AsyncTransformer[TransformerConfig]]
    }
    
    extension [Self <: AsyncTransformer[?], TransformerConfig](x: Self & AsyncTransformer[TransformerConfig]) {
      
      inline def setCanInstrument(value: Boolean): Self = StObject.set(x, "canInstrument", value.asInstanceOf[js.Any])
      
      inline def setCanInstrumentUndefined: Self = StObject.set(x, "canInstrument", js.undefined)
      
      inline def setGetCacheKey(
        value: (/* sourceText */ String, /* sourcePath */ String, /* options */ TransformOptions[TransformerConfig]) => String
      ): Self = StObject.set(x, "getCacheKey", js.Any.fromFunction3(value))
      
      inline def setGetCacheKeyAsync(
        value: (/* sourceText */ String, /* sourcePath */ String, /* options */ TransformOptions[TransformerConfig]) => js.Promise[String]
      ): Self = StObject.set(x, "getCacheKeyAsync", js.Any.fromFunction3(value))
      
      inline def setGetCacheKeyAsyncUndefined: Self = StObject.set(x, "getCacheKeyAsync", js.undefined)
      
      inline def setGetCacheKeyUndefined: Self = StObject.set(x, "getCacheKey", js.undefined)
      
      inline def setProcess(
        value: (/* sourceText */ String, /* sourcePath */ String, /* options */ TransformOptions[TransformerConfig]) => TransformedSource
      ): Self = StObject.set(x, "process", js.Any.fromFunction3(value))
      
      inline def setProcessAsync(value: (String, String, TransformOptions[TransformerConfig]) => js.Promise[TransformedSource]): Self = StObject.set(x, "processAsync", js.Any.fromFunction3(value))
      
      inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    }
  }
  
  trait CallerTransformOptions extends StObject {
    
    var supportsDynamicImport: Boolean
    
    var supportsExportNamespaceFrom: Boolean
    
    var supportsStaticESM: Boolean
    
    var supportsTopLevelAwait: Boolean
  }
  object CallerTransformOptions {
    
    inline def apply(
      supportsDynamicImport: Boolean,
      supportsExportNamespaceFrom: Boolean,
      supportsStaticESM: Boolean,
      supportsTopLevelAwait: Boolean
    ): CallerTransformOptions = {
      val __obj = js.Dynamic.literal(supportsDynamicImport = supportsDynamicImport.asInstanceOf[js.Any], supportsExportNamespaceFrom = supportsExportNamespaceFrom.asInstanceOf[js.Any], supportsStaticESM = supportsStaticESM.asInstanceOf[js.Any], supportsTopLevelAwait = supportsTopLevelAwait.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallerTransformOptions]
    }
    
    extension [Self <: CallerTransformOptions](x: Self) {
      
      inline def setSupportsDynamicImport(value: Boolean): Self = StObject.set(x, "supportsDynamicImport", value.asInstanceOf[js.Any])
      
      inline def setSupportsExportNamespaceFrom(value: Boolean): Self = StObject.set(x, "supportsExportNamespaceFrom", value.asInstanceOf[js.Any])
      
      inline def setSupportsStaticESM(value: Boolean): Self = StObject.set(x, "supportsStaticESM", value.asInstanceOf[js.Any])
      
      inline def setSupportsTopLevelAwait(value: Boolean): Self = StObject.set(x, "supportsTopLevelAwait", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorWithCodeFrame
    extends StObject
       with Error {
    
    var codeFrame: js.UndefOr[String] = js.undefined
  }
  object ErrorWithCodeFrame {
    
    inline def apply(message: String, name: String): ErrorWithCodeFrame = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorWithCodeFrame]
    }
    
    extension [Self <: ErrorWithCodeFrame](x: Self) {
      
      inline def setCodeFrame(value: String): Self = StObject.set(x, "codeFrame", value.asInstanceOf[js.Any])
      
      inline def setCodeFrameUndefined: Self = StObject.set(x, "codeFrame", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<@jridgewell/trace-mapping.@jridgewell/trace-mapping.EncodedSourceMap, 'version'> */
  trait FixedRawSourceMap extends StObject {
    
    var file: js.UndefOr[String | Null] = js.undefined
    
    var mappings: String
    
    var names: js.Array[String]
    
    var sourceRoot: js.UndefOr[String] = js.undefined
    
    var sources: js.Array[String | Null]
    
    var sourcesContent: js.UndefOr[js.Array[String | Null]] = js.undefined
    
    var version: Double
  }
  object FixedRawSourceMap {
    
    inline def apply(mappings: String, names: js.Array[String], sources: js.Array[String | Null], version: Double): FixedRawSourceMap = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedRawSourceMap]
    }
    
    extension [Self <: FixedRawSourceMap](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileNull: Self = StObject.set(x, "file", null)
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setSources(value: js.Array[String | Null]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesContent(value: js.Array[String | Null]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
      
      inline def setSourcesContentVarargs(value: (String | Null)*): Self = StObject.set(x, "sourcesContent", js.Array(value*))
      
      inline def setSourcesVarargs(value: (String | Null)*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReducedTransformOptions
    extends StObject
       with CallerTransformOptions {
    
    var instrument: Boolean
  }
  object ReducedTransformOptions {
    
    inline def apply(
      instrument: Boolean,
      supportsDynamicImport: Boolean,
      supportsExportNamespaceFrom: Boolean,
      supportsStaticESM: Boolean,
      supportsTopLevelAwait: Boolean
    ): ReducedTransformOptions = {
      val __obj = js.Dynamic.literal(instrument = instrument.asInstanceOf[js.Any], supportsDynamicImport = supportsDynamicImport.asInstanceOf[js.Any], supportsExportNamespaceFrom = supportsExportNamespaceFrom.asInstanceOf[js.Any], supportsStaticESM = supportsStaticESM.asInstanceOf[js.Any], supportsTopLevelAwait = supportsTopLevelAwait.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReducedTransformOptions]
    }
    
    extension [Self <: ReducedTransformOptions](x: Self) {
      
      inline def setInstrument(value: Boolean): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequireAndTranspileModuleOptions
    extends StObject
       with ReducedTransformOptions {
    
    var applyInteropRequireDefault: Boolean
  }
  object RequireAndTranspileModuleOptions {
    
    inline def apply(
      applyInteropRequireDefault: Boolean,
      instrument: Boolean,
      supportsDynamicImport: Boolean,
      supportsExportNamespaceFrom: Boolean,
      supportsStaticESM: Boolean,
      supportsTopLevelAwait: Boolean
    ): RequireAndTranspileModuleOptions = {
      val __obj = js.Dynamic.literal(applyInteropRequireDefault = applyInteropRequireDefault.asInstanceOf[js.Any], instrument = instrument.asInstanceOf[js.Any], supportsDynamicImport = supportsDynamicImport.asInstanceOf[js.Any], supportsExportNamespaceFrom = supportsExportNamespaceFrom.asInstanceOf[js.Any], supportsStaticESM = supportsStaticESM.asInstanceOf[js.Any], supportsTopLevelAwait = supportsTopLevelAwait.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequireAndTranspileModuleOptions]
    }
    
    extension [Self <: RequireAndTranspileModuleOptions](x: Self) {
      
      inline def setApplyInteropRequireDefault(value: Boolean): Self = StObject.set(x, "applyInteropRequireDefault", value.asInstanceOf[js.Any])
    }
  }
  
  type ScriptTransformer = ScriptTransformer2
  
  @js.native
  trait ScriptTransformer2 extends StObject {
    
    /* private */ var _buildCacheKeyFromFileInfo: Any = js.native
    
    /* private */ var _buildTransformResult: Any = js.native
    
    /* private */ val _cache: Any = js.native
    
    /* private */ val _cacheFS: Any = js.native
    
    /* private */ val _config: Any = js.native
    
    /* private */ var _createCachedFilename: Any = js.native
    
    /* private */ var _getCacheKey: Any = js.native
    
    /* private */ var _getCacheKeyAsync: Any = js.native
    
    /* private */ var _getFileCachePath: Any = js.native
    
    /* private */ var _getFileCachePathAsync: Any = js.native
    
    /* private */ var _getTransformPath: Any = js.native
    
    /* private */ var _getTransformer: Any = js.native
    
    /* private */ var _instrumentFile: Any = js.native
    
    /* private */ var _transformAndBuildScript: Any = js.native
    
    /* private */ var _transformAndBuildScriptAsync: Any = js.native
    
    /* private */ val _transformCache: Any = js.native
    
    /* private */ var _transformsAreLoaded: Any = js.native
    
    def loadTransformers(): js.Promise[Unit] = js.native
    
    def requireAndTranspileModule[ModuleType](moduleName: String): js.Promise[ModuleType] = js.native
    def requireAndTranspileModule[ModuleType](moduleName: String, callback: js.Function1[/* module */ ModuleType, Unit | js.Promise[Unit]]): js.Promise[ModuleType] = js.native
    def requireAndTranspileModule[ModuleType](
      moduleName: String,
      callback: js.Function1[/* module */ ModuleType, Unit | js.Promise[Unit]],
      options: RequireAndTranspileModuleOptions
    ): js.Promise[ModuleType] = js.native
    def requireAndTranspileModule[ModuleType](moduleName: String, callback: Unit, options: RequireAndTranspileModuleOptions): js.Promise[ModuleType] = js.native
    
    def shouldTransform(filename: String): Boolean = js.native
    
    def transform(filename: String, options: TransformationOptions): TransformResult = js.native
    def transform(filename: String, options: TransformationOptions, fileSource: String): TransformResult = js.native
    
    def transformAsync(filename: String, options: TransformationOptions): js.Promise[TransformResult] = js.native
    def transformAsync(filename: String, options: TransformationOptions, fileSource: String): js.Promise[TransformResult] = js.native
    
    def transformJson(filename: String, options: TransformationOptions, fileSource: String): String = js.native
    
    def transformSource(filepath: String, content: String, options: ReducedTransformOptions): TransformResult = js.native
    
    def transformSourceAsync(filepath: String, content: String, options: ReducedTransformOptions): js.Promise[TransformResult] = js.native
  }
  
  /* Inlined parent std.Pick<@jest/types.@jest/types.GlobalConfig, 'collectCoverage' | 'collectCoverageFrom' | 'coverageProvider'> */
  trait ShouldInstrumentOptions extends StObject {
    
    var changedFiles: js.UndefOr[Set[String]] = js.undefined
    
    var collectCoverage: Boolean
    
    var collectCoverageFrom: js.Array[String]
    
    var coverageProvider: CoverageProvider
    
    var sourcesRelatedToTestsInChangedFiles: js.UndefOr[Set[String]] = js.undefined
  }
  object ShouldInstrumentOptions {
    
    inline def apply(
      collectCoverage: Boolean,
      collectCoverageFrom: js.Array[String],
      coverageProvider: CoverageProvider
    ): ShouldInstrumentOptions = {
      val __obj = js.Dynamic.literal(collectCoverage = collectCoverage.asInstanceOf[js.Any], collectCoverageFrom = collectCoverageFrom.asInstanceOf[js.Any], coverageProvider = coverageProvider.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShouldInstrumentOptions]
    }
    
    extension [Self <: ShouldInstrumentOptions](x: Self) {
      
      inline def setChangedFiles(value: Set[String]): Self = StObject.set(x, "changedFiles", value.asInstanceOf[js.Any])
      
      inline def setChangedFilesUndefined: Self = StObject.set(x, "changedFiles", js.undefined)
      
      inline def setCollectCoverage(value: Boolean): Self = StObject.set(x, "collectCoverage", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverageFrom(value: js.Array[String]): Self = StObject.set(x, "collectCoverageFrom", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverageFromVarargs(value: String*): Self = StObject.set(x, "collectCoverageFrom", js.Array(value*))
      
      inline def setCoverageProvider(value: CoverageProvider): Self = StObject.set(x, "coverageProvider", value.asInstanceOf[js.Any])
      
      inline def setSourcesRelatedToTestsInChangedFiles(value: Set[String]): Self = StObject.set(x, "sourcesRelatedToTestsInChangedFiles", value.asInstanceOf[js.Any])
      
      inline def setSourcesRelatedToTestsInChangedFilesUndefined: Self = StObject.set(x, "sourcesRelatedToTestsInChangedFiles", js.undefined)
    }
  }
  
  type StringMap = Map[String, String]
  
  trait SyncTransformer[TransformerConfig]
    extends StObject
       with Transformer2[TransformerConfig] {
    
    /**
      * Indicates if the transformer is capable of instrumenting the code for code coverage.
      *
      * If V8 coverage is _not_ active, and this is `true`, Jest will assume the code is instrumented.
      * If V8 coverage is _not_ active, and this is `false`. Jest will instrument the code returned by this transformer using Babel.
      */
    var canInstrument: js.UndefOr[Boolean] = js.undefined
    
    var getCacheKey: js.UndefOr[
        js.Function3[
          /* sourceText */ String, 
          /* sourcePath */ String, 
          /* options */ TransformOptions[TransformerConfig], 
          String
        ]
      ] = js.undefined
    
    var getCacheKeyAsync: js.UndefOr[
        js.Function3[
          /* sourceText */ String, 
          /* sourcePath */ String, 
          /* options */ TransformOptions[TransformerConfig], 
          js.Promise[String]
        ]
      ] = js.undefined
    
    def process(sourceText: String, sourcePath: String, options: TransformOptions[TransformerConfig]): TransformedSource
    
    var processAsync: js.UndefOr[
        js.Function3[
          /* sourceText */ String, 
          /* sourcePath */ String, 
          /* options */ TransformOptions[TransformerConfig], 
          js.Promise[TransformedSource]
        ]
      ] = js.undefined
  }
  object SyncTransformer {
    
    inline def apply[TransformerConfig](process: (String, String, TransformOptions[TransformerConfig]) => TransformedSource): SyncTransformer[TransformerConfig] = {
      val __obj = js.Dynamic.literal(process = js.Any.fromFunction3(process))
      __obj.asInstanceOf[SyncTransformer[TransformerConfig]]
    }
    
    extension [Self <: SyncTransformer[?], TransformerConfig](x: Self & SyncTransformer[TransformerConfig]) {
      
      inline def setCanInstrument(value: Boolean): Self = StObject.set(x, "canInstrument", value.asInstanceOf[js.Any])
      
      inline def setCanInstrumentUndefined: Self = StObject.set(x, "canInstrument", js.undefined)
      
      inline def setGetCacheKey(
        value: (/* sourceText */ String, /* sourcePath */ String, /* options */ TransformOptions[TransformerConfig]) => String
      ): Self = StObject.set(x, "getCacheKey", js.Any.fromFunction3(value))
      
      inline def setGetCacheKeyAsync(
        value: (/* sourceText */ String, /* sourcePath */ String, /* options */ TransformOptions[TransformerConfig]) => js.Promise[String]
      ): Self = StObject.set(x, "getCacheKeyAsync", js.Any.fromFunction3(value))
      
      inline def setGetCacheKeyAsyncUndefined: Self = StObject.set(x, "getCacheKeyAsync", js.undefined)
      
      inline def setGetCacheKeyUndefined: Self = StObject.set(x, "getCacheKey", js.undefined)
      
      inline def setProcess(value: (String, String, TransformOptions[TransformerConfig]) => TransformedSource): Self = StObject.set(x, "process", js.Any.fromFunction3(value))
      
      inline def setProcessAsync(
        value: (/* sourceText */ String, /* sourcePath */ String, /* options */ TransformOptions[TransformerConfig]) => js.Promise[TransformedSource]
      ): Self = StObject.set(x, "processAsync", js.Any.fromFunction3(value))
      
      inline def setProcessAsyncUndefined: Self = StObject.set(x, "processAsync", js.undefined)
    }
  }
  
  trait TransformOptions[TransformerConfig]
    extends StObject
       with ReducedTransformOptions {
    
    /** Cached file system which is used by `jest-runtime` to improve performance. */
    var cacheFS: StringMap
    
    /** Jest configuration of currently running project. */
    var config: ProjectConfig
    
    /** Stringified version of the `config` - useful in cache busting. */
    var configString: String
    
    /** Transformer configuration passed through `transform` option by the user. */
    var transformerConfig: TransformerConfig
  }
  object TransformOptions {
    
    inline def apply[TransformerConfig](
      cacheFS: StringMap,
      config: ProjectConfig,
      configString: String,
      instrument: Boolean,
      supportsDynamicImport: Boolean,
      supportsExportNamespaceFrom: Boolean,
      supportsStaticESM: Boolean,
      supportsTopLevelAwait: Boolean,
      transformerConfig: TransformerConfig
    ): TransformOptions[TransformerConfig] = {
      val __obj = js.Dynamic.literal(cacheFS = cacheFS.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], configString = configString.asInstanceOf[js.Any], instrument = instrument.asInstanceOf[js.Any], supportsDynamicImport = supportsDynamicImport.asInstanceOf[js.Any], supportsExportNamespaceFrom = supportsExportNamespaceFrom.asInstanceOf[js.Any], supportsStaticESM = supportsStaticESM.asInstanceOf[js.Any], supportsTopLevelAwait = supportsTopLevelAwait.asInstanceOf[js.Any], transformerConfig = transformerConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformOptions[TransformerConfig]]
    }
    
    extension [Self <: TransformOptions[?], TransformerConfig](x: Self & TransformOptions[TransformerConfig]) {
      
      inline def setCacheFS(value: StringMap): Self = StObject.set(x, "cacheFS", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: ProjectConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigString(value: String): Self = StObject.set(x, "configString", value.asInstanceOf[js.Any])
      
      inline def setTransformerConfig(value: TransformerConfig): Self = StObject.set(x, "transformerConfig", value.asInstanceOf[js.Any])
    }
  }
  
  type TransformResult = typings.jestTypes.mod.TransformResult
  
  trait TransformationOptions
    extends StObject
       with ShouldInstrumentOptions
       with CallerTransformOptions {
    
    var isInternalModule: js.UndefOr[Boolean] = js.undefined
  }
  object TransformationOptions {
    
    inline def apply(
      collectCoverage: Boolean,
      collectCoverageFrom: js.Array[String],
      coverageProvider: CoverageProvider,
      supportsDynamicImport: Boolean,
      supportsExportNamespaceFrom: Boolean,
      supportsStaticESM: Boolean,
      supportsTopLevelAwait: Boolean
    ): TransformationOptions = {
      val __obj = js.Dynamic.literal(collectCoverage = collectCoverage.asInstanceOf[js.Any], collectCoverageFrom = collectCoverageFrom.asInstanceOf[js.Any], coverageProvider = coverageProvider.asInstanceOf[js.Any], supportsDynamicImport = supportsDynamicImport.asInstanceOf[js.Any], supportsExportNamespaceFrom = supportsExportNamespaceFrom.asInstanceOf[js.Any], supportsStaticESM = supportsStaticESM.asInstanceOf[js.Any], supportsTopLevelAwait = supportsTopLevelAwait.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformationOptions]
    }
    
    extension [Self <: TransformationOptions](x: Self) {
      
      inline def setIsInternalModule(value: Boolean): Self = StObject.set(x, "isInternalModule", value.asInstanceOf[js.Any])
      
      inline def setIsInternalModuleUndefined: Self = StObject.set(x, "isInternalModule", js.undefined)
    }
  }
  
  trait TransformedSource extends StObject {
    
    var code: String
    
    var map: js.UndefOr[FixedRawSourceMap | String | Null] = js.undefined
  }
  object TransformedSource {
    
    inline def apply(code: String): TransformedSource = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformedSource]
    }
    
    extension [Self <: TransformedSource](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMap(value: FixedRawSourceMap | String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
  
  /**
    * We have both sync (`process`) and async (`processAsync`) code transformation, which both can be provided.
    * `require` will always use `process`, and `import` will use `processAsync` if it exists, otherwise fall back to `process`.
    * Meaning, if you use `import` exclusively you do not need `process`, but in most cases supplying both makes sense:
    * Jest transpiles on demand rather than ahead of time, so the sync one needs to exist.
    *
    * For more info on the sync vs async model, see https://jestjs.io/docs/code-transformation#writing-custom-transformers
    */
  /* Rewritten from type alias, can be one of: 
    - typings.jestTransform.mod.SyncTransformer[TransformerConfig]
    - typings.jestTransform.mod.AsyncTransformer[TransformerConfig]
  */
  trait Transformer2[TransformerConfig] extends StObject
  object Transformer2 {
    
    inline def AsyncTransformer[TransformerConfig](
      processAsync: (String, String, TransformOptions[TransformerConfig]) => js.Promise[TransformedSource]
    ): typings.jestTransform.mod.AsyncTransformer[TransformerConfig] = {
      val __obj = js.Dynamic.literal(processAsync = js.Any.fromFunction3(processAsync))
      __obj.asInstanceOf[typings.jestTransform.mod.AsyncTransformer[TransformerConfig]]
    }
    
    inline def SyncTransformer[TransformerConfig](process: (String, String, TransformOptions[TransformerConfig]) => TransformedSource): typings.jestTransform.mod.SyncTransformer[TransformerConfig] = {
      val __obj = js.Dynamic.literal(process = js.Any.fromFunction3(process))
      __obj.asInstanceOf[typings.jestTransform.mod.SyncTransformer[TransformerConfig]]
    }
  }
  
  type TransformerCreator[X /* <: Transformer2[TransformerConfig] */, TransformerConfig] = js.Function1[/* transformerConfig */ js.UndefOr[TransformerConfig], X]
  
  trait TransformerFactory[X /* <: Transformer2[Any] */] extends StObject {
    
    def createTransformer(): X
    def createTransformer(transformerConfig: Any): X
    @JSName("createTransformer")
    var createTransformer_Original: TransformerCreator[X, Any]
  }
  object TransformerFactory {
    
    inline def apply[X /* <: Transformer2[Any] */](createTransformer: /* transformerConfig */ js.UndefOr[Any] => X): TransformerFactory[X] = {
      val __obj = js.Dynamic.literal(createTransformer = js.Any.fromFunction1(createTransformer))
      __obj.asInstanceOf[TransformerFactory[X]]
    }
    
    extension [Self <: TransformerFactory[?], X /* <: Transformer2[Any] */](x: Self & TransformerFactory[X]) {
      
      inline def setCreateTransformer(value: /* transformerConfig */ js.UndefOr[Any] => X): Self = StObject.set(x, "createTransformer", js.Any.fromFunction1(value))
    }
  }
}
