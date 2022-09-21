package typings.libp2pCrypto

import typings.protonsRuntime.codecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keysKeysMod {
  
  @js.native
  sealed trait KeyType extends StObject
  @JSImport("@libp2p/crypto/dist/src/keys/keys", "KeyType")
  @js.native
  object KeyType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[KeyType & String] = js.native
    
    @js.native
    sealed trait Ed25519
      extends StObject
         with KeyType
    /* "Ed25519" */ val Ed25519: typings.libp2pCrypto.keysKeysMod.KeyType.Ed25519 & String = js.native
    
    @js.native
    sealed trait RSA
      extends StObject
         with KeyType
    /* "RSA" */ val RSA: typings.libp2pCrypto.keysKeysMod.KeyType.RSA & String = js.native
    
    @js.native
    sealed trait Secp256k1
      extends StObject
         with KeyType
    /* "Secp256k1" */ val Secp256k1: typings.libp2pCrypto.keysKeysMod.KeyType.Secp256k1 & String = js.native
    
    def codec(): Codec[KeyType] = js.native
  }
  
  trait PrivateKey extends StObject {
    
    var Data: js.typedarray.Uint8Array
    
    var Type: KeyType
  }
  object PrivateKey {
    
    inline def apply(Data: js.typedarray.Uint8Array, Type: KeyType): PrivateKey = {
      val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrivateKey]
    }
    
    @JSImport("@libp2p/crypto/dist/src/keys/keys", "PrivateKey")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[PrivateKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[PrivateKey]]
    
    inline def decode(buf: js.typedarray.Uint8Array): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]
    inline def decode(buf: Uint8ArrayList): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]
    
    inline def encode(obj: PrivateKey): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    extension [Self <: PrivateKey](x: Self) {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setType(value: KeyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
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
    
    @JSImport("@libp2p/crypto/dist/src/keys/keys", "PublicKey")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[PublicKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[PublicKey]]
    
    inline def decode(buf: js.typedarray.Uint8Array): PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PublicKey]
    inline def decode(buf: Uint8ArrayList): PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PublicKey]
    
    inline def encode(obj: PublicKey): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    extension [Self <: PublicKey](x: Self) {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setType(value: KeyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
}
