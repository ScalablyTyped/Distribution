package typings.libp2pCrypto

import typings.node.bufferMod.global.Buffer
import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeysRsaClassMod {
  
  @JSImport("@libp2p/crypto/dist/src/keys/rsa-class", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@libp2p/crypto/dist/src/keys/rsa-class", "RsaPrivateKey")
  @js.native
  open class RsaPrivateKey protected () extends StObject {
    def this(key: JsonWebKey, publicKey: JsonWebKey) = this()
    
    /* private */ val _key: Any = js.native
    
    /* private */ val _publicKey: Any = js.native
    
    def bytes: js.typedarray.Uint8Array = js.native
    
    def decrypt(bytes: js.typedarray.Uint8Array): Buffer = js.native
    
    /**
      * Exports the key into a password protected PEM format
      */
    def `export`(password: String): js.Promise[Any] = js.native
    def `export`(password: String, format: String): js.Promise[Any] = js.native
    
    def genSecret(): js.typedarray.Uint8Array = js.native
    
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
    
    def public: RsaPublicKey = js.native
    
    def sign(message: js.typedarray.Uint8Array): js.Promise[Buffer & String] = js.native
  }
  
  @JSImport("@libp2p/crypto/dist/src/keys/rsa-class", "RsaPublicKey")
  @js.native
  open class RsaPublicKey protected () extends StObject {
    def this(key: JsonWebKey) = this()
    
    /* private */ val _key: Any = js.native
    
    def bytes: js.typedarray.Uint8Array = js.native
    
    def encrypt(bytes: js.typedarray.Uint8Array): Buffer = js.native
    
    def hash(): js.Promise[js.typedarray.Uint8Array] = js.native
    
    def marshal(): js.typedarray.Uint8Array = js.native
    
    def verify(data: js.typedarray.Uint8Array, sig: js.typedarray.Uint8Array): js.Promise[Boolean] = js.native
  }
  
  inline def fromJwk(jwk: JsonWebKey): js.Promise[RsaPrivateKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJwk")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RsaPrivateKey]]
  
  inline def generateKeyPair(bits: Double): js.Promise[RsaPrivateKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RsaPrivateKey]]
  
  inline def unmarshalRsaPrivateKey(bytes: js.typedarray.Uint8Array): js.Promise[RsaPrivateKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshalRsaPrivateKey")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RsaPrivateKey]]
  
  inline def unmarshalRsaPublicKey(bytes: js.typedarray.Uint8Array): RsaPublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshalRsaPublicKey")(bytes.asInstanceOf[js.Any]).asInstanceOf[RsaPublicKey]
}
