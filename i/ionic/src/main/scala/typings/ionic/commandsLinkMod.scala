package typings.ionic

import typings.atIonicCliDashFramework.definitionsMod.CommandLineInputs
import typings.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import typings.ionic.definitionsMod.App
import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.libCommandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/link", JSImport.Namespace)
@js.native
object commandsLinkMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atIonicCliDashFramework.definitionsMod.ICommand because Already inherited
  - typings.ionic.definitionsMod.ICommand because Already inherited
  - typings.ionic.definitionsMod.CommandPreRun because var conflicts: namespace. Inlined preRun */ @js.native
  class LinkCommand () extends Command {
    var getAppClient: js.Any = js.native
    var getUserClient: js.Any = js.native
    def chooseApp(apps: js.Array[App]): js.Promise[String] = js.native
    def confirmGithubRepoExists(): js.Promise[Unit] = js.native
    def connectGithub(app: App, repoId: Double, branches: js.Array[String]): js.Promise[js.UndefOr[String]] = js.native
    def createApp(hasName: Anon_NameString, runinfo: CommandInstanceInfo): js.Promise[String] = js.native
    def formatRepoName(fullName: String): String = js.native
    def linkApp(app: App, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    def linkGithub(app: App): js.Promise[js.UndefOr[String]] = js.native
    def lookUpApp(id: String): js.Promise[App] = js.native
    def needsAssociation(app: App, userId: Double): js.Promise[Boolean] = js.native
    def oAuthProcess(userId: Double): js.Promise[Unit] = js.native
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, metadata: CommandInstanceInfo): js.Promise[Unit] = js.native
    def run(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    def selectGithubBranches(repoId: Double): js.Promise[js.Array[String]] = js.native
    def selectGithubRepo(): js.Promise[Double] = js.native
  }
  
}

