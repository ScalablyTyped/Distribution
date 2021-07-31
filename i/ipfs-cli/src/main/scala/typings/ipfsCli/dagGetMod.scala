package typings.ipfsCli

import typings.ipfsCli.anon.Cidpath
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dagGetMod {
  
  @JSImport("ipfs-cli/dist/src/commands/dag/get", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/dag/get", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/dag/get", "builder.local-resolve")
    @js.native
    def localResolve: Type = js.native
    
    @scala.inline
    def localResolve_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("local-resolve")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/dag/get", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    @scala.inline
    def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/dag/get", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/dag/get", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsPrintCidpathLocalResolveTimeout: Cidpath): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintCidpathLocalResolveTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
}
