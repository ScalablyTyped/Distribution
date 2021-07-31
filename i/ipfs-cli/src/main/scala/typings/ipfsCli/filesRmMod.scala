package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.anon.CtxPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filesRmMod {
  
  @JSImport("ipfs-cli/dist/src/commands/files/rm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object recursive extends Shortcut {
      
      @JSImport("ipfs-cli/dist/src/commands/files/rm", "builder.recursive._default")
      @js.native
      val default: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/files/rm", "builder.recursive.alias")
      @js.native
      val alias: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/files/rm", "builder.recursive.describe_1")
      @js.native
      val describe1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/files/rm", "builder.recursive.type")
      @js.native
      val `type`: String = js.native
      
      type _To = Boolean
      
      /* This means you don't have to write `default`, but can instead just say `recursive.foo` */
      override def _to: Boolean = default
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/files/rm", "builder.timeout.type_1")
      @js.native
      val type1: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/files/rm", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/files/rm", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsPathRecursiveTimeout: CtxPath): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPathRecursiveTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
