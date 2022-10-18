package typings.ionic

import typings.ionic.commandsSshBaseMod.SSHBaseCommand
import typings.ionic.definitionsMod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsSshSetupMod {
  
  @JSImport("ionic/commands/ssh/setup", "SSHSetupCommand")
  @js.native
  open class SSHSetupCommand protected () extends SSHBaseCommand {
    def this(namespace: INamespace) = this()
    
    def preRun(): js.Promise[Unit] = js.native
  }
}
