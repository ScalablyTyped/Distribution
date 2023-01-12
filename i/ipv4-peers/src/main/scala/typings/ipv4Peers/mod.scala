package typings.ipv4Peers

import typings.ipv4Peers.anon.Encode
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipv4-peers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object decode {
    
    inline def apply(buffer: Buffer): js.Array[Peer] = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[Peer]]
    inline def apply(buffer: Buffer, offset: Double): js.Array[Peer] = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Peer]]
    inline def apply(buffer: Buffer, offset: Double, end: Double): js.Array[Peer] = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Peer]]
    inline def apply(buffer: Buffer, offset: Unit, end: Double): js.Array[Peer] = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Peer]]
    
    @JSImport("ipv4-peers", "decode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipv4-peers", "decode.bytes")
    @js.native
    val bytes: Double = js.native
  }
  
  object encode {
    
    inline def apply(peers: js.Array[Peer]): Buffer = ^.asInstanceOf[js.Dynamic].apply(peers.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def apply(peers: js.Array[Peer], buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(peers.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(peers: js.Array[Peer], buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(peers.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(peers: js.Array[Peer], buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(peers.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @JSImport("ipv4-peers", "encode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ipv4-peers", "encode.bytes")
    @js.native
    val bytes: Double = js.native
  }
  
  inline def encodingLength(peers: js.Array[Peer]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(peers.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Create a new ipv4-peers decoder that encodes/decodes a fixed size peer id in addition to host/port.
    * The peer id is exposed as the `.id` property on a peer object.
    */
  inline def idLength(): Encode = ^.asInstanceOf[js.Dynamic].applyDynamic("idLength")().asInstanceOf[Encode]
  inline def idLength(idLength: Double): Encode = ^.asInstanceOf[js.Dynamic].applyDynamic("idLength")(idLength.asInstanceOf[js.Any]).asInstanceOf[Encode]
  
  trait Peer extends StObject {
    
    var host: String
    
    var id: js.UndefOr[Buffer] = js.undefined
    
    var port: Double
  }
  object Peer {
    
    inline def apply(host: String, port: Double): Peer = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Peer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Peer] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setId(value: Buffer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
