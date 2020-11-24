package typings.jestRuntime.mod

import typings.istanbulLibCoverage.mod.CoverageMapData
import typings.jestRuntime.anon.Virtual
import typings.jestSourceMap.typesMod.SourceMapRegistry
import typings.jestTypes.configMod.Path
import typings.std.Record
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Runtime extends js.Object {
  
  var _cacheFS: js.Any = js.native
  
  var _config: js.Any = js.native
  
  var _coverageOptions: js.Any = js.native
  
  var _createJestObjectFor: js.Any = js.native
  
  var _createRequireImplementation: js.Any = js.native
  
  var _currentlyExecutingModulePath: js.Any = js.native
  
  var _environment: js.Any = js.native
  
  var _esmoduleRegistry: js.Any = js.native
  
  var _execModule: js.Any = js.native
  
  var _explicitShouldMock: js.Any = js.native
  
  var _fakeTimersImplementation: js.Any = js.native
  
  var _fileTransforms: js.Any = js.native
  
  var _generateMock: js.Any = js.native
  
  var _getFullTransformationOptions: js.Any = js.native
  
  var _getMockedNativeModule: js.Any = js.native
  
  var _importCoreModule: js.Any = js.native
  
  var _internalModuleRegistry: js.Any = js.native
  
  var _isCurrentlyExecutingManualMock: js.Any = js.native
  
  var _isolatedMockRegistry: js.Any = js.native
  
  var _isolatedModuleRegistry: js.Any = js.native
  
  var _loadModule: js.Any = js.native
  
  var _logFormattedReferenceError: js.Any = js.native
  
  var _mainModule: js.Any = js.native
  
  var _mockFactories: js.Any = js.native
  
  var _mockMetaDataCache: js.Any = js.native
  
  var _mockRegistry: js.Any = js.native
  
  var _moduleImplementation: js.Any = js.native
  
  var _moduleMocker: js.Any = js.native
  
  var _moduleRegistry: js.Any = js.native
  
  var _requireCoreModule: js.Any = js.native
  
  var _requireResolve: js.Any = js.native
  
  var _requireResolvePaths: js.Any = js.native
  
  var _resolveModule: js.Any = js.native
  
  var _resolver: js.Any = js.native
  
  var _scriptTransformer: js.Any = js.native
  
  var _shouldAutoMock: js.Any = js.native
  
  var _shouldMock: js.Any = js.native
  
  var _shouldMockModuleCache: js.Any = js.native
  
  var _shouldUnmockTransitiveDependenciesCache: js.Any = js.native
  
  var _sourceMapRegistry: js.Any = js.native
  
  var _testPath: js.Any = js.native
  
  var _transitiveShouldMock: js.Any = js.native
  
  var _unmockList: js.Any = js.native
  
  var _v8CoverageInstrumenter: js.Any = js.native
  
  var _v8CoverageResult: js.Any = js.native
  
  var _virtualMocks: js.Any = js.native
  
  def clearAllMocks(): Unit = js.native
  
  def collectV8Coverage(): js.Promise[Unit] = js.native
  
  var constructInjectedModuleParameters: js.Any = js.native
  
  var constructModuleWrapperStart: js.Any = js.native
  
  var createScriptFromCode: js.Any = js.native
  
  def getAllCoverageInfoCopy(): CoverageMapData = js.native
  
  def getAllV8CoverageInfoCopy(): js.Any = js.native
  
  var getGlobalsForCjs: js.Any = js.native
  
  var getGlobalsForEsm: js.Any = js.native
  
  var getGlobalsFromEnvironment: js.Any = js.native
  
  def getSourceMapInfo(_coveredFiles: Set[String]): Record[String, String] = js.native
  
  def getSourceMaps(): SourceMapRegistry = js.native
  
  var handleExecutionError: js.Any = js.native
  
  def isolateModules(fn: js.Function0[Unit]): Unit = js.native
  
  var jestGlobals: js.Any = js.native
  
  var jestObjectCaches: js.Any = js.native
  
  var linkModules: js.Any = js.native
  
  var loadCjsAsEsm: js.Any = js.native
  
  var loadEsmModule: js.Any = js.native
  
  var readFile: js.Any = js.native
  
  def requireActual[T](from: Path, moduleName: String): T = js.native
  
  def requireInternalModule[T](from: Path): T = js.native
  def requireInternalModule[T](from: Path, to: String): T = js.native
  
  def requireMock[T](from: Path, moduleName: String): T = js.native
  
  def requireModule[T](from: Path): T = js.native
  def requireModule[T](
    from: Path,
    moduleName: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    isRequireActual: Boolean
  ): T = js.native
  def requireModule[T](from: Path, moduleName: js.UndefOr[scala.Nothing], options: InternalModuleOptions): T = js.native
  def requireModule[T](
    from: Path,
    moduleName: js.UndefOr[scala.Nothing],
    options: InternalModuleOptions,
    isRequireActual: Boolean
  ): T = js.native
  def requireModule[T](from: Path, moduleName: String): T = js.native
  def requireModule[T](from: Path, moduleName: String, options: js.UndefOr[scala.Nothing], isRequireActual: Boolean): T = js.native
  def requireModule[T](from: Path, moduleName: String, options: InternalModuleOptions): T = js.native
  def requireModule[T](from: Path, moduleName: String, options: InternalModuleOptions, isRequireActual: Boolean): T = js.native
  
  def requireModuleOrMock[T](from: Path, moduleName: String): T = js.native
  
  def resetAllMocks(): Unit = js.native
  
  def resetModules(): Unit = js.native
  
  def restoreAllMocks(): Unit = js.native
  
  def setGlobalsForRuntime(globals: JestGlobals): Unit = js.native
  
  def setMock(from: String, moduleName: String, mockFactory: js.Function0[_]): Unit = js.native
  def setMock(from: String, moduleName: String, mockFactory: js.Function0[_], options: Virtual): Unit = js.native
  
  def stopCollectingV8Coverage(): js.Promise[Unit] = js.native
  
  def teardown(): Unit = js.native
  
  var transformFile: js.Any = js.native
  
  def unstable_importModule(from: Path): js.Promise[Unit] = js.native
  def unstable_importModule(from: Path, moduleName: String): js.Promise[Unit] = js.native
  
  var unstable_shouldLoadAsEsm: js.Function1[/* path */ Path, Boolean] = js.native
  
  var wrapCodeInModuleWrapper: js.Any = js.native
}
