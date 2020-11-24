package typings.ionic.libProjectMod

import typings.ionic.anon.PartialReadonlyIProjectCo
import typings.ionic.definitionsMod.IProjectConfig
import typings.ionic.definitionsMod.ProjectType
import typings.ionicCliFramework.mod.BaseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/project", "ProjectConfig")
@js.native
class ProjectConfig protected () extends BaseConfig[IProjectConfig] {
  def this(p: String) = this()
  def this(p: String, hasTypeOptions: ProjectConfigOptions) = this()
  
  def provideDefaults(c: PartialReadonlyIProjectCo): IProjectConfig = js.native
  
  val `type`: js.UndefOr[ProjectType] = js.native
}
