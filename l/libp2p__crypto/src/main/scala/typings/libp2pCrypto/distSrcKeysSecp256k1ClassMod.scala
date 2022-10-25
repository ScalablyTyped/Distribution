package typings.libp2pCrypto

import typings.libp2pCrypto.libp2pCryptoStrings.m
import typings.multiformats.distTypesSrcBasesInterfaceMod.Multibase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeysSecp256k1ClassMod {
  
  @JSImport("@libp2p/crypto/dist/src/keys/secp256k1-class", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@libp2p/crypto/dist/src/keys/secp256k1-class", "Secp256k1PrivateKey")
  @js.native
  open class Secp256k1PrivateKey protected () extends StObject {
    def this(key: js.typedarray.Uint8Array) = this()
    def this(key: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array) = this()
    
    /* private */ val _key: Any = js.native
    
    /* private */ val _publicKey: Any = js.native
    
    def bytes: js.typedarray.Uint8Array = js.native
    
    /**
      * Exports the key into a password protected `format`
      */
    def `export`(password: String): js.Promise[Multibase[m]] = js.native
    def `export`(password: String, format: String): js.Promise[Multibase[m]] = js.native
    
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
    
    def public: Secp256k1PublicKey = js.native
    
    def sign(message: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
  }
  
  @JSImport("@libp2p/crypto/dist/src/keys/secp256k1-class", "Secp256k1PublicKey")
  @js.native
  open class Secp256k1PublicKey protected () extends StObject {
    def this(key: js.typedarray.Uint8Array) = this()
    
    /* private */ val _key: Any = js.native
    
    def bytes: js.typedarray.Uint8Array = js.native
    
    def hash(): js.Promise[js.typedarray.Uint8Array] = js.native
    
    def marshal(): js.typedarray.Uint8Array = js.native
    
    def verify(data: js.typedarray.Uint8Array, sig: js.typedarray.Uint8Array): js.Promise[Boolean] = js.native
  }
  
  inline def generateKeyPair(): js.Promise[Secp256k1PrivateKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")().asInstanceOf[js.Promise[Secp256k1PrivateKey]]
  
  inline def unmarshalSecp256k1PrivateKey(bytes: js.typedarray.Uint8Array): Secp256k1PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshalSecp256k1PrivateKey")(bytes.asInstanceOf[js.Any]).asInstanceOf[Secp256k1PrivateKey]
  
  inline def unmarshalSecp256k1PublicKey(bytes: js.typedarray.Uint8Array): Secp256k1PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshalSecp256k1PublicKey")(bytes.asInstanceOf[js.Any]).asInstanceOf[Secp256k1PublicKey]
}
