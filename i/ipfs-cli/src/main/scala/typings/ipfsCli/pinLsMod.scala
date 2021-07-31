package typings.ipfsCli

import typings.ipfsCli.anon.AliasChoicesDefault
import typings.ipfsCli.anon.AliasString
import typings.ipfsCli.anon.Choices
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.Quiet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinLsMod {
  
  @JSImport("ipfs-cli/dist/src/commands/pin/ls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/pin/ls", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/pin/ls", "builder.cid-base")
    @js.native
    def cidBase: Choices = js.native
    
    @scala.inline
    def cidBase_=(x: Choices): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-base")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/pin/ls", "builder.quiet")
    @js.native
    def quiet: AliasString = js.native
    @scala.inline
    def quiet_=(x: AliasString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quiet")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/pin/ls", "builder.stream")
    @js.native
    def stream: AliasString = js.native
    @scala.inline
    def stream_=(x: AliasString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stream")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/pin/ls", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    @scala.inline
    def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/pin/ls", "builder.type")
    @js.native
    val `type`: AliasChoicesDefault = js.native
  }
  
  @JSImport("ipfs-cli/dist/src/commands/pin/ls", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/pin/ls", "describe")
  @js.native
  val describe: String = js.native
  
  @scala.inline
  def handler(hasHasIpfsPrintIpfsPathTypeQuietCidBaseStreamTimeout: Quiet): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintIpfsPathTypeQuietCidBaseStreamTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
