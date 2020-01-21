package typings.jestWatcher.baseWatchPluginMod

import typings.jestTypes.configMod.GlobalConfig
import typings.jestWatcher.AnonStdin
import typings.jestWatcher.typesMod.JestHookSubscriber
import typings.jestWatcher.typesMod.UpdateConfigCallback
import typings.jestWatcher.typesMod.UsageData
import typings.node.processMod._Global_.NodeJS.ReadStream
import typings.node.processMod._Global_.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-watcher/build/BaseWatchPlugin", JSImport.Default)
@js.native
class default protected () extends BaseWatchPlugin {
  def this(hasStdinStdout: AnonStdin) = this()
  /* CompleteClass */
  override var _stdin: ReadStream = js.native
  /* CompleteClass */
  override var _stdout: WriteStream = js.native
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

