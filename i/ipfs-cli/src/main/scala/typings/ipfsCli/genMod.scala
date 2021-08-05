package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object genMod {
  
  @JSImport("ipfs-cli/dist/src/commands/key/gen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object size {
      
      @JSImport("ipfs-cli/dist/src/commands/key/gen", "builder.size.alias_1")
      @js.native
      val alias1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/key/gen", "builder.size._default_1")
      @js.native
      val default1: Double = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/key/gen", "builder.size.describe_2")
      @js.native
      val describe2: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/key/gen", "builder.size.type_1")
      @js.native
      val type1: String = js.native
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/key/gen", "builder.timeout.type_2")
      @js.native
      val type2: String = js.native
    }
    
    object `type` extends Shortcut {
      
      @JSImport("ipfs-cli/dist/src/commands/key/gen", "builder.type._default")
      @js.native
      val default: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/key/gen", "builder.type.alias")
      @js.native
      val alias: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/key/gen", "builder.type.describe_1")
      @js.native
      val describe1: String = js.native
      
      type _To = String
      
      /* This means you don't have to write `default`, but can instead just say ``type`.foo` */
      override def _to: String = default
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/key/gen", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/key/gen", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPrintNameTypeSizeTimeout: Size): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintNameTypeSizeTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
