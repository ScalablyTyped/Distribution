package typings.ipfsCli

import typings.ipfsCli.anon.AliasChoices
import typings.ipfsCli.anon.Choices
import typings.ipfsCli.anon.CidVersion
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.DefaultBoolean
import typings.ipfsCli.anon.DefaultDescribeType
import typings.ipfsCli.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dagPutMod {
  
  @JSImport("ipfs-cli/dist/src/commands/dag/put", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/dag/put", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/dag/put", "builder.cid-base")
    @js.native
    def cidBase: Choices = js.native
    
    @scala.inline
    def cidBase_=(x: Choices): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-base")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/dag/put", "builder.cid-version")
    @js.native
    def cidVersion: DefaultDescribeType = js.native
    
    @scala.inline
    def cidVersion_=(x: DefaultDescribeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-version")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/dag/put", "builder.data")
    @js.native
    def data: `0` = js.native
    @scala.inline
    def data_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/dag/put", "builder.format")
    @js.native
    def format: AliasChoices = js.native
    @scala.inline
    def format_=(x: AliasChoices): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/dag/put", "builder.hash-alg")
    @js.native
    def hashAlg: AliasChoices = js.native
    
    @scala.inline
    def hashAlg_=(x: AliasChoices): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hash-alg")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/dag/put", "builder.input-encoding")
    @js.native
    def inputEncoding: AliasChoices = js.native
    
    @scala.inline
    def inputEncoding_=(x: AliasChoices): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("input-encoding")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/dag/put", "builder.only-hash")
    @js.native
    def onlyHash: DefaultBoolean = js.native
    
    @scala.inline
    def onlyHash_=(x: DefaultBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("only-hash")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/dag/put", "builder.pin")
    @js.native
    def pin: DefaultBoolean = js.native
    @scala.inline
    def pin_=(x: DefaultBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pin")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/dag/put", "builder.preload")
    @js.native
    def preload: DefaultBoolean = js.native
    @scala.inline
    def preload_=(x: DefaultBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preload")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/dag/put", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    @scala.inline
    def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/dag/put", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/dag/put", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(
    hasHasIpfsPrintGetStdinDataFormatInputEncodingPinHashAlgCidVersionCidBasePreloadOnlyHashTimeout: CidVersion
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintGetStdinDataFormatInputEncodingPinHashAlgCidVersionCidBasePreloadOnlyHashTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
