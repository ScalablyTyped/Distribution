package typings.ipfsCli

import org.scalablytyped.runtime.Shortcut
import typings.ipfsCli.anon.Commit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsVersionMod {
  
  @JSImport("ipfs-cli/dist/src/commands/version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object all {
      
      @JSImport("ipfs-cli/dist/src/commands/version", "builder.all._default_3")
      @js.native
      val default3: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/version", "builder.all.describe_4")
      @js.native
      val describe4: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/version", "builder.all.type_3")
      @js.native
      val type3: String = js.native
    }
    
    object commit {
      
      @JSImport("ipfs-cli/dist/src/commands/version", "builder.commit._default_1")
      @js.native
      val default1: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/version", "builder.commit.describe_2")
      @js.native
      val describe2: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/version", "builder.commit.type_1")
      @js.native
      val type1: String = js.native
    }
    
    object number extends Shortcut {
      
      @JSImport("ipfs-cli/dist/src/commands/version", "builder.number._default")
      @js.native
      val default: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/version", "builder.number.alias")
      @js.native
      val alias: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/version", "builder.number.describe_1")
      @js.native
      val describe1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/version", "builder.number.type")
      @js.native
      val `type`: String = js.native
      
      type _To = Boolean
      
      /* This means you don't have to write `default`, but can instead just say `number.foo` */
      override def _to: Boolean = default
    }
    
    object repo {
      
      @JSImport("ipfs-cli/dist/src/commands/version", "builder.repo._default_2")
      @js.native
      val default2: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/version", "builder.repo.describe_3")
      @js.native
      val describe3: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/version", "builder.repo.type_2")
      @js.native
      val type2: String = js.native
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/version", "builder.timeout.type_4")
      @js.native
      val type4: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/version", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/version", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasPrintIpfsAllCommitRepoNumberTimeout: Commit): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasPrintIpfsAllCommitRepoNumberTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
