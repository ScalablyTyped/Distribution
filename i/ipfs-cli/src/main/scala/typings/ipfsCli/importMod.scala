package typings.ipfsCli

import typings.ipfsCli.anon.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importMod {
  
  @JSImport("ipfs-cli/dist/src/commands/key/import", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    object input {
      
      @JSImport("ipfs-cli/dist/src/commands/key/import", "builder.input")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/key/import", "builder.input.alias_1")
      @js.native
      val alias1: String = js.native
      
      inline def coerce(input: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(input.asInstanceOf[js.Any]).asInstanceOf[String]
      
      @JSImport("ipfs-cli/dist/src/commands/key/import", "builder.input.demandOption")
      @js.native
      val demandOption: Boolean = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/key/import", "builder.input.describe_2")
      @js.native
      val describe2: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/key/import", "builder.input.type_1")
      @js.native
      val type1: String = js.native
    }
    
    object passin {
      
      @JSImport("ipfs-cli/dist/src/commands/key/import", "builder.passin.alias")
      @js.native
      val alias: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/key/import", "builder.passin.describe_1")
      @js.native
      val describe1: String = js.native
      
      @JSImport("ipfs-cli/dist/src/commands/key/import", "builder.passin.type")
      @js.native
      val `type`: String = js.native
    }
    
    object timeout {
      
      @JSImport("ipfs-cli/dist/src/commands/key/import", "builder.timeout.type_2")
      @js.native
      val type2: String = js.native
    }
  }
  
  @JSImport("ipfs-cli/dist/src/commands/key/import", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/key/import", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPrintNameInputPassinTimeout: Input): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintNameInputPassinTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
