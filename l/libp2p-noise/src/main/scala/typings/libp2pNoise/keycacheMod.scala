package typings.libp2pNoise

import typings.libp2pNoise.basicMod.bytes32
import typings.peerId.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-noise/dist/src/keycache", JSImport.Namespace)
@js.native
object keycacheMod extends js.Object {
  
  @JSName("KeyCache")
  val KeyCache_ : Keycache = js.native
  
  /**
    * Storage for static keys of previously connected peers.
    */
  @js.native
  trait Keycache extends js.Object {
    
    def load(): bytes32 | Null = js.native
    def load(peerId: ^): bytes32 | Null = js.native
    
    def resetStorage(): Unit = js.native
    
    var storage: js.Any = js.native
    
    def store(peerId: ^, key: bytes32): Unit = js.native
  }
}
