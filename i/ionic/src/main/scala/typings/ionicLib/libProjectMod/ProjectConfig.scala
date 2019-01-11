package typings
package ionicLib.libProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project", "ProjectConfig")
@js.native
class ProjectConfig protected ()
  extends atIonicCliDashFrameworkLib.atIonicCliDashFrameworkMod.BaseConfig[ionicLib.definitionsMod.IProjectConfig] {
  def this(p: java.lang.String) = this()
  def this(p: java.lang.String, hasTypeOptions: ProjectConfigOptions) = this()
  val `type`: js.UndefOr[ionicLib.definitionsMod.ProjectType] = js.native
}

