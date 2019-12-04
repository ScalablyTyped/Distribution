package typings.atJestCore

import typings.atJestTypes.buildConfigMod.GlobalConfig
import typings.atJestTypes.buildConfigMod.ProjectConfig
import typings.jestDashChangedDashFiles.buildTypesMod.ChangedFiles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/getChangedFilesPromise", JSImport.Namespace)
@js.native
object buildGetChangedFilesPromiseMod extends js.Object {
  def default(globalConfig: GlobalConfig, configs: js.Array[ProjectConfig]): js.UndefOr[js.Promise[ChangedFiles]] = js.native
}

