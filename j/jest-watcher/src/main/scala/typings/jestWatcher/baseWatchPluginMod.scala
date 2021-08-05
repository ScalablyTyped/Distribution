package typings.jestWatcher

import typings.jestTypes.configMod.GlobalConfig
import typings.jestWatcher.anon.Stdin
import typings.jestWatcher.typesMod.JestHookSubscriber
import typings.jestWatcher.typesMod.UpdateConfigCallback
import typings.jestWatcher.typesMod.UsageData
import typings.jestWatcher.typesMod.WatchPlugin
import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseWatchPluginMod {
  
  @JSImport("jest-watcher/build/BaseWatchPlugin", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with BaseWatchPlugin {
    def this(hasStdinStdout: Stdin) = this()
    
    /* protected */ /* CompleteClass */
    var _stdin: ReadStream = js.native
    
    /* protected */ /* CompleteClass */
    var _stdout: WriteStream = js.native
    
    /* CompleteClass */
    @JSName("apply")
    override def apply_MBaseWatchPlugin(_hooks: JestHookSubscriber): Unit = js.native
    
    /* CompleteClass */
    @JSName("getUsageInfo")
    override def getUsageInfo_MBaseWatchPlugin(_globalConfig: GlobalConfig): UsageData | Null = js.native
    
    /* CompleteClass */
    @JSName("onKey")
    override def onKey_MBaseWatchPlugin(_key: String): Unit = js.native
    
    /* CompleteClass */
    @JSName("run")
    override def run_MBaseWatchPlugin(_globalConfig: GlobalConfig, _updateConfigAndRun: UpdateConfigCallback): js.Promise[Unit | Boolean] = js.native
  }
  
  trait BaseWatchPlugin
    extends StObject
       with WatchPlugin {
    
    /* protected */ var _stdin: ReadStream
    
    /* protected */ var _stdout: WriteStream
    
    @JSName("apply")
    def apply_MBaseWatchPlugin(_hooks: JestHookSubscriber): Unit
    
    @JSName("getUsageInfo")
    def getUsageInfo_MBaseWatchPlugin(_globalConfig: GlobalConfig): UsageData | Null
    
    @JSName("onKey")
    def onKey_MBaseWatchPlugin(_key: String): Unit
    
    @JSName("run")
    def run_MBaseWatchPlugin(_globalConfig: GlobalConfig, _updateConfigAndRun: UpdateConfigCallback): js.Promise[Unit | Boolean]
  }
  object BaseWatchPlugin {
    
    inline def apply(
      _stdin: ReadStream,
      _stdout: WriteStream,
      apply: JestHookSubscriber => Unit,
      getUsageInfo: GlobalConfig => UsageData | Null,
      onKey: String => Unit,
      run: (GlobalConfig, UpdateConfigCallback) => js.Promise[Unit | Boolean]
    ): BaseWatchPlugin = {
      val __obj = js.Dynamic.literal(_stdin = _stdin.asInstanceOf[js.Any], _stdout = _stdout.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), getUsageInfo = js.Any.fromFunction1(getUsageInfo), onKey = js.Any.fromFunction1(onKey), run = js.Any.fromFunction2(run))
      __obj.asInstanceOf[BaseWatchPlugin]
    }
    
    extension [Self <: BaseWatchPlugin](x: Self) {
      
      inline def setApply(value: JestHookSubscriber => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setGetUsageInfo(value: GlobalConfig => UsageData | Null): Self = StObject.set(x, "getUsageInfo", js.Any.fromFunction1(value))
      
      inline def setOnKey(value: String => Unit): Self = StObject.set(x, "onKey", js.Any.fromFunction1(value))
      
      inline def setRun(value: (GlobalConfig, UpdateConfigCallback) => js.Promise[Unit | Boolean]): Self = StObject.set(x, "run", js.Any.fromFunction2(value))
      
      inline def set_stdin(value: ReadStream): Self = StObject.set(x, "_stdin", value.asInstanceOf[js.Any])
      
      inline def set_stdout(value: WriteStream): Self = StObject.set(x, "_stdout", value.asInstanceOf[js.Any])
    }
  }
}
