package typings.ipfsCore.startMod

import typings.ipfsCore.filesMod.MFS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAPIConfig extends js.Object {
  
  var apiManager: APIManager = js.native
  
  var bitswap: js.UndefOr[js.Any] = js.native
  
  var block: Block = js.native
  
  var blockService: js.Any = js.native
  
  var config: Config = js.native
  
  var constructorOptions: StartOptions = js.native
  
  var dag: DAG = js.native
  
  var files: js.UndefOr[MFS] = js.native
  
  var gcLock: GCLock = js.native
  
  var initOptions: InitOptions = js.native
  
  var ipld: IPLD = js.native
  
  var ipns: typings.ipfsCore.ipnsMod.^ = js.native
  
  var keychain: js.Any = js.native
  
  var libp2p: js.Any = js.native
  
  var mfsPreload: MFSPreload = js.native
  
  var peerId: PeerId = js.native
  
  var pin: Pin = js.native
  
  var preload: Preload = js.native
  
  def print(args: js.Any*): Unit = js.native
  @JSName("print")
  var print_Original: Print = js.native
  
  var repo: js.Any = js.native
}
