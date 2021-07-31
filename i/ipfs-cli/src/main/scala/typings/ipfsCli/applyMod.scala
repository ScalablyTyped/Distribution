package typings.ipfsCli

import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.DryRun
import typings.ipfsCli.anon.TypeString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applyMod {
  
  @JSImport("ipfs-cli/dist/src/commands/config/profile/apply", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/config/profile/apply", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/config/profile/apply", "builder.dry-run")
    @js.native
    def dryRun: TypeString = js.native
    
    @scala.inline
    def dryRun_=(x: TypeString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dry-run")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/config/profile/apply", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    @scala.inline
    def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/config/profile/apply", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/config/profile/apply", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasCtxProfileDryRunTimeout: DryRun): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasCtxProfileDryRunTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
