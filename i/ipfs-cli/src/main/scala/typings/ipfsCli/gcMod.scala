package typings.ipfsCli

import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.DefaultDesc
import typings.ipfsCli.anon.Desc
import typings.ipfsCli.anon.StreamErrors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gcMod {
  
  @JSImport("ipfs-cli/dist/src/commands/repo/gc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/repo/gc", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/repo/gc", "builder.quiet")
    @js.native
    def quiet: Desc = js.native
    @scala.inline
    def quiet_=(x: Desc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quiet")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/repo/gc", "builder.stream-errors")
    @js.native
    def streamErrors: DefaultDesc = js.native
    
    @scala.inline
    def streamErrors_=(x: DefaultDesc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stream-errors")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/repo/gc", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    @scala.inline
    def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/repo/gc", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/repo/gc", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsPrintQuietStreamErrorsTimeout: StreamErrors): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintQuietStreamErrorsTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
