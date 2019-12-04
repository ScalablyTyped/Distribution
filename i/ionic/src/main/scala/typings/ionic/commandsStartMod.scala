package typings.ionic

import typings.atIonicCliDashFramework.definitionsMod.CommandLineInputs
import typings.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.definitionsMod.ResolvedStarterTemplate
import typings.ionic.definitionsMod.StarterManifest
import typings.ionic.libCommandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/start", JSImport.Namespace)
@js.native
object commandsStartMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atIonicCliDashFramework.definitionsMod.ICommand because Already inherited
  - typings.ionic.definitionsMod.ICommand because Already inherited
  - typings.ionic.definitionsMod.CommandPreRun because var conflicts: namespace. Inlined preRun */ @js.native
  class StartCommand () extends Command {
    var canRemoveExisting: js.Any = js.native
    var schema: js.UndefOr[js.Any] = js.native
    def checkForExisting(projectDir: String): js.Promise[Unit] = js.native
    def downloadStarterTemplate(projectDir: String, starterTemplate: ResolvedStarterTemplate): js.Promise[Unit] = js.native
    def findStarterTemplate(template: String, `type`: String, tag: String): js.Promise[ResolvedStarterTemplate] = js.native
    def getProjectType(): js.Promise[String] = js.native
    def loadManifest(manifestPath: String): js.Promise[js.UndefOr[StarterManifest]] = js.native
    def performManifestOps(manifest: StarterManifest): js.Promise[Unit] = js.native
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, metadata: CommandInstanceInfo): js.Promise[Unit] = js.native
    def run(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    def showNextSteps(projectDir: String, cloned: Boolean, linkConfirmed: Boolean): js.Promise[Unit] = js.native
    def validateProjectId(projectId: String): js.Promise[Unit] = js.native
    def validateProjectType(`type`: String): js.Promise[Unit] = js.native
  }
  
}

