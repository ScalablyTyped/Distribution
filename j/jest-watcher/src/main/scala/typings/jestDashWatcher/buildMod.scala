package typings.jestDashWatcher

import typings.jestDashWatcher.buildBaseWatchPluginMod.default
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-watcher/build", JSImport.Namespace)
@js.native
object buildMod extends js.Object {
  @js.native
  class BaseWatchPlugin protected () extends default {
    def this(hasStdinStdout: Anon_Stdin) = this()
  }
  
  @js.native
  class JestHook ()
    extends typings.jestDashWatcher.buildJestHooksMod.default
  
  @js.native
  class PatternPrompt protected ()
    extends typings.jestDashWatcher.buildPatternPromptMod.default {
    def this(pipe: WritableStream, prompt: typings.jestDashWatcher.buildLibPromptMod.default) = this()
  }
  
  @js.native
  class Prompt ()
    extends typings.jestDashWatcher.buildLibPromptMod.default
  
  def printPatternCaret(pattern: String, pipe: WritableStream): Unit = js.native
  def printRestoredPatternCaret(pattern: String, currentUsageRows: Double, pipe: WritableStream): Unit = js.native
  @js.native
  object KEYS extends js.Object {
    var ARROW_DOWN: String = js.native
    var ARROW_LEFT: String = js.native
    var ARROW_RIGHT: String = js.native
    var ARROW_UP: String = js.native
    var BACKSPACE: String = js.native
    var CONTROL_C: String = js.native
    var CONTROL_D: String = js.native
    var ENTER: String = js.native
    var ESCAPE: String = js.native
  }
  
}

