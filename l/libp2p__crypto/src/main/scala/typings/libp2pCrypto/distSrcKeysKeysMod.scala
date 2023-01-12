package typings.libp2pCrypto

import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeysKeysMod {
  
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
    /* "Ed25519" */ val Ed25519: typings.libp2pCrypto.distSrcKeysKeysMod.KeyType.Ed25519 & String = js.native
    
    @js.native
    sealed trait RSA
      extends StObject
         with KeyType
    /* "RSA" */ val RSA: typings.libp2pCrypto.distSrcKeysKeysMod.KeyType.RSA & String = js.native
    
    @js.native
    sealed trait Secp256k1
      extends StObject
         with KeyType
    /* "Secp256k1" */ val Secp256k1: typings.libp2pCrypto.distSrcKeysKeysMod.KeyType.Secp256k1 & String = js.native
    
    def codec(): Codec[KeyType] = js.native
  }
  
  trait PrivateKey extends StObject {
    
    var Data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var Type: js.UndefOr[KeyType] = js.undefined
  }
  object PrivateKey {
    
    inline def apply(): PrivateKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrivateKey]
    }
    
    @JSImport("@libp2p/crypto/dist/src/keys/keys", "PrivateKey")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[PrivateKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[PrivateKey]]
    
    inline def decode(buf: js.typedarray.Uint8Array): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]
    inline def decode(buf: Uint8ArrayList): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]
    
    inline def encode(obj: PrivateKey): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrivateKey] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      inline def setType(value: KeyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
  trait PublicKey extends StObject {
    
    var Data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var Type: js.UndefOr[KeyType] = js.undefined
  }
  object PublicKey {
    
    inline def apply(): PublicKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PublicKey]
    }
    
    @JSImport("@libp2p/crypto/dist/src/keys/keys", "PublicKey")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[PublicKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[PublicKey]]
    
    inline def decode(buf: js.typedarray.Uint8Array): PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PublicKey]
    inline def decode(buf: Uint8ArrayList): PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PublicKey]
    
    inline def encode(obj: PublicKey): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PublicKey] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      inline def setType(value: KeyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
