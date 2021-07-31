package typings.ipfsCli

import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.Desc
import typings.ipfsCli.anon.DescString
import typings.ipfsCli.anon.DescType
import typings.ipfsCli.anon.Edges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refsMod {
  
  @JSImport("ipfs-cli/dist/src/commands/refs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/refs", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/refs", "builder.edges")
    @js.native
    def edges: Desc = js.native
    @scala.inline
    def edges_=(x: Desc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edges")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/refs", "builder.format")
    @js.native
    def format: DescType = js.native
    @scala.inline
    def format_=(x: DescType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/refs", "builder.max-depth")
    @js.native
    def maxDepth: DescString = js.native
    
    @scala.inline
    def maxDepth_=(x: DescString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max-depth")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/refs", "builder.recursive")
    @js.native
    def recursive: Desc = js.native
    @scala.inline
    def recursive_=(x: Desc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recursive")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/refs", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    @scala.inline
    def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/refs", "builder.unique")
    @js.native
    def unique: Desc = js.native
    @scala.inline
    def unique_=(x: Desc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unique")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/refs", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/refs", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsPrintKeyKeysRecursiveFormatEdgesUniqueMaxDepthTimeout: Edges): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintKeyKeysRecursiveFormatEdgesUniqueMaxDepthTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
