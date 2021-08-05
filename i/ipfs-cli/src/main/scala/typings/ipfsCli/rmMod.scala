package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.anon.Force
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rmMod {
  
  @JSImport("ipfs-cli/dist/src/commands/block/rm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object force extends Shortcut {
      
      @JSImport("ipfs-cli/dist/src/commands/block/rm", "builder.force._default")
      @js.native
      val default: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/block/rm", "builder.force.alias")
      @js.native
      val alias: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/block/rm", "builder.force.describe_1")
      @js.native
      val describe1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/block/rm", "builder.force.type")
      @js.native
      val `type`: String = js.native
      
      type _To = Boolean
      
      /* This means you don't have to write `default`, but can instead just say `force.foo` */
      override def _to: Boolean = default
    }
    
    object quiet {
      
      @JSImport("ipfs-cli/dist/src/commands/block/rm", "builder.quiet.alias_1")
      @js.native
      val alias1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/block/rm", "builder.quiet._default_1")
      @js.native
      val default1: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/block/rm", "builder.quiet.describe_2")
      @js.native
      val describe2: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/block/rm", "builder.quiet.type_1")
      @js.native
      val type1: String = js.native
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/block/rm", "builder.timeout.type_2")
      @js.native
      val type2: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/block/rm", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/block/rm", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasCtxHashForceQuietTimeout: Force): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasCtxHashForceQuietTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
