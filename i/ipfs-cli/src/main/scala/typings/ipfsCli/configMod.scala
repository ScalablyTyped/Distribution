package typings.ipfsCli

import typings.ipfsCli.anon.Bool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("ipfs-cli/dist/src/commands/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def builder(yargs: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("builder")(yargs.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("ipfs-cli/dist/src/commands/config", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/config", "description")
  @js.native
  val description: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsPrintValueBoolJsonKeyTimeout: Bool): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintValueBoolJsonKeyTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
