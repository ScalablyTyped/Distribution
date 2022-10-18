package typings.ionic

import typings.ionic.commandsSshBaseMod.SSHBaseCommand
import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.definitionsMod.INamespace
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsSshDeleteMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ionicCliFramework.definitionsMod.ICommand because Already inherited
  - typings.ionic.definitionsMod.ICommand because Already inherited
  - typings.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @JSImport("ionic/commands/ssh/delete", "SSHDeleteCommand")
  @js.native
  open class SSHDeleteCommand protected () extends SSHBaseCommand {
    def this(namespace: INamespace) = this()
    
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, metadata: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
}
