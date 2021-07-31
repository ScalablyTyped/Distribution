package typings.mafmt

import typings.multiaddr.mod.^
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mafmt/src", "Circuit")
  @js.native
  val Circuit: Mafmt = js.native
  
  @JSImport("mafmt/src", "DNS")
  @js.native
  val DNS: Mafmt = js.native
  
  @JSImport("mafmt/src", "DNS4")
  @js.native
  val DNS4: Mafmt = js.native
  
  @JSImport("mafmt/src", "DNS6")
  @js.native
  val DNS6: Mafmt = js.native
  
  @JSImport("mafmt/src", "HTTP")
  @js.native
  val HTTP: Mafmt = js.native
  
  @JSImport("mafmt/src", "HTTPS")
  @js.native
  val HTTPS: Mafmt = js.native
  
  @JSImport("mafmt/src", "IP")
  @js.native
  val IP: Mafmt = js.native
  
  @JSImport("mafmt/src", "IPFS")
  @js.native
  val IPFS: Mafmt = js.native
  
  @JSImport("mafmt/src", "P2P")
  @js.native
  val P2P: Mafmt = js.native
  
  @JSImport("mafmt/src", "Reliable")
  @js.native
  val Reliable: Mafmt = js.native
  
  @JSImport("mafmt/src", "Stardust")
  @js.native
  val Stardust: Mafmt = js.native
  
  @JSImport("mafmt/src", "TCP")
  @js.native
  val TCP: Mafmt = js.native
  
  @JSImport("mafmt/src", "UDP")
  @js.native
  val UDP: Mafmt = js.native
  
  @JSImport("mafmt/src", "UTP")
  @js.native
  val UTP: Mafmt = js.native
  
  @JSImport("mafmt/src", "WebRTCDirect")
  @js.native
  val WebRTCDirect: Mafmt = js.native
  
  @JSImport("mafmt/src", "WebRTCStar")
  @js.native
  val WebRTCStar: Mafmt = js.native
  
  @JSImport("mafmt/src", "WebSocketStar")
  @js.native
  val WebSocketStar: Mafmt = js.native
  
  @JSImport("mafmt/src", "WebSockets")
  @js.native
  val WebSockets: Mafmt = js.native
  
  @JSImport("mafmt/src", "WebSocketsSecure")
  @js.native
  val WebSocketsSecure: Mafmt = js.native
  
  @js.native
  trait Mafmt extends StObject {
    
    var input: js.UndefOr[js.Array[Mafmt | js.Function0[this.type]]] = js.native
    
    def matches(a: String): Boolean = js.native
    def matches(a: ^): Boolean = js.native
    def matches(a: Uint8Array): Boolean = js.native
    
    def partialMatch(protos: js.Array[String]): Boolean = js.native
  }
}
