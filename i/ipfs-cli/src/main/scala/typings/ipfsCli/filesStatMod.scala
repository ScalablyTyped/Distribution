package typings.ipfsCli

import typings.ipfsCli.anon.AliasCoerce
import typings.ipfsCli.anon.AliasDefaultDescribeType
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.Format
import typings.ipfsCli.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filesStatMod {
  
  @JSImport("ipfs-cli/dist/src/commands/files/stat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/files/stat", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/files/stat", "builder.cid-base")
    @js.native
    def cidBase: `1` = js.native
    
    @scala.inline
    def cidBase_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-base")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/stat", "builder.format")
    @js.native
    def format: AliasDefaultDescribeType = js.native
    @scala.inline
    def format_=(x: AliasDefaultDescribeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/stat", "builder.hash")
    @js.native
    def hash: AliasCoerce = js.native
    @scala.inline
    def hash_=(x: AliasCoerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hash")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/stat", "builder.size")
    @js.native
    def size: AliasCoerce = js.native
    @scala.inline
    def size_=(x: AliasCoerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/stat", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    @scala.inline
    def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/files/stat", "builder.with-local")
    @js.native
    def withLocal: AliasCoerce = js.native
    
    @scala.inline
    def withLocal_=(x: AliasCoerce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("with-local")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/files/stat", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/files/stat", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsPrintPathFormatHashSizeWithLocalCidBaseTimeout: Format): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintPathFormatHashSizeWithLocalCidBaseTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
