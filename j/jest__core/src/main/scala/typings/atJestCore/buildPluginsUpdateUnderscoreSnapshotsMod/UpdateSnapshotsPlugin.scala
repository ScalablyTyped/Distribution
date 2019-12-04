package typings.atJestCore.buildPluginsUpdateUnderscoreSnapshotsMod

import typings.atJestCore.Anon_Key
import typings.atJestCore.atJestCoreNumbers.`true`
import typings.atJestTypes.buildConfigMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseWatchPlugin * / any */ trait UpdateSnapshotsPlugin extends js.Object {
  var _hasSnapshotFailure: js.Any
  var isInternal: `true`
  @JSName("apply")
  def apply(
    hooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookSubscriber */ js.Any
  ): Unit
  def getUsageInfo(): Anon_Key | Null
  def run(
    _globalConfig: GlobalConfig,
    updateConfigAndRun: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any
  ): js.Promise[Boolean]
}

object UpdateSnapshotsPlugin {
  @scala.inline
  def apply(
    _hasSnapshotFailure: js.Any,
    apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookSubscriber */ js.Any => Unit,
    getUsageInfo: () => Anon_Key | Null,
    isInternal: `true`,
    run: (GlobalConfig, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any) => js.Promise[Boolean]
  ): UpdateSnapshotsPlugin = {
    val __obj = js.Dynamic.literal(_hasSnapshotFailure = _hasSnapshotFailure.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), getUsageInfo = js.Any.fromFunction0(getUsageInfo), isInternal = isInternal.asInstanceOf[js.Any], run = js.Any.fromFunction2(run))
  
    __obj.asInstanceOf[UpdateSnapshotsPlugin]
  }
}

