package typings.jestCore.updateSnapshotsMod

import typings.jestCore.AnonKey
import typings.jestCore.AnonStdin
import typings.jestCore.jestCoreBooleans.`true`
import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/plugins/update_snapshots", JSImport.Default)
@js.native
class default protected () extends UpdateSnapshotsPlugin {
  def this(options: AnonStdin) = this()
  /* CompleteClass */
  override var _hasSnapshotFailure: js.Any = js.native
  /* CompleteClass */
  override var isInternal: `true` = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    hooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookSubscriber */ js.Any
  ): Unit = js.native
  /* CompleteClass */
  override def getUsageInfo(): AnonKey | Null = js.native
  /* CompleteClass */
  override def run(
    _globalConfig: GlobalConfig,
    updateConfigAndRun: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any
  ): js.Promise[Boolean] = js.native
}

