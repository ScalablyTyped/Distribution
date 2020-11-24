package typings.ionic.libProjectMod

import typings.ionic.definitionsMod.IProject
import typings.minimist.mod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/project", "createProjectFromDirectory")
@js.native
object createProjectFromDirectory extends js.Object {
  
  def apply(rootDirectory: String, args: ParsedArgs, deps: ProjectDeps): js.Promise[js.UndefOr[IProject]] = js.native
  def apply(
    rootDirectory: String,
    args: ParsedArgs,
    deps: ProjectDeps,
    hasLogErrors: CreateProjectFromDirectoryOptions
  ): js.Promise[js.UndefOr[IProject]] = js.native
}
