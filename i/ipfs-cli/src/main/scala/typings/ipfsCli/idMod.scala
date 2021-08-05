package typings.ipfsCli

import typings.ipfsCli.anon.CtxFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idMod {
  
  @JSImport("ipfs-cli/dist/src/commands/id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object format {
      
      @JSImport("ipfs-cli/dist/src/commands/id", "builder.format.alias")
      @js.native
      val alias: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/id", "builder.format.describe_1")
      @js.native
      val describe1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/id", "builder.format.type")
      @js.native
      val `type`: String = js.native
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/id", "builder.timeout.type_1")
      @js.native
      val type1: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/id", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/id", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPrintFormatTimeout: CtxFormat): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintFormatTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
