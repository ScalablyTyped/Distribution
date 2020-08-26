package typings.jestWatcher.baseWatchPluginMod

import typings.jestTypes.configMod.GlobalConfig
import typings.jestWatcher.typesMod.JestHookSubscriber
import typings.jestWatcher.typesMod.UpdateConfigCallback
import typings.jestWatcher.typesMod.UsageData
import typings.jestWatcher.typesMod.WatchPlugin
import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class BaseWatchPluginOps[Self <: BaseWatchPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_stdin(value: ReadStream): Self = this.set("_stdin", value.asInstanceOf[js.Any])
    @scala.inline
    def set_stdout(value: WriteStream): Self = this.set("_stdout", value.asInstanceOf[js.Any])
    @scala.inline
    def setApply(value: JestHookSubscriber => Unit): Self = this.set("apply", js.Any.fromFunction1(value))
    @scala.inline
    def setGetUsageInfo(value: GlobalConfig => UsageData | Null): Self = this.set("getUsageInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setOnKey(value: String => Unit): Self = this.set("onKey", js.Any.fromFunction1(value))
    @scala.inline
    def setRun(value: (GlobalConfig, UpdateConfigCallback) => js.Promise[Unit | Boolean]): Self = this.set("run", js.Any.fromFunction2(value))
  }
  
}

