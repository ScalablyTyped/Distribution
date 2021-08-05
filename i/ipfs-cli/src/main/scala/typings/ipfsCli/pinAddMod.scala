package typings.ipfsCli

import typings.ipfsCli.anon.AliasString
import typings.ipfsCli.anon.Choices
import typings.ipfsCli.anon.CoerceDescribeString
import typings.ipfsCli.anon.CoerceDescribeType
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinAddMod {
  
  @JSImport("ipfs-cli/dist/src/commands/pin/add", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/pin/add", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/pin/add", "builder.cid-base")
    @js.native
    def cidBase: Choices = js.native
    
    inline def cidBase_=(x: Choices): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-base")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/pin/add", "builder.metadata")
    @js.native
    def metadata: CoerceDescribeType = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/pin/add", "builder.metadata-json")
    @js.native
    def metadataJson: CoerceDescribeString = js.native
    
    inline def metadataJson_=(x: CoerceDescribeString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata-json")(x.asInstanceOf[js.Any])
    
    inline def metadata_=(x: CoerceDescribeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/pin/add", "builder.recursive")
    @js.native
    def recursive: AliasString = js.native
    inline def recursive_=(x: AliasString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recursive")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/pin/add", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    inline def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/pin/add", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/pin/add", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasCtxIpfsPathRecursiveCidBaseTimeoutMetadataMetadataJson: Metadata): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasCtxIpfsPathRecursiveCidBaseTimeoutMetadataMetadataJson.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
