package typings.jestDashRuntime.jestDashRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import typings.atJestSourceDashMap.buildTypesMod.SourceMapRegistry
import typings.atJestTypes.buildConfigMod.Path
import typings.istanbulDashLibDashCoverage.istanbulDashLibDashCoverageMod.CoverageMapData
import typings.jestDashRuntime.Anon_Virtual
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runtime extends js.Object {
  var _cacheFS: js.Any = js.native
  var _config: js.Any = js.native
  var _coverageOptions: js.Any = js.native
  var _createJestObjectFor: js.Any = js.native
  var _createRequireImplementation: js.Any = js.native
  var _currentlyExecutingModulePath: js.Any = js.native
  var _environment: js.Any = js.native
  var _execModule: js.Any = js.native
  var _explicitShouldMock: js.Any = js.native
  var _generateMock: js.Any = js.native
  var _getFullTransformationOptions: js.Any = js.native
  var _internalModuleRegistry: js.Any = js.native
  var _isCurrentlyExecutingManualMock: js.Any = js.native
  var _isolatedMockRegistry: js.Any = js.native
  var _isolatedModuleRegistry: js.Any = js.native
  var _loadModule: js.Any = js.native
  var _logFormattedReferenceError: js.Any = js.native
  var _mockFactories: js.Any = js.native
  var _mockMetaDataCache: js.Any = js.native
  var _mockRegistry: js.Any = js.native
  var _moduleMocker: js.Any = js.native
  var _moduleRegistry: js.Any = js.native
  var _needsCoverageMapped: js.Any = js.native
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
  var _transitiveShouldMock: js.Any = js.native
  var _unmockList: js.Any = js.native
  var _virtualMocks: js.Any = js.native
  def clearAllMocks(): Unit = js.native
  def getAllCoverageInfoCopy(): CoverageMapData = js.native
  def getSourceMapInfo(coveredFiles: Set[String]): StringDictionary[String] = js.native
  def getSourceMaps(): SourceMapRegistry = js.native
  def isolateModules(fn: js.Function0[Unit]): Unit = js.native
  def requireActual(from: Path, moduleName: String): js.Any = js.native
  def requireInternalModule(from: Path): js.Any = js.native
  def requireInternalModule(from: Path, to: String): js.Any = js.native
  def requireMock(from: Path, moduleName: String): js.Any = js.native
  def requireModule(from: Path): js.Any = js.native
  def requireModule(from: Path, moduleName: String): js.Any = js.native
  def requireModule(from: Path, moduleName: String, options: InternalModuleOptions): js.Any = js.native
  def requireModule(from: Path, moduleName: String, options: InternalModuleOptions, isRequireActual: Boolean): js.Any = js.native
  def requireModuleOrMock(from: Path, moduleName: String): js.Any = js.native
  def resetAllMocks(): Unit = js.native
  def resetModules(): Unit = js.native
  def restoreAllMocks(): Unit = js.native
  def setMock(from: String, moduleName: String, mockFactory: js.Function0[_]): Unit = js.native
  def setMock(from: String, moduleName: String, mockFactory: js.Function0[_], options: Anon_Virtual): Unit = js.native
}

