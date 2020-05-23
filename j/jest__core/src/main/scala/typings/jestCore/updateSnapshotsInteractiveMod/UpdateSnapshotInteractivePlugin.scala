package typings.jestCore.updateSnapshotsInteractiveMod

import typings.jestCore.anon.Key
import typings.jestCore.jestCoreBooleans.`true`
import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.AssertionLocation
import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseWatchPlugin * / any */ trait UpdateSnapshotInteractivePlugin extends js.Object {
  var _failedSnapshotTestAssertions: js.Any
  var _snapshotInteractiveMode: js.Any
  var isInternal: `true`
  @JSName("apply")
  def apply(
    hooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookSubscriber */ js.Any
  ): Unit
  def getFailedSnapshotTestAssertions(testResults: AggregatedResult): js.Array[AssertionLocation]
  def getUsageInfo(): Key | Null
  def onKey(key: String): Unit
  def run(_globalConfig: GlobalConfig, updateConfigAndRun: js.Function): js.Promise[Unit]
}

object UpdateSnapshotInteractivePlugin {
  @scala.inline
  def apply(
    _failedSnapshotTestAssertions: js.Any,
    _snapshotInteractiveMode: js.Any,
    apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookSubscriber */ js.Any => Unit,
    getFailedSnapshotTestAssertions: AggregatedResult => js.Array[AssertionLocation],
    getUsageInfo: () => Key | Null,
    isInternal: `true`,
    onKey: String => Unit,
    run: (GlobalConfig, js.Function) => js.Promise[Unit]
  ): UpdateSnapshotInteractivePlugin = {
    val __obj = js.Dynamic.literal(_failedSnapshotTestAssertions = _failedSnapshotTestAssertions.asInstanceOf[js.Any], _snapshotInteractiveMode = _snapshotInteractiveMode.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), getFailedSnapshotTestAssertions = js.Any.fromFunction1(getFailedSnapshotTestAssertions), getUsageInfo = js.Any.fromFunction0(getUsageInfo), isInternal = isInternal.asInstanceOf[js.Any], onKey = js.Any.fromFunction1(onKey), run = js.Any.fromFunction2(run))
    __obj.asInstanceOf[UpdateSnapshotInteractivePlugin]
  }
}

