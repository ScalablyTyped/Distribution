package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.anon.Domain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dnsMod {
  
  @JSImport("ipfs-cli/dist/src/commands/dns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object format {
      
      @JSImport("ipfs-cli/dist/src/commands/dns", "builder.format.type_1")
      @js.native
      val type1: String = js.native
    }
    
    object recursive extends Shortcut {
      
      @JSImport("ipfs-cli/dist/src/commands/dns", "builder.recursive._default")
      @js.native
      val default: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/dns", "builder.recursive.alias")
      @js.native
      val alias: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/dns", "builder.recursive.desc")
      @js.native
      val desc: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/dns", "builder.recursive.type")
      @js.native
      val `type`: String = js.native
      
      type _To = Boolean
      
      /* This means you don't have to write `default`, but can instead just say `recursive.foo` */
      override def _to: Boolean = default
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/dns", "builder.timeout.type_2")
      @js.native
      val type2: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/dns", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/dns", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPrintDomainRecursiveFormatTimeout: Domain): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintDomainRecursiveFormatTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
