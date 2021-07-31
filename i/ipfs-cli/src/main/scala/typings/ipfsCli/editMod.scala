package typings.ipfsCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editMod {
  
  @JSImport("ipfs-cli/dist/src/commands/config/edit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/config/edit", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/config/edit", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(argv: js.Any): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(argv.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
