package typings.ipfsCli

import typings.ipfsCli.anon.AliasDefaultDescribe
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.NumProviders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findProvidersMod {
  
  @JSImport("ipfs-cli/dist/src/commands/dht/find-providers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/dht/find-providers", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/dht/find-providers", "builder.num-providers")
    @js.native
    def numProviders: AliasDefaultDescribe = js.native
    
    @scala.inline
    def numProviders_=(x: AliasDefaultDescribe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("num-providers")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/dht/find-providers", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    @scala.inline
    def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/dht/find-providers", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/dht/find-providers", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsPrintKeyNumProvidersTimeout: NumProviders): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintKeyNumProvidersTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
