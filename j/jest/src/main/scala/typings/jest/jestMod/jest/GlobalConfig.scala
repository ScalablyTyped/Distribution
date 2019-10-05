package typings.jest.jestMod.jest

import org.scalablytyped.runtime.StringDictionary
import typings.jest.Anon_Global
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalConfig extends js.Object {
  var bail: Boolean
  var collectCoverage: Boolean
  var collectCoverageFrom: js.Array[Glob]
  var collectCoverageOnlyFrom: Maybe[StringDictionary[Boolean]]
  var coverageDirectory: String
  var coverageReporters: js.Array[String]
  var coverageThreshold: Anon_Global
  var expand: Boolean
  var forceExit: Boolean
  var logHeapUsage: Boolean
  var mapCoverage: Boolean
  var noStackTrace: Boolean
  @JSName("notify")
  var notify_FGlobalConfig: Boolean
  var projects: js.Array[Glob]
  var replname: Maybe[String]
  var reporters: js.Array[ReporterConfig]
  var rootDir: Path
  var silent: Boolean
  var testNamePattern: String
  var testPathPattern: String
  var testResultsProcessor: Maybe[String]
  var updateSnapshot: SnapshotUpdateState
  var useStderr: Boolean
  var verbose: Maybe[Boolean]
  var watch: Boolean
  var watchman: Boolean
}

object GlobalConfig {
  @scala.inline
  def apply(
    bail: Boolean,
    collectCoverage: Boolean,
    collectCoverageFrom: js.Array[Glob],
    coverageDirectory: String,
    coverageReporters: js.Array[String],
    coverageThreshold: Anon_Global,
    expand: Boolean,
    forceExit: Boolean,
    logHeapUsage: Boolean,
    mapCoverage: Boolean,
    noStackTrace: Boolean,
    notify: Boolean,
    projects: js.Array[Glob],
    reporters: js.Array[ReporterConfig],
    rootDir: Path,
    silent: Boolean,
    testNamePattern: String,
    testPathPattern: String,
    updateSnapshot: SnapshotUpdateState,
    useStderr: Boolean,
    watch: Boolean,
    watchman: Boolean,
    collectCoverageOnlyFrom: Maybe[StringDictionary[Boolean]] = null,
    replname: Maybe[String] = null,
    testResultsProcessor: Maybe[String] = null,
    verbose: Maybe[Boolean] = null
  ): GlobalConfig = {
    val __obj = js.Dynamic.literal(bail = bail, collectCoverage = collectCoverage, collectCoverageFrom = collectCoverageFrom, coverageDirectory = coverageDirectory, coverageReporters = coverageReporters, coverageThreshold = coverageThreshold, expand = expand, forceExit = forceExit, logHeapUsage = logHeapUsage, mapCoverage = mapCoverage, noStackTrace = noStackTrace, notify = notify, projects = projects, reporters = reporters, rootDir = rootDir, silent = silent, testNamePattern = testNamePattern, testPathPattern = testPathPattern, updateSnapshot = updateSnapshot, useStderr = useStderr, watch = watch, watchman = watchman)
    if (collectCoverageOnlyFrom != null) __obj.updateDynamic("collectCoverageOnlyFrom")(collectCoverageOnlyFrom.asInstanceOf[js.Any])
    if (replname != null) __obj.updateDynamic("replname")(replname.asInstanceOf[js.Any])
    if (testResultsProcessor != null) __obj.updateDynamic("testResultsProcessor")(testResultsProcessor.asInstanceOf[js.Any])
    if (verbose != null) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalConfig]
  }
}

