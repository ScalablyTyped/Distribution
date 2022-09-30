package typings.jestTypes.mod

import typings.jestSchemas.mod.SnapshotFormat
import typings.jestTypes.anon.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalConfig extends StObject {
  
  var bail: Double
  
  var changedFilesWithAncestor: Boolean
  
  var changedSince: js.UndefOr[String] = js.undefined
  
  var ci: Boolean
  
  var collectCoverage: Boolean
  
  var collectCoverageFrom: js.Array[String]
  
  var coverageDirectory: String
  
  var coveragePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
  
  var coverageProvider: CoverageProvider
  
  var coverageReporters: CoverageReporters
  
  var coverageThreshold: js.UndefOr[CoverageThreshold] = js.undefined
  
  var detectLeaks: Boolean
  
  var detectOpenHandles: Boolean
  
  var errorOnDeprecated: Boolean
  
  var expand: Boolean
  
  var filter: js.UndefOr[String] = js.undefined
  
  var findRelatedTests: Boolean
  
  var forceExit: Boolean
  
  var globalSetup: js.UndefOr[String] = js.undefined
  
  var globalTeardown: js.UndefOr[String] = js.undefined
  
  var json: Boolean
  
  var lastCommit: Boolean
  
  var listTests: Boolean
  
  var logHeapUsage: Boolean
  
  var maxConcurrency: Double
  
  var maxWorkers: Double
  
  var noSCM: js.UndefOr[Boolean] = js.undefined
  
  var noStackTrace: Boolean
  
  var nonFlagArgs: js.Array[String]
  
  var notifyMode: NotifyMode
  
  @JSName("notify")
  var notify_FGlobalConfig: Boolean
  
  var onlyChanged: Boolean
  
  var onlyFailures: Boolean
  
  var outputFile: js.UndefOr[String] = js.undefined
  
  var passWithNoTests: Boolean
  
  var projects: js.Array[String]
  
  var replname: js.UndefOr[String] = js.undefined
  
  var reporters: js.UndefOr[js.Array[ReporterConfig]] = js.undefined
  
  var rootDir: String
  
  var runTestsByPath: Boolean
  
  var shard: js.UndefOr[ShardConfig] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var skipFilter: Boolean
  
  var snapshotFormat: SnapshotFormat
  
  var testFailureExitCode: Double
  
  var testNamePattern: js.UndefOr[String] = js.undefined
  
  var testPathPattern: String
  
  var testResultsProcessor: js.UndefOr[String] = js.undefined
  
  var testSequencer: String
  
  var testTimeout: js.UndefOr[Double] = js.undefined
  
  var updateSnapshot: SnapshotUpdateState
  
  var useStderr: Boolean
  
  var verbose: js.UndefOr[Boolean] = js.undefined
  
  var watch: Boolean
  
  var watchAll: Boolean
  
  var watchPlugins: js.UndefOr[js.Array[Config] | Null] = js.undefined
  
  var watchman: Boolean
  
  var workerIdleMemoryLimit: js.UndefOr[Double] = js.undefined
}
object GlobalConfig {
  
  inline def apply(
    bail: Double,
    changedFilesWithAncestor: Boolean,
    ci: Boolean,
    collectCoverage: Boolean,
    collectCoverageFrom: js.Array[String],
    coverageDirectory: String,
    coverageProvider: CoverageProvider,
    coverageReporters: CoverageReporters,
    detectLeaks: Boolean,
    detectOpenHandles: Boolean,
    errorOnDeprecated: Boolean,
    expand: Boolean,
    findRelatedTests: Boolean,
    forceExit: Boolean,
    json: Boolean,
    lastCommit: Boolean,
    listTests: Boolean,
    logHeapUsage: Boolean,
    maxConcurrency: Double,
    maxWorkers: Double,
    noStackTrace: Boolean,
    nonFlagArgs: js.Array[String],
    notifyMode: NotifyMode,
    notify_ : Boolean,
    onlyChanged: Boolean,
    onlyFailures: Boolean,
    passWithNoTests: Boolean,
    projects: js.Array[String],
    rootDir: String,
    runTestsByPath: Boolean,
    skipFilter: Boolean,
    snapshotFormat: SnapshotFormat,
    testFailureExitCode: Double,
    testPathPattern: String,
    testSequencer: String,
    updateSnapshot: SnapshotUpdateState,
    useStderr: Boolean,
    watch: Boolean,
    watchAll: Boolean,
    watchman: Boolean
  ): GlobalConfig = {
    val __obj = js.Dynamic.literal(bail = bail.asInstanceOf[js.Any], changedFilesWithAncestor = changedFilesWithAncestor.asInstanceOf[js.Any], ci = ci.asInstanceOf[js.Any], collectCoverage = collectCoverage.asInstanceOf[js.Any], collectCoverageFrom = collectCoverageFrom.asInstanceOf[js.Any], coverageDirectory = coverageDirectory.asInstanceOf[js.Any], coverageProvider = coverageProvider.asInstanceOf[js.Any], coverageReporters = coverageReporters.asInstanceOf[js.Any], detectLeaks = detectLeaks.asInstanceOf[js.Any], detectOpenHandles = detectOpenHandles.asInstanceOf[js.Any], errorOnDeprecated = errorOnDeprecated.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], findRelatedTests = findRelatedTests.asInstanceOf[js.Any], forceExit = forceExit.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], lastCommit = lastCommit.asInstanceOf[js.Any], listTests = listTests.asInstanceOf[js.Any], logHeapUsage = logHeapUsage.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], noStackTrace = noStackTrace.asInstanceOf[js.Any], nonFlagArgs = nonFlagArgs.asInstanceOf[js.Any], notifyMode = notifyMode.asInstanceOf[js.Any], onlyChanged = onlyChanged.asInstanceOf[js.Any], onlyFailures = onlyFailures.asInstanceOf[js.Any], passWithNoTests = passWithNoTests.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], runTestsByPath = runTestsByPath.asInstanceOf[js.Any], skipFilter = skipFilter.asInstanceOf[js.Any], snapshotFormat = snapshotFormat.asInstanceOf[js.Any], testFailureExitCode = testFailureExitCode.asInstanceOf[js.Any], testPathPattern = testPathPattern.asInstanceOf[js.Any], testSequencer = testSequencer.asInstanceOf[js.Any], updateSnapshot = updateSnapshot.asInstanceOf[js.Any], useStderr = useStderr.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], watchAll = watchAll.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalConfig]
  }
  
  extension [Self <: GlobalConfig](x: Self) {
    
    inline def setBail(value: Double): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
    
    inline def setChangedFilesWithAncestor(value: Boolean): Self = StObject.set(x, "changedFilesWithAncestor", value.asInstanceOf[js.Any])
    
    inline def setChangedSince(value: String): Self = StObject.set(x, "changedSince", value.asInstanceOf[js.Any])
    
    inline def setChangedSinceUndefined: Self = StObject.set(x, "changedSince", js.undefined)
    
    inline def setCi(value: Boolean): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
    
    inline def setCollectCoverage(value: Boolean): Self = StObject.set(x, "collectCoverage", value.asInstanceOf[js.Any])
    
    inline def setCollectCoverageFrom(value: js.Array[String]): Self = StObject.set(x, "collectCoverageFrom", value.asInstanceOf[js.Any])
    
    inline def setCollectCoverageFromVarargs(value: String*): Self = StObject.set(x, "collectCoverageFrom", js.Array(value*))
    
    inline def setCoverageDirectory(value: String): Self = StObject.set(x, "coverageDirectory", value.asInstanceOf[js.Any])
    
    inline def setCoveragePathIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "coveragePathIgnorePatterns", value.asInstanceOf[js.Any])
    
    inline def setCoveragePathIgnorePatternsUndefined: Self = StObject.set(x, "coveragePathIgnorePatterns", js.undefined)
    
    inline def setCoveragePathIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "coveragePathIgnorePatterns", js.Array(value*))
    
    inline def setCoverageProvider(value: CoverageProvider): Self = StObject.set(x, "coverageProvider", value.asInstanceOf[js.Any])
    
    inline def setCoverageReporters(value: CoverageReporters): Self = StObject.set(x, "coverageReporters", value.asInstanceOf[js.Any])
    
    inline def setCoverageReportersVarargs(value: (CoverageReporterName | CoverageReporterWithOptions[CoverageReporterName])*): Self = StObject.set(x, "coverageReporters", js.Array(value*))
    
    inline def setCoverageThreshold(value: CoverageThreshold): Self = StObject.set(x, "coverageThreshold", value.asInstanceOf[js.Any])
    
    inline def setCoverageThresholdUndefined: Self = StObject.set(x, "coverageThreshold", js.undefined)
    
    inline def setDetectLeaks(value: Boolean): Self = StObject.set(x, "detectLeaks", value.asInstanceOf[js.Any])
    
    inline def setDetectOpenHandles(value: Boolean): Self = StObject.set(x, "detectOpenHandles", value.asInstanceOf[js.Any])
    
    inline def setErrorOnDeprecated(value: Boolean): Self = StObject.set(x, "errorOnDeprecated", value.asInstanceOf[js.Any])
    
    inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFindRelatedTests(value: Boolean): Self = StObject.set(x, "findRelatedTests", value.asInstanceOf[js.Any])
    
    inline def setForceExit(value: Boolean): Self = StObject.set(x, "forceExit", value.asInstanceOf[js.Any])
    
    inline def setGlobalSetup(value: String): Self = StObject.set(x, "globalSetup", value.asInstanceOf[js.Any])
    
    inline def setGlobalSetupUndefined: Self = StObject.set(x, "globalSetup", js.undefined)
    
    inline def setGlobalTeardown(value: String): Self = StObject.set(x, "globalTeardown", value.asInstanceOf[js.Any])
    
    inline def setGlobalTeardownUndefined: Self = StObject.set(x, "globalTeardown", js.undefined)
    
    inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setLastCommit(value: Boolean): Self = StObject.set(x, "lastCommit", value.asInstanceOf[js.Any])
    
    inline def setListTests(value: Boolean): Self = StObject.set(x, "listTests", value.asInstanceOf[js.Any])
    
    inline def setLogHeapUsage(value: Boolean): Self = StObject.set(x, "logHeapUsage", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
    
    inline def setNoSCM(value: Boolean): Self = StObject.set(x, "noSCM", value.asInstanceOf[js.Any])
    
    inline def setNoSCMUndefined: Self = StObject.set(x, "noSCM", js.undefined)
    
    inline def setNoStackTrace(value: Boolean): Self = StObject.set(x, "noStackTrace", value.asInstanceOf[js.Any])
    
    inline def setNonFlagArgs(value: js.Array[String]): Self = StObject.set(x, "nonFlagArgs", value.asInstanceOf[js.Any])
    
    inline def setNonFlagArgsVarargs(value: String*): Self = StObject.set(x, "nonFlagArgs", js.Array(value*))
    
    inline def setNotifyMode(value: NotifyMode): Self = StObject.set(x, "notifyMode", value.asInstanceOf[js.Any])
    
    inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    inline def setOnlyChanged(value: Boolean): Self = StObject.set(x, "onlyChanged", value.asInstanceOf[js.Any])
    
    inline def setOnlyFailures(value: Boolean): Self = StObject.set(x, "onlyFailures", value.asInstanceOf[js.Any])
    
    inline def setOutputFile(value: String): Self = StObject.set(x, "outputFile", value.asInstanceOf[js.Any])
    
    inline def setOutputFileUndefined: Self = StObject.set(x, "outputFile", js.undefined)
    
    inline def setPassWithNoTests(value: Boolean): Self = StObject.set(x, "passWithNoTests", value.asInstanceOf[js.Any])
    
    inline def setProjects(value: js.Array[String]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsVarargs(value: String*): Self = StObject.set(x, "projects", js.Array(value*))
    
    inline def setReplname(value: String): Self = StObject.set(x, "replname", value.asInstanceOf[js.Any])
    
    inline def setReplnameUndefined: Self = StObject.set(x, "replname", js.undefined)
    
    inline def setReporters(value: js.Array[ReporterConfig]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
    
    inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
    
    inline def setReportersVarargs(value: ReporterConfig*): Self = StObject.set(x, "reporters", js.Array(value*))
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    
    inline def setRunTestsByPath(value: Boolean): Self = StObject.set(x, "runTestsByPath", value.asInstanceOf[js.Any])
    
    inline def setShard(value: ShardConfig): Self = StObject.set(x, "shard", value.asInstanceOf[js.Any])
    
    inline def setShardUndefined: Self = StObject.set(x, "shard", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setSkipFilter(value: Boolean): Self = StObject.set(x, "skipFilter", value.asInstanceOf[js.Any])
    
    inline def setSnapshotFormat(value: SnapshotFormat): Self = StObject.set(x, "snapshotFormat", value.asInstanceOf[js.Any])
    
    inline def setTestFailureExitCode(value: Double): Self = StObject.set(x, "testFailureExitCode", value.asInstanceOf[js.Any])
    
    inline def setTestNamePattern(value: String): Self = StObject.set(x, "testNamePattern", value.asInstanceOf[js.Any])
    
    inline def setTestNamePatternUndefined: Self = StObject.set(x, "testNamePattern", js.undefined)
    
    inline def setTestPathPattern(value: String): Self = StObject.set(x, "testPathPattern", value.asInstanceOf[js.Any])
    
    inline def setTestResultsProcessor(value: String): Self = StObject.set(x, "testResultsProcessor", value.asInstanceOf[js.Any])
    
    inline def setTestResultsProcessorUndefined: Self = StObject.set(x, "testResultsProcessor", js.undefined)
    
    inline def setTestSequencer(value: String): Self = StObject.set(x, "testSequencer", value.asInstanceOf[js.Any])
    
    inline def setTestTimeout(value: Double): Self = StObject.set(x, "testTimeout", value.asInstanceOf[js.Any])
    
    inline def setTestTimeoutUndefined: Self = StObject.set(x, "testTimeout", js.undefined)
    
    inline def setUpdateSnapshot(value: SnapshotUpdateState): Self = StObject.set(x, "updateSnapshot", value.asInstanceOf[js.Any])
    
    inline def setUseStderr(value: Boolean): Self = StObject.set(x, "useStderr", value.asInstanceOf[js.Any])
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    
    inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchAll(value: Boolean): Self = StObject.set(x, "watchAll", value.asInstanceOf[js.Any])
    
    inline def setWatchPlugins(value: js.Array[Config]): Self = StObject.set(x, "watchPlugins", value.asInstanceOf[js.Any])
    
    inline def setWatchPluginsNull: Self = StObject.set(x, "watchPlugins", null)
    
    inline def setWatchPluginsUndefined: Self = StObject.set(x, "watchPlugins", js.undefined)
    
    inline def setWatchPluginsVarargs(value: Config*): Self = StObject.set(x, "watchPlugins", js.Array(value*))
    
    inline def setWatchman(value: Boolean): Self = StObject.set(x, "watchman", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdleMemoryLimit(value: Double): Self = StObject.set(x, "workerIdleMemoryLimit", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdleMemoryLimitUndefined: Self = StObject.set(x, "workerIdleMemoryLimit", js.undefined)
  }
}
