package typings.jestCore

import typings.jestCore.anon.Context
import typings.jestRunner.mod.Test
import typings.jestWatcher.mod.PatternPrompt
import typings.jestWatcher.mod.Prompt
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/core/build/TestPathPatternPrompt", JSImport.Namespace)
@js.native
object testPathPatternPromptMod extends js.Object {
  
  @js.native
  trait TestPathPatternPrompt extends PatternPrompt {
    
    def _getMatchedTests(pattern: String): js.Array[Test] = js.native
    
    def _printPrompt(pattern: String): Unit = js.native
    
    var _searchSources: js.UndefOr[SearchSources] = js.native
    
    def updateSearchSources(searchSources: SearchSources): Unit = js.native
  }
  
  @js.native
  class default protected () extends TestPathPatternPrompt {
    def this(pipe: WritableStream, prompt: Prompt) = this()
  }
  
  type SearchSources = js.Array[Context]
}
