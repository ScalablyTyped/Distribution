package typings.jestWatcher

import typings.jestWatcher.anon.Header
import typings.jestWatcher.typesMod.ScrollOptions
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-watcher/build/PatternPrompt", JSImport.Namespace)
@js.native
object patternPromptMod extends js.Object {
  
  @js.native
  trait PatternPrompt extends js.Object {
    
    var _currentUsageRows: Double = js.native
    
    var _entityName: String = js.native
    
    /* protected */ def _onChange(_pattern: String, _options: ScrollOptions): Unit = js.native
    
    var _pipe: WritableStream = js.native
    
    var _prompt: typings.jestWatcher.promptMod.default = js.native
    
    def run(onSuccess: js.Function1[/* value */ String, Unit], onCancel: js.Function0[Unit]): Unit = js.native
    def run(onSuccess: js.Function1[/* value */ String, Unit], onCancel: js.Function0[Unit], options: Header): Unit = js.native
  }
  
  @js.native
  class default protected () extends PatternPrompt {
    def this(pipe: WritableStream, prompt: typings.jestWatcher.promptMod.default) = this()
  }
}
