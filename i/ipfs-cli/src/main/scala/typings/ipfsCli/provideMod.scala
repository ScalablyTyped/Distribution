package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.anon.Recursive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object provideMod {
  
  @JSImport("ipfs-cli/dist/src/commands/dht/provide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object recursive extends Shortcut {
      
      @JSImport("ipfs-cli/dist/src/commands/dht/provide", "builder.recursive._default")
      @js.native
      val default: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/dht/provide", "builder.recursive.alias")
      @js.native
      val alias: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/dht/provide", "builder.recursive.recursive_1")
      @js.native
      val recursive1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/dht/provide", "builder.recursive.type")
      @js.native
      val `type`: String = js.native
      
      type _To = Boolean
      
      /* This means you don't have to write `default`, but can instead just say `recursive.foo` */
      override def _to: Boolean = default
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/dht/provide", "builder.timeout.type_1")
      @js.native
      val type1: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/dht/provide", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/dht/provide", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsKeyRecursiveTimeout: Recursive): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsKeyRecursiveTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
