package typings.jestCore

import typings.jestChangedFiles.typesMod.ChangedFiles
import typings.jestTypes.configMod.GlobalConfig
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/getChangedFilesPromise", JSImport.Namespace)
@js.native
object getChangedFilesPromiseMod extends js.Object {
  def default(globalConfig: GlobalConfig, configs: js.Array[ProjectConfig]): js.UndefOr[js.Promise[ChangedFiles]] = js.native
}

