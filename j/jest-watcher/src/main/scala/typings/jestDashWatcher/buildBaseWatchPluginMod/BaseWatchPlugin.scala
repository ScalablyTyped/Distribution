package typings.jestDashWatcher.buildBaseWatchPluginMod

import typings.atJestTypes.buildConfigMod.GlobalConfig
import typings.jestDashWatcher.buildTypesMod.JestHookSubscriber
import typings.jestDashWatcher.buildTypesMod.UpdateConfigCallback
import typings.jestDashWatcher.buildTypesMod.UsageData
import typings.jestDashWatcher.buildTypesMod.WatchPlugin
import typings.node.processMod._Global_.NodeJS.ReadStream
import typings.node.processMod._Global_.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseWatchPlugin extends WatchPlugin {
  var _stdin: ReadStream
  var _stdout: WriteStream
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
  @scala.inline
  def apply(
    _stdin: ReadStream,
    _stdout: WriteStream,
    apply: JestHookSubscriber => Unit,
    getUsageInfo: GlobalConfig => UsageData | Null,
    onKey: String => Unit,
    run: (GlobalConfig, UpdateConfigCallback) => js.Promise[Unit | Boolean],
    isInternal: js.UndefOr[Boolean] = js.undefined
  ): BaseWatchPlugin = {
    val __obj = js.Dynamic.literal(_stdin = _stdin, _stdout = _stdout, apply = js.Any.fromFunction1(apply), getUsageInfo = js.Any.fromFunction1(getUsageInfo), onKey = js.Any.fromFunction1(onKey), run = js.Any.fromFunction2(run))
    if (!js.isUndefined(isInternal)) __obj.updateDynamic("isInternal")(isInternal)
    __obj.asInstanceOf[BaseWatchPlugin]
  }
}

