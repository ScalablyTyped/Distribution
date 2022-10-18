package typings.ionic

import typings.ionic.definitionsMod.INamespace
import typings.ionic.libCommandMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsSslBaseMod {
  
  /* note: abstract class */ @JSImport("ionic/commands/ssl/base", "SSLBaseCommand")
  @js.native
  open class SSLBaseCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def checkForOpenSSL(): js.Promise[Unit] = js.native
  }
}
