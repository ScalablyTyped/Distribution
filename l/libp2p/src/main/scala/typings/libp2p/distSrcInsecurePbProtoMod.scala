package typings.libp2p

import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcInsecurePbProtoMod {
  
  trait Exchange extends StObject {
    
    var id: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var pubkey: js.UndefOr[PublicKey] = js.undefined
  }
  object Exchange {
    
    inline def apply(): Exchange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exchange]
    }
    
    @JSImport("libp2p/dist/src/insecure/pb/proto", "Exchange")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[Exchange] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[Exchange]]
    
    inline def decode(buf: js.typedarray.Uint8Array): Exchange = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Exchange]
    inline def decode(buf: Uint8ArrayList): Exchange = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[Exchange]
    
    inline def encode(obj: Exchange): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Exchange] (val x: Self) extends AnyVal {
      
      inline def setId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPubkey(value: PublicKey): Self = StObject.set(x, "pubkey", value.asInstanceOf[js.Any])
      
      inline def setPubkeyUndefined: Self = StObject.set(x, "pubkey", js.undefined)
    }
  }
  
  @js.native
  sealed trait KeyType extends StObject
  @JSImport("libp2p/dist/src/insecure/pb/proto", "KeyType")
  @js.native
  object KeyType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[KeyType & String] = js.native
    
    @js.native
    sealed trait ECDSA
      extends StObject
         with KeyType
    /* "ECDSA" */ val ECDSA: typings.libp2p.distSrcInsecurePbProtoMod.KeyType.ECDSA & String = js.native
    
    @js.native
    sealed trait Ed25519
      extends StObject
         with KeyType
    /* "Ed25519" */ val Ed25519: typings.libp2p.distSrcInsecurePbProtoMod.KeyType.Ed25519 & String = js.native
    
    @js.native
    sealed trait RSA
      extends StObject
         with KeyType
    /* "RSA" */ val RSA: typings.libp2p.distSrcInsecurePbProtoMod.KeyType.RSA & String = js.native
    
    @js.native
    sealed trait Secp256k1
      extends StObject
         with KeyType
    /* "Secp256k1" */ val Secp256k1: typings.libp2p.distSrcInsecurePbProtoMod.KeyType.Secp256k1 & String = js.native
    
    def codec(): Codec[KeyType] = js.native
  }
  
  trait PublicKey extends StObject {
    
    var Data: js.typedarray.Uint8Array
    
    var Type: KeyType
  }
  object PublicKey {
    
    inline def apply(Data: js.typedarray.Uint8Array, Type: KeyType): PublicKey = {
      val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublicKey]
    }
    
    @JSImport("libp2p/dist/src/insecure/pb/proto", "PublicKey")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[PublicKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[PublicKey]]
    
    inline def decode(buf: js.typedarray.Uint8Array): PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PublicKey]
    inline def decode(buf: Uint8ArrayList): PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PublicKey]
    
    inline def encode(obj: PublicKey): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PublicKey] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setType(value: KeyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
}
