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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseWatchPluginMod {
  
  @JSImport("jest-watcher/build/BaseWatchPlugin", JSImport.Default)
  @js.native
  class default protected () extends BaseWatchPlugin {
    def this(hasStdinStdout: Stdin) = this()
  }
  
  @js.native
  trait BaseWatchPlugin extends WatchPlugin {
    
    var _stdin: ReadStream = js.native
    
    var _stdout: WriteStream = js.native
    
    @JSName("apply")
    def apply_MBaseWatchPlugin(_hooks: JestHookSubscriber): Unit = js.native
    
    @JSName("getUsageInfo")
    def getUsageInfo_MBaseWatchPlugin(_globalConfig: GlobalConfig): UsageData | Null = js.native
    
    @JSName("onKey")
    def onKey_MBaseWatchPlugin(_key: String): Unit = js.native
    
    @JSName("run")
    def run_MBaseWatchPlugin(_globalConfig: GlobalConfig, _updateConfigAndRun: UpdateConfigCallback): js.Promise[Unit | Boolean] = js.native
  }
  object BaseWatchPlugin {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class BaseWatchPluginMutableBuilder[Self <: BaseWatchPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: JestHookSubscriber => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetUsageInfo(value: GlobalConfig => UsageData | Null): Self = StObject.set(x, "getUsageInfo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKey(value: String => Unit): Self = StObject.set(x, "onKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRun(value: (GlobalConfig, UpdateConfigCallback) => js.Promise[Unit | Boolean]): Self = StObject.set(x, "run", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_stdin(value: ReadStream): Self = StObject.set(x, "_stdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_stdout(value: WriteStream): Self = StObject.set(x, "_stdout", value.asInstanceOf[js.Any])
    }
  }
}
