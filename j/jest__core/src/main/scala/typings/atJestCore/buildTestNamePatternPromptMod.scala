package typings.atJestCore

import typings.atJestCore.buildTestNamePatternPromptMod.TestNamePatternPrompt
import typings.atJestTestDashResult.buildTypesMod.TestResult
import typings.node.NodeJS.WritableStream
import typings.std.ScrollOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/TestNamePatternPrompt", JSImport.Namespace)
@js.native
object buildTestNamePatternPromptMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PatternPrompt * / any */ @js.native
  trait TestNamePatternPrompt extends js.Object {
    var _cachedTestResults: js.Array[TestResult] = js.native
    def _getMatchedTests(pattern: String): js.Array[String] = js.native
    def _onChange(pattern: String, options: ScrollOptions): Unit = js.native
    def _printPrompt(pattern: String): Unit = js.native
    def updateCachedTestResults(): Unit = js.native
    def updateCachedTestResults(testResults: js.Array[TestResult]): Unit = js.native
  }
  
  @js.native
  class default protected () extends TestNamePatternPrompt {
    def this(
      pipe: WritableStream,
      prompt: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Prompt */ js.Any
    ) = this()
  }
  
}

