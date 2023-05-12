package typings.libp2pMultistreamSelect

import typings.itStreamTypes.mod.Duplex
import typings.itStreamTypes.mod.Source
import typings.libp2pInterfaces.mod.AbortOptions
import typings.libp2pMultistreamSelect.libp2pMultistreamSelectBooleans.`false`
import typings.libp2pMultistreamSelect.libp2pMultistreamSelectBooleans.`true`
import typings.std.AsyncGenerator
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
    stream: Duplex[
      Source[Uint8ArrayList | js.typedarray.Uint8Array], 
      Source[Uint8ArrayList | js.typedarray.Uint8Array], 
      Any
    ],
    protocols: String
  ): js.Promise[
    ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ]]
  inline def handle(
    stream: Duplex[Source[js.typedarray.Uint8Array], Source[js.typedarray.Uint8Array], Any],
    protocols: String,
    options: ByteArrayInit
  ): js.Promise[
    ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]]
  ]]
  inline def handle(
    stream: Duplex[
      Source[Uint8ArrayList | js.typedarray.Uint8Array], 
      Source[Uint8ArrayList | js.typedarray.Uint8Array], 
      Any
    ],
    protocols: String,
    options: ByteListInit
  ): js.Promise[
    ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ]]
  inline def handle(
    stream: Duplex[
      Source[Uint8ArrayList | js.typedarray.Uint8Array], 
      Source[Uint8ArrayList | js.typedarray.Uint8Array], 
      Any
    ],
    protocols: js.Array[String]
  ): js.Promise[
    ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ]]
  inline def handle(
    stream: Duplex[Source[js.typedarray.Uint8Array], Source[js.typedarray.Uint8Array], Any],
    protocols: js.Array[String],
    options: ByteArrayInit
  ): js.Promise[
    ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]]
  ]]
  inline def handle(
    stream: Duplex[
      Source[Uint8ArrayList | js.typedarray.Uint8Array], 
      Source[Uint8ArrayList | js.typedarray.Uint8Array], 
      Any
    ],
    protocols: js.Array[String],
    options: ByteListInit
  ): js.Promise[
    ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ]]
  
  inline def lazySelect(
    stream: Duplex[
      Source[js.typedarray.Uint8Array | Uint8ArrayList], 
      Source[js.typedarray.Uint8Array | Uint8ArrayList], 
      Any
    ],
    protocol: String
  ): ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("lazySelect")(stream.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]]
  
  inline def select(
    stream: Duplex[
      AsyncGenerator[Uint8ArrayList | js.typedarray.Uint8Array, Any, Any], 
      Source[Uint8ArrayList | js.typedarray.Uint8Array], 
      Any
    ],
    protocols: String
  ): js.Promise[
    ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ]]
  inline def select(
    stream: Duplex[
      AsyncGenerator[js.typedarray.Uint8Array, Any, Any], 
      Source[js.typedarray.Uint8Array], 
      Any
    ],
    protocols: String,
    options: ByteArrayInit
  ): js.Promise[
    ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]]
  ]]
  inline def select(
    stream: Duplex[
      AsyncGenerator[Uint8ArrayList | js.typedarray.Uint8Array, Any, Any], 
      Source[Uint8ArrayList | js.typedarray.Uint8Array], 
      Any
    ],
    protocols: String,
    options: ByteListInit
  ): js.Promise[
    ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ]]
  inline def select(
    stream: Duplex[
      AsyncGenerator[Uint8ArrayList | js.typedarray.Uint8Array, Any, Any], 
      Source[Uint8ArrayList | js.typedarray.Uint8Array], 
      Any
    ],
    protocols: js.Array[String]
  ): js.Promise[
    ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ]]
  inline def select(
    stream: Duplex[
      AsyncGenerator[js.typedarray.Uint8Array, Any, Any], 
      Source[js.typedarray.Uint8Array], 
      Any
    ],
    protocols: js.Array[String],
    options: ByteArrayInit
  ): js.Promise[
    ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    ProtocolStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]]
  ]]
  inline def select(
    stream: Duplex[
      AsyncGenerator[Uint8ArrayList | js.typedarray.Uint8Array, Any, Any], 
      Source[Uint8ArrayList | js.typedarray.Uint8Array], 
      Any
    ],
    protocols: js.Array[String],
    options: ByteListInit
  ): js.Promise[
    ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(stream.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    ProtocolStream[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ]]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ByteArrayInit] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ByteListInit] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultistreamSelectInit] (val x: Self) extends AnyVal {
      
      inline def setWriteBytes(value: Boolean): Self = StObject.set(x, "writeBytes", value.asInstanceOf[js.Any])
      
      inline def setWriteBytesUndefined: Self = StObject.set(x, "writeBytes", js.undefined)
    }
  }
  
  trait ProtocolStream[TSource, TSink, RSink] extends StObject {
    
    var protocol: String
    
    var stream: Duplex[AsyncGenerator[TSource, Any, Any], Source[TSink], RSink]
  }
  object ProtocolStream {
    
    inline def apply[TSource, TSink, RSink](protocol: String, stream: Duplex[AsyncGenerator[TSource, Any, Any], Source[TSink], RSink]): ProtocolStream[TSource, TSink, RSink] = {
      val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtocolStream[TSource, TSink, RSink]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProtocolStream[?, ?, ?], TSource, TSink, RSink] (val x: Self & (ProtocolStream[TSource, TSink, RSink])) extends AnyVal {
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setStream(value: Duplex[AsyncGenerator[TSource, Any, Any], Source[TSink], RSink]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
