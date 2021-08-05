package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.anon.Interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bwMod {
  
  @JSImport("ipfs-cli/dist/src/commands/stats/bw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object interval {
      
      @JSImport("ipfs-cli/dist/src/commands/stats/bw", "builder.interval._default_3")
      @js.native
      val default3: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/stats/bw", "builder.interval.type_3")
      @js.native
      val type3: String = js.native
    }
    
    object peer extends Shortcut {
      
      @JSImport("ipfs-cli/dist/src/commands/stats/bw", "builder.peer._default")
      @js.native
      val default: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/stats/bw", "builder.peer.type")
      @js.native
      val `type`: String = js.native
      
      type _To = String
      
      /* This means you don't have to write `default`, but can instead just say `peer.foo` */
      override def _to: String = default
    }
    
    object poll {
      
      @JSImport("ipfs-cli/dist/src/commands/stats/bw", "builder.poll._default_2")
      @js.native
      val default2: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/stats/bw", "builder.poll.type_2")
      @js.native
      val type2: String = js.native
    }
    
    object proto {
      
      @JSImport("ipfs-cli/dist/src/commands/stats/bw", "builder.proto._default_1")
      @js.native
      val default1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/stats/bw", "builder.proto.type_1")
      @js.native
      val type1: String = js.native
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/stats/bw", "builder.timeout.type_4")
      @js.native
      val type4: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/stats/bw", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/stats/bw", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPrintPeerProtoPollIntervalTimeout: Interval): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintPeerProtoPollIntervalTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
