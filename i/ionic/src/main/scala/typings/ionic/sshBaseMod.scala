package typings.ionic

import typings.ionic.commandMod.Command
import typings.ionic.definitionsMod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sshBaseMod {
  
  @JSImport("ionic/commands/ssh/base", "SSHBaseCommand")
  @js.native
  abstract class SSHBaseCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def checkForOpenSSH(): js.Promise[Unit] = js.native
  }
}
