package typings.libp2pPeerIdFactory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bits extends StObject {
    
    var bits: Double
  }
  object Bits {
    
    inline def apply(bits: Double): Bits = {
      val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bits]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bits] (val x: Self) extends AnyVal {
      
      inline def setBits(value: Double): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var privKey: js.UndefOr[String] = js.undefined
    
    var pubKey: js.UndefOr[String] = js.undefined
  }
  object Id {
    
    inline def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPrivKey(value: String): Self = StObject.set(x, "privKey", value.asInstanceOf[js.Any])
      
      inline def setPrivKeyUndefined: Self = StObject.set(x, "privKey", js.undefined)
      
      inline def setPubKey(value: String): Self = StObject.set(x, "pubKey", value.asInstanceOf[js.Any])
      
      inline def setPubKeyUndefined: Self = StObject.set(x, "pubKey", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@libp2p/peer-id-factory.@libp2p/peer-id-factory/dist/src/proto.PeerIdProto> */
  trait PartialPeerIdProto extends StObject {
    
    var id: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var privKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var pubKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object PartialPeerIdProto {
    
    inline def apply(): PartialPeerIdProto = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPeerIdProto]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialPeerIdProto] (val x: Self) extends AnyVal {
      
      inline def setId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPrivKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "privKey", value.asInstanceOf[js.Any])
      
      inline def setPrivKeyUndefined: Self = StObject.set(x, "privKey", js.undefined)
      
      inline def setPubKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "pubKey", value.asInstanceOf[js.Any])
      
      inline def setPubKeyUndefined: Self = StObject.set(x, "pubKey", js.undefined)
    }
  }
}
