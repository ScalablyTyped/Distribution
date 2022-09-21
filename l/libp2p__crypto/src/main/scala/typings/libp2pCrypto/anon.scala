package typings.libp2pCrypto

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.libp2pCrypto.ed25519ClassMod.Ed25519PrivateKey
import typings.libp2pCrypto.ed25519ClassMod.Ed25519PublicKey
import typings.libp2pCrypto.rsaClassMod.RsaPrivateKey
import typings.libp2pCrypto.rsaClassMod.RsaPublicKey
import typings.libp2pCrypto.secp256k1ClassMod.Secp256k1PrivateKey
import typings.libp2pCrypto.secp256k1ClassMod.Secp256k1PublicKey
import typings.node.bufferMod.global.Buffer
import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Abs extends StObject {
    
    def abs(): Any
  }
  object Abs {
    
    inline def apply(abs: () => Any): Abs = {
      val __obj = js.Dynamic.literal(abs = js.Any.fromFunction0(abs))
      __obj.asInstanceOf[Abs]
    }
    
    extension [Self <: Abs](x: Self) {
      
      inline def setAbs(value: () => Any): Self = StObject.set(x, "abs", js.Any.fromFunction0(value))
    }
  }
  
  trait Bytes extends StObject {
    
    var bytes: js.typedarray.Uint8Array
  }
  object Bytes {
    
    inline def apply(bytes: js.typedarray.Uint8Array): Bytes = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bytes]
    }
    
    extension [Self <: Bytes](x: Self) {
      
      inline def setBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    }
  }
  
  trait CipherKey extends StObject {
    
    var cipherKey: js.typedarray.Uint8Array
    
    var iv: js.typedarray.Uint8Array
    
    var macKey: js.typedarray.Uint8Array
  }
  object CipherKey {
    
    inline def apply(
      cipherKey: js.typedarray.Uint8Array,
      iv: js.typedarray.Uint8Array,
      macKey: js.typedarray.Uint8Array
    ): CipherKey = {
      val __obj = js.Dynamic.literal(cipherKey = cipherKey.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], macKey = macKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[CipherKey]
    }
    
    extension [Self <: CipherKey](x: Self) {
      
      inline def setCipherKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "cipherKey", value.asInstanceOf[js.Any])
      
      inline def setIv(value: js.typedarray.Uint8Array): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setMacKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "macKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait Digest extends StObject {
    
    def digest(data: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array]
    
    var length: Double
  }
  object Digest {
    
    inline def apply(digest: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array], length: Double): Digest = {
      val __obj = js.Dynamic.literal(digest = js.Any.fromFunction1(digest), length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Digest]
    }
    
    extension [Self <: Digest](x: Self) {
      
      inline def setDigest(value: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "digest", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait K1 extends StObject {
    
    var k1: CipherKey
    
    var k2: CipherKey
  }
  object K1 {
    
    inline def apply(k1: CipherKey, k2: CipherKey): K1 = {
      val __obj = js.Dynamic.literal(k1 = k1.asInstanceOf[js.Any], k2 = k2.asInstanceOf[js.Any])
      __obj.asInstanceOf[K1]
    }
    
    extension [Self <: K1](x: Self) {
      
      inline def setK1(value: CipherKey): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
      
      inline def setK2(value: CipherKey): Self = StObject.set(x, "k2", value.asInstanceOf[js.Any])
    }
  }
  
  trait Length extends StObject {
    
    def digest(data: js.typedarray.Uint8Array): js.Promise[Buffer]
    
    var length: Double
  }
  object Length {
    
    inline def apply(digest: js.typedarray.Uint8Array => js.Promise[Buffer], length: Double): Length = {
      val __obj = js.Dynamic.literal(digest = js.Any.fromFunction1(digest), length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    extension [Self <: Length](x: Self) {
      
      inline def setDigest(value: js.typedarray.Uint8Array => js.Promise[Buffer]): Self = StObject.set(x, "digest", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrivateKey extends StObject {
    
    var privateKey: js.typedarray.Uint8Array
    
    var publicKey: js.typedarray.Uint8Array
  }
  object PrivateKey {
    
    inline def apply(privateKey: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): PrivateKey = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrivateKey]
    }
    
    extension [Self <: PrivateKey](x: Self) {
      
      inline def setPrivateKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait PublicKey extends StObject {
    
    var privateKey: JsonWebKey
    
    var publicKey: JsonWebKey
  }
  object PublicKey {
    
    inline def apply(privateKey: JsonWebKey, publicKey: JsonWebKey): PublicKey = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublicKey]
    }
    
    extension [Self <: PublicKey](x: Self) {
      
      inline def setPrivateKey(value: JsonWebKey): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: JsonWebKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofEd25519 extends StObject {
    
    var Ed25519PrivateKey: Instantiable2[
        /* key */ js.typedarray.Uint8Array, 
        /* publicKey */ js.typedarray.Uint8Array, 
        typings.libp2pCrypto.ed25519ClassMod.Ed25519PrivateKey
      ]
    
    var Ed25519PublicKey: Instantiable1[
        /* key */ js.typedarray.Uint8Array, 
        typings.libp2pCrypto.ed25519ClassMod.Ed25519PublicKey
      ]
    
    def generateKeyPair(): js.Promise[Ed25519PrivateKey]
    
    def generateKeyPairFromSeed(seed: js.typedarray.Uint8Array): js.Promise[Ed25519PrivateKey]
    
    def unmarshalEd25519PrivateKey(bytes: js.typedarray.Uint8Array): Ed25519PrivateKey
    
    def unmarshalEd25519PublicKey(bytes: js.typedarray.Uint8Array): Ed25519PublicKey
  }
  object TypeofEd25519 {
    
    inline def apply(
      Ed25519PrivateKey: Instantiable2[
          /* key */ js.typedarray.Uint8Array, 
          /* publicKey */ js.typedarray.Uint8Array, 
          Ed25519PrivateKey
        ],
      Ed25519PublicKey: Instantiable1[/* key */ js.typedarray.Uint8Array, Ed25519PublicKey],
      generateKeyPair: () => js.Promise[Ed25519PrivateKey],
      generateKeyPairFromSeed: js.typedarray.Uint8Array => js.Promise[Ed25519PrivateKey],
      unmarshalEd25519PrivateKey: js.typedarray.Uint8Array => Ed25519PrivateKey,
      unmarshalEd25519PublicKey: js.typedarray.Uint8Array => Ed25519PublicKey
    ): TypeofEd25519 = {
      val __obj = js.Dynamic.literal(Ed25519PrivateKey = Ed25519PrivateKey.asInstanceOf[js.Any], Ed25519PublicKey = Ed25519PublicKey.asInstanceOf[js.Any], generateKeyPair = js.Any.fromFunction0(generateKeyPair), generateKeyPairFromSeed = js.Any.fromFunction1(generateKeyPairFromSeed), unmarshalEd25519PrivateKey = js.Any.fromFunction1(unmarshalEd25519PrivateKey), unmarshalEd25519PublicKey = js.Any.fromFunction1(unmarshalEd25519PublicKey))
      __obj.asInstanceOf[TypeofEd25519]
    }
    
    extension [Self <: TypeofEd25519](x: Self) {
      
      inline def setEd25519PrivateKey(
        value: Instantiable2[
              /* key */ js.typedarray.Uint8Array, 
              /* publicKey */ js.typedarray.Uint8Array, 
              Ed25519PrivateKey
            ]
      ): Self = StObject.set(x, "Ed25519PrivateKey", value.asInstanceOf[js.Any])
      
      inline def setEd25519PublicKey(value: Instantiable1[/* key */ js.typedarray.Uint8Array, Ed25519PublicKey]): Self = StObject.set(x, "Ed25519PublicKey", value.asInstanceOf[js.Any])
      
      inline def setGenerateKeyPair(value: () => js.Promise[Ed25519PrivateKey]): Self = StObject.set(x, "generateKeyPair", js.Any.fromFunction0(value))
      
      inline def setGenerateKeyPairFromSeed(value: js.typedarray.Uint8Array => js.Promise[Ed25519PrivateKey]): Self = StObject.set(x, "generateKeyPairFromSeed", js.Any.fromFunction1(value))
      
      inline def setUnmarshalEd25519PrivateKey(value: js.typedarray.Uint8Array => Ed25519PrivateKey): Self = StObject.set(x, "unmarshalEd25519PrivateKey", js.Any.fromFunction1(value))
      
      inline def setUnmarshalEd25519PublicKey(value: js.typedarray.Uint8Array => Ed25519PublicKey): Self = StObject.set(x, "unmarshalEd25519PublicKey", js.Any.fromFunction1(value))
    }
  }
  
  trait TypeofRSA extends StObject {
    
    var RsaPrivateKey: Instantiable2[
        /* key */ JsonWebKey, 
        /* publicKey */ JsonWebKey, 
        typings.libp2pCrypto.rsaClassMod.RsaPrivateKey
      ]
    
    var RsaPublicKey: Instantiable1[/* key */ JsonWebKey, typings.libp2pCrypto.rsaClassMod.RsaPublicKey]
    
    def fromJwk(jwk: JsonWebKey): js.Promise[RsaPrivateKey]
    
    def generateKeyPair(bits: Double): js.Promise[RsaPrivateKey]
    
    def unmarshalRsaPrivateKey(bytes: js.typedarray.Uint8Array): js.Promise[RsaPrivateKey]
    
    def unmarshalRsaPublicKey(bytes: js.typedarray.Uint8Array): RsaPublicKey
  }
  object TypeofRSA {
    
    inline def apply(
      RsaPrivateKey: Instantiable2[/* key */ JsonWebKey, /* publicKey */ JsonWebKey, RsaPrivateKey],
      RsaPublicKey: Instantiable1[/* key */ JsonWebKey, RsaPublicKey],
      fromJwk: JsonWebKey => js.Promise[RsaPrivateKey],
      generateKeyPair: Double => js.Promise[RsaPrivateKey],
      unmarshalRsaPrivateKey: js.typedarray.Uint8Array => js.Promise[RsaPrivateKey],
      unmarshalRsaPublicKey: js.typedarray.Uint8Array => RsaPublicKey
    ): TypeofRSA = {
      val __obj = js.Dynamic.literal(RsaPrivateKey = RsaPrivateKey.asInstanceOf[js.Any], RsaPublicKey = RsaPublicKey.asInstanceOf[js.Any], fromJwk = js.Any.fromFunction1(fromJwk), generateKeyPair = js.Any.fromFunction1(generateKeyPair), unmarshalRsaPrivateKey = js.Any.fromFunction1(unmarshalRsaPrivateKey), unmarshalRsaPublicKey = js.Any.fromFunction1(unmarshalRsaPublicKey))
      __obj.asInstanceOf[TypeofRSA]
    }
    
    extension [Self <: TypeofRSA](x: Self) {
      
      inline def setFromJwk(value: JsonWebKey => js.Promise[RsaPrivateKey]): Self = StObject.set(x, "fromJwk", js.Any.fromFunction1(value))
      
      inline def setGenerateKeyPair(value: Double => js.Promise[RsaPrivateKey]): Self = StObject.set(x, "generateKeyPair", js.Any.fromFunction1(value))
      
      inline def setRsaPrivateKey(value: Instantiable2[/* key */ JsonWebKey, /* publicKey */ JsonWebKey, RsaPrivateKey]): Self = StObject.set(x, "RsaPrivateKey", value.asInstanceOf[js.Any])
      
      inline def setRsaPublicKey(value: Instantiable1[/* key */ JsonWebKey, RsaPublicKey]): Self = StObject.set(x, "RsaPublicKey", value.asInstanceOf[js.Any])
      
      inline def setUnmarshalRsaPrivateKey(value: js.typedarray.Uint8Array => js.Promise[RsaPrivateKey]): Self = StObject.set(x, "unmarshalRsaPrivateKey", js.Any.fromFunction1(value))
      
      inline def setUnmarshalRsaPublicKey(value: js.typedarray.Uint8Array => RsaPublicKey): Self = StObject.set(x, "unmarshalRsaPublicKey", js.Any.fromFunction1(value))
    }
  }
  
  trait TypeofSecp256k1 extends StObject {
    
    var Secp256k1PrivateKey: Instantiable2[
        /* key */ js.typedarray.Uint8Array, 
        /* publicKey */ js.UndefOr[js.typedarray.Uint8Array], 
        typings.libp2pCrypto.secp256k1ClassMod.Secp256k1PrivateKey
      ]
    
    var Secp256k1PublicKey: Instantiable1[
        /* key */ js.typedarray.Uint8Array, 
        typings.libp2pCrypto.secp256k1ClassMod.Secp256k1PublicKey
      ]
    
    def generateKeyPair(): js.Promise[Secp256k1PrivateKey]
    
    def unmarshalSecp256k1PrivateKey(bytes: js.typedarray.Uint8Array): Secp256k1PrivateKey
    
    def unmarshalSecp256k1PublicKey(bytes: js.typedarray.Uint8Array): Secp256k1PublicKey
  }
  object TypeofSecp256k1 {
    
    inline def apply(
      Secp256k1PrivateKey: Instantiable2[
          /* key */ js.typedarray.Uint8Array, 
          /* publicKey */ js.UndefOr[js.typedarray.Uint8Array], 
          Secp256k1PrivateKey
        ],
      Secp256k1PublicKey: Instantiable1[/* key */ js.typedarray.Uint8Array, Secp256k1PublicKey],
      generateKeyPair: () => js.Promise[Secp256k1PrivateKey],
      unmarshalSecp256k1PrivateKey: js.typedarray.Uint8Array => Secp256k1PrivateKey,
      unmarshalSecp256k1PublicKey: js.typedarray.Uint8Array => Secp256k1PublicKey
    ): TypeofSecp256k1 = {
      val __obj = js.Dynamic.literal(Secp256k1PrivateKey = Secp256k1PrivateKey.asInstanceOf[js.Any], Secp256k1PublicKey = Secp256k1PublicKey.asInstanceOf[js.Any], generateKeyPair = js.Any.fromFunction0(generateKeyPair), unmarshalSecp256k1PrivateKey = js.Any.fromFunction1(unmarshalSecp256k1PrivateKey), unmarshalSecp256k1PublicKey = js.Any.fromFunction1(unmarshalSecp256k1PublicKey))
      __obj.asInstanceOf[TypeofSecp256k1]
    }
    
    extension [Self <: TypeofSecp256k1](x: Self) {
      
      inline def setGenerateKeyPair(value: () => js.Promise[Secp256k1PrivateKey]): Self = StObject.set(x, "generateKeyPair", js.Any.fromFunction0(value))
      
      inline def setSecp256k1PrivateKey(
        value: Instantiable2[
              /* key */ js.typedarray.Uint8Array, 
              /* publicKey */ js.UndefOr[js.typedarray.Uint8Array], 
              Secp256k1PrivateKey
            ]
      ): Self = StObject.set(x, "Secp256k1PrivateKey", value.asInstanceOf[js.Any])
      
      inline def setSecp256k1PublicKey(value: Instantiable1[/* key */ js.typedarray.Uint8Array, Secp256k1PublicKey]): Self = StObject.set(x, "Secp256k1PublicKey", value.asInstanceOf[js.Any])
      
      inline def setUnmarshalSecp256k1PrivateKey(value: js.typedarray.Uint8Array => Secp256k1PrivateKey): Self = StObject.set(x, "unmarshalSecp256k1PrivateKey", js.Any.fromFunction1(value))
      
      inline def setUnmarshalSecp256k1PublicKey(value: js.typedarray.Uint8Array => Secp256k1PublicKey): Self = StObject.set(x, "unmarshalSecp256k1PublicKey", js.Any.fromFunction1(value))
    }
  }
  
  trait Update extends StObject {
    
    def update(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array
  }
  object Update {
    
    inline def apply(update: js.typedarray.Uint8Array => js.typedarray.Uint8Array): Update = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Update]
    }
    
    extension [Self <: Update](x: Self) {
      
      inline def setUpdate(value: js.typedarray.Uint8Array => js.typedarray.Uint8Array): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
