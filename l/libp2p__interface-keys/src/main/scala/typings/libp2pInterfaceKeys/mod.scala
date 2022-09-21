package typings.libp2pInterfaceKeys

import typings.libp2pInterfaceKeys.libp2pInterfaceKeysStrings.`pkcs-8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/interface-keys", "Ed25519")
  @js.native
  val Ed25519: /* "Ed25519" */ String = js.native
  
  @JSImport("@libp2p/interface-keys", "RSA")
  @js.native
  val RSA: /* "RSA" */ String = js.native
  
  @JSImport("@libp2p/interface-keys", "secp256k1")
  @js.native
  val secp256k1: /* "secp256k1" */ String = js.native
  
  type KeyType = /* "Ed25519" */ String
  
  @js.native
  trait PrivateKey extends StObject {
    
    val bytes: js.typedarray.Uint8Array = js.native
    
    def equals(key: PrivateKey): Boolean = js.native
    
    /**
      * Exports the password protected key in the format specified.
      */
    def `export`(password: String): js.Promise[String] = js.native
    def `export`(password: String, format: String): js.Promise[String] = js.native
    @JSName("export")
    def export_pkcs8(password: String, format: `pkcs-8`): js.Promise[String] = js.native
    
    def hash(): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * Gets the ID of the key.
      *
      * The key id is the base58 encoding of the SHA-256 multihash of its public key.
      * The public key is a protobuf encoding containing a type and the DER encoding
      * of the PKCS SubjectPublicKeyInfo.
      */
    def id(): js.Promise[String] = js.native
    
    def marshal(): js.typedarray.Uint8Array = js.native
    
    val public: PublicKey = js.native
    
    def sign(data: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
  }
  
  trait PublicKey extends StObject {
    
    val bytes: js.typedarray.Uint8Array
    
    def equals(key: PublicKey): Boolean
    
    def hash(): js.Promise[js.typedarray.Uint8Array]
    
    def marshal(): js.typedarray.Uint8Array
    
    def verify(data: js.typedarray.Uint8Array, sig: js.typedarray.Uint8Array): js.Promise[Boolean]
  }
  object PublicKey {
    
    inline def apply(
      bytes: js.typedarray.Uint8Array,
      equals_ : PublicKey => Boolean,
      hash: () => js.Promise[js.typedarray.Uint8Array],
      marshal: () => js.typedarray.Uint8Array,
      verify: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.Promise[Boolean]
    ): PublicKey = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], hash = js.Any.fromFunction0(hash), marshal = js.Any.fromFunction0(marshal), verify = js.Any.fromFunction2(verify))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[PublicKey]
    }
    
    extension [Self <: PublicKey](x: Self) {
      
      inline def setBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setEquals_(value: PublicKey => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setHash(value: () => js.Promise[js.typedarray.Uint8Array]): Self = StObject.set(x, "hash", js.Any.fromFunction0(value))
      
      inline def setMarshal(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "marshal", js.Any.fromFunction0(value))
      
      inline def setVerify(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => js.Promise[Boolean]): Self = StObject.set(x, "verify", js.Any.fromFunction2(value))
    }
  }
}
