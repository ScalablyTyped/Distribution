package typings.ipfsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object startMod {
  
  type APIManager = typings.ipfsCore.apiManagerMod.^
  
  type IPFSBlockService = js.Any
  
  type IPFSRepo = js.Any
  
  type Keychain = js.Any
  
  type LibP2P = js.Any
  
  type PeerId = typings.peerId.mod.^
  
  type PinManager = typings.ipfsCore.pinManagerMod.^
  
  type Preload = (js.Function0[scala.Unit] with typings.ipfsCore.anon.Start) | typings.ipfsCore.anon.Call
  
  type Print = js.Function1[/* repeated */ js.Any, scala.Unit]
}
