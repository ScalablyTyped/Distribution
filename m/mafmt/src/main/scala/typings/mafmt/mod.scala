package typings.mafmt

import typings.multiaddr.mod.^
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mafmt/src", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Circuit: Mafmt = js.native
  
  val DNS: Mafmt = js.native
  
  val DNS4: Mafmt = js.native
  
  val DNS6: Mafmt = js.native
  
  val HTTP: Mafmt = js.native
  
  val HTTPS: Mafmt = js.native
  
  val IP: Mafmt = js.native
  
  val IPFS: Mafmt = js.native
  
  val P2P: Mafmt = js.native
  
  val Reliable: Mafmt = js.native
  
  val Stardust: Mafmt = js.native
  
  val TCP: Mafmt = js.native
  
  val UDP: Mafmt = js.native
  
  val UTP: Mafmt = js.native
  
  val WebRTCDirect: Mafmt = js.native
  
  val WebRTCStar: Mafmt = js.native
  
  val WebSocketStar: Mafmt = js.native
  
  val WebSockets: Mafmt = js.native
  
  val WebSocketsSecure: Mafmt = js.native
  
  @js.native
  trait Mafmt extends js.Object {
    
    var input: js.UndefOr[js.Array[Mafmt | js.Function0[this.type]]] = js.native
    
    def matches(a: String): Boolean = js.native
    def matches(a: ^): Boolean = js.native
    def matches(a: Uint8Array): Boolean = js.native
    
    def partialMatch(protos: js.Array[String]): Boolean = js.native
  }
}
