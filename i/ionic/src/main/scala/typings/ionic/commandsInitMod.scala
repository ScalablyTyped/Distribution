package typings.ionic

import typings.ionic.definitionsMod.INamespace
import typings.ionic.libCommandMod.Command
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsInitMod {
  
  @JSImport("ionic/commands/init", "InitCommand")
  @js.native
  open class InitCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
  }
}
