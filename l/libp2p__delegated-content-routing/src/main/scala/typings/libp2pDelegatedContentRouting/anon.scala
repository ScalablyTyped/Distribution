package typings.libp2pDelegatedContentRouting

import typings.libp2pDelegatedContentRouting.mod.DHTProvideOptions
import typings.libp2pDelegatedContentRouting.mod.HTTPClientExtraOptions
import typings.libp2pDelegatedContentRouting.mod.QueryEvent
import typings.libp2pDelegatedContentRouting.mod.StatResult
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FindProvs extends StObject {
    
    def findProvs(cid: CID[Any, Double, Double, Version]): AsyncIterable[QueryEvent] = js.native
    def findProvs(
      cid: CID[Any, Double, Double, Version],
      options: HTTPClientExtraOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbortOptions */ Any)
    ): AsyncIterable[QueryEvent] = js.native
    
    def get(key: String): AsyncIterable[QueryEvent] = js.native
    def get(
      key: String,
      options: HTTPClientExtraOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbortOptions */ Any)
    ): AsyncIterable[QueryEvent] = js.native
    def get(key: js.typedarray.Uint8Array): AsyncIterable[QueryEvent] = js.native
    def get(
      key: js.typedarray.Uint8Array,
      options: HTTPClientExtraOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbortOptions */ Any)
    ): AsyncIterable[QueryEvent] = js.native
    
    def provide(cid: CID[Any, Double, Double, Version]): AsyncIterable[QueryEvent] = js.native
    def provide(cid: CID[Any, Double, Double, Version], options: HTTPClientExtraOptions & DHTProvideOptions): AsyncIterable[QueryEvent] = js.native
    
    def put(key: String, value: js.typedarray.Uint8Array): AsyncIterable[QueryEvent] = js.native
    def put(
      key: String,
      value: js.typedarray.Uint8Array,
      options: HTTPClientExtraOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbortOptions */ Any)
    ): AsyncIterable[QueryEvent] = js.native
    def put(key: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array): AsyncIterable[QueryEvent] = js.native
    def put(
      key: js.typedarray.Uint8Array,
      value: js.typedarray.Uint8Array,
      options: HTTPClientExtraOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbortOptions */ Any)
    ): AsyncIterable[QueryEvent] = js.native
  }
  
  trait Host extends StObject {
    
    var host: String
    
    var port: String
    
    var protocol: String
  }
  object Host {
    
    inline def apply(host: String, port: String, protocol: String): Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Stat extends StObject {
    
    def stat(cid: CID[Any, Double, Double, Version]): js.Promise[StatResult] = js.native
    def stat(
      cid: CID[Any, Double, Double, Version],
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbortOptions */ Any
    ): js.Promise[StatResult] = js.native
  }
}
