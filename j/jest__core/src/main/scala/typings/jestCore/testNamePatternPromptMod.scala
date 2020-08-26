package typings.jestCore

import typings.jestTestResult.typesMod.TestResult
import typings.jestWatcher.mod.PatternPrompt
import typings.jestWatcher.mod.Prompt
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/TestNamePatternPrompt", JSImport.Namespace)
@js.native
object testNamePatternPromptMod extends js.Object {
  @js.native
  trait TestNamePatternPrompt extends PatternPrompt {
    var _cachedTestResults: js.Array[TestResult] = js.native
    def _getMatchedTests(pattern: String): js.Array[String] = js.native
    def _printPrompt(pattern: String): Unit = js.native
    def updateCachedTestResults(): Unit = js.native
    def updateCachedTestResults(testResults: js.Array[TestResult]): Unit = js.native
  }
  
  @js.native
  class default protected () extends TestNamePatternPrompt {
    def this(pipe: WritableStream, prompt: Prompt) = this()
  }
  
}

