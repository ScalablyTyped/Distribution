package typings.libp2p

import typings.libp2p.distSrcFetchPbProtoMod.FetchResponse.StatusCode
import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFetchPbProtoMod {
  
  trait FetchRequest extends StObject {
    
    var identifier: String
  }
  object FetchRequest {
    
    inline def apply(identifier: String): FetchRequest = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchRequest]
    }
    
    @JSImport("libp2p/dist/src/fetch/pb/proto", "FetchRequest")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[FetchRequest] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[FetchRequest]]
    
    inline def decode(buf: js.typedarray.Uint8Array): FetchRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[FetchRequest]
    inline def decode(buf: Uint8ArrayList): FetchRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[FetchRequest]
    
    inline def encode(obj: FetchRequest): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    extension [Self <: FetchRequest](x: Self) {
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait FetchResponse extends StObject {
    
    var data: js.typedarray.Uint8Array
    
    var status: StatusCode
  }
  object FetchResponse {
    
    inline def apply(data: js.typedarray.Uint8Array, status: StatusCode): FetchResponse = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchResponse]
    }
    
    @JSImport("libp2p/dist/src/fetch/pb/proto", "FetchResponse")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    sealed trait StatusCode extends StObject
    @JSImport("libp2p/dist/src/fetch/pb/proto", "FetchResponse.StatusCode")
    @js.native
    object StatusCode extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[StatusCode & String] = js.native
      
      @js.native
      sealed trait ERROR
        extends StObject
           with StatusCode
      /* "ERROR" */ val ERROR: typings.libp2p.distSrcFetchPbProtoMod.FetchResponse.StatusCode.ERROR & String = js.native
      
      @js.native
      sealed trait NOT_FOUND
        extends StObject
           with StatusCode
      /* "NOT_FOUND" */ val NOT_FOUND: typings.libp2p.distSrcFetchPbProtoMod.FetchResponse.StatusCode.NOT_FOUND & String = js.native
      
      @js.native
      sealed trait OK
        extends StObject
           with StatusCode
      /* "OK" */ val OK: typings.libp2p.distSrcFetchPbProtoMod.FetchResponse.StatusCode.OK & String = js.native
      
      def codec(): Codec[StatusCode] = js.native
    }
    
    inline def codec(): Codec[FetchResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[FetchResponse]]
    
    inline def decode(buf: js.typedarray.Uint8Array): FetchResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[FetchResponse]
    inline def decode(buf: Uint8ArrayList): FetchResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[FetchResponse]
    
    inline def encode(obj: FetchResponse): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    extension [Self <: FetchResponse](x: Self) {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: StatusCode): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
