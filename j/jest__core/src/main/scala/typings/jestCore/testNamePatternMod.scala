package typings.jestCore

import typings.jestCore.anon.Stdin
import typings.jestCore.jestCoreBooleans.`true`
import typings.jestTypes.configMod.GlobalConfig
import typings.jestWatcher.mod.BaseWatchPlugin
import typings.jestWatcher.mod.Prompt
import typings.jestWatcher.typesMod.UpdateConfigCallback
import typings.jestWatcher.typesMod.UsageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/core/build/plugins/TestNamePattern", JSImport.Namespace)
@js.native
object testNamePatternMod extends js.Object {
  
  @js.native
  trait TestNamePatternPlugin extends BaseWatchPlugin {
    
    var _prompt: Prompt = js.native
    
    @JSName("getUsageInfo")
    def getUsageInfo_MTestNamePatternPlugin(): UsageData = js.native
    
    @JSName("isInternal")
    var isInternal_TestNamePatternPlugin: `true` = js.native
    
    @JSName("onKey")
    def onKey_MTestNamePatternPlugin(key: String): Unit = js.native
    
    @JSName("run")
    def run_MTestNamePatternPlugin(globalConfig: GlobalConfig, updateConfigAndRun: UpdateConfigCallback): js.Promise[Unit] = js.native
  }
  
  @js.native
  class default protected () extends TestNamePatternPlugin {
    def this(options: Stdin) = this()
  }
}
