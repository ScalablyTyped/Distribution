package typings.ipfsCli

import typings.ipfsCli.anon.CtxAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsMod {
  
  @JSImport("ipfs-cli/dist/src/commands/commands", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/commands", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/commands", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasCtx: CtxAny): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasCtx.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
