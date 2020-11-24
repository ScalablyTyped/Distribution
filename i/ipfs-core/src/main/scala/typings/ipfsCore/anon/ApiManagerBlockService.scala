package typings.ipfsCore.anon

import typings.ipfsCore.startMod.APIManager
import typings.ipfsCore.startMod.GCLock
import typings.ipfsCore.startMod.IPFSBlockService
import typings.ipfsCore.startMod.IPFSRepo
import typings.ipfsCore.startMod.IPLD
import typings.ipfsCore.startMod.StartOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiManagerBlockService extends js.Object {
  
  var apiManager: APIManager = js.native
  
  var blockService: IPFSBlockService = js.native
  
  var gcLock: GCLock = js.native
  
  var initOptions: typings.ipfsCore.startMod.InitOptions = js.native
  
  var ipld: IPLD = js.native
  
  var keychain: typings.ipfsCore.startMod.Keychain = js.native
  
  var options: StartOptions = js.native
  
  var peerId: typings.ipfsCore.startMod.PeerId = js.native
  
  var pinManager: typings.ipfsCore.startMod.PinManager = js.native
  
  var preload: typings.ipfsCore.startMod.Preload = js.native
  
  def print(args: js.Any*): Unit = js.native
  @JSName("print")
  var print_Original: typings.ipfsCore.startMod.Print = js.native
  
  var repo: IPFSRepo = js.native
}
