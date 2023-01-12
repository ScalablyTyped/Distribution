package typings.libp2pCrypto

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
