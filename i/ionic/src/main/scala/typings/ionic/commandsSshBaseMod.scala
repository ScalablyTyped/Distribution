package typings.ionic

import typings.ionic.definitionsMod.INamespace
import typings.ionic.libCommandMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsSshBaseMod {
  
  /* note: abstract class */ @JSImport("ionic/commands/ssh/base", "SSHBaseCommand")
  @js.native
  open class SSHBaseCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def checkForOpenSSH(): js.Promise[Unit] = js.native
  }
}
