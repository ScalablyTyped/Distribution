package typings.ionic.libProjectMod

import typings.ionic.definitionsMod.IProject
import typings.minimist.minimistMod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createProjectFromDetails(details: ProjectDetailsResult, deps: ProjectDeps): js.Promise[IProject] = js.native
  def createProjectFromDirectory(rootDirectory: String, args: ParsedArgs, deps: ProjectDeps): js.Promise[js.UndefOr[IProject]] = js.native
  def createProjectFromDirectory(
    rootDirectory: String,
    args: ParsedArgs,
    deps: ProjectDeps,
    hasLogErrors: CreateProjectFromDirectoryOptions
  ): js.Promise[js.UndefOr[IProject]] = js.native
  def findProjectDirectory(cwd: String): js.Promise[js.UndefOr[String]] = js.native
  def isValidProjectId(projectId: String): Boolean = js.native
  def prettyProjectName(): String = js.native
  def prettyProjectName(`type`: String): String = js.native
}

