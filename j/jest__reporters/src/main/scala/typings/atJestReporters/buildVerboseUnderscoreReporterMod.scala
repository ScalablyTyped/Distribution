package typings.atJestReporters

import typings.atJestTestDashResult.buildTypesMod.AssertionResult
import typings.atJestTestDashResult.buildTypesMod.Suite
import typings.atJestTypes.buildConfigMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/verbose_reporter", JSImport.Namespace)
@js.native
object buildVerboseUnderscoreReporterMod extends js.Object {
  @js.native
  trait VerboseReporter
    extends typings.atJestReporters.buildDefaultUnderscoreReporterMod.default {
    var _getIcon: js.Any = js.native
    var _logLine: js.Any = js.native
    var _logSuite: js.Any = js.native
    var _logTest: js.Any = js.native
    var _logTestResults: js.Any = js.native
    var _logTests: js.Any = js.native
    var _logTodoOrPendingTest: js.Any = js.native
  }
  
  @js.native
  class default protected () extends VerboseReporter {
    def this(globalConfig: GlobalConfig) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def filterTestResults(testResults: js.Array[AssertionResult]): js.Array[AssertionResult] = js.native
    def groupTestsBySuites(testResults: js.Array[AssertionResult]): Suite = js.native
  }
  
}

