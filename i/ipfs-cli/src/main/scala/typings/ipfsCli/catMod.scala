package typings.ipfsCli

import typings.ipfsCli.anon.IpfsPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object catMod {
  
  @JSImport("ipfs-cli/dist/src/commands/cat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object length {
      
      @JSImport("ipfs-cli/dist/src/commands/cat", "builder.length.alias_1")
      @js.native
      val alias1: js.Array[String] = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/cat", "builder.length.describe_2")
      @js.native
      val describe2: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/cat", "builder.length.type_1")
      @js.native
      val type1: String = js.native
    }
    
    object offset {
      
      @JSImport("ipfs-cli/dist/src/commands/cat", "builder.offset.alias")
      @js.native
      val alias: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/cat", "builder.offset.describe_1")
      @js.native
      val describe1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/cat", "builder.offset.type")
      @js.native
      val `type`: String = js.native
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/cat", "builder.timeout.type_2")
      @js.native
      val type2: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/cat", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/cat", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPrintIpfsPathOffsetLengthTimeout: IpfsPath): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintIpfsPathOffsetLengthTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
