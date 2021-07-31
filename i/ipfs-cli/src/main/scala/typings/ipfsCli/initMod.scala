package typings.ipfsCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initMod {
  
  @JSImport("ipfs-cli/dist/src/commands/init", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def builder(yargs: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("builder")(yargs.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("ipfs-cli/dist/src/commands/init", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/init", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(argv: js.Any): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(argv.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
