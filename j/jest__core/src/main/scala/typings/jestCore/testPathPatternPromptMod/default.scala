package typings.jestCore.testPathPatternPromptMod

import typings.jestRunner.mod.Test
import typings.node.NodeJS.WritableStream
import typings.std.ScrollOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/TestPathPatternPrompt", JSImport.Default)
@js.native
class default protected () extends TestPathPatternPrompt {
  def this(
    pipe: WritableStream,
    prompt: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Prompt */ js.Any
  ) = this()
  /* CompleteClass */
  override def _getMatchedTests(pattern: String): js.Array[Test] = js.native
  /* CompleteClass */
  override def _onChange(pattern: String, options: ScrollOptions): Unit = js.native
  /* CompleteClass */
  override def _printPrompt(pattern: String): Unit = js.native
  /* CompleteClass */
  override def updateSearchSources(searchSources: SearchSources): Unit = js.native
}

