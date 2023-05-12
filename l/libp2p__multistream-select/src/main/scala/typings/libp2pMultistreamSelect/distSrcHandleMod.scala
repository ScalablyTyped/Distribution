package typings.libp2pMultistreamSelect

import typings.itStreamTypes.mod.Duplex
import typings.itStreamTypes.mod.Source
import typings.libp2pMultistreamSelect.mod.ByteArrayInit
import typings.libp2pMultistreamSelect.mod.ByteListInit
import typings.libp2pMultistreamSelect.mod.ProtocolStream
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHandleMod {
  
  @JSImport("@libp2p/multistream-select/dist/src/handle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
}
