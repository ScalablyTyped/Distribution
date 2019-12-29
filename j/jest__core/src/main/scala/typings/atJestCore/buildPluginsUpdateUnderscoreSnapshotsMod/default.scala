package typings.atJestCore.buildPluginsUpdateUnderscoreSnapshotsMod

import typings.atJestCore.Anon_Key
import typings.atJestCore.Anon_Stdin
import typings.atJestCore.atJestCoreBooleans.`true`
import typings.atJestTypes.buildConfigMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/plugins/update_snapshots", JSImport.Default)
@js.native
class default protected () extends UpdateSnapshotsPlugin {
  def this(options: Anon_Stdin) = this()
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
  override def getUsageInfo(): Anon_Key | Null = js.native
  /* CompleteClass */
  override def run(
    _globalConfig: GlobalConfig,
    updateConfigAndRun: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any
  ): js.Promise[Boolean] = js.native
}

