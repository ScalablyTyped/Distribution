package typings.libp2pCrypto

import typings.libp2pCrypto.libp2pCryptoStrings.`P-256`
import typings.libp2pCrypto.libp2pCryptoStrings.`P-384`
import typings.libp2pCrypto.libp2pCryptoStrings.`P-521`
import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeysInterfaceMod {
  
  @js.native
  trait ECDHKey extends StObject {
    
    def genSharedKey(theirPub: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
    def genSharedKey(theirPub: js.typedarray.Uint8Array, forcePrivate: ECDHKeyPair): js.Promise[js.typedarray.Uint8Array] = js.native
    
    var key: js.typedarray.Uint8Array = js.native
  }
  
  trait ECDHKeyPair extends StObject {
    
    var `private`: js.typedarray.Uint8Array
    
    var public: js.typedarray.Uint8Array
  }
  object ECDHKeyPair {
    
    inline def apply(`private`: js.typedarray.Uint8Array, public: js.typedarray.Uint8Array): ECDHKeyPair = {
      val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ECDHKeyPair]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ECDHKeyPair] (val x: Self) extends AnyVal {
      
      inline def setPrivate(value: js.typedarray.Uint8Array): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPublic(value: js.typedarray.Uint8Array): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnhancedKey extends StObject {
    
    var cipherKey: js.typedarray.Uint8Array
    
    var iv: js.typedarray.Uint8Array
    
    var macKey: js.typedarray.Uint8Array
  }
  object EnhancedKey {
    
    inline def apply(
      cipherKey: js.typedarray.Uint8Array,
      iv: js.typedarray.Uint8Array,
      macKey: js.typedarray.Uint8Array
    ): EnhancedKey = {
      val __obj = js.Dynamic.literal(cipherKey = cipherKey.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], macKey = macKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnhancedKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnhancedKey] (val x: Self) extends AnyVal {
      
      inline def setCipherKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "cipherKey", value.asInstanceOf[js.Any])
      
      inline def setIv(value: js.typedarray.Uint8Array): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setMacKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "macKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnhancedKeyPair extends StObject {
    
    var k1: EnhancedKey
    
    var k2: EnhancedKey
  }
  object EnhancedKeyPair {
    
    inline def apply(k1: EnhancedKey, k2: EnhancedKey): EnhancedKeyPair = {
      val __obj = js.Dynamic.literal(k1 = k1.asInstanceOf[js.Any], k2 = k2.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnhancedKeyPair]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnhancedKeyPair] (val x: Self) extends AnyVal {
      
      inline def setK1(value: EnhancedKey): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
      
      inline def setK2(value: EnhancedKey): Self = StObject.set(x, "k2", value.asInstanceOf[js.Any])
    }
  }
  
  trait JWKEncodedPrivateKey
    extends StObject
       with JWKEncodedPublicKey {
    
    var d: String
  }
  object JWKEncodedPrivateKey {
    
    inline def apply(crv: `P-256` | `P-384` | `P-521`, d: String, ext: Boolean, kty: String, x: String, y: String): JWKEncodedPrivateKey = {
      val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWKEncodedPrivateKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JWKEncodedPrivateKey] (val x: Self) extends AnyVal {
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    }
  }
  
  trait JWKEncodedPublicKey extends StObject {
    
    var crv: `P-256` | `P-384` | `P-521`
    
    var ext: Boolean
    
    var kty: String
    
    var x: String
    
    var y: String
  }
  object JWKEncodedPublicKey {
    
    inline def apply(crv: `P-256` | `P-384` | `P-521`, ext: Boolean, kty: String, x: String, y: String): JWKEncodedPublicKey = {
      val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWKEncodedPublicKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JWKEncodedPublicKey] (val x: Self) extends AnyVal {
      
      inline def setCrv(value: `P-256` | `P-384` | `P-521`): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
      
      inline def setExt(value: Boolean): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait JWKKeyPair extends StObject {
    
    var privateKey: JsonWebKey
    
    var publicKey: JsonWebKey
  }
  object JWKKeyPair {
    
    inline def apply(privateKey: JsonWebKey, publicKey: JsonWebKey): JWKKeyPair = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWKKeyPair]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JWKKeyPair] (val x: Self) extends AnyVal {
      
      inline def setPrivateKey(value: JsonWebKey): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: JsonWebKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait Uint8ArrayKeyPair extends StObject {
    
    var privateKey: js.typedarray.Uint8Array
    
    var publicKey: js.typedarray.Uint8Array
  }
  object Uint8ArrayKeyPair {
    
    inline def apply(privateKey: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array): Uint8ArrayKeyPair = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Uint8ArrayKeyPair]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Uint8ArrayKeyPair] (val x: Self) extends AnyVal {
      
      inline def setPrivateKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
}
