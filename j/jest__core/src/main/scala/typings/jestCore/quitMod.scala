package typings.jestCore

import typings.jestCore.jestCoreBooleans.`true`
import typings.jestWatcher.mod.BaseWatchPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/plugins/quit", JSImport.Namespace)
@js.native
object quitMod extends js.Object {
  @js.native
  trait QuitPlugin extends BaseWatchPlugin {
    @JSName("isInternal")
    var isInternal_QuitPlugin: `true` = js.native
    @JSName("getUsageInfo")
    def getUsageInfo_MQuitPlugin(): AnonKey = js.native
    @JSName("run")
    def run_MQuitPlugin(): js.Promise[Unit] = js.native
  }
  
  @js.native
  class default protected () extends QuitPlugin {
    def this(options: AnonStdin) = this()
  }
  
}

