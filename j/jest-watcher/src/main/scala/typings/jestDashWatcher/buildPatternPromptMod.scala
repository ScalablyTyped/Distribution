package typings.jestDashWatcher

import typings.jestDashWatcher.buildTypesMod.ScrollOptions
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-watcher/build/PatternPrompt", JSImport.Namespace)
@js.native
object buildPatternPromptMod extends js.Object {
  @js.native
  trait PatternPrompt extends js.Object {
    var _currentUsageRows: Double = js.native
    var _entityName: String = js.native
    var _pipe: WritableStream = js.native
    var _prompt: typings.jestDashWatcher.buildLibPromptMod.default = js.native
    /* protected */ def _onChange(_pattern: String, _options: ScrollOptions): Unit = js.native
    def run(onSuccess: js.Function1[/* value */ String, Unit], onCancel: js.Function0[Unit]): Unit = js.native
    def run(
      onSuccess: js.Function1[/* value */ String, Unit],
      onCancel: js.Function0[Unit],
      options: Anon_Header
    ): Unit = js.native
  }
  
  @js.native
  class default protected () extends PatternPrompt {
    def this(pipe: WritableStream, prompt: typings.jestDashWatcher.buildLibPromptMod.default) = this()
  }
  
}

