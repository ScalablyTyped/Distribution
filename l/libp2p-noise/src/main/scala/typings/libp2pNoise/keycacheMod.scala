package typings.libp2pNoise

import typings.libp2pNoise.basicMod.bytes32
import typings.peerId.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keycacheMod {
  
  @JSImport("libp2p-noise/dist/src/keycache", "KeyCache")
  @js.native
  val KeyCache_ : Keycache = js.native
  
  /**
    * Storage for static keys of previously connected peers.
    */
  @js.native
  trait Keycache extends StObject {
    
    def load(): bytes32 | Null = js.native
    def load(peerId: ^): bytes32 | Null = js.native
    
    def resetStorage(): Unit = js.native
    
    var storage: js.Any = js.native
    
    def store(peerId: ^, key: bytes32): Unit = js.native
  }
}
