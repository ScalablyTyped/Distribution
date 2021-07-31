package typings.ipfsCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object profileMod {
  
  @JSImport("ipfs-cli/dist/src/commands/config/profile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def builder(yargs: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("builder")(yargs.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("ipfs-cli/dist/src/commands/config/profile", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/config/profile", "description")
  @js.native
  val description: String = js.native
}
