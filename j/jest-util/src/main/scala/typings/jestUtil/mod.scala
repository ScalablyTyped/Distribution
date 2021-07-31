package typings.jestUtil

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.callsites.mod.CallSite
import typings.jestConsole.mod.CustomConsole
import typings.jestConsole.typesMod.LogEntry
import typings.jestFakeTimers.anon.Config
import typings.jestFakeTimers.mod.JestFakeTimers
import typings.jestSourceMap.typesMod.SourceMapRegistry
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jest-util", "BufferedConsole")
  @js.native
  class BufferedConsole protected ()
    extends typings.jestConsole.mod.BufferedConsole {
    def this(getSourceMaps: js.Function0[js.UndefOr[SourceMapRegistry | Null]]) = this()
  }
  @JSImport("jest-util", "BufferedConsole")
  @js.native
  def BufferedConsole: TypeofBufferedConsole = js.native
  @scala.inline
  def BufferedConsole_=(x: TypeofBufferedConsole): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BufferedConsole")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jest-util", "Console")
  @js.native
  class Console protected () extends CustomConsole {
    def this(stdout: WritableStream, stderr: WritableStream) = this()
  }
  @JSImport("jest-util", "Console")
  @js.native
  def Console: Instantiable2[/* stdout */ WritableStream, /* stderr */ WritableStream, CustomConsole] = js.native
  @scala.inline
  def Console_=(x: Instantiable2[/* stdout */ WritableStream, /* stderr */ WritableStream, CustomConsole]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Console")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jest-util", "ErrorWithStack")
  @js.native
  class ErrorWithStack protected () extends default {
    def this(message: String, callsite: js.Function) = this()
    def this(message: Unit, callsite: js.Function) = this()
  }
  @JSImport("jest-util", "ErrorWithStack")
  @js.native
  def ErrorWithStack: Instantiable2[/* message */ js.UndefOr[String], /* callsite */ js.Function, default] = js.native
  @scala.inline
  def ErrorWithStack_=(x: Instantiable2[/* message */ js.UndefOr[String], /* callsite */ js.Function, default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ErrorWithStack")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jest-util", "FakeTimers")
  @js.native
  class FakeTimers[TimerRef] protected () extends JestFakeTimers[TimerRef] {
    def this(hasGlobalModuleMockerTimerConfigConfigMaxLoops: Config[/* import warning: RewrittenClass.unapply cls was tparam TimerRef */ js.Any]) = this()
  }
  @JSImport("jest-util", "FakeTimers")
  @js.native
  def FakeTimers: Instantiable1[
    /* hasGlobalModuleMockerTimerConfigConfigMaxLoops */ Config[/* import warning: RewrittenClass.unapply cls was tparam TimerRef */ js.Any], 
    JestFakeTimers[js.Object]
  ] = js.native
  @scala.inline
  def FakeTimers_=(
    x: Instantiable1[
      /* hasGlobalModuleMockerTimerConfigConfigMaxLoops */ Config[/* import warning: RewrittenClass.unapply cls was tparam TimerRef */ js.Any], 
      JestFakeTimers[js.Object]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FakeTimers")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jest-util", "NullConsole")
  @js.native
  class NullConsole ()
    extends typings.jestConsole.mod.NullConsole
  @JSImport("jest-util", "NullConsole")
  @js.native
  def NullConsole: Instantiable0[typings.jestConsole.mod.NullConsole] = js.native
  @scala.inline
  def NullConsole_=(x: Instantiable0[typings.jestConsole.mod.NullConsole]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NullConsole")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def clearLine(stream: WritableStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearLine")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("jest-util", "convertDescriptorToString")
  @js.native
  def convertDescriptorToString: FnCall = js.native
  @scala.inline
  def convertDescriptorToString(descriptor: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDescriptorToString")(descriptor.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def convertDescriptorToString(descriptor: js.Function): js.Function | String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDescriptorToString")(descriptor.asInstanceOf[js.Any]).asInstanceOf[js.Function | String]
  @scala.inline
  def convertDescriptorToString(descriptor: Double): Double | String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDescriptorToString")(descriptor.asInstanceOf[js.Any]).asInstanceOf[Double | String]
  @scala.inline
  def convertDescriptorToString(descriptor: Unit): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDescriptorToString")(descriptor.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def convertDescriptorToString_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("convertDescriptorToString")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "createDirectory")
  @js.native
  def createDirectory: js.Function1[/* path */ Path, Unit] = js.native
  @scala.inline
  def createDirectory(path: Path): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createDirectory")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def createDirectory_=(x: js.Function1[/* path */ Path, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createDirectory")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "deepCyclicCopy")
  @js.native
  def deepCyclicCopy: FnCallValueOptionsCycles = js.native
  @scala.inline
  def deepCyclicCopy[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCyclicCopy")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def deepCyclicCopy[T](value: T, options: Unit, cycles: WeakMap[js.Any, js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deepCyclicCopy")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cycles.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def deepCyclicCopy[T](value: T, options: DeepCyclicCopyOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deepCyclicCopy")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def deepCyclicCopy[T](value: T, options: DeepCyclicCopyOptions, cycles: WeakMap[js.Any, js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deepCyclicCopy")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cycles.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def deepCyclicCopy_=(x: FnCallValueOptionsCycles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deepCyclicCopy")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "formatTestResults")
  @js.native
  def formatTestResults: FnCallResultsCodeCoverageFormatterReporter = js.native
  @scala.inline
  def formatTestResults(results: AggregatedResult): FormattedTestResults = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTestResults")(results.asInstanceOf[js.Any]).asInstanceOf[FormattedTestResults]
  @scala.inline
  def formatTestResults(results: AggregatedResult, codeCoverageFormatter: Unit, reporter: CodeCoverageReporter): FormattedTestResults = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTestResults")(results.asInstanceOf[js.Any], codeCoverageFormatter.asInstanceOf[js.Any], reporter.asInstanceOf[js.Any])).asInstanceOf[FormattedTestResults]
  @scala.inline
  def formatTestResults(results: AggregatedResult, codeCoverageFormatter: CodeCoverageFormatter): FormattedTestResults = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTestResults")(results.asInstanceOf[js.Any], codeCoverageFormatter.asInstanceOf[js.Any])).asInstanceOf[FormattedTestResults]
  @scala.inline
  def formatTestResults(
    results: AggregatedResult,
    codeCoverageFormatter: CodeCoverageFormatter,
    reporter: CodeCoverageReporter
  ): FormattedTestResults = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTestResults")(results.asInstanceOf[js.Any], codeCoverageFormatter.asInstanceOf[js.Any], reporter.asInstanceOf[js.Any])).asInstanceOf[FormattedTestResults]
  @scala.inline
  def formatTestResults_=(x: FnCallResultsCodeCoverageFormatterReporter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatTestResults")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def getCallsite(level: Double): CallSite = ^.asInstanceOf[js.Dynamic].applyDynamic("getCallsite")(level.asInstanceOf[js.Any]).asInstanceOf[CallSite]
  @scala.inline
  def getCallsite(level: Double, sourceMaps: Record[String, String]): CallSite = (^.asInstanceOf[js.Dynamic].applyDynamic("getCallsite")(level.asInstanceOf[js.Any], sourceMaps.asInstanceOf[js.Any])).asInstanceOf[CallSite]
  
  @scala.inline
  def getConsoleOutput(root: String, verbose: Boolean, buffer: js.Array[LogEntry]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getConsoleOutput")(root.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("jest-util", "getFailedSnapshotTests")
  @js.native
  def getFailedSnapshotTests: js.Function1[/* testResults */ AggregatedResult, js.Array[String]] = js.native
  @scala.inline
  def getFailedSnapshotTests(testResults: AggregatedResult): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFailedSnapshotTests")(testResults.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def getFailedSnapshotTests_=(x: js.Function1[/* testResults */ AggregatedResult, js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFailedSnapshotTests")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "installCommonGlobals")
  @js.native
  def installCommonGlobals: js.Function2[/* globalObject */ Global, /* globals */ ConfigGlobals, Global & ConfigGlobals] = js.native
  @scala.inline
  def installCommonGlobals(globalObject: Global, globals: ConfigGlobals): Global & ConfigGlobals = (^.asInstanceOf[js.Dynamic].applyDynamic("installCommonGlobals")(globalObject.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Global & ConfigGlobals]
  @scala.inline
  def installCommonGlobals_=(x: js.Function2[/* globalObject */ Global, /* globals */ ConfigGlobals, Global & ConfigGlobals]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("installCommonGlobals")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "interopRequireDefault")
  @js.native
  def interopRequireDefault: js.Function1[/* obj */ js.Any, js.Any] = js.native
  @scala.inline
  def interopRequireDefault(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("interopRequireDefault")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def interopRequireDefault_=(x: js.Function1[/* obj */ js.Any, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interopRequireDefault")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "isInteractive")
  @js.native
  def isInteractive: Boolean = js.native
  @scala.inline
  def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def isPromise(candidate: js.Any): /* is std.Promise<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(candidate.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<unknown> */ Boolean]
  
  @JSImport("jest-util", "pluralize")
  @js.native
  def pluralize: js.Function2[/* word */ String, /* count */ Double, String] = js.native
  @scala.inline
  def pluralize(word: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pluralize")(word.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def pluralize_=(x: js.Function2[/* word */ String, /* count */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pluralize")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "preRunMessage")
  @js.native
  def preRunMessage: TypeofpreRunMessage = js.native
  @scala.inline
  def preRunMessage_=(x: TypeofpreRunMessage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preRunMessage")(x.asInstanceOf[js.Any])
  
  @JSImport("jest-util", "replacePathSepForGlob")
  @js.native
  def replacePathSepForGlob: js.Function1[/* path */ Path, Glob] = js.native
  @scala.inline
  def replacePathSepForGlob(path: Path): Glob = ^.asInstanceOf[js.Dynamic].applyDynamic("replacePathSepForGlob")(path.asInstanceOf[js.Any]).asInstanceOf[Glob]
  @scala.inline
  def replacePathSepForGlob_=(x: js.Function1[/* path */ Path, Glob]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replacePathSepForGlob")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def setGlobal(globalToMutate: Global, key: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGlobal")(globalToMutate.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setGlobal(globalToMutate: Window, key: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGlobal")(globalToMutate.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("jest-util", "specialChars")
  @js.native
  def specialChars: TypeofspecialChars = js.native
  @scala.inline
  def specialChars_=(x: TypeofspecialChars): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("specialChars")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def testPathPatternToRegExp(testPathPattern: String): RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("testPathPatternToRegExp")(testPathPattern.asInstanceOf[js.Any]).asInstanceOf[RegExp]
}
