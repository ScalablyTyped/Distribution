package typings.libp2pMultistreamSelect

import typings.itStreamTypes.mod.Duplex
import typings.libp2pInterfaces.mod.AbortOptions
import typings.libp2pMultistreamSelect.libp2pMultistreamSelectBooleans.`false`
import typings.libp2pMultistreamSelect.libp2pMultistreamSelectBooleans.`true`
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/multistream-select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@libp2p/multistream-select", "PROTOCOL_ID")
  @js.native
  val PROTOCOL_ID: /* "/multistream/1.0.0" */ String = js.native
  
  inline def handle(
    stream: Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]],
    protocols: String
  ): js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]]]
  inline def handle(
    stream: Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]],
    protocols: String,
    options: ByteArrayInit
  ): js.Promise[ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]]
  inline def handle(
    stream: Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]],
    protocols: String,
    options: ByteListInit
  ): js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]]]
  inline def handle(
    stream: Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]],
    protocols: js.Array[String]
  ): js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]]]
  inline def handle(
    stream: Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]],
    protocols: js.Array[String],
    options: ByteArrayInit
  ): js.Promise[ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]]
  inline def handle(
    stream: Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]],
    protocols: js.Array[String],
    options: ByteListInit
  ): js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]]]
  
  inline def lazySelect(
    stream: Duplex[
      js.typedarray.Uint8Array | Uint8ArrayList, 
      js.typedarray.Uint8Array | Uint8ArrayList, 
      js.Promise[Unit]
    ],
    protocol: String
  ): ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("lazySelect")(stream.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]]
  
  inline def select(
    stream: Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]],
    protocols: String
  ): js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]]]
  inline def select(
    stream: Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]],
    protocols: String,
    options: ByteArrayInit
  ): js.Promise[ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]]
  inline def select(
    stream: Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]],
    protocols: String,
    options: ByteListInit
  ): js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]]]
  inline def select(
    stream: Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]],
    protocols: js.Array[String]
  ): js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]]]
  inline def select(
    stream: Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]],
    protocols: js.Array[String],
    options: ByteArrayInit
  ): js.Promise[ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]]
  inline def select(
    stream: Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]],
    protocols: js.Array[String],
    options: ByteListInit
  ): js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array]]]
  
  trait ByteArrayInit
    extends StObject
       with AbortOptions {
    
    var writeBytes: `true`
  }
  object ByteArrayInit {
    
    inline def apply(): ByteArrayInit = {
      val __obj = js.Dynamic.literal(writeBytes = true)
      __obj.asInstanceOf[ByteArrayInit]
    }
    
    extension [Self <: ByteArrayInit](x: Self) {
      
      inline def setWriteBytes(value: `true`): Self = StObject.set(x, "writeBytes", value.asInstanceOf[js.Any])
    }
  }
  
  trait ByteListInit
    extends StObject
       with AbortOptions {
    
    var writeBytes: js.UndefOr[`false`] = js.undefined
  }
  object ByteListInit {
    
    inline def apply(): ByteListInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ByteListInit]
    }
    
    extension [Self <: ByteListInit](x: Self) {
      
      inline def setWriteBytes(value: `false`): Self = StObject.set(x, "writeBytes", value.asInstanceOf[js.Any])
      
      inline def setWriteBytesUndefined: Self = StObject.set(x, "writeBytes", js.undefined)
    }
  }
  
  trait MultistreamSelectInit
    extends StObject
       with AbortOptions {
    
    var writeBytes: js.UndefOr[Boolean] = js.undefined
  }
  object MultistreamSelectInit {
    
    inline def apply(): MultistreamSelectInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultistreamSelectInit]
    }
    
    extension [Self <: MultistreamSelectInit](x: Self) {
      
      inline def setWriteBytes(value: Boolean): Self = StObject.set(x, "writeBytes", value.asInstanceOf[js.Any])
      
      inline def setWriteBytesUndefined: Self = StObject.set(x, "writeBytes", js.undefined)
    }
  }
  
  trait ProtocolStream[TSource, TSink] extends StObject {
    
    var protocol: String
    
    var stream: Duplex[TSource, TSink, js.Promise[Unit]]
  }
  object ProtocolStream {
    
    inline def apply[TSource, TSink](protocol: String, stream: Duplex[TSource, TSink, js.Promise[Unit]]): ProtocolStream[TSource, TSink] = {
      val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtocolStream[TSource, TSink]]
    }
    
    extension [Self <: ProtocolStream[?, ?], TSource, TSink](x: Self & (ProtocolStream[TSource, TSink])) {
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setStream(value: Duplex[TSource, TSink, js.Promise[Unit]]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
