package typings.ipfsCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filesMod {
  
  @JSImport("ipfs-cli/dist/src/commands/files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def builder(yargs: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("builder")(yargs.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("ipfs-cli/dist/src/commands/files", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/files", "description")
  @js.native
  val description: String = js.native
  
  @scala.inline
  def handler(argv: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(argv.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
