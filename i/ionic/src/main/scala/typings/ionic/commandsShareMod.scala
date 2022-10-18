package typings.ionic

import typings.ionic.definitionsMod.INamespace
import typings.ionic.libCommandMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsShareMod {
  
  @JSImport("ionic/commands/share", "ShareCommand")
  @js.native
  open class ShareCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def run(): js.Promise[Unit] = js.native
  }
}
