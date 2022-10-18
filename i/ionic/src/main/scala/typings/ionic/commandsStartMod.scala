package typings.ionic

import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.definitionsMod.INamespace
import typings.ionic.definitionsMod.ResolvedStarterTemplate
import typings.ionic.definitionsMod.StarterManifest
import typings.ionic.libCommandMod.Command
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsStartMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ionicCliFramework.definitionsMod.ICommand because Already inherited
  - typings.ionic.definitionsMod.ICommand because Already inherited
  - typings.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @JSImport("ionic/commands/start", "StartCommand")
  @js.native
  open class StartCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    /* private */ var canRemoveExisting: Any = js.native
    
    def checkForExisting(projectDir: String): js.Promise[Unit] = js.native
    
    def downloadStarterTemplate(projectDir: String, starterTemplate: ResolvedStarterTemplate): js.Promise[Unit] = js.native
    
    def findStarterTemplate(template: String, `type`: String, tag: String): js.Promise[ResolvedStarterTemplate] = js.native
    
    def getProjectType(): js.Promise[String] = js.native
    
    def loadManifest(manifestPath: String): js.Promise[js.UndefOr[StarterManifest]] = js.native
    
    def performManifestOps(manifest: StarterManifest): js.Promise[Unit] = js.native
    
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, metadata: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    /* private */ var schema: Any = js.native
    
    def showNextSteps(projectDir: String, cloned: Boolean, linkConfirmed: Boolean): js.Promise[Unit] = js.native
    
    def validateProjectId(projectId: String): js.Promise[Unit] = js.native
    
    def validateProjectType(`type`: String): js.Promise[Unit] = js.native
  }
}
