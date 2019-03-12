package typings
package ionicLib.libProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createProjectFromDetails(details: ProjectDetailsResult, deps: ProjectDeps): js.Promise[ionicLib.definitionsMod.IProject] = js.native
  def createProjectFromDirectory(
    rootDirectory: java.lang.String,
    args: minimistLib.minimistMod.minimistNs.ParsedArgs,
    deps: ProjectDeps
  ): js.Promise[js.UndefOr[ionicLib.definitionsMod.IProject]] = js.native
  def createProjectFromDirectory(
    rootDirectory: java.lang.String,
    args: minimistLib.minimistMod.minimistNs.ParsedArgs,
    deps: ProjectDeps,
    hasLogErrors: CreateProjectFromDirectoryOptions
  ): js.Promise[js.UndefOr[ionicLib.definitionsMod.IProject]] = js.native
  def findProjectDirectory(cwd: java.lang.String): js.Promise[js.UndefOr[java.lang.String]] = js.native
  def isValidProjectId(projectId: java.lang.String): scala.Boolean = js.native
  def prettyProjectName(): java.lang.String = js.native
  def prettyProjectName(`type`: java.lang.String): java.lang.String = js.native
}

