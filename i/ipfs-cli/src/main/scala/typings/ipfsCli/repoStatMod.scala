package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.anon.Human
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repoStatMod {
  
  @JSImport("ipfs-cli/dist/src/commands/repo/stat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object human extends Shortcut {
      
      @JSImport("ipfs-cli/dist/src/commands/repo/stat", "builder.human._default")
      @js.native
      val default: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/repo/stat", "builder.human.alias")
      @js.native
      val alias: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/repo/stat", "builder.human.type")
      @js.native
      val `type`: String = js.native
      
      type _To = Boolean
      
      /* This means you don't have to write `default`, but can instead just say `human.foo` */
      override def _to: Boolean = default
    }
    
    object sizeOnly {
      
      @JSImport("ipfs-cli/dist/src/commands/repo/stat", "builder.sizeOnly.alias_1")
      @js.native
      val alias1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/repo/stat", "builder.sizeOnly._default_1")
      @js.native
      val default1: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/repo/stat", "builder.sizeOnly.type_1")
      @js.native
      val type1: String = js.native
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/repo/stat", "builder.timeout.type_2")
      @js.native
      val type2: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/repo/stat", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/repo/stat", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsPrintHumanSizeOnlyTimeout: Human): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintHumanSizeOnlyTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
