package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.anon.Output
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetMod {
  
  @JSImport("ipfs-cli/dist/src/commands/get", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object output extends Shortcut {
      
      @JSImport("ipfs-cli/dist/src/commands/get", "builder.output._default")
      @js.native
      val default: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/get", "builder.output.alias")
      @js.native
      val alias: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/get", "builder.output.type")
      @js.native
      val `type`: String = js.native
      
      type _To = String
      
      /* This means you don't have to write `default`, but can instead just say `output.foo` */
      override def _to: String = default
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/get", "builder.timeout.type_1")
      @js.native
      val type1: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/get", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/get", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPrintIpfsPathOutputTimeout: Output): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintIpfsPathOutputTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
