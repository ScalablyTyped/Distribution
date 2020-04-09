package typings.jestCore

import typings.jestCore.jestCoreBooleans.`true`
import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.AssertionLocation
import typings.jestTypes.configMod.GlobalConfig
import typings.jestWatcher.mod.BaseWatchPlugin
import typings.jestWatcher.typesMod.JestHookSubscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/plugins/update_snapshots_interactive", JSImport.Namespace)
@js.native
object updateSnapshotsInteractiveMod extends js.Object {
  @js.native
  trait UpdateSnapshotInteractivePlugin extends BaseWatchPlugin {
    var _failedSnapshotTestAssertions: js.Any = js.native
    var _snapshotInteractiveMode: js.Any = js.native
    @JSName("isInternal")
    var isInternal_UpdateSnapshotInteractivePlugin: `true` = js.native
    @JSName("apply")
    def apply_MUpdateSnapshotInteractivePlugin(hooks: JestHookSubscriber): Unit = js.native
    def getFailedSnapshotTestAssertions(testResults: AggregatedResult): js.Array[AssertionLocation] = js.native
    @JSName("getUsageInfo")
    def getUsageInfo_MUpdateSnapshotInteractivePlugin(): AnonKey | Null = js.native
    @JSName("onKey")
    def onKey_MUpdateSnapshotInteractivePlugin(key: String): Unit = js.native
    @JSName("run")
    def run_MUpdateSnapshotInteractivePlugin(_globalConfig: GlobalConfig, updateConfigAndRun: js.Function): js.Promise[Unit] = js.native
  }
  
  @js.native
  class default () extends UpdateSnapshotInteractivePlugin
  
}

