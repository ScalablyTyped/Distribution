package typings.jestCore

import typings.jestCore.anon.Stdin
import typings.jestCore.jestCoreBooleans.`true`
import typings.jestTypes.configMod.GlobalConfig
import typings.jestWatcher.mod.BaseWatchPlugin
import typings.jestWatcher.typesMod.UpdateConfigCallback
import typings.jestWatcher.typesMod.UsageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/plugins/test_path_pattern", JSImport.Namespace)
@js.native
object testPathPatternMod extends js.Object {
  @js.native
  trait TestPathPatternPlugin extends BaseWatchPlugin {
    var _prompt: js.Any = js.native
    @JSName("isInternal")
    var isInternal_TestPathPatternPlugin: `true` = js.native
    @JSName("getUsageInfo")
    def getUsageInfo_MTestPathPatternPlugin(): UsageData = js.native
    @JSName("onKey")
    def onKey_MTestPathPatternPlugin(key: String): Unit = js.native
    @JSName("run")
    def run_MTestPathPatternPlugin(globalConfig: GlobalConfig, updateConfigAndRun: UpdateConfigCallback): js.Promise[Unit] = js.native
  }
  
  @js.native
  class default protected () extends TestPathPatternPlugin {
    def this(options: Stdin) = this()
  }
  
}

