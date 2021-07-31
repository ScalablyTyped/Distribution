package typings.ipfsCli

import typings.ipfsCli.anon.AliasDefault
import typings.ipfsCli.anon.Block
import typings.ipfsCli.anon.Choices
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.DefaultNumber
import typings.ipfsCli.anon.DefaultString
import typings.ipfsCli.anon.DefaultUndefined
import typings.ipfsCli.anon.DescribeString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putMod {
  
  @JSImport("ipfs-cli/dist/src/commands/block/put", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/block/put", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/block/put", "builder.cid-base")
    @js.native
    def cidBase: Choices = js.native
    
    @scala.inline
    def cidBase_=(x: Choices): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-base")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/block/put", "builder.format")
    @js.native
    def format: AliasDefault = js.native
    @scala.inline
    def format_=(x: AliasDefault): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/block/put", "builder.mhlen")
    @js.native
    def mhlen: DefaultUndefined = js.native
    @scala.inline
    def mhlen_=(x: DefaultUndefined): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mhlen")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/block/put", "builder.mhtype")
    @js.native
    def mhtype: DefaultString = js.native
    @scala.inline
    def mhtype_=(x: DefaultString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mhtype")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/block/put", "builder.pin")
    @js.native
    def pin: DescribeString = js.native
    @scala.inline
    def pin_=(x: DescribeString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pin")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/block/put", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    @scala.inline
    def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/block/put", "builder.version")
    @js.native
    def version: DefaultNumber = js.native
    @scala.inline
    def version_=(x: DefaultNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/block/put", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/block/put", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsPrintGetStdinBlockTimeoutFormatMhtypeMhlenVersionCidBasePin: Block): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintGetStdinBlockTimeoutFormatMhtypeMhlenVersionCidBasePin.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
