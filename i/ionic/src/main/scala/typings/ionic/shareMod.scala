package typings.ionic

import typings.ionic.commandMod.Command
import typings.ionic.definitionsMod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shareMod {
  
  @JSImport("ionic/commands/share", "ShareCommand")
  @js.native
  class ShareCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def run(): js.Promise[Unit] = js.native
  }
}
