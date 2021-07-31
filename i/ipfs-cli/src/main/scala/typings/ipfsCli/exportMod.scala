package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportMod {
  
  @JSImport("ipfs-cli/dist/src/commands/key/export", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object output extends Shortcut {
      
      @JSImport("ipfs-cli/dist/src/commands/key/export", "builder.output._default")
      @js.native
      val default: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/key/export", "builder.output.alias_1")
      @js.native
      val alias1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/key/export", "builder.output.describe_2")
      @js.native
      val describe2: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/key/export", "builder.output.type_1")
      @js.native
      val type1: String = js.native
      
      type _To = String
      
      /* This means you don't have to write `default`, but can instead just say `output.foo` */
      override def _to: String = default
    }
    
    object passout {
      
      @JSImport("ipfs-cli/dist/src/commands/key/export", "builder.passout.alias")
      @js.native
      val alias: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/key/export", "builder.passout.demandOption")
      @js.native
      val demandOption: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/key/export", "builder.passout.describe_1")
      @js.native
      val describe1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/key/export", "builder.passout.type")
      @js.native
      val `type`: String = js.native
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/key/export", "builder.timeout.type_2")
      @js.native
      val type2: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/key/export", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/key/export", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasCtxNamePassoutOutputTimeout: Name): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasCtxNamePassoutOutputTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
