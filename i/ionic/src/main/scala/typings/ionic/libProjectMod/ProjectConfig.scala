package typings.ionic.libProjectMod

import typings.ionic.PartialReadonlyIProjectCo
import typings.ionic.definitionsMod.IProjectConfig
import typings.ionic.definitionsMod.ProjectType
import typings.ionicCliFramework.mod.BaseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project", "ProjectConfig")
@js.native
class ProjectConfig protected () extends BaseConfig[IProjectConfig] {
  def this(p: String) = this()
  def this(p: String, hasTypeOptions: ProjectConfigOptions) = this()
  val `type`: js.UndefOr[ProjectType] = js.native
  def provideDefaults(c: PartialReadonlyIProjectCo): IProjectConfig = js.native
}

