package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.anon.Nocache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nameResolveMod {
  
  @JSImport("ipfs-cli/dist/src/commands/name/resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object nocache extends Shortcut {
      
      @JSImport("ipfs-cli/dist/src/commands/name/resolve", "builder.nocache._default")
      @js.native
      val default: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/resolve", "builder.nocache.alias")
      @js.native
      val alias: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/resolve", "builder.nocache.describe_1")
      @js.native
      val describe1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/resolve", "builder.nocache.type")
      @js.native
      val `type`: String = js.native
      
      type _To = Boolean
      
      /* This means you don't have to write `default`, but can instead just say `nocache.foo` */
      override def _to: Boolean = default
    }
    
    object recursive {
      
      @JSImport("ipfs-cli/dist/src/commands/name/resolve", "builder.recursive.alias_1")
      @js.native
      val alias1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/resolve", "builder.recursive._default_1")
      @js.native
      val default1: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/resolve", "builder.recursive.describe_2")
      @js.native
      val describe2: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/resolve", "builder.recursive.type_1")
      @js.native
      val type1: String = js.native
    }
    
    object stream {
      
      @JSImport("ipfs-cli/dist/src/commands/name/resolve", "builder.stream.alias_2")
      @js.native
      val alias2: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/resolve", "builder.stream._default_2")
      @js.native
      val default2: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/resolve", "builder.stream.describe_3")
      @js.native
      val describe3: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/resolve", "builder.stream.type_2")
      @js.native
      val type2: String = js.native
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/name/resolve", "builder.timeout.type_3")
      @js.native
      val type3: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/name/resolve", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/name/resolve", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPrintNocacheRecursiveNameStreamTimeout: Nocache): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintNocacheRecursiveNameStreamTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
