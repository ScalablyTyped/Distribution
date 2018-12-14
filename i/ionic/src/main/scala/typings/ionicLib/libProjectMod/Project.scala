package typings
package ionicLib.libProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project", "Project")
@js.native
abstract class Project protected ()
  extends ionicLib.definitionsMod.IProject {
  def this(details: ProjectDetailsResult, e: ProjectDeps) = this()
  @JSName("config")
  val config_Project: ProjectConfig = js.native
  val e: ProjectDeps = js.native
  var originalConfigFile: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val packageJsonPath: java.lang.String = js.native
  /* protected */ def getIntegrations(): js.Promise[js.Array[ionicLib.definitionsMod.IIntegration]] = js.native
}

