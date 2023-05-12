package typings.jestTypes.mod

import typings.jestSchemas.mod.SnapshotFormat
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultOptions extends StObject {
  
  var automock: Boolean
  
  var bail: Double
  
  var cache: Boolean
  
  var cacheDirectory: String
  
  var changedFilesWithAncestor: Boolean
  
  var ci: Boolean
  
  var clearMocks: Boolean
  
  var collectCoverage: Boolean
  
  var coveragePathIgnorePatterns: js.Array[String]
  
  var coverageProvider: CoverageProvider
  
  var coverageReporters: js.Array[CoverageReporterName]
  
  var detectLeaks: Boolean
  
  var detectOpenHandles: Boolean
  
  var errorOnDeprecated: Boolean
  
  var expand: Boolean
  
  var extensionsToTreatAsEsm: js.Array[String]
  
  var fakeTimers: FakeTimers
  
  var forceCoverageMatch: js.Array[String]
  
  var globals: ConfigGlobals
  
  var haste: HasteConfig
  
  var injectGlobals: Boolean
  
  var listTests: Boolean
  
  var maxConcurrency: Double
  
  var maxWorkers: Double | String
  
  var moduleDirectories: js.Array[String]
  
  var moduleFileExtensions: js.Array[String]
  
  var moduleNameMapper: Record[String, String | js.Array[String]]
  
  var modulePathIgnorePatterns: js.Array[String]
  
  var noStackTrace: Boolean
  
  var notifyMode: NotifyMode
  
  @JSName("notify")
  var notify_FDefaultOptions: Boolean
  
  var openHandlesTimeout: Double
  
  var passWithNoTests: Boolean
  
  var prettierPath: String
  
  var resetMocks: Boolean
  
  var resetModules: Boolean
  
  var restoreMocks: Boolean
  
  var roots: js.Array[String]
  
  var runTestsByPath: Boolean
  
  var runner: String
  
  var setupFiles: js.Array[String]
  
  var setupFilesAfterEnv: js.Array[String]
  
  var skipFilter: Boolean
  
  var slowTestThreshold: Double
  
  var snapshotFormat: SnapshotFormat
  
  var snapshotSerializers: js.Array[String]
  
  var testEnvironment: String
  
  var testEnvironmentOptions: Record[String, Any]
  
  var testFailureExitCode: String | Double
  
  var testLocationInResults: Boolean
  
  var testMatch: js.Array[String]
  
  var testPathIgnorePatterns: js.Array[String]
  
  var testRegex: js.Array[String]
  
  var testRunner: String
  
  var testSequencer: String
  
  var transformIgnorePatterns: js.Array[String]
  
  var useStderr: Boolean
  
  var watch: Boolean
  
  var watchPathIgnorePatterns: js.Array[String]
  
  var watchman: Boolean
  
  var workerThreads: Boolean
}
object DefaultOptions {
  
  inline def apply(
    automock: Boolean,
    bail: Double,
    cache: Boolean,
    cacheDirectory: String,
    changedFilesWithAncestor: Boolean,
    ci: Boolean,
    clearMocks: Boolean,
    collectCoverage: Boolean,
    coveragePathIgnorePatterns: js.Array[String],
    coverageProvider: CoverageProvider,
    coverageReporters: js.Array[CoverageReporterName],
    detectLeaks: Boolean,
    detectOpenHandles: Boolean,
    errorOnDeprecated: Boolean,
    expand: Boolean,
    extensionsToTreatAsEsm: js.Array[String],
    fakeTimers: FakeTimers,
    forceCoverageMatch: js.Array[String],
    globals: ConfigGlobals,
    haste: HasteConfig,
    injectGlobals: Boolean,
    listTests: Boolean,
    maxConcurrency: Double,
    maxWorkers: Double | String,
    moduleDirectories: js.Array[String],
    moduleFileExtensions: js.Array[String],
    moduleNameMapper: Record[String, String | js.Array[String]],
    modulePathIgnorePatterns: js.Array[String],
    noStackTrace: Boolean,
    notifyMode: NotifyMode,
    notify_ : Boolean,
    openHandlesTimeout: Double,
    passWithNoTests: Boolean,
    prettierPath: String,
    resetMocks: Boolean,
    resetModules: Boolean,
    restoreMocks: Boolean,
    roots: js.Array[String],
    runTestsByPath: Boolean,
    runner: String,
    setupFiles: js.Array[String],
    setupFilesAfterEnv: js.Array[String],
    skipFilter: Boolean,
    slowTestThreshold: Double,
    snapshotFormat: SnapshotFormat,
    snapshotSerializers: js.Array[String],
    testEnvironment: String,
    testEnvironmentOptions: Record[String, Any],
    testFailureExitCode: String | Double,
    testLocationInResults: Boolean,
    testMatch: js.Array[String],
    testPathIgnorePatterns: js.Array[String],
    testRegex: js.Array[String],
    testRunner: String,
    testSequencer: String,
    transformIgnorePatterns: js.Array[String],
    useStderr: Boolean,
    watch: Boolean,
    watchPathIgnorePatterns: js.Array[String],
    watchman: Boolean,
    workerThreads: Boolean
  ): DefaultOptions = {
    val __obj = js.Dynamic.literal(automock = automock.asInstanceOf[js.Any], bail = bail.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheDirectory = cacheDirectory.asInstanceOf[js.Any], changedFilesWithAncestor = changedFilesWithAncestor.asInstanceOf[js.Any], ci = ci.asInstanceOf[js.Any], clearMocks = clearMocks.asInstanceOf[js.Any], collectCoverage = collectCoverage.asInstanceOf[js.Any], coveragePathIgnorePatterns = coveragePathIgnorePatterns.asInstanceOf[js.Any], coverageProvider = coverageProvider.asInstanceOf[js.Any], coverageReporters = coverageReporters.asInstanceOf[js.Any], detectLeaks = detectLeaks.asInstanceOf[js.Any], detectOpenHandles = detectOpenHandles.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], extensionsToTreatAsEsm = extensionsToTreatAsEsm.asInstanceOf[js.Any], fakeTimers = fakeTimers.asInstanceOf[js.Any], forceCoverageMatch = forceCoverageMatch.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], haste = haste.asInstanceOf[js.Any], injectGlobals = injectGlobals.asInstanceOf[js.Any], listTests = listTests.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], moduleDirectories = moduleDirectories.asInstanceOf[js.Any], moduleFileExtensions = moduleFileExtensions.asInstanceOf[js.Any], moduleNameMapper = moduleNameMapper.asInstanceOf[js.Any], modulePathIgnorePatterns = modulePathIgnorePatterns.asInstanceOf[js.Any], noStackTrace = noStackTrace.asInstanceOf[js.Any], notifyMode = notifyMode.asInstanceOf[js.Any], openHandlesTimeout = openHandlesTimeout.asInstanceOf[js.Any], passWithNoTests = passWithNoTests.asInstanceOf[js.Any], prettierPath = prettierPath.asInstanceOf[js.Any], resetMocks = resetMocks.asInstanceOf[js.Any], resetModules = resetModules.asInstanceOf[js.Any], restoreMocks = restoreMocks.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any], runTestsByPath = runTestsByPath.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], setupFiles = setupFiles.asInstanceOf[js.Any], setupFilesAfterEnv = setupFilesAfterEnv.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], slowTestThreshold = slowTestThreshold.asInstanceOf[js.Any], snapshotFormat = snapshotFormat.asInstanceOf[js.Any], snapshotSerializers = snapshotSerializers.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], testEnvironmentOptions = testEnvironmentOptions.asInstanceOf[js.Any], testFailureExitCode = testFailureExitCode.asInstanceOf[js.Any], testLocationInResults = testLocationInResults.asInstanceOf[js.Any], testMatch = testMatch.asInstanceOf[js.Any], testPathIgnorePatterns = testPathIgnorePatterns.asInstanceOf[js.Any], testRegex = testRegex.asInstanceOf[js.Any], testRunner = testRunner.asInstanceOf[js.Any], testSequencer = testSequencer.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns.asInstanceOf[js.Any], useStderr = useStderr.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], watchPathIgnorePatterns = watchPathIgnorePatterns.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any], workerThreads = workerThreads.asInstanceOf[js.Any])
    __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultOptions] (val x: Self) extends AnyVal {
    
    inline def setAutomock(value: Boolean): Self = StObject.set(x, "automock", value.asInstanceOf[js.Any])
    
    inline def setBail(value: Double): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
    
    inline def setChangedFilesWithAncestor(value: Boolean): Self = StObject.set(x, "changedFilesWithAncestor", value.asInstanceOf[js.Any])
    
    inline def setCi(value: Boolean): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
    
    inline def setClearMocks(value: Boolean): Self = StObject.set(x, "clearMocks", value.asInstanceOf[js.Any])
    
    inline def setCollectCoverage(value: Boolean): Self = StObject.set(x, "collectCoverage", value.asInstanceOf[js.Any])
    
    inline def setCoveragePathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "coveragePathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setCoveragePathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "coveragePathIgnorePatterns", js.Array(value*))
    
    inline def setCoverageProvider(value: CoverageProvider): Self = StObject.set(x, "coverageProvider", value.asInstanceOf[js.Any])
    
    inline def setCoverageReporters(value: js.Array[CoverageReporterName]): Self = StObject.set(x, "coverageReporters", value.asInstanceOf[js.Any])
    
    inline def setCoverageReportersVarargs(value: CoverageReporterName*): Self = StObject.set(x, "coverageReporters", js.Array(value*))
    
    inline def setDetectLeaks(value: Boolean): Self = StObject.set(x, "detectLeaks", value.asInstanceOf[js.Any])
    
    inline def setDetectOpenHandles(value: Boolean): Self = StObject.set(x, "detectOpenHandles", value.asInstanceOf[js.Any])
    
    inline def setErrorOnDeprecated(value: Boolean): Self = StObject.set(x, "errorOnDeprecated", value.asInstanceOf[js.Any])
    
    inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExtensionsToTreatAsEsm(value: js.Array[String]): Self = StObject.set(x, "extensionsToTreatAsEsm", value.asInstanceOf[js.Any])
    
    inline def setExtensionsToTreatAsEsmVarargs(value: String*): Self = StObject.set(x, "extensionsToTreatAsEsm", js.Array(value*))
    
    inline def setFakeTimers(value: FakeTimers): Self = StObject.set(x, "fakeTimers", value.asInstanceOf[js.Any])
    
    inline def setForceCoverageMatch(value: js.Array[String]): Self = StObject.set(x, "forceCoverageMatch", value.asInstanceOf[js.Any])
    
    inline def setForceCoverageMatchVarargs(value: String*): Self = StObject.set(x, "forceCoverageMatch", js.Array(value*))
    
    inline def setGlobals(value: ConfigGlobals): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setHaste(value: HasteConfig): Self = StObject.set(x, "haste", value.asInstanceOf[js.Any])
    
    inline def setInjectGlobals(value: Boolean): Self = StObject.set(x, "injectGlobals", value.asInstanceOf[js.Any])
    
    inline def setListTests(value: Boolean): Self = StObject.set(x, "listTests", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxWorkers(value: Double | String): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
    
    inline def setModuleDirectories(value: js.Array[String]): Self = StObject.set(x, "moduleDirectories", value.asInstanceOf[js.Any])
    
    inline def setModuleDirectoriesVarargs(value: String*): Self = StObject.set(x, "moduleDirectories", js.Array(value*))
    
    inline def setModuleFileExtensions(value: js.Array[String]): Self = StObject.set(x, "moduleFileExtensions", value.asInstanceOf[js.Any])
    
    inline def setModuleFileExtensionsVarargs(value: String*): Self = StObject.set(x, "moduleFileExtensions", js.Array(value*))
    
    inline def setModuleNameMapper(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "moduleNameMapper", value.asInstanceOf[js.Any])
    
    inline def setModulePathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "modulePathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setModulePathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "modulePathIgnorePatterns", js.Array(value*))
    
    inline def setNoStackTrace(value: Boolean): Self = StObject.set(x, "noStackTrace", value.asInstanceOf[js.Any])
    
    inline def setNotifyMode(value: NotifyMode): Self = StObject.set(x, "notifyMode", value.asInstanceOf[js.Any])
    
    inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    inline def setOpenHandlesTimeout(value: Double): Self = StObject.set(x, "openHandlesTimeout", value.asInstanceOf[js.Any])
    
    inline def setPassWithNoTests(value: Boolean): Self = StObject.set(x, "passWithNoTests", value.asInstanceOf[js.Any])
    
    inline def setPrettierPath(value: String): Self = StObject.set(x, "prettierPath", value.asInstanceOf[js.Any])
    
    inline def setResetMocks(value: Boolean): Self = StObject.set(x, "resetMocks", value.asInstanceOf[js.Any])
    
    inline def setResetModules(value: Boolean): Self = StObject.set(x, "resetModules", value.asInstanceOf[js.Any])
    
    inline def setRestoreMocks(value: Boolean): Self = StObject.set(x, "restoreMocks", value.asInstanceOf[js.Any])
    
    inline def setRoots(value: js.Array[String]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
    
    inline def setRootsVarargs(value: String*): Self = StObject.set(x, "roots", js.Array(value*))
    
    inline def setRunTestsByPath(value: Boolean): Self = StObject.set(x, "runTestsByPath", value.asInstanceOf[js.Any])
    
    inline def setRunner(value: String): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
    
    inline def setSetupFiles(value: js.Array[String]): Self = StObject.set(x, "setupFiles", value.asInstanceOf[js.Any])
    
    inline def setSetupFilesAfterEnv(value: js.Array[String]): Self = StObject.set(x, "setupFilesAfterEnv", value.asInstanceOf[js.Any])
    
    inline def setSetupFilesAfterEnvVarargs(value: String*): Self = StObject.set(x, "setupFilesAfterEnv", js.Array(value*))
    
    inline def setSetupFilesVarargs(value: String*): Self = StObject.set(x, "setupFiles", js.Array(value*))
    
    inline def setSkipFilter(value: Boolean): Self = StObject.set(x, "skipFilter", value.asInstanceOf[js.Any])
    
    inline def setSlowTestThreshold(value: Double): Self = StObject.set(x, "slowTestThreshold", value.asInstanceOf[js.Any])
    
    inline def setSnapshotFormat(value: SnapshotFormat): Self = StObject.set(x, "snapshotFormat", value.asInstanceOf[js.Any])
    
    inline def setSnapshotSerializers(value: js.Array[String]): Self = StObject.set(x, "snapshotSerializers", value.asInstanceOf[js.Any])
    
    inline def setSnapshotSerializersVarargs(value: String*): Self = StObject.set(x, "snapshotSerializers", js.Array(value*))
    
    inline def setTestEnvironment(value: String): Self = StObject.set(x, "testEnvironment", value.asInstanceOf[js.Any])
    
    inline def setTestEnvironmentOptions(value: Record[String, Any]): Self = StObject.set(x, "testEnvironmentOptions", value.asInstanceOf[js.Any])
    
    inline def setTestFailureExitCode(value: String | Double): Self = StObject.set(x, "testFailureExitCode", value.asInstanceOf[js.Any])
    
    inline def setTestLocationInResults(value: Boolean): Self = StObject.set(x, "testLocationInResults", value.asInstanceOf[js.Any])
    
    inline def setTestMatch(value: js.Array[String]): Self = StObject.set(x, "testMatch", value.asInstanceOf[js.Any])
    
    inline def setTestMatchVarargs(value: String*): Self = StObject.set(x, "testMatch", js.Array(value*))
    
    inline def setTestPathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "testPathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setTestPathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "testPathIgnorePatterns", js.Array(value*))
    
    inline def setTestRegex(value: js.Array[String]): Self = StObject.set(x, "testRegex", value.asInstanceOf[js.Any])
    
    inline def setTestRegexVarargs(value: String*): Self = StObject.set(x, "testRegex", js.Array(value*))
    
    inline def setTestRunner(value: String): Self = StObject.set(x, "testRunner", value.asInstanceOf[js.Any])
    
    inline def setTestSequencer(value: String): Self = StObject.set(x, "testSequencer", value.asInstanceOf[js.Any])
    
    inline def setTransformIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "transformIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setTransformIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "transformIgnorePatterns", js.Array(value*))
    
    inline def setUseStderr(value: Boolean): Self = StObject.set(x, "useStderr", value.asInstanceOf[js.Any])
    
    inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchPathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "watchPathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setWatchPathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "watchPathIgnorePatterns", js.Array(value*))
    
    inline def setWatchman(value: Boolean): Self = StObject.set(x, "watchman", value.asInstanceOf[js.Any])
    
    inline def setWorkerThreads(value: Boolean): Self = StObject.set(x, "workerThreads", value.asInstanceOf[js.Any])
  }
}
