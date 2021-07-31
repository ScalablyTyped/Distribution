package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pingMod {
  
  @JSImport("ipfs-cli/dist/src/commands/ping", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object count extends Shortcut {
      
      @JSImport("ipfs-cli/dist/src/commands/ping", "builder.count._default")
      @js.native
      val default: Double = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/ping", "builder.count.alias")
      @js.native
      val alias: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/ping", "builder.count.type")
      @js.native
      val `type`: String = js.native
      
      type _To = Double
      
      /* This means you don't have to write `default`, but can instead just say `count.foo` */
      override def _to: Double = default
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/ping", "builder.timeout.type_1")
      @js.native
      val type1: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/ping", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/ping", "description")
  @js.native
  val description: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsPrintCountPeerIdTimeout: Count): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintCountPeerIdTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
