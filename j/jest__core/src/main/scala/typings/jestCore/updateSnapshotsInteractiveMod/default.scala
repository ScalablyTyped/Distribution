package typings.jestCore.updateSnapshotsInteractiveMod

import typings.jestCore.AnonKey
import typings.jestCore.jestCoreBooleans.`true`
import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.AssertionLocation
import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/plugins/update_snapshots_interactive", JSImport.Default)
@js.native
class default () extends UpdateSnapshotInteractivePlugin {
  /* CompleteClass */
  override var _failedSnapshotTestAssertions: js.Any = js.native
  /* CompleteClass */
  override var _snapshotInteractiveMode: js.Any = js.native
  /* CompleteClass */
  override var isInternal: `true` = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    hooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookSubscriber */ js.Any
  ): Unit = js.native
  /* CompleteClass */
  override def getFailedSnapshotTestAssertions(testResults: AggregatedResult): js.Array[AssertionLocation] = js.native
  /* CompleteClass */
  override def getUsageInfo(): AnonKey | Null = js.native
  /* CompleteClass */
  override def onKey(key: String): Unit = js.native
  /* CompleteClass */
  override def run(_globalConfig: GlobalConfig, updateConfigAndRun: js.Function): js.Promise[Unit] = js.native
}

