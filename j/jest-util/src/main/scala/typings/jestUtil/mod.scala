package typings.jestUtil

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.callsites.mod.CallSite
import typings.jestConsole.mod.CustomConsole
import typings.jestConsole.typesMod.LogEntry
import typings.jestFakeTimers.anon.Config
import typings.jestFakeTimers.mod.JestFakeTimers
import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.CodeCoverageFormatter
import typings.jestTestResult.typesMod.CodeCoverageReporter
import typings.jestTestResult.typesMod.FormattedTestResults
import typings.jestTypes.configMod.ConfigGlobals
import typings.jestTypes.configMod.Glob
import typings.jestTypes.configMod.Path
import typings.jestUtil.anon.FnCall
import typings.jestUtil.anon.FnCallResultsCodeCoverageFormatterReporter
import typings.jestUtil.anon.FnCallValueOptionsCycles
import typings.jestUtil.anon.TypeofBufferedConsole
import typings.jestUtil.anon.TypeofpreRunMessage
import typings.jestUtil.anon.TypeofspecialChars
import typings.jestUtil.deepCyclicCopyMod.DeepCyclicCopyOptions
import typings.jestUtil.errorWithStackMod.default
import typings.node.NodeJS.Global
import typings.node.NodeJS.WritableStream
import typings.std.Record
import typings.std.RegExp
import typings.std.WeakMap
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-util", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Console protected () extends CustomConsole {
    def this(stdout: WritableStream, stderr: WritableStream) = this()
  }
  
  @js.native
  class ErrorWithStack protected () extends default {
    def this(message: js.UndefOr[scala.Nothing], callsite: js.Function) = this()
    def this(message: String, callsite: js.Function) = this()
  }
  
  @js.native
  class FakeTimers[TimerRef] protected () extends JestFakeTimers[TimerRef] {
    def this(hasGlobalModuleMockerTimerConfigConfigMaxLoops: Config[/* import warning: RewrittenClass.unapply cls was tparam TimerRef */ _]) = this()
  }
  
  @js.native
  class NullConsole ()
    extends typings.jestConsole.mod.NullConsole
  
  var BufferedConsole: TypeofBufferedConsole = js.native
  @JSName("convertDescriptorToString")
  var convertDescriptorToString_Original: FnCall = js.native
  @JSName("createDirectory")
  var createDirectory_Original: js.Function1[/* path */ Path, Unit] = js.native
  @JSName("deepCyclicCopy")
  var deepCyclicCopy_Original: FnCallValueOptionsCycles = js.native
  @JSName("formatTestResults")
  var formatTestResults_Original: FnCallResultsCodeCoverageFormatterReporter = js.native
  @JSName("getFailedSnapshotTests")
  var getFailedSnapshotTests_Original: js.Function1[/* testResults */ AggregatedResult, js.Array[String]] = js.native
  @JSName("installCommonGlobals")
  var installCommonGlobals_Original: js.Function2[/* globalObject */ Global, /* globals */ ConfigGlobals, Global with ConfigGlobals] = js.native
  @JSName("interopRequireDefault")
  var interopRequireDefault_Original: js.Function1[/* obj */ js.Any, _] = js.native
  var isInteractive: Boolean = js.native
  @JSName("pluralize")
  var pluralize_Original: js.Function2[/* word */ String, /* count */ Double, String] = js.native
  var preRunMessage: TypeofpreRunMessage = js.native
  @JSName("replacePathSepForGlob")
  var replacePathSepForGlob_Original: js.Function1[/* path */ Path, Glob] = js.native
  var specialChars: TypeofspecialChars = js.native
  def clearLine(stream: WritableStream): Unit = js.native
  def convertDescriptorToString(descriptor: js.UndefOr[scala.Nothing]): js.UndefOr[String] = js.native
  def convertDescriptorToString(descriptor: String): String = js.native
  def convertDescriptorToString(descriptor: js.Function): js.Function | String = js.native
  def convertDescriptorToString(descriptor: Double): Double | String = js.native
  def createDirectory(path: Path): Unit = js.native
  def deepCyclicCopy[T](value: T): T = js.native
  def deepCyclicCopy[T](value: T, options: js.UndefOr[scala.Nothing], cycles: WeakMap[_, _]): T = js.native
  def deepCyclicCopy[T](value: T, options: DeepCyclicCopyOptions): T = js.native
  def deepCyclicCopy[T](value: T, options: DeepCyclicCopyOptions, cycles: WeakMap[_, _]): T = js.native
  def formatTestResults(results: AggregatedResult): FormattedTestResults = js.native
  def formatTestResults(
    results: AggregatedResult,
    codeCoverageFormatter: js.UndefOr[scala.Nothing],
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
  def formatTestResults(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = js.native
  def formatTestResults(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = js.native
  def getCallsite(level: Double): CallSite = js.native
  def getCallsite(level: Double, sourceMaps: Record[String, String]): CallSite = js.native
  def getConsoleOutput(root: String, verbose: Boolean, buffer: js.Array[LogEntry]): String = js.native
  def getFailedSnapshotTests(testResults: AggregatedResult): js.Array[String] = js.native
  def installCommonGlobals(globalObject: Global, globals: ConfigGlobals): Global with ConfigGlobals = js.native
  def interopRequireDefault(obj: js.Any): js.Any = js.native
  def isPromise(candidate: js.Any): /* is std.Promise<unknown> */ Boolean = js.native
  def pluralize(word: String, count: Double): String = js.native
  def replacePathSepForGlob(path: Path): Glob = js.native
  def setGlobal(globalToMutate: Global, key: String, value: js.Any): Unit = js.native
  def setGlobal(globalToMutate: Window, key: String, value: js.Any): Unit = js.native
  def testPathPatternToRegExp(testPathPattern: String): RegExp = js.native
  @js.native
  object Console extends TopLevel[
          Instantiable2[/* stdout */ WritableStream, /* stderr */ WritableStream, CustomConsole]
        ]
  
  @js.native
  object ErrorWithStack
    extends TopLevel[
          Instantiable2[/* message */ js.UndefOr[String], /* callsite */ js.Function, default]
        ]
  
  @js.native
  object FakeTimers
    extends TopLevel[
          Instantiable1[
            /* hasGlobalModuleMockerTimerConfigConfigMaxLoops */ Config[/* import warning: RewrittenClass.unapply cls was tparam TimerRef */ js.Any], 
            JestFakeTimers[js.Object]
          ]
        ]
  
  @js.native
  object NullConsole
    extends TopLevel[Instantiable0[typings.jestConsole.mod.NullConsole]]
  
}

