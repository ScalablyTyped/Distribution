package typings.jestWatcher

import typings.jestWatcher.anon.Stdin
import typings.jestWatcher.baseWatchPluginMod.default
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-watcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest-watcher", "BaseWatchPlugin")
  @js.native
  class BaseWatchPlugin protected () extends default {
    def this(hasStdinStdout: Stdin) = this()
  }
  
  @JSImport("jest-watcher", "JestHook")
  @js.native
  class JestHook ()
    extends typings.jestWatcher.jestHooksMod.default
  
  object KEYS {
    
    @JSImport("jest-watcher", "KEYS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jest-watcher", "KEYS.ARROW_DOWN")
    @js.native
    def ARROW_DOWN: String = js.native
    inline def ARROW_DOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_DOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-watcher", "KEYS.ARROW_LEFT")
    @js.native
    def ARROW_LEFT: String = js.native
    inline def ARROW_LEFT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-watcher", "KEYS.ARROW_RIGHT")
    @js.native
    def ARROW_RIGHT: String = js.native
    inline def ARROW_RIGHT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-watcher", "KEYS.ARROW_UP")
    @js.native
    def ARROW_UP: String = js.native
    inline def ARROW_UP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_UP")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-watcher", "KEYS.BACKSPACE")
    @js.native
    def BACKSPACE: String = js.native
    inline def BACKSPACE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKSPACE")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-watcher", "KEYS.CONTROL_C")
    @js.native
    def CONTROL_C: String = js.native
    inline def CONTROL_C_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTROL_C")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-watcher", "KEYS.CONTROL_D")
    @js.native
    def CONTROL_D: String = js.native
    inline def CONTROL_D_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTROL_D")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-watcher", "KEYS.ENTER")
    @js.native
    def ENTER: String = js.native
    inline def ENTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-watcher", "KEYS.ESCAPE")
    @js.native
    def ESCAPE: String = js.native
    inline def ESCAPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ESCAPE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("jest-watcher", "PatternPrompt")
  @js.native
  class PatternPrompt protected ()
    extends typings.jestWatcher.patternPromptMod.default {
    def this(pipe: WritableStream, prompt: typings.jestWatcher.promptMod.default) = this()
  }
  
  @JSImport("jest-watcher", "Prompt")
  @js.native
  class Prompt ()
    extends typings.jestWatcher.promptMod.default
  
  inline def printPatternCaret(pattern: String, pipe: WritableStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printPatternCaret")(pattern.asInstanceOf[js.Any], pipe.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def printRestoredPatternCaret(pattern: String, currentUsageRows: Double, pipe: WritableStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printRestoredPatternCaret")(pattern.asInstanceOf[js.Any], currentUsageRows.asInstanceOf[js.Any], pipe.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
