package typings.jest.mod.jest

import org.scalablytyped.runtime.StringDictionary
import typings.jest.AnonGlobal
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
  var coverageThreshold: AnonGlobal
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
    coverageThreshold: AnonGlobal,
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
    val __obj = js.Dynamic.literal(bail = bail.asInstanceOf[js.Any], collectCoverage = collectCoverage.asInstanceOf[js.Any], collectCoverageFrom = collectCoverageFrom.asInstanceOf[js.Any], coverageDirectory = coverageDirectory.asInstanceOf[js.Any], coverageReporters = coverageReporters.asInstanceOf[js.Any], coverageThreshold = coverageThreshold.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], forceExit = forceExit.asInstanceOf[js.Any], logHeapUsage = logHeapUsage.asInstanceOf[js.Any], mapCoverage = mapCoverage.asInstanceOf[js.Any], noStackTrace = noStackTrace.asInstanceOf[js.Any], notify = notify.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], reporters = reporters.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], testNamePattern = testNamePattern.asInstanceOf[js.Any], testPathPattern = testPathPattern.asInstanceOf[js.Any], updateSnapshot = updateSnapshot.asInstanceOf[js.Any], useStderr = useStderr.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any], watchman = watchman.asInstanceOf[js.Any])
    if (collectCoverageOnlyFrom != null) __obj.updateDynamic("collectCoverageOnlyFrom")(collectCoverageOnlyFrom.asInstanceOf[js.Any])
    if (replname != null) __obj.updateDynamic("replname")(replname.asInstanceOf[js.Any])
    if (testResultsProcessor != null) __obj.updateDynamic("testResultsProcessor")(testResultsProcessor.asInstanceOf[js.Any])
    if (verbose != null) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalConfig]
  }
}

