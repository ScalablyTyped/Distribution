package typings.ionic

import typings.ionic.cordovaBaseMod.CordovaCommand
import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.definitionsMod.INamespace
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourcesMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ionicCliFramework.definitionsMod.ICommand because Already inherited
  - typings.ionic.definitionsMod.ICommand because Already inherited
  - typings.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @JSImport("ionic/commands/cordova/resources", "ResourcesCommand")
  @js.native
  open class ResourcesCommand protected () extends CordovaCommand {
    def this(namespace: INamespace) = this()
    
    def getBuildPlatforms(): js.Promise[js.Array[String]] = js.native
    
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    def runCordovaRes(platform: String, options: CommandLineOptions): js.Promise[Unit] = js.native
    def runCordovaRes(platform: Unit, options: CommandLineOptions): js.Promise[Unit] = js.native
    
    def runResourceServer(platform: String, options: CommandLineOptions): js.Promise[Unit] = js.native
    def runResourceServer(platform: Unit, options: CommandLineOptions): js.Promise[Unit] = js.native
  }
}
