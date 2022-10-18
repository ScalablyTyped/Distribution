package typings.libp2pCrypto

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeysEd25519ClassMod {
  
  @JSImport("@libp2p/crypto/dist/src/keys/ed25519-class", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@libp2p/crypto/dist/src/keys/ed25519-class", "Ed25519PrivateKey")
  @js.native
  open class Ed25519PrivateKey protected () extends StObject {
    def this(key: js.typedarray.Uint8Array, publicKey: js.typedarray.Uint8Array) = this()
    
    /* private */ val _key: Any = js.native
    
    /* private */ val _publicKey: Any = js.native
    
    def bytes: js.typedarray.Uint8Array = js.native
    
    /**
      * Exports the key into a password protected `format`
      */
    def `export`(password: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_base.Multibase<'m'> */ Any
      ] = js.native
    def `export`(password: String, format: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_base.Multibase<'m'> */ Any
      ] = js.native
    
    def hash(): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * Gets the ID of the key.
      *
      * The key id is the base58 encoding of the identity multihash containing its public key.
      * The public key is a protobuf encoding containing a type and the DER encoding
      * of the PKCS SubjectPublicKeyInfo.
      *
      * @returns {Promise<string>}
      */
    def id(): js.Promise[String] = js.native
    
    def marshal(): js.typedarray.Uint8Array = js.native
    
    def public: Ed25519PublicKey = js.native
    
    def sign(message: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
  }
  
  @JSImport("@libp2p/crypto/dist/src/keys/ed25519-class", "Ed25519PublicKey")
  @js.native
  open class Ed25519PublicKey protected () extends StObject {
    def this(key: js.typedarray.Uint8Array) = this()
    
    /* private */ val _key: Any = js.native
    
    def bytes: js.typedarray.Uint8Array = js.native
    
    def hash(): js.Promise[js.typedarray.Uint8Array] = js.native
    
    def marshal(): js.typedarray.Uint8Array = js.native
    
    def verify(data: js.typedarray.Uint8Array, sig: js.typedarray.Uint8Array): js.Promise[Boolean] = js.native
  }
  
  inline def generateKeyPair(): js.Promise[Ed25519PrivateKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")().asInstanceOf[js.Promise[Ed25519PrivateKey]]
  
  inline def generateKeyPairFromSeed(seed: js.typedarray.Uint8Array): js.Promise[Ed25519PrivateKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairFromSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Ed25519PrivateKey]]
  
  inline def unmarshalEd25519PrivateKey(bytes: js.typedarray.Uint8Array): Ed25519PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshalEd25519PrivateKey")(bytes.asInstanceOf[js.Any]).asInstanceOf[Ed25519PrivateKey]
  
  inline def unmarshalEd25519PublicKey(bytes: js.typedarray.Uint8Array): Ed25519PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshalEd25519PublicKey")(bytes.asInstanceOf[js.Any]).asInstanceOf[Ed25519PublicKey]
}
