package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.anon.Multihash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refsLocalMod {
  
  @JSImport("ipfs-cli/dist/src/commands/refs-local", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object multihash extends Shortcut {
      
      @JSImport("ipfs-cli/dist/src/commands/refs-local", "builder.multihash._default")
      @js.native
      val default: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/refs-local", "builder.multihash.desc")
      @js.native
      val desc: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/refs-local", "builder.multihash.type_1")
      @js.native
      val type1: String = js.native
      
      type _To = Boolean
      
      /* This means you don't have to write `default`, but can instead just say `multihash.foo` */
      override def _to: Boolean = default
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/refs-local", "builder.timeout.type")
      @js.native
      val `type`: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/refs-local", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/refs-local", "describe")
  @js.native
  val describe: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/refs-local", "epilog")
  @js.native
  val epilog: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsPrintTimeoutMultihash: Multihash): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintTimeoutMultihash.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
