package typings.jestCore

import typings.jestCore.anon.Stdin
import typings.jestCore.jestCoreBooleans.`true`
import typings.jestTypes.configMod.GlobalConfig
import typings.jestWatcher.mod.BaseWatchPlugin
import typings.jestWatcher.typesMod.JestHookSubscriber
import typings.jestWatcher.typesMod.UpdateConfigCallback
import typings.jestWatcher.typesMod.UsageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/plugins/update_snapshots", JSImport.Namespace)
@js.native
object updateSnapshotsMod extends js.Object {
  @js.native
  trait UpdateSnapshotsPlugin extends BaseWatchPlugin {
    var _hasSnapshotFailure: js.Any = js.native
    @JSName("isInternal")
    var isInternal_UpdateSnapshotsPlugin: `true` = js.native
    @JSName("apply")
    def apply_MUpdateSnapshotsPlugin(hooks: JestHookSubscriber): Unit = js.native
    @JSName("getUsageInfo")
    def getUsageInfo_MUpdateSnapshotsPlugin(): UsageData | Null = js.native
    @JSName("run")
    def run_MUpdateSnapshotsPlugin(_globalConfig: GlobalConfig, updateConfigAndRun: UpdateConfigCallback): js.Promise[Boolean] = js.native
  }
  
  @js.native
  class default protected () extends UpdateSnapshotsPlugin {
    def this(options: Stdin) = this()
  }
  
}

