package typings.libp2p.anon

import typings.itStreamTypes.mod.Duplex
import typings.itStreamTypes.mod.Source
import typings.libp2pInterfaceStreamMuxer.mod.StreamMuxerFactory
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MuxerFactory extends StObject {
  
  var muxerFactory: js.UndefOr[StreamMuxerFactory] = js.undefined
  
  var stream: Duplex[
    AsyncGenerator[js.typedarray.Uint8Array, Any, Any], 
    Source[js.typedarray.Uint8Array], 
    js.Promise[Unit]
  ]
}
object MuxerFactory {
  
  inline def apply(
    stream: Duplex[
      AsyncGenerator[js.typedarray.Uint8Array, Any, Any], 
      Source[js.typedarray.Uint8Array], 
      js.Promise[Unit]
    ]
  ): MuxerFactory = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuxerFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MuxerFactory] (val x: Self) extends AnyVal {
    
    inline def setMuxerFactory(value: StreamMuxerFactory): Self = StObject.set(x, "muxerFactory", value.asInstanceOf[js.Any])
    
    inline def setMuxerFactoryUndefined: Self = StObject.set(x, "muxerFactory", js.undefined)
    
    inline def setStream(
      value: Duplex[
          AsyncGenerator[js.typedarray.Uint8Array, Any, Any], 
          Source[js.typedarray.Uint8Array], 
          js.Promise[Unit]
        ]
    ): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
