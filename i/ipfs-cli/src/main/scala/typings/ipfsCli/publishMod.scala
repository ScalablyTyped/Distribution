package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.anon.Lifetime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publishMod {
  
  @JSImport("ipfs-cli/dist/src/commands/name/publish", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object key {
      
      @JSImport("ipfs-cli/dist/src/commands/name/publish", "builder.key.alias_2")
      @js.native
      val alias2: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/publish", "builder.key._default_2")
      @js.native
      val default2: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/publish", "builder.key.describe_3")
      @js.native
      val describe3: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/publish", "builder.key.type_2")
      @js.native
      val type2: String = js.native
    }
    
    object lifetime {
      
      @JSImport("ipfs-cli/dist/src/commands/name/publish", "builder.lifetime.alias_1")
      @js.native
      val alias1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/publish", "builder.lifetime._default_1")
      @js.native
      val default1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/publish", "builder.lifetime.describe_2")
      @js.native
      val describe2: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/publish", "builder.lifetime.type_1")
      @js.native
      val type1: String = js.native
    }
    
    object resolve extends Shortcut {
      
      @JSImport("ipfs-cli/dist/src/commands/name/publish", "builder.resolve._default")
      @js.native
      val default: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/publish", "builder.resolve.alias")
      @js.native
      val alias: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/publish", "builder.resolve.describe_1")
      @js.native
      val describe1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/publish", "builder.resolve.type")
      @js.native
      val `type`: String = js.native
      
      type _To = Boolean
      
      /* This means you don't have to write `default`, but can instead just say `resolve.foo` */
      override def _to: Boolean = default
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/name/publish", "builder.timeout.type_4")
      @js.native
      val type4: String = js.native
    }
    
    object ttl {
      
      @JSImport("ipfs-cli/dist/src/commands/name/publish", "builder.ttl._default_3")
      @js.native
      val default3: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/publish", "builder.ttl.describe_4")
      @js.native
      val describe4: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/name/publish", "builder.ttl.type_3")
      @js.native
      val type3: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/name/publish", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/name/publish", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPrintIpfsPathResolveLifetimeKeyTtlTimeout: Lifetime): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintIpfsPathResolveLifetimeKeyTtlTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
