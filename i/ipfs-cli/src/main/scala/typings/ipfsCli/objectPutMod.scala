package typings.ipfsCli

import typings.ipfsCli.anon.Choices
import typings.ipfsCli.anon.CoerceType
import typings.ipfsCli.anon.DefaultStringTypeString
import typings.ipfsCli.anon.InputEnc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectPutMod {
  
  @JSImport("ipfs-cli/dist/src/commands/object/put", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object builder {
    
    @JSImport("ipfs-cli/dist/src/commands/object/put", "builder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipfs-cli/dist/src/commands/object/put", "builder.cid-base")
    @js.native
    def cidBase: Choices = js.native
    
    inline def cidBase_=(x: Choices): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cid-base")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/object/put", "builder.input-enc")
    @js.native
    def inputEnc: DefaultStringTypeString = js.native
    
    inline def inputEnc_=(x: DefaultStringTypeString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("input-enc")(x.asInstanceOf[js.Any])
    
    @JSImport("ipfs-cli/dist/src/commands/object/put", "builder.timeout")
    @js.native
    def timeout: CoerceType = js.native
    inline def timeout_=(x: CoerceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ipfs-cli/dist/src/commands/object/put", "command")
  @js.native
  val command: String = js.native
  
  @JSImport("ipfs-cli/dist/src/commands/object/put", "describe")
  @js.native
  val describe: String = js.native
  
  inline def handler(hasHasIpfsPrintGetStdinDataInputEncCidBaseTimeout: InputEnc): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handler")(hasHasIpfsPrintGetStdinDataInputEncCidBaseTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
